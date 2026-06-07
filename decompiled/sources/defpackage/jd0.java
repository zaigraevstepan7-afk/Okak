package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class jd0 {
    public static final az0 a = new az0(2);
    public static final d9 b = new d9(3);

    /* JADX WARN: Type inference failed for: r8v2, types: [np, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [np, java.lang.Object] */
    public static np a(Context context, List list) {
        Typeface typeface;
        xq1.g("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                kd0 kd0Var = (kd0) list.get(i);
                if (Build.VERSION.SDK_INT >= 31) {
                    String str = kd0Var.e;
                    wm1 wm1Var = ic2.a;
                    if (str != null && !str.isEmpty()) {
                        typeface = Typeface.create(str, 0);
                        Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                        if (typeface != null && !typeface.equals(create)) {
                            if (typeface != null && ic2.b(typeface) != null) {
                                arrayList.add(new ud0[]{new ud0(str, kd0Var.f)});
                            }
                        }
                    }
                    typeface = null;
                    if (typeface != null) {
                        arrayList.add(new ud0[]{new ud0(str, kd0Var.f)});
                    }
                }
                ProviderInfo b2 = b(context.getPackageManager(), kd0Var, context.getResources());
                if (b2 == null) {
                    ?? obj = new Object();
                    obj.a = 1;
                    obj.b = Collections.singletonList(null);
                    return obj;
                }
                arrayList.add(c(context, kd0Var, b2.authority));
            }
            ?? obj2 = new Object();
            obj2.a = 0;
            obj2.b = arrayList;
            return obj2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [id0, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, kd0 kd0Var, Resources resources) {
        d9 d9Var = b;
        az0 az0Var = a;
        xq1.g("FontProvider.getProvider");
        try {
            List list = kd0Var.d;
            String str = kd0Var.a;
            String str2 = kd0Var.b;
            if (list == null) {
                list = hp.I(resources, 0);
            }
            ?? obj = new Object();
            obj.a = str;
            obj.b = str2;
            obj.c = list;
            ProviderInfo providerInfo = (ProviderInfo) az0Var.a(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, d9Var);
                    for (int i = 0; i < list.size(); i++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                        Collections.sort(arrayList2, d9Var);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                    break;
                                }
                            }
                            az0Var.b(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static ud0[] c(Context context, kd0 kd0Var, String str) {
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        xq1.g("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                xq1.g("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {kd0Var.c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i = cursor.getInt(columnIndex);
                            } else {
                                i = 0;
                            }
                            if (columnIndex4 != -1) {
                                i2 = cursor.getInt(columnIndex4);
                            } else {
                                i2 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i3 = cursor.getInt(columnIndex5);
                            } else {
                                i3 = 400;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList2.add(new ud0(uri, i2, i3, z, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (ud0[]) arrayList.toArray(new ud0[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
