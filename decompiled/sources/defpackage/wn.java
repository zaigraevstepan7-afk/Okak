package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class wn extends ao {
    public static List A0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return xn.E(next);
            }
            return l60.e;
        }
        return xn.H(C0(iterable));
    }

    public static ArrayList B0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List C0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        z0(iterable, arrayList);
        return arrayList;
    }

    public static Set D0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(tz0.c0(collection.size()));
                    z0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                Set singleton = Collections.singleton(next);
                singleton.getClass();
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            z0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                singleton2.getClass();
                return singleton2;
            }
        }
        return p60.e;
    }

    public static void d0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static double e0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static boolean f0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (j0(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static Object g0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        y61.j("List is empty.");
        return null;
    }

    public static Object h0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object i0(int i, List list) {
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static int j0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i >= 0) {
                if (sn0.r(obj, obj2)) {
                    return i;
                }
                i++;
            } else {
                xn.U();
                throw null;
            }
        }
        return -1;
    }

    public static final void k0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, oe0 oe0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            xp1.g(sb, obj, oe0Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void l0(List list, StringBuilder sb, r rVar, int i) {
        if ((i & 64) != 0) {
            rVar = null;
        }
        k0(list, sb, "\n", "", "", "...", rVar);
    }

    public static String m0(Iterable iterable, String str, String str2, String str3, oe0 oe0Var, int i) {
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            oe0Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        k0(iterable, sb, str6, str4, str5, "...", oe0Var);
        return sb.toString();
    }

    public static Object n0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        y61.j("List is empty.");
        return null;
    }

    public static Object o0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable p0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList q0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        d0(iterable, arrayList2);
        return arrayList2;
    }

    public static ArrayList r0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static void s0(List list, oe0 oe0Var) {
        int size;
        list.getClass();
        oe0Var.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof xo0) && !(list instanceof yo0)) {
                fc2.J(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) oe0Var.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) oe0Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size != i) {
                size--;
            } else {
                return;
            }
        }
    }

    public static Object t0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        y61.j("List is empty.");
        return null;
    }

    public static Object u0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        y61.j("List is empty.");
        return null;
    }

    public static Object v0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static List w0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return A0(iterable);
        }
        List C0 = C0(iterable);
        Collections.reverse(C0);
        return C0;
    }

    public static List x0(ArrayList arrayList, Comparator comparator) {
        arrayList.getClass();
        if (arrayList.size() <= 1) {
            return A0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List y0(int i, List list) {
        if (i >= 0) {
            if (i == 0) {
                return l60.e;
            }
            int size = list.size();
            if (i >= size) {
                return A0(list);
            }
            if (i == 1) {
                return xn.E(n0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        se.e(l90.i("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static final void z0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
