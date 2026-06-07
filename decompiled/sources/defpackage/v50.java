package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v50 {
    public static final Object j = new Object();
    public static volatile v50 k;
    public final ReentrantReadWriteLock a;
    public final af b;
    public volatile int c;
    public final Handler d;
    public final s50 e;
    public final u50 f;
    public final xl1 g;
    public final int h;
    public final jy i;

    public v50(md0 md0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        u50 u50Var = md0Var.a;
        this.f = u50Var;
        int i = md0Var.b;
        this.h = i;
        this.i = md0Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new af();
        this.g = new xl1(29);
        s50 s50Var = new s50(this);
        this.e = s50Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                u50Var.a(new r50(s50Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static v50 a() {
        v50 v50Var;
        boolean z;
        synchronized (j) {
            try {
                v50Var = k;
                if (v50Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return v50Var;
    }

    public static boolean d() {
        if (k != null) {
            return true;
        }
        return false;
    }

    public final int b(CharSequence charSequence, int i) {
        boolean z = true;
        if (c() != 1) {
            z = false;
        }
        if (z) {
            go.m(charSequence, "charSequence cannot be null");
            ld ldVar = this.e.b;
            ldVar.getClass();
            if (i >= 0 && i < charSequence.length()) {
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    lc2[] lc2VarArr = (lc2[]) spanned.getSpans(i, i + 1, lc2.class);
                    if (lc2VarArr.length > 0) {
                        return spanned.getSpanStart(lc2VarArr[0]);
                    }
                }
                return ((d60) ldVar.p(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new d60(i))).f;
            }
            return -1;
        }
        se.p("Not initialized yet");
        return 0;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        boolean z;
        if (this.h == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (c() == 1) {
                return;
            }
            this.a.writeLock().lock();
            try {
                if (this.c == 0) {
                    return;
                }
                this.c = 0;
                this.a.writeLock().unlock();
                s50 s50Var = this.e;
                v50 v50Var = s50Var.a;
                try {
                    v50Var.f.a(new r50(s50Var));
                    return;
                } catch (Throwable th) {
                    v50Var.f(th);
                    return;
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
        se.p("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new t50(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void g(EditorInfo editorInfo) {
        int i;
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        s50 s50Var = this.e;
        s50Var.getClass();
        Bundle bundle = editorInfo.extras;
        b11 b11Var = (b11) s50Var.c.f;
        int a = b11Var.a(4);
        if (a != 0) {
            i = ((ByteBuffer) b11Var.h).getInt(a + b11Var.e);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
