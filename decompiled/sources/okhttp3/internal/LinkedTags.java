package okhttp3.internal;

import defpackage.fp;
import defpackage.mv1;
import defpackage.oe0;
import defpackage.to0;
import defpackage.wn;
import defpackage.yq1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/LinkedTags;", "", "K", "Lokhttp3/internal/Tags;", "Lto0;", "key", "value", "next", "<init>", "(Lto0;Ljava/lang/Object;Lokhttp3/internal/Tags;)V", "T", "plus", "(Lto0;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lto0;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lto0;", "Ljava/lang/Object;", "Lokhttp3/internal/Tags;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
final class LinkedTags<K> extends Tags {
    private final to0 key;
    private final Tags next;
    private final K value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(to0 to0Var, K k, Tags tags) {
        super(null);
        to0Var.getClass();
        k.getClass();
        tags.getClass();
        this.key = to0Var;
        this.value = k;
        this.next = tags;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedTags toString$lambda$0(LinkedTags linkedTags) {
        linkedTags.getClass();
        Tags tags = linkedTags.next;
        if (tags instanceof LinkedTags) {
            return (LinkedTags) tags;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1(LinkedTags linkedTags) {
        linkedTags.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(linkedTags.key);
        sb.append('=');
        sb.append(linkedTags.value);
        return sb.toString();
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(to0 key) {
        key.getClass();
        if (key.equals(this.key)) {
            return (T) fp.D(key).cast(this.value);
        }
        return (T) this.next.get(key);
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(to0 key, T value) {
        key.getClass();
        boolean equals = key.equals(this.key);
        Tags tags = this.next;
        if (!equals) {
            Tags plus = tags.plus(key, null);
            if (plus != this.next) {
                this = new LinkedTags<>(this.key, this.value, plus);
            }
            tags = this;
        }
        if (value != null) {
            return new LinkedTags(key, value, tags);
        }
        return tags;
    }

    public String toString() {
        final int i = 0;
        List w0 = wn.w0(mv1.H(mv1.G(this, new oe0() { // from class: okhttp3.internal.a
            @Override // defpackage.oe0
            public final Object invoke(Object obj) {
                LinkedTags string$lambda$0;
                CharSequence string$lambda$1;
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (i) {
                    case 0:
                        string$lambda$0 = LinkedTags.toString$lambda$0(linkedTags);
                        return string$lambda$0;
                    default:
                        string$lambda$1 = LinkedTags.toString$lambda$1(linkedTags);
                        return string$lambda$1;
                }
            }
        })));
        final int i2 = 1;
        return wn.m0(w0, null, "{", "}", new oe0() { // from class: okhttp3.internal.a
            @Override // defpackage.oe0
            public final Object invoke(Object obj) {
                LinkedTags string$lambda$0;
                CharSequence string$lambda$1;
                LinkedTags linkedTags = (LinkedTags) obj;
                switch (i2) {
                    case 0:
                        string$lambda$0 = LinkedTags.toString$lambda$0(linkedTags);
                        return string$lambda$0;
                    default:
                        string$lambda$1 = LinkedTags.toString$lambda$1(linkedTags);
                        return string$lambda$1;
                }
            }
        }, 25);
    }
}
