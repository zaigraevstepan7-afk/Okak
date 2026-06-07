package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class CombiningEvaluator extends Evaluator {
    int cost;
    final ArrayList<Evaluator> evaluators;
    int num;
    final List<Evaluator> sortedEvaluators;

    public CombiningEvaluator() {
        this.num = 0;
        this.cost = 0;
        this.evaluators = new ArrayList<>();
        this.sortedEvaluators = new ArrayList();
    }

    @Override // org.jsoup.select.Evaluator
    public int cost() {
        return this.cost;
    }

    public void replaceRightMostEvaluator(Evaluator evaluator) {
        this.evaluators.set(this.num - 1, evaluator);
        updateEvaluators();
    }

    @Override // org.jsoup.select.Evaluator
    public void reset() {
        Iterator<Evaluator> it = this.evaluators.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        super.reset();
    }

    public Evaluator rightMostEvaluator() {
        int i = this.num;
        if (i > 0) {
            return this.evaluators.get(i - 1);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.function.ToIntFunction, java.lang.Object] */
    public void updateEvaluators() {
        this.num = this.evaluators.size();
        this.cost = 0;
        Iterator<Evaluator> it = this.evaluators.iterator();
        while (it.hasNext()) {
            Evaluator next = it.next();
            this.cost = next.cost() + this.cost;
        }
        this.sortedEvaluators.clear();
        this.sortedEvaluators.addAll(this.evaluators);
        this.sortedEvaluators.sort(Comparator.comparingInt(new Object()));
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class And extends CombiningEvaluator {
        public And(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            for (int i = 0; i < this.num; i++) {
                if (!this.sortedEvaluators.get(i).lambda$asPredicate$0(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return StringUtil.join(this.evaluators, "");
        }

        public And(Collection<Evaluator> collection) {
            super(collection);
        }
    }

    public CombiningEvaluator(Collection<Evaluator> collection) {
        this();
        this.evaluators.addAll(collection);
        updateEvaluators();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Or extends CombiningEvaluator {
        public Or(Collection<Evaluator> collection) {
            int i = this.num;
            ArrayList<Evaluator> arrayList = this.evaluators;
            if (i > 1) {
                arrayList.add(new And(collection));
            } else {
                arrayList.addAll(collection);
            }
            updateEvaluators();
        }

        public void add(Evaluator evaluator) {
            this.evaluators.add(evaluator);
            updateEvaluators();
        }

        @Override // org.jsoup.select.Evaluator
        /* renamed from: matches */
        public boolean lambda$asPredicate$0(Element element, Element element2) {
            for (int i = 0; i < this.num; i++) {
                if (this.sortedEvaluators.get(i).lambda$asPredicate$0(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return StringUtil.join(this.evaluators, ", ");
        }

        public Or(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }

        public Or() {
        }
    }
}
