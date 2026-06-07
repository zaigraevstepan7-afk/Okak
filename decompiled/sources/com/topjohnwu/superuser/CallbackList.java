package com.topjohnwu.superuser;

import com.topjohnwu.superuser.internal.UiThreadHandler;
import defpackage.n6;
import java.util.AbstractList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class CallbackList<E> extends AbstractList<E> {
    protected List<E> mBase;
    protected Executor mExecutor;

    public CallbackList(Executor executor, List<E> list) {
        this.mExecutor = executor;
        this.mBase = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        List<E> list = this.mBase;
        if (list != null) {
            list.add(i, e);
        }
        this.mExecutor.execute(new n6(1, this, e));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: onAddElement, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$add$0(E e);

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.set(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        List<E> list = this.mBase;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public CallbackList(List<E> list) {
        this(UiThreadHandler.executor, list);
    }

    public CallbackList(Executor executor) {
        this(executor, null);
    }

    public CallbackList() {
        this(UiThreadHandler.executor, null);
    }
}
