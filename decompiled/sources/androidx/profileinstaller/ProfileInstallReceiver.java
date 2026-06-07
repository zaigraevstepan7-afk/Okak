package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.bf;
import defpackage.ej1;
import defpackage.mp0;
import defpackage.rg2;
import java.io.File;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                mp0.R(context, new ej1(0), new rg2(this, 26), true);
                return;
            }
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        rg2 rg2Var = new rg2(this, 26);
                        try {
                            mp0.G(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            rg2Var.b(10, null);
                            return;
                        } catch (PackageManager.NameNotFoundException e) {
                            rg2Var.b(7, e);
                            return;
                        }
                    }
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
                return;
            }
            if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                rg2 rg2Var2 = new rg2(this, 26);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        codeCacheDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    } else {
                        codeCacheDir = context.createDeviceProtectedStorageContext().getCodeCacheDir();
                    }
                    if (bf.L(codeCacheDir)) {
                        rg2Var2.b(14, null);
                        return;
                    } else {
                        rg2Var2.b(15, null);
                        return;
                    }
                }
                rg2Var2.b(16, null);
            }
        }
    }
}
