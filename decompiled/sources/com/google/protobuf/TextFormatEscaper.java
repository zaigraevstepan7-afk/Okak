package com.google.protobuf;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class TextFormatEscaper {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    public static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder sb = new StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            byte byteAt = byteSequence.byteAt(i);
            if (byteAt != 34) {
                if (byteAt != 39) {
                    if (byteAt != 92) {
                        switch (byteAt) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (byteAt >= 32 && byteAt <= 126) {
                                    sb.append((char) byteAt);
                                    break;
                                } else {
                                    sb.append(AbstractJsonLexerKt.STRING_ESC);
                                    sb.append((char) (((byteAt >>> 6) & 3) + 48));
                                    sb.append((char) (((byteAt >>> 3) & 7) + 48));
                                    sb.append((char) ((byteAt & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static String escapeBytes(final ByteString byteString) {
        return escapeBytes(new ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.1
            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return ByteString.this.byteAt(i);
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return ByteString.this.size();
            }
        });
    }

    public static String escapeBytes(final byte[] bArr) {
        return escapeBytes(new ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.2
            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return bArr[i];
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return bArr.length;
            }
        });
    }
}
