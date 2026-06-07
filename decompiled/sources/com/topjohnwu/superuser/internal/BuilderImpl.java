package com.topjohnwu.superuser.internal;

import android.content.Context;
import android.text.TextUtils;
import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class BuilderImpl extends Shell.Builder {
    private static final String TAG = "BUILDER";
    private String[] command;
    private Shell.Initializer[] initializers;
    long timeout = 20;
    private int flags = 0;

    private ShellImpl exec(String... strArr) {
        try {
            TextUtils.join(" ", strArr);
            return build(Runtime.getRuntime().exec(strArr));
        } catch (IOException e) {
            throw new NoShellException("Unable to create a shell!", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r1.isRoot() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.topjohnwu.superuser.internal.ShellImpl start() {
        /*
            r5 = this;
            r0 = 1
            boolean r1 = r5.hasFlags(r0)
            java.lang.String r2 = "su"
            r3 = 0
            if (r1 != 0) goto L21
            r1 = 2
            boolean r1 = r5.hasFlags(r1)
            if (r1 == 0) goto L21
            java.lang.String r1 = "--mount-master"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch: com.topjohnwu.superuser.NoShellException -> L21
            com.topjohnwu.superuser.internal.ShellImpl r1 = r5.exec(r1)     // Catch: com.topjohnwu.superuser.NoShellException -> L21
            boolean r4 = r1.isRoot()     // Catch: com.topjohnwu.superuser.NoShellException -> L22
            if (r4 != 0) goto L22
        L21:
            r1 = r3
        L22:
            if (r1 != 0) goto L3b
            boolean r4 = r5.hasFlags(r0)
            if (r4 != 0) goto L3b
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: com.topjohnwu.superuser.NoShellException -> L3b
            com.topjohnwu.superuser.internal.ShellImpl r1 = r5.exec(r2)     // Catch: com.topjohnwu.superuser.NoShellException -> L3b
            boolean r2 = r1.isRoot()     // Catch: com.topjohnwu.superuser.NoShellException -> L3b
            if (r2 != 0) goto L39
            goto L3a
        L39:
            r3 = r1
        L3a:
            r1 = r3
        L3b:
            if (r1 != 0) goto L51
            boolean r0 = r5.hasFlags(r0)
            if (r0 != 0) goto L47
            r0 = 0
            com.topjohnwu.superuser.internal.Utils.setConfirmedRootState(r0)
        L47:
            java.lang.String r0 = "sh"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.topjohnwu.superuser.internal.ShellImpl r1 = r5.exec(r0)
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topjohnwu.superuser.internal.BuilderImpl.start():com.topjohnwu.superuser.internal.ShellImpl");
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public ShellImpl build(Process process) {
        try {
            ShellImpl shellImpl = new ShellImpl(this, process);
            if (hasFlags(8)) {
                Shell.enableLegacyStderrRedirection = true;
            }
            MainShell.setCached(shellImpl);
            if (this.initializers != null) {
                Context context = Utils.getContext();
                for (Shell.Initializer initializer : this.initializers) {
                    if (initializer != null && !initializer.onInit(context, shellImpl)) {
                        MainShell.setCached(null);
                        throw new NoShellException("Unable to init shell");
                    }
                }
            }
            return shellImpl;
        } catch (IOException e) {
            throw new NoShellException("Unable to create a shell!", e);
        }
    }

    public boolean hasFlags(int i) {
        if ((this.flags & i) == i) {
            return true;
        }
        return false;
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public Shell.Builder setCommands(String... strArr) {
        this.command = strArr;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public Shell.Builder setFlags(int i) {
        this.flags = i;
        return this;
    }

    public void setInitializersImpl(Class<? extends Shell.Initializer>[] clsArr) {
        this.initializers = new Shell.Initializer[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            try {
                Constructor<? extends Shell.Initializer> declaredConstructor = clsArr[i].getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                this.initializers[i] = declaredConstructor.newInstance(null);
            } catch (ClassCastException | ReflectiveOperationException e) {
                Utils.err(e);
            }
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public Shell.Builder setTimeout(long j) {
        this.timeout = j;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public ShellImpl build() {
        String[] strArr = this.command;
        if (strArr != null) {
            return exec(strArr);
        }
        return start();
    }
}
