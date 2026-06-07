package org.jsoup.internal;

import defpackage.m50;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class Functions {
    private static final Function ListFunction = new m50(6);
    private static final Function SetFunction = new m50(7);
    private static final Function MapFunction = new m50(8);
    private static final Function IdentityMapFunction = new m50(9);

    private Functions() {
    }

    public static <T, K, V> Function<T, IdentityHashMap<K, V>> identityMapFunction() {
        return IdentityMapFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$0(Object obj) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1(Object obj) {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$2(Object obj) {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$3(Object obj) {
        return new IdentityHashMap();
    }

    public static <T, U> Function<T, List<U>> listFunction() {
        return ListFunction;
    }

    public static <T, K, V> Function<T, Map<K, V>> mapFunction() {
        return MapFunction;
    }

    public static <T, U> Function<T, Set<U>> setFunction() {
        return SetFunction;
    }
}
