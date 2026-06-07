package okhttp3;

import defpackage.fc2;
import defpackage.lo;
import defpackage.se;
import defpackage.xo0;
import defpackage.y61;
import defpackage.yq1;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bR\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"okhttp3/Cache$urls$1", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/String;", "Lod2;", "remove", "()V", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Ljava/util/Iterator;", "nextUrl", "Ljava/lang/String;", "canRemove", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Cache$urls$1 implements Iterator<String>, xo0 {
    private boolean canRemove;
    private final Iterator<DiskLruCache.Snapshot> delegate;
    private String nextUrl;

    public Cache$urls$1(Cache cache) {
        this.delegate = cache.getCache().snapshots();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextUrl == null) {
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = lo.l(next.getSource(0)).q(Long.MAX_VALUE);
                        fc2.u(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                            break;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            str.getClass();
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
        y61.c();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.canRemove) {
            this.delegate.remove();
        } else {
            se.p("remove() before next()");
        }
    }
}
