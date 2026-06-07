package org.jsoup.select;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Selector {
    private Selector() {
    }

    public static Elements filterOut(Collection<Element> collection, Collection<Element> collection2) {
        Elements elements = new Elements();
        for (Element element : collection) {
            Iterator<Element> it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (element.equals(it.next())) {
                        break;
                    }
                } else {
                    elements.add(element);
                    break;
                }
            }
        }
        return elements;
    }

    public static Elements select(String str, Iterable<Element> iterable) {
        Validate.notEmpty(str);
        Validate.notNull(iterable);
        Evaluator parse = QueryParser.parse(str);
        Elements elements = new Elements();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<Element> it = iterable.iterator();
        while (it.hasNext()) {
            Iterator<Element> it2 = select(parse, it.next()).iterator();
            while (it2.hasNext()) {
                Element next = it2.next();
                if (identityHashMap.put(next, Boolean.TRUE) == null) {
                    elements.add(next);
                }
            }
        }
        return elements;
    }

    public static Element selectFirst(String str, Element element) {
        Validate.notEmpty(str);
        return Collector.findFirst(QueryParser.parse(str), element);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }

        public SelectorParseException(String str) {
            super(str);
        }

        public SelectorParseException(Throwable th, String str, Object... objArr) {
            super(String.format(str, objArr), th);
        }
    }

    public static Elements select(Evaluator evaluator, Element element) {
        Validate.notNull(evaluator);
        Validate.notNull(element);
        return Collector.collect(evaluator, element);
    }

    public static Elements select(String str, Element element) {
        Validate.notEmpty(str);
        return select(QueryParser.parse(str), element);
    }
}
