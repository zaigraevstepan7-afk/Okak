package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ResultImpl extends Shell.Result {
    int code = -1;
    List<String> err;
    List<String> out;

    @Override // com.topjohnwu.superuser.Shell.Result
    public int getCode() {
        return this.code;
    }

    @Override // com.topjohnwu.superuser.Shell.Result
    public List<String> getErr() {
        List<String> list = this.err;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    @Override // com.topjohnwu.superuser.Shell.Result
    public List<String> getOut() {
        List<String> list = this.out;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }
}
