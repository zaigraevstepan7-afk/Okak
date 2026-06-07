package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class q81 implements InputConnection {
    public final n3 a;
    public ml1 b;

    public q81(ml1 ml1Var, n3 n3Var) {
        this.a = n3Var;
        this.b = ml1Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            if (ml1Var != null) {
                ml1Var.closeConnection();
                this.b = null;
            }
            this.a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        ml1 ml1Var = this.b;
        if (ml1Var != null) {
            return ml1Var.setSelection(i, i2);
        }
        return false;
    }
}
