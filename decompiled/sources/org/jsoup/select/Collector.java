package org.jsoup.select;

import defpackage.rm;
import java.util.stream.Collectors;
import org.jsoup.nodes.Element;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Collector {
    private Collector() {
    }

    public static Elements collect(Evaluator evaluator, Element element) {
        evaluator.reset();
        return (Elements) element.stream().filter(evaluator.asPredicate(element)).collect(Collectors.toCollection(new rm(2)));
    }

    public static Element findFirst(Evaluator evaluator, Element element) {
        evaluator.reset();
        return element.stream().filter(evaluator.asPredicate(element)).findFirst().orElse(null);
    }
}
