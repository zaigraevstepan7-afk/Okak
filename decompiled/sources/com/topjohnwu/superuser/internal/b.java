package com.topjohnwu.superuser.internal;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ OpenFile f;
    public final /* synthetic */ ParcelFileDescriptor g;

    public /* synthetic */ b(OpenFile openFile, ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.e = i;
        this.f = openFile;
        this.g = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        ParcelFileDescriptor parcelFileDescriptor = this.g;
        OpenFile openFile = this.f;
        switch (i) {
            case 0:
                FileSystemService.b(openFile, parcelFileDescriptor);
                return;
            default:
                FileSystemService.a(openFile, parcelFileDescriptor);
                return;
        }
    }
}
