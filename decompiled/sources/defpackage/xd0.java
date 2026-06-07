package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class xd0 extends n90 {
    private final n90 delegate;

    public xd0(n90 n90Var) {
        n90Var.getClass();
        this.delegate = n90Var;
    }

    @Override // defpackage.n90
    public ey1 appendingSink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        return this.delegate.appendingSink(onPathParameter(oe1Var, "appendingSink", "file"), z);
    }

    @Override // defpackage.n90
    public void atomicMove(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        this.delegate.atomicMove(onPathParameter(oe1Var, "atomicMove", "source"), onPathParameter(oe1Var2, "atomicMove", "target"));
    }

    @Override // defpackage.n90
    public oe1 canonicalize(oe1 oe1Var) {
        oe1Var.getClass();
        return onPathResult(this.delegate.canonicalize(onPathParameter(oe1Var, "canonicalize", "path")), "canonicalize");
    }

    @Override // defpackage.n90, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // defpackage.n90
    public void createDirectory(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        this.delegate.createDirectory(onPathParameter(oe1Var, "createDirectory", "dir"), z);
    }

    @Override // defpackage.n90
    public void createSymlink(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        this.delegate.createSymlink(onPathParameter(oe1Var, "createSymlink", "source"), onPathParameter(oe1Var2, "createSymlink", "target"));
    }

    public final n90 delegate() {
        return this.delegate;
    }

    @Override // defpackage.n90
    public void delete(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        this.delegate.delete(onPathParameter(oe1Var, "delete", "path"), z);
    }

    @Override // defpackage.n90
    public List<oe1> list(oe1 oe1Var) {
        oe1Var.getClass();
        List list = this.delegate.list(onPathParameter(oe1Var, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((oe1) it.next(), "list"));
        }
        ao.b0(arrayList);
        return arrayList;
    }

    @Override // defpackage.n90
    public List<oe1> listOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        List listOrNull = this.delegate.listOrNull(onPathParameter(oe1Var, "listOrNull", "dir"));
        if (listOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((oe1) it.next(), "listOrNull"));
        }
        ao.b0(arrayList);
        return arrayList;
    }

    @Override // defpackage.n90
    public kv1 listRecursively(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        kv1 listRecursively = this.delegate.listRecursively(onPathParameter(oe1Var, "listRecursively", "dir"), z);
        r rVar = new r(this, 16);
        listRecursively.getClass();
        return new o52(listRecursively, rVar, 1);
    }

    @Override // defpackage.n90
    public j90 metadataOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        j90 metadataOrNull = this.delegate.metadataOrNull(onPathParameter(oe1Var, "metadataOrNull", "path"));
        if (metadataOrNull == null) {
            return null;
        }
        oe1 oe1Var2 = metadataOrNull.c;
        if (oe1Var2 == null) {
            return metadataOrNull;
        }
        oe1 onPathResult = onPathResult(oe1Var2, "metadataOrNull");
        boolean z = metadataOrNull.a;
        boolean z2 = metadataOrNull.b;
        Long l = metadataOrNull.d;
        Long l2 = metadataOrNull.e;
        Long l3 = metadataOrNull.f;
        Long l4 = metadataOrNull.g;
        Map map = metadataOrNull.h;
        map.getClass();
        return new j90(z, z2, onPathResult, l, l2, l3, l4, map);
    }

    public oe1 onPathParameter(oe1 oe1Var, String str, String str2) {
        oe1Var.getClass();
        str.getClass();
        str2.getClass();
        return oe1Var;
    }

    public oe1 onPathResult(oe1 oe1Var, String str) {
        oe1Var.getClass();
        str.getClass();
        return oe1Var;
    }

    @Override // defpackage.n90
    public i90 openReadOnly(oe1 oe1Var) {
        oe1Var.getClass();
        return this.delegate.openReadOnly(onPathParameter(oe1Var, "openReadOnly", "file"));
    }

    @Override // defpackage.n90
    public i90 openReadWrite(oe1 oe1Var, boolean z, boolean z2) {
        oe1Var.getClass();
        return this.delegate.openReadWrite(onPathParameter(oe1Var, "openReadWrite", "file"), z, z2);
    }

    @Override // defpackage.n90
    public ey1 sink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        return this.delegate.sink(onPathParameter(oe1Var, "sink", "file"), z);
    }

    @Override // defpackage.n90
    public k12 source(oe1 oe1Var) {
        oe1Var.getClass();
        return this.delegate.source(onPathParameter(oe1Var, "source", "file"));
    }

    public String toString() {
        return yl1.a(getClass()).d() + '(' + this.delegate + ')';
    }
}
