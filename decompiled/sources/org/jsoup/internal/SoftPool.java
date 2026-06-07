package org.jsoup.internal;

import defpackage.rm;
import java.lang.ref.SoftReference;
import java.util.Stack;
import java.util.function.Supplier;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class SoftPool<T> {
    static final int MaxIdle = 12;
    private final Supplier<T> initializer;
    final ThreadLocal<SoftReference<Stack<T>>> threadLocalStack = ThreadLocal.withInitial(new rm(4));

    public SoftPool(Supplier<T> supplier) {
        this.initializer = supplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SoftReference lambda$new$0() {
        return new SoftReference(new Stack());
    }

    public T borrow() {
        Stack<T> stack = getStack();
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return this.initializer.get();
    }

    public Stack<T> getStack() {
        Stack<T> stack = this.threadLocalStack.get().get();
        if (stack == null) {
            Stack<T> stack2 = new Stack<>();
            this.threadLocalStack.set(new SoftReference<>(stack2));
            return stack2;
        }
        return stack;
    }

    public void release(T t) {
        Stack<T> stack = getStack();
        if (stack.size() < 12) {
            stack.push(t);
        }
    }
}
