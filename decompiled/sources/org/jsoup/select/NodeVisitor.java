package org.jsoup.select;

import org.jsoup.nodes.Node;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@FunctionalInterface
/* loaded from: classes.dex */
public interface NodeVisitor {
    /* renamed from: head */
    void mo125head(Node node, int i);

    default void tail(Node node, int i) {
    }
}
