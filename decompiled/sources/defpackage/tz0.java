package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class tz0 extends xn {
    public static nz0 a0(nz0 nz0Var) {
        nz0Var.b();
        nz0Var.q = true;
        if (nz0Var.m > 0) {
            return nz0Var;
        }
        nz0 nz0Var2 = nz0.r;
        nz0Var2.getClass();
        return nz0Var2;
    }

    public static Object b0(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int c0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void d0(HashMap hashMap, xd1[] xd1VarArr) {
        for (xd1 xd1Var : xd1VarArr) {
            hashMap.put(xd1Var.e, xd1Var.f);
        }
    }

    public static Map e0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(c0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    xd1 xd1Var = (xd1) it.next();
                    linkedHashMap.put(xd1Var.e, xd1Var.f);
                }
                return linkedHashMap;
            }
            xd1 xd1Var2 = (xd1) arrayList.get(0);
            xd1Var2.getClass();
            Map singletonMap = Collections.singletonMap(xd1Var2.e, xd1Var2.f);
            singletonMap.getClass();
            return singletonMap;
        }
        return m60.e;
    }

    public static Map f0(Map map) {
        map.getClass();
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            singletonMap.getClass();
            return singletonMap;
        }
        return m60.e;
    }
}
