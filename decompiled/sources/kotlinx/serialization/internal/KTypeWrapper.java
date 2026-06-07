package kotlinx.serialization.internal;

import defpackage.fp;
import defpackage.fp0;
import defpackage.gp0;
import defpackage.sn0;
import defpackage.to0;
import defpackage.uo0;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlinx/serialization/internal/KTypeWrapper;", "Lfp0;", "origin", "<init>", "(Lfp0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lfp0;", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lgp0;", "getArguments", "arguments", "Luo0;", "getClassifier", "()Luo0;", "classifier", "isMarkedNullable", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class KTypeWrapper implements fp0 {
    private final fp0 origin;

    public KTypeWrapper(fp0 fp0Var) {
        fp0Var.getClass();
        this.origin = fp0Var;
    }

    public boolean equals(Object other) {
        KTypeWrapper kTypeWrapper;
        fp0 fp0Var;
        fp0 fp0Var2;
        if (other == null) {
            return false;
        }
        fp0 fp0Var3 = this.origin;
        uo0 uo0Var = null;
        if (other instanceof KTypeWrapper) {
            kTypeWrapper = (KTypeWrapper) other;
        } else {
            kTypeWrapper = null;
        }
        if (kTypeWrapper != null) {
            fp0Var = kTypeWrapper.origin;
        } else {
            fp0Var = null;
        }
        if (!sn0.r(fp0Var3, fp0Var)) {
            return false;
        }
        uo0 classifier = getClassifier();
        if (classifier instanceof to0) {
            if (other instanceof fp0) {
                fp0Var2 = (fp0) other;
            } else {
                fp0Var2 = null;
            }
            if (fp0Var2 != null) {
                uo0Var = fp0Var2.getClassifier();
            }
            if (uo0Var != null && (uo0Var instanceof to0)) {
                return fp.D((to0) classifier).equals(fp.D((to0) uo0Var));
            }
        }
        return false;
    }

    @Override // defpackage.ro0
    public List<Annotation> getAnnotations() {
        return this.origin.getAnnotations();
    }

    @Override // defpackage.fp0
    public List<gp0> getArguments() {
        return this.origin.getArguments();
    }

    @Override // defpackage.fp0
    public uo0 getClassifier() {
        return this.origin.getClassifier();
    }

    public int hashCode() {
        return this.origin.hashCode();
    }

    @Override // defpackage.fp0
    public boolean isMarkedNullable() {
        return this.origin.isMarkedNullable();
    }

    public String toString() {
        return "KTypeWrapper: " + this.origin;
    }
}
