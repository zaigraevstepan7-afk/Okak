package okhttp3.logging;

import defpackage.f00;
import defpackage.go;
import defpackage.h70;
import defpackage.p60;
import defpackage.sn0;
import defpackage.wn;
import defpackage.yq1;
import defpackage.yx;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.internal.platform.Platform;
import org.jsoup.helper.HttpConnection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u0003342B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0018\"\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010!\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00100\u001a\u0004\b!\u0010 \"\u0004\b\u001c\u00101¨\u00065"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Lokhttp3/Headers;", "headers", "", "i", "Lod2;", "logHeader", "(Lokhttp3/Headers;I)V", "", "bodyHasUnknownEncoding", "(Lokhttp3/Headers;)Z", "Lokhttp3/Response;", "response", "bodyIsStreaming", "(Lokhttp3/Response;)Z", "", "name", "redactHeader", "(Ljava/lang/String;)V", "", "redactQueryParams", "([Ljava/lang/String;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "url", "redactUrl$logging_interceptor", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "redactUrl", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "headersToRedact", "Ljava/util/Set;", "queryParamsNameToRedact", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Companion", "Level", "Logger", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;
    private volatile Set<String> queryParamsNameToRedact;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Level {
        private static final /* synthetic */ h70 $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level NONE = new Level("NONE", 0);
        public static final Level BASIC = new Level("BASIC", 1);
        public static final Level HEADERS = new Level("HEADERS", 2);
        public static final Level BODY = new Level("BODY", 3);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{NONE, BASIC, HEADERS, BODY};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = go.y($values);
        }

        private Level(String str, int i) {
        }

        public static h70 getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "", "message", "Lod2;", "log", "(Ljava/lang/String;)V", "Companion", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public interface Logger {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "<init>", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "", "message", "Lod2;", "log", "(Ljava/lang/String;)V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    message.getClass();
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String message);
    }

    public HttpLoggingInterceptor(Logger logger) {
        logger.getClass();
        this.logger = logger;
        p60 p60Var = p60.e;
        this.headersToRedact = p60Var;
        this.queryParamsNameToRedact = p60Var;
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get(HttpConnection.CONTENT_ENCODING);
        if (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) {
            return false;
        }
        return true;
    }

    private final boolean bodyIsStreaming(Response response) {
        MediaType mediaType = response.body().getMediaType();
        if (mediaType != null && sn0.r(mediaType.type(), "text") && sn0.r(mediaType.subtype(), "event-stream")) {
            return true;
        }
        return false;
    }

    private final void logHeader(Headers headers, int i) {
        String value;
        if (this.headersToRedact.contains(headers.name(i))) {
            value = "██";
        } else {
            value = headers.value(i);
        }
        this.logger.log(headers.name(i) + ": " + value);
    }

    @f00
    /* renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0325  */
    /* JADX WARN: Type inference failed for: r4v21, types: [hk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [hk, java.lang.Object, pk, ok] */
    /* JADX WARN: Type inference failed for: r6v22, types: [hk, java.lang.Object] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r27) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public final void level(Level level) {
        level.getClass();
        this.level = level;
    }

    public final void redactHeader(String name) {
        name.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        wn.d0(this.headersToRedact, treeSet);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    public final void redactQueryParams(String... name) {
        name.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        wn.d0(this.queryParamsNameToRedact, treeSet);
        List asList = Arrays.asList(name);
        asList.getClass();
        treeSet.addAll(asList);
        this.queryParamsNameToRedact = treeSet;
    }

    public final String redactUrl$logging_interceptor(HttpUrl url) {
        String queryParameterValue;
        url.getClass();
        if (!this.queryParamsNameToRedact.isEmpty() && url.querySize() != 0) {
            HttpUrl.Builder query = url.newBuilder().query(null);
            int querySize = url.querySize();
            for (int i = 0; i < querySize; i++) {
                String queryParameterName = url.queryParameterName(i);
                if (this.queryParamsNameToRedact.contains(queryParameterName)) {
                    queryParameterValue = "██";
                } else {
                    queryParameterValue = url.queryParameterValue(i);
                }
                query.addEncodedQueryParameter(queryParameterName, queryParameterValue);
            }
            return query.toString();
        }
        return url.getUrl();
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        level.getClass();
        this.level = level;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, yx yxVar) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
