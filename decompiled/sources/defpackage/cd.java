package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.elixir.loader.ElixirApplication;
import java.io.File;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cd {
    public final ElixirApplication a;

    public cd(ElixirApplication elixirApplication) {
        this.a = elixirApplication;
    }

    public final void a(File file) {
        file.getClass();
        ElixirApplication elixirApplication = this.a;
        Uri d = FileProvider.d(elixirApplication, elixirApplication.getPackageName() + ".fileprovider", file);
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        intent.setData(d);
        intent.setFlags(268435457);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        elixirApplication.startActivity(intent);
    }
}
