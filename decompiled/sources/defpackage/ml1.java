package defpackage;

import android.R;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ml1 implements InputConnection {
    public final rg2 a;
    public final boolean b;
    public final gu0 c;
    public final b82 d;
    public final hg2 e;
    public int f;
    public i82 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public ml1(i82 i82Var, rg2 rg2Var, boolean z, gu0 gu0Var, b82 b82Var, hg2 hg2Var) {
        this.a = rg2Var;
        this.b = z;
        this.c = gu0Var;
        this.d = b82Var;
        this.e = hg2Var;
        this.g = i82Var;
    }

    public final void a(h50 h50Var) {
        this.f++;
        try {
            this.j.add(h50Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((hu0) this.a.f).c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.f > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (z) {
            this.f++;
            return true;
        }
        return z;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((hu0) this.a.f).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (sn0.r(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        if (z) {
            return this.b;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new dp(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new xz(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new yz(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [h50, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (z) {
            a(new Object());
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        i82 i82Var = this.g;
        return TextUtils.getCapsMode(i82Var.a.f, d92.f(i82Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.i = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.h = i2;
        }
        return qo.d(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (d92.c(this.g.b)) {
            return null;
        }
        return xq1.m(this.g).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return xq1.n(this.g, i).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return xq1.o(this.g, i).f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new sv1(0, this.g.a.f.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((hu0) this.a.f).d.invoke(new mj0(i2));
            }
            i2 = 1;
            ((hu0) this.a.f).d.invoke(new mj0(i2));
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d7  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r19, java.util.concurrent.Executor r20, final java.util.function.IntConsumer r21) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml1.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        gu0 gu0Var;
        rc rcVar;
        rc rcVar2;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        int i;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int i2;
        RectF deletionArea;
        int granularity3;
        int i3;
        RectF selectionArea;
        int granularity4;
        int i4;
        v82 v82Var;
        if (Build.VERSION.SDK_INT >= 34 && (gu0Var = this.c) != null && (rcVar = gu0Var.j) != null) {
            x82 d = gu0Var.d();
            if (d != null && (v82Var = d.a.a) != null) {
                rcVar2 = v82Var.a;
            } else {
                rcVar2 = null;
            }
            if (rcVar.equals(rcVar2)) {
                boolean r = v7.r(previewableHandwritingGesture);
                int i5 = 1;
                jg0 jg0Var = jg0.e;
                b82 b82Var = this.d;
                if (r) {
                    SelectGesture b = li2.b(previewableHandwritingGesture);
                    if (b82Var != null) {
                        selectionArea = b.getSelectionArea();
                        pl1 Z = fp.Z(selectionArea);
                        granularity4 = b.getGranularity();
                        if (granularity4 != 1) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        long H = fp.H(gu0Var, Z, i4);
                        gu0 gu0Var2 = b82Var.d;
                        if (gu0Var2 != null) {
                            gu0Var2.f(H);
                        }
                        gu0 gu0Var3 = b82Var.d;
                        if (gu0Var3 != null) {
                            gu0Var3.e(d92.b);
                        }
                        if (!d92.c(H)) {
                            b82Var.t(false);
                            b82Var.q(jg0Var);
                        }
                    }
                } else if (pg0.B(previewableHandwritingGesture)) {
                    DeleteGesture l = pg0.l(previewableHandwritingGesture);
                    if (b82Var != null) {
                        deletionArea = l.getDeletionArea();
                        pl1 Z2 = fp.Z(deletionArea);
                        granularity3 = l.getGranularity();
                        if (granularity3 != 1) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        long H2 = fp.H(gu0Var, Z2, i3);
                        gu0 gu0Var4 = b82Var.d;
                        if (gu0Var4 != null) {
                            gu0Var4.e(H2);
                        }
                        gu0 gu0Var5 = b82Var.d;
                        if (gu0Var5 != null) {
                            gu0Var5.f(d92.b);
                        }
                        if (!d92.c(H2)) {
                            b82Var.t(false);
                            b82Var.q(jg0Var);
                        }
                    }
                } else if (pg0.C(previewableHandwritingGesture)) {
                    SelectRangeGesture q = pg0.q(previewableHandwritingGesture);
                    if (b82Var != null) {
                        selectionStartArea = q.getSelectionStartArea();
                        pl1 Z3 = fp.Z(selectionStartArea);
                        selectionEndArea = q.getSelectionEndArea();
                        pl1 Z4 = fp.Z(selectionEndArea);
                        granularity2 = q.getGranularity();
                        if (granularity2 != 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        long m = fp.m(gu0Var, Z3, Z4, i2);
                        gu0 gu0Var6 = b82Var.d;
                        if (gu0Var6 != null) {
                            gu0Var6.f(m);
                        }
                        gu0 gu0Var7 = b82Var.d;
                        if (gu0Var7 != null) {
                            gu0Var7.e(d92.b);
                        }
                        if (!d92.c(m)) {
                            b82Var.t(false);
                            b82Var.q(jg0Var);
                        }
                    }
                } else if (pg0.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture m2 = pg0.m(previewableHandwritingGesture);
                    if (b82Var != null) {
                        deletionStartArea = m2.getDeletionStartArea();
                        pl1 Z5 = fp.Z(deletionStartArea);
                        deletionEndArea = m2.getDeletionEndArea();
                        pl1 Z6 = fp.Z(deletionEndArea);
                        granularity = m2.getGranularity();
                        if (granularity != 1) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        long m3 = fp.m(gu0Var, Z5, Z6, i);
                        gu0 gu0Var8 = b82Var.d;
                        if (gu0Var8 != null) {
                            gu0Var8.e(m3);
                        }
                        gu0 gu0Var9 = b82Var.d;
                        if (gu0Var9 != null) {
                            gu0Var9.f(d92.b);
                        }
                        if (!d92.c(m3)) {
                            b82Var.t(false);
                            b82Var.q(jg0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new gr(b82Var, i5));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            rg2 r9 = r9.a
            java.lang.Object r9 = r9.f
            hu0 r9 = (defpackage.hu0) r9
            cu0 r9 = r9.m
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            i82 r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml1.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (z) {
            ((BaseInputConnection) ((hu0) this.a.f).k.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new qv1(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new rv1(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new sv1(i, i2));
            return true;
        }
        return z;
    }
}
