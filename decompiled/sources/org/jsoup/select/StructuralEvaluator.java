package org.jsoup.select;

import defpackage.rm;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.function.Function;
import org.jsoup.internal.Functions;
import org.jsoup.internal.SoftPool;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class StructuralEvaluator extends Evaluator {
    final Evaluator evaluator;
    final ThreadLocal<IdentityHashMap<Element, IdentityHashMap<Element, Boolean>>> threadMemo = ThreadLocal.withInitial(new rm(6));

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Has extends StructuralEvaluator {
        static final SoftPool<NodeIterator<Element>> ElementIterPool = new SoftPool<>(new Object());
        private final boolean checkSiblings;

        public Has(Evaluator evaluator) {
            super(evaluator);
            this.checkSiblings = evalWantsSiblings(evaluator);
        }

        private static boolean evalWantsSiblings(Evaluator evaluator) {
            if (evaluator instanceof CombiningEvaluator) {
                Iterator<Evaluator> it = ((CombiningEvaluator) evaluator).evaluators.iterator();
                while (it.hasNext()) {
                    Evaluator next = it.next();
                    if ((next instanceof PreviousSibling) || (next instanceof ImmediatePreviousSibling)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ NodeIterator lambda$static$0() {
            return new NodeIterator(new Element("html"), Element.class);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return this.evaluator.cost() * 10;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (this.checkSiblings) {
                for (Element firstElementSibling = element2.firstElementSibling(); firstElementSibling != null; firstElementSibling = firstElementSibling.nextElementSibling()) {
                    if (firstElementSibling != element2 && this.evaluator.lambda$asPredicate$0(element2, firstElementSibling)) {
                        return true;
                    }
                }
            }
            NodeIterator<Element> borrow = ElementIterPool.borrow();
            borrow.restart(element2);
            while (borrow.hasNext()) {
                try {
                    Element next = borrow.next();
                    if (next != element2 && this.evaluator.lambda$asPredicate$0(element2, next)) {
                        return true;
                    }
                } finally {
                    ElementIterPool.release(borrow);
                }
            }
            ElementIterPool.release(borrow);
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.evaluator);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ImmediateParentRun extends Evaluator {
        int cost;
        final ArrayList<Evaluator> evaluators;

        public ImmediateParentRun(Evaluator evaluator) {
            ArrayList<Evaluator> arrayList = new ArrayList<>();
            this.evaluators = arrayList;
            this.cost = 2;
            arrayList.add(evaluator);
            this.cost = evaluator.cost() + this.cost;
        }

        public void add(Evaluator evaluator) {
            this.evaluators.add(evaluator);
            this.cost = evaluator.cost() + this.cost;
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return this.cost;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element2 == element) {
                return false;
            }
            for (int size = this.evaluators.size() - 1; size >= 0; size--) {
                if (element2 == null || !this.evaluators.get(size).lambda$asPredicate$0(element, element2)) {
                    return false;
                }
                element2 = element2.parent();
            }
            return true;
        }

        public String toString() {
            return StringUtil.join(this.evaluators, " > ");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ImmediatePreviousSibling extends StructuralEvaluator {
        public ImmediatePreviousSibling(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return this.evaluator.cost() + 2;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            Element previousElementSibling;
            if (element == element2 || (previousElementSibling = element2.previousElementSibling()) == null || !memoMatches(element, previousElementSibling)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return String.format("%s + ", this.evaluator);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Is extends StructuralEvaluator {
        public Is(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return this.evaluator.cost() + 2;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return this.evaluator.lambda$asPredicate$0(element, element2);
        }

        public String toString() {
            return String.format(":is(%s)", this.evaluator);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Not extends StructuralEvaluator {
        public Not(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return this.evaluator.cost() + 2;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            return !memoMatches(element, element2);
        }

        public String toString() {
            return String.format(":not(%s)", this.evaluator);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Parent extends StructuralEvaluator {
        public Parent(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return this.evaluator.cost() * 2;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            do {
                element2 = element2.parent();
                if (element2 == null) {
                    break;
                }
                if (memoMatches(element, element2)) {
                    return true;
                }
            } while (element2 != element);
            return false;
        }

        public String toString() {
            return String.format("%s ", this.evaluator);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class PreviousSibling extends StructuralEvaluator {
        public PreviousSibling(Evaluator evaluator) {
            super(evaluator);
        }

        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return this.evaluator.cost() * 3;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            for (Element firstElementSibling = element2.firstElementSibling(); firstElementSibling != null && firstElementSibling != element2; firstElementSibling = firstElementSibling.nextElementSibling()) {
                if (memoMatches(element, firstElementSibling)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", this.evaluator);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Root extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public int cost() {
            return 1;
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            if (element == element2) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "";
        }
    }

    public StructuralEvaluator(Evaluator evaluator) {
        this.evaluator = evaluator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$memoMatches$0(Element element, Element element2) {
        return Boolean.valueOf(this.evaluator.lambda$asPredicate$0(element, element2));
    }

    public boolean memoMatches(final Element element, Element element2) {
        return this.threadMemo.get().computeIfAbsent(element, Functions.identityMapFunction()).computeIfAbsent(element2, new Function() { // from class: org.jsoup.select.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Boolean lambda$memoMatches$0;
                lambda$memoMatches$0 = StructuralEvaluator.this.lambda$memoMatches$0(element, (Element) obj);
                return lambda$memoMatches$0;
            }
        }).booleanValue();
    }

    @Override // org.jsoup.select.Evaluator
    public void reset() {
        this.threadMemo.get().clear();
        super.reset();
    }
}
