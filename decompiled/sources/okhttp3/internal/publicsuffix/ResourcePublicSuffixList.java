package okhttp3.internal.publicsuffix;

import defpackage.k12;
import defpackage.n90;
import defpackage.oe1;
import defpackage.wc0;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Loe1;", "path", "Ln90;", "fileSystem", "<init>", "(Loe1;Ln90;)V", "Lk12;", "listSource", "()Lk12;", "Loe1;", "getPath", "()Loe1;", "Ln90;", "getFileSystem", "()Ln90;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {
    public static final oe1 PUBLIC_SUFFIX_RESOURCE;
    private final n90 fileSystem;
    private final oe1 path;

    static {
        String str = oe1.f;
        PUBLIC_SUFFIX_RESOURCE = wc0.k("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list", false);
    }

    public /* synthetic */ ResourcePublicSuffixList(oe1 oe1Var, n90 n90Var, int i, yx yxVar) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : oe1Var, (i & 2) != 0 ? n90.RESOURCES : n90Var);
    }

    public final n90 getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public k12 listSource() {
        return this.fileSystem.source(getPath());
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public oe1 getPath() {
        return this.path;
    }

    public ResourcePublicSuffixList(oe1 oe1Var, n90 n90Var) {
        oe1Var.getClass();
        n90Var.getClass();
        this.path = oe1Var;
        this.fileSystem = n90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
