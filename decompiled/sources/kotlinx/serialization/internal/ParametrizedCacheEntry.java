package kotlinx.serialization.internal;

import defpackage.de0;
import defpackage.fo1;
import defpackage.fp0;
import defpackage.go1;
import defpackage.yn;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JE\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR4\u0010\u0011\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "T", "", "<init>", "()V", "", "Lfp0;", "types", "Lkotlin/Function0;", "Lkotlinx/serialization/KSerializer;", "producer", "Lgo1;", "computeIfAbsent-gIAlu-s", "(Ljava/util/List;Lde0;)Ljava/lang/Object;", "computeIfAbsent", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/serialization/internal/KTypeWrapper;", "serializers", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
final class ParametrizedCacheEntry<T> {
    private final ConcurrentHashMap<List<KTypeWrapper>, go1> serializers = new ConcurrentHashMap<>();

    /* renamed from: computeIfAbsent-gIAlu-s, reason: not valid java name */
    public final Object m83computeIfAbsentgIAlus(List<? extends fp0> types, de0 producer) {
        Object fo1Var;
        types.getClass();
        producer.getClass();
        ArrayList arrayList = new ArrayList(yn.a0(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((fp0) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = this.serializers;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                fo1Var = (KSerializer) producer.invoke();
            } catch (Throwable th) {
                fo1Var = new fo1(th);
            }
            go1 go1Var = new go1(fo1Var);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, go1Var);
            if (putIfAbsent == null) {
                obj = go1Var;
            } else {
                obj = putIfAbsent;
            }
        }
        return ((go1) obj).e;
    }
}
