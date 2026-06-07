package kotlinx.serialization.builtins;

import defpackage.a20;
import defpackage.ad2;
import defpackage.al;
import defpackage.bd2;
import defpackage.cc2;
import defpackage.cd2;
import defpackage.ce2;
import defpackage.d32;
import defpackage.dd2;
import defpackage.de2;
import defpackage.ed2;
import defpackage.fa0;
import defpackage.fd2;
import defpackage.fy0;
import defpackage.jx1;
import defpackage.km0;
import defpackage.lm0;
import defpackage.od2;
import defpackage.pm;
import defpackage.qm0;
import defpackage.r40;
import defpackage.s40;
import defpackage.si;
import defpackage.sn0;
import defpackage.to0;
import defpackage.uc2;
import defpackage.vc2;
import defpackage.wc2;
import defpackage.xc2;
import defpackage.xd1;
import defpackage.yc2;
import defpackage.yq1;
import defpackage.zc2;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.InstantSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NothingSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteArraySerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntArraySerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongArraySerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortArraySerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.internal.UuidSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000È\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001aG\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007\u001aa\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00100\u0002\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002*\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001c\u001a\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002H\u0007¢\u0006\u0004\b \u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\"0\u0002*\u00020!¢\u0006\u0004\b\u0015\u0010#\u001a\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0002¢\u0006\u0004\b%\u0010\u0019\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0002H\u0007¢\u0006\u0004\b'\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020)0\u0002*\u00020(¢\u0006\u0004\b\u0015\u0010*\u001a\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0002¢\u0006\u0004\b,\u0010\u0019\u001a\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0002H\u0007¢\u0006\u0004\b.\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002000\u0002*\u00020/¢\u0006\u0004\b\u0015\u00101\u001a\u0013\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0002¢\u0006\u0004\b3\u0010\u0019\u001a\u0015\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0002H\u0007¢\u0006\u0004\b5\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002070\u0002*\u000206¢\u0006\u0004\b\u0015\u00108\u001a\u0013\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0002¢\u0006\u0004\b:\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020<0\u0002*\u00020;¢\u0006\u0004\b\u0015\u0010=\u001a\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0002¢\u0006\u0004\b?\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020A0\u0002*\u00020@¢\u0006\u0004\b\u0015\u0010B\u001a\u0013\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0002¢\u0006\u0004\bD\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020E0\u0002*\u00020E¢\u0006\u0004\b\u0015\u0010F\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020H0\u0002*\u00020G¢\u0006\u0004\b\u0015\u0010I\u001aD\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010N0\u0002\"\n\b\u0000\u0010K\u0018\u0001*\u00020J\"\f\b\u0001\u0010L\u0018\u0001*\u0004\u0018\u00018\u00002\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\b¢\u0006\u0004\bO\u0010P\u001aM\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010N0\u0002\"\b\b\u0000\u0010K*\u00020J\"\n\b\u0001\u0010L*\u0004\u0018\u00018\u00002\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\bO\u0010S\u001a-\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0\u0002\"\u0004\b\u0000\u0010K2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bU\u0010P\u001a-\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000V0\u0002\"\u0004\b\u0000\u0010K2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bW\u0010P\u001aG\u0010Y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010X0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\bY\u0010\u0007\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020[0\u0002*\u00020Z¢\u0006\u0004\b\u0015\u0010\\\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020^0\u0002*\u00020]¢\u0006\u0004\b\u0015\u0010_\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020a0\u0002*\u00020`¢\u0006\u0004\b\u0015\u0010b\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020d0\u0002*\u00020c¢\u0006\u0004\b\u0015\u0010e\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020g0\u0002*\u00020f¢\u0006\u0004\b\u0015\u0010h\u001a\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020j0\u0002*\u00020iH\u0007¢\u0006\u0004\b\u0015\u0010k\u001a\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020m0\u0002*\u00020lH\u0007¢\u0006\u0004\b\u0015\u0010n\u001a\u0015\u0010p\u001a\b\u0012\u0004\u0012\u00020o0\u0002H\u0007¢\u0006\u0004\bp\u0010\u0019\"3\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010K*\u00020J*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\f\u0012\u0004\br\u0010s\u001a\u0004\bq\u0010P¨\u0006u"}, d2 = {"K", "V", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "Lxd1;", "PairSerializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "MapEntrySerializer", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "Lcc2;", "TripleSerializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Char$Companion;", "", "serializer", "(Lpm;)Lkotlinx/serialization/KSerializer;", "", "CharArraySerializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlin/Byte$Companion;", "", "(Lal;)Lkotlinx/serialization/KSerializer;", "", "ByteArraySerializer", "Lwc2;", "UByteArraySerializer", "Lkotlin/Short$Companion;", "", "(Ljx1;)Lkotlinx/serialization/KSerializer;", "", "ShortArraySerializer", "Lfd2;", "UShortArraySerializer", "Lkotlin/Int$Companion;", "", "(Lqm0;)Lkotlinx/serialization/KSerializer;", "", "IntArraySerializer", "Lzc2;", "UIntArraySerializer", "Lkotlin/Long$Companion;", "", "(Lfy0;)Lkotlinx/serialization/KSerializer;", "", "LongArraySerializer", "Lcd2;", "ULongArraySerializer", "Lkotlin/Float$Companion;", "", "(Lfa0;)Lkotlinx/serialization/KSerializer;", "", "FloatArraySerializer", "Lkotlin/Double$Companion;", "", "(La20;)Lkotlinx/serialization/KSerializer;", "", "DoubleArraySerializer", "Lkotlin/Boolean$Companion;", "", "(Lsi;)Lkotlinx/serialization/KSerializer;", "", "BooleanArraySerializer", "Lod2;", "(Lod2;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", "", "(Ld32;)Lkotlinx/serialization/KSerializer;", "", "T", "E", "elementSerializer", "", "ArraySerializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lto0;", "kClass", "(Lto0;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "ListSerializer", "", "SetSerializer", "", "MapSerializer", "Lxc2;", "Lyc2;", "(Lxc2;)Lkotlinx/serialization/KSerializer;", "Lad2;", "Lbd2;", "(Lad2;)Lkotlinx/serialization/KSerializer;", "Luc2;", "Lvc2;", "(Luc2;)Lkotlinx/serialization/KSerializer;", "Ldd2;", "Led2;", "(Ldd2;)Lkotlinx/serialization/KSerializer;", "Lr40;", "Ls40;", "(Lr40;)Lkotlinx/serialization/KSerializer;", "Lkm0;", "Llm0;", "(Lkm0;)Lkotlinx/serialization/KSerializer;", "Lce2;", "Lde2;", "(Lce2;)Lkotlinx/serialization/KSerializer;", "", "NothingSerializer", "getNullable", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "nullable", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class BuiltinSerializersKt {
    @ExperimentalSerializationApi
    public static final <T, E extends T> KSerializer<E[]> ArraySerializer(to0 to0Var, KSerializer<E> kSerializer) {
        to0Var.getClass();
        kSerializer.getClass();
        return new ReferenceArraySerializer(to0Var, kSerializer);
    }

    public static final KSerializer<boolean[]> BooleanArraySerializer() {
        return BooleanArraySerializer.INSTANCE;
    }

    public static final KSerializer<byte[]> ByteArraySerializer() {
        return ByteArraySerializer.INSTANCE;
    }

    public static final KSerializer<char[]> CharArraySerializer() {
        return CharArraySerializer.INSTANCE;
    }

    public static final KSerializer<double[]> DoubleArraySerializer() {
        return DoubleArraySerializer.INSTANCE;
    }

    public static final KSerializer<float[]> FloatArraySerializer() {
        return FloatArraySerializer.INSTANCE;
    }

    public static final KSerializer<int[]> IntArraySerializer() {
        return IntArraySerializer.INSTANCE;
    }

    public static final <T> KSerializer<List<T>> ListSerializer(KSerializer<T> kSerializer) {
        kSerializer.getClass();
        return new ArrayListSerializer(kSerializer);
    }

    public static final KSerializer<long[]> LongArraySerializer() {
        return LongArraySerializer.INSTANCE;
    }

    public static final <K, V> KSerializer<Map.Entry<K, V>> MapEntrySerializer(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new MapEntrySerializer(kSerializer, kSerializer2);
    }

    public static final <K, V> KSerializer<Map<K, V>> MapSerializer(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new LinkedHashMapSerializer(kSerializer, kSerializer2);
    }

    @ExperimentalSerializationApi
    public static final KSerializer NothingSerializer() {
        return NothingSerializer.INSTANCE;
    }

    public static final <K, V> KSerializer<xd1> PairSerializer(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new PairSerializer(kSerializer, kSerializer2);
    }

    public static final <T> KSerializer<Set<T>> SetSerializer(KSerializer<T> kSerializer) {
        kSerializer.getClass();
        return new LinkedHashSetSerializer(kSerializer);
    }

    public static final KSerializer<short[]> ShortArraySerializer() {
        return ShortArraySerializer.INSTANCE;
    }

    public static final <A, B, C> KSerializer<cc2> TripleSerializer(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        return new TripleSerializer(kSerializer, kSerializer2, kSerializer3);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<wc2> UByteArraySerializer() {
        return UByteArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<zc2> UIntArraySerializer() {
        return UIntArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<cd2> ULongArraySerializer() {
        return ULongArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<fd2> UShortArraySerializer() {
        return UShortArraySerializer.INSTANCE;
    }

    public static final <T> KSerializer<T> getNullable(KSerializer<T> kSerializer) {
        kSerializer.getClass();
        if (kSerializer.getDescriptor().isNullable()) {
            return kSerializer;
        }
        return new NullableSerializer(kSerializer);
    }

    public static final KSerializer<Character> serializer(pm pmVar) {
        pmVar.getClass();
        return CharSerializer.INSTANCE;
    }

    public static final KSerializer<Byte> serializer(al alVar) {
        alVar.getClass();
        return ByteSerializer.INSTANCE;
    }

    public static final KSerializer<Short> serializer(jx1 jx1Var) {
        jx1Var.getClass();
        return ShortSerializer.INSTANCE;
    }

    public static final KSerializer<Integer> serializer(qm0 qm0Var) {
        qm0Var.getClass();
        return IntSerializer.INSTANCE;
    }

    public static final KSerializer<Long> serializer(fy0 fy0Var) {
        fy0Var.getClass();
        return LongSerializer.INSTANCE;
    }

    public static final KSerializer<Float> serializer(fa0 fa0Var) {
        fa0Var.getClass();
        return FloatSerializer.INSTANCE;
    }

    public static final KSerializer<Double> serializer(a20 a20Var) {
        a20Var.getClass();
        return DoubleSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T, E extends T> KSerializer<E[]> ArraySerializer(KSerializer<E> kSerializer) {
        kSerializer.getClass();
        sn0.R();
        throw null;
    }

    public static final KSerializer<Boolean> serializer(si siVar) {
        siVar.getClass();
        return BooleanSerializer.INSTANCE;
    }

    public static final KSerializer<od2> serializer(od2 od2Var) {
        od2Var.getClass();
        return UnitSerializer.INSTANCE;
    }

    public static final KSerializer<String> serializer(d32 d32Var) {
        d32Var.getClass();
        return StringSerializer.INSTANCE;
    }

    public static final KSerializer<yc2> serializer(xc2 xc2Var) {
        xc2Var.getClass();
        return UIntSerializer.INSTANCE;
    }

    public static final KSerializer<bd2> serializer(ad2 ad2Var) {
        ad2Var.getClass();
        return ULongSerializer.INSTANCE;
    }

    public static final KSerializer<vc2> serializer(uc2 uc2Var) {
        uc2Var.getClass();
        return UByteSerializer.INSTANCE;
    }

    public static final KSerializer<ed2> serializer(dd2 dd2Var) {
        dd2Var.getClass();
        return UShortSerializer.INSTANCE;
    }

    public static final KSerializer<s40> serializer(r40 r40Var) {
        r40Var.getClass();
        return DurationSerializer.INSTANCE;
    }

    public static final KSerializer<lm0> serializer(km0 km0Var) {
        km0Var.getClass();
        return InstantSerializer.INSTANCE;
    }

    public static final KSerializer<de2> serializer(ce2 ce2Var) {
        ce2Var.getClass();
        return UuidSerializer.INSTANCE;
    }

    public static /* synthetic */ void getNullable$annotations(KSerializer kSerializer) {
    }
}
