package org.jsoup.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.jsoup.internal.ControllableInputStream;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.parser.StreamParser;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class DataUtil {
    public static final Charset UTF_8;
    static final int boundaryLength = 32;
    private static final Pattern charsetPattern = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    static final String defaultCharsetName;
    private static final int firstReadBufferSize = 5120;
    private static final char[] mimeBoundaryChars;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class CharsetDoc {
        Charset charset;
        Document doc;
        InputStream input;

        public CharsetDoc(Charset charset, Document document, InputStream inputStream) {
            this.charset = charset;
            this.input = inputStream;
            this.doc = document;
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        UTF_8 = forName;
        defaultCharsetName = forName.name();
        mimeBoundaryChars = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    private DataUtil() {
    }

    public static void crossStreams(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[SharedConstants.DefaultBufferSize];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static CharsetDoc detectCharset(ControllableInputStream controllableInputStream, String str, String str2, Parser parser) {
        Charset forName;
        XmlDeclaration xmlDeclaration;
        String detectCharsetFromBom = detectCharsetFromBom(controllableInputStream);
        if (detectCharsetFromBom != null) {
            str = detectCharsetFromBom;
        }
        Document document = null;
        if (str == null) {
            int max = controllableInputStream.max();
            controllableInputStream.max(firstReadBufferSize);
            controllableInputStream.mark(firstReadBufferSize);
            controllableInputStream.allowClose(false);
            try {
                try {
                    Document parseInput = parser.parseInput(new InputStreamReader(controllableInputStream, UTF_8), str2);
                    controllableInputStream.reset();
                    controllableInputStream.max(max);
                    controllableInputStream.allowClose(true);
                    Iterator<Element> it = parseInput.select("meta[http-equiv=content-type], meta[charset]").iterator();
                    String str3 = null;
                    while (it.hasNext()) {
                        Element next = it.next();
                        if (next.hasAttr("http-equiv")) {
                            str3 = getCharsetFromContentType(next.attr("content"));
                        }
                        if (str3 == null && next.hasAttr("charset")) {
                            str3 = next.attr("charset");
                        }
                        if (str3 != null) {
                            break;
                        }
                    }
                    if (str3 == null && parseInput.childNodeSize() > 0) {
                        Node childNode = parseInput.childNode(0);
                        if (childNode instanceof XmlDeclaration) {
                            xmlDeclaration = (XmlDeclaration) childNode;
                        } else {
                            if (childNode instanceof Comment) {
                                Comment comment = (Comment) childNode;
                                if (comment.isXmlDeclaration()) {
                                    xmlDeclaration = comment.asXmlDeclaration();
                                }
                            }
                            xmlDeclaration = null;
                        }
                        if (xmlDeclaration != null && xmlDeclaration.name().equalsIgnoreCase("xml")) {
                            str3 = xmlDeclaration.attr("encoding");
                        }
                    }
                    String validateCharset = validateCharset(str3);
                    if (validateCharset != null && !validateCharset.equalsIgnoreCase(defaultCharsetName)) {
                        str = validateCharset.trim().replaceAll("[\"']", "");
                    } else if (controllableInputStream.baseReadFully()) {
                        controllableInputStream.close();
                        document = parseInput;
                    }
                } catch (UncheckedIOException e) {
                    throw e.getCause();
                }
            } catch (Throwable th) {
                controllableInputStream.allowClose(true);
                throw th;
            }
        } else {
            Validate.notEmpty(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (str == null) {
            str = defaultCharsetName;
        }
        if (str.equals(defaultCharsetName)) {
            forName = UTF_8;
        } else {
            forName = Charset.forName(str);
        }
        return new CharsetDoc(forName, document, controllableInputStream);
    }

    private static String detectCharsetFromBom(ControllableInputStream controllableInputStream) {
        byte[] bArr = new byte[4];
        controllableInputStream.mark(4);
        controllableInputStream.read(bArr, 0, 4);
        controllableInputStream.reset();
        byte b = bArr[0];
        if (b != 0 || bArr[1] != 0 || bArr[2] != -2 || bArr[3] != -1) {
            if (b == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0) {
                return "UTF-32";
            }
            if (b != -2 || bArr[1] != -1) {
                if (b == -1 && bArr[1] == -2) {
                    return "UTF-16";
                }
                if (b == -17 && bArr[1] == -69 && bArr[2] == -65) {
                    controllableInputStream.read(bArr, 0, 3);
                    return "UTF-8";
                }
                return null;
            }
            return "UTF-16";
        }
        return "UTF-32";
    }

    public static ByteBuffer emptyByteBuffer() {
        return ByteBuffer.allocate(0);
    }

    public static String getCharsetFromContentType(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = charsetPattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return validateCharset(matcher.group(1).trim().replace("charset=", ""));
    }

    public static Document load(InputStream inputStream, String str, String str2) {
        return parseInputStream(ControllableInputStream.wrap(inputStream, 0), str, str2, Parser.htmlParser());
    }

    public static String mimeBoundary() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = mimeBoundaryChars;
            borrowBuilder.append(cArr[random.nextInt(cArr.length)]);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    private static ControllableInputStream openStream(Path path) {
        boolean z;
        SeekableByteChannel newByteChannel = Files.newByteChannel(path, new OpenOption[0]);
        InputStream newInputStream = Channels.newInputStream(newByteChannel);
        String lowerCase = Normalizer.lowerCase(path.getFileName().toString());
        if (lowerCase.endsWith(".gz") || lowerCase.endsWith(".z")) {
            if (newInputStream.read() == 31 && newInputStream.read() == 139) {
                z = true;
            } else {
                z = false;
            }
            newByteChannel.position(0L);
            if (z) {
                newInputStream = new GZIPInputStream(newInputStream);
            }
        }
        return ControllableInputStream.wrap(newInputStream, 0);
    }

    public static Document parseInputStream(CharsetDoc charsetDoc, String str, Parser parser) {
        Document document = charsetDoc.doc;
        if (document != null) {
            return document;
        }
        InputStream inputStream = charsetDoc.input;
        Validate.notNull(inputStream);
        Charset charset = charsetDoc.charset;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        try {
            try {
                Document parseInput = parser.parseInput(inputStreamReader, str);
                parseInput.outputSettings().charset(charset);
                if (!charset.canEncode()) {
                    parseInput.charset(UTF_8);
                }
                inputStreamReader.close();
                return parseInput;
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i) {
        return ControllableInputStream.readToByteBuffer(inputStream, i);
    }

    public static StreamParser streamParser(Path path, Charset charset, String str, Parser parser) {
        String str2;
        StreamParser streamParser = new StreamParser(parser);
        if (charset != null) {
            str2 = charset.name();
        } else {
            str2 = null;
        }
        CharsetDoc detectCharset = detectCharset(openStream(path), str2, str, parser);
        streamParser.parse(new BufferedReader(new InputStreamReader(detectCharset.input, detectCharset.charset), SharedConstants.DefaultBufferSize), str);
        return streamParser;
    }

    private static String validateCharset(String str) {
        if (str != null && str.length() != 0) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }

    public static Document load(File file, String str, String str2, Parser parser) {
        return load(file.toPath(), str, str2, parser);
    }

    public static Document load(Path path, String str, String str2) {
        return load(path, str, str2, Parser.htmlParser());
    }

    public static Document load(Path path, String str, String str2, Parser parser) {
        return parseInputStream(openStream(path), str, str2, parser);
    }

    public static Document load(File file, String str, String str2) {
        return load(file.toPath(), str, str2);
    }

    public static Document load(InputStream inputStream, String str, String str2, Parser parser) {
        return parseInputStream(ControllableInputStream.wrap(inputStream, 0), str, str2, parser);
    }

    public static Document parseInputStream(ControllableInputStream controllableInputStream, String str, String str2, Parser parser) {
        CharsetDoc charsetDoc;
        if (controllableInputStream == null) {
            return new Document(str2);
        }
        try {
            charsetDoc = detectCharset(controllableInputStream, str, str2, parser);
            try {
                Document parseInputStream = parseInputStream(charsetDoc, str2, parser);
                if (charsetDoc != null) {
                    charsetDoc.input.close();
                }
                return parseInputStream;
            } catch (Throwable th) {
                th = th;
                if (charsetDoc != null) {
                    charsetDoc.input.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            charsetDoc = null;
        }
    }
}
