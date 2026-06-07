package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class ResultHolder implements Shell.ResultCallback {
    private Shell.Result result;

    public Shell.Result getResult() {
        Shell.Result result = this.result;
        if (result == null) {
            return new ResultImpl();
        }
        return result;
    }

    @Override // com.topjohnwu.superuser.Shell.ResultCallback
    public void onResult(Shell.Result result) {
        this.result = result;
    }
}
