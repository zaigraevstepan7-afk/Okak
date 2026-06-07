package com.elixir.loader.data.local;

import com.elixir.loader.UserSettings;
import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.od2;
import defpackage.vt;
import defpackage.yq1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/elixir/loader/data/local/UserSettingsSerializer;", "<init>", "()V", "Ljava/io/InputStream;", "input", "Lcom/elixir/loader/UserSettings;", "readFrom", "(Ljava/io/InputStream;Lvt;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "Lod2;", "writeTo", "(Lcom/elixir/loader/UserSettings;Ljava/io/OutputStream;Lvt;)Ljava/lang/Object;", "defaultValue", "Lcom/elixir/loader/UserSettings;", "getDefaultValue", "()Lcom/elixir/loader/UserSettings;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UserSettingsSerializer {
    public static final int $stable = 0;
    public static final UserSettingsSerializer INSTANCE = new UserSettingsSerializer();
    private static final UserSettings defaultValue;

    static {
        UserSettings defaultInstance = UserSettings.getDefaultInstance();
        defaultInstance.getClass();
        defaultValue = defaultInstance;
    }

    private UserSettingsSerializer() {
    }

    /* renamed from: getDefaultValue, reason: collision with other method in class */
    public /* bridge */ Object m2getDefaultValue() {
        return getDefaultValue();
    }

    public Object readFrom(InputStream inputStream, vt<? super UserSettings> vtVar) {
        try {
            UserSettings parseFrom = UserSettings.parseFrom(inputStream);
            parseFrom.getClass();
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new IOException("Cannot read proto.", e);
        }
    }

    public /* bridge */ Object writeTo(Object obj, OutputStream outputStream, vt vtVar) {
        return writeTo((UserSettings) obj, outputStream, (vt<? super od2>) vtVar);
    }

    public UserSettings getDefaultValue() {
        return defaultValue;
    }

    public Object writeTo(UserSettings userSettings, OutputStream outputStream, vt<? super od2> vtVar) {
        userSettings.writeTo(outputStream);
        return od2.a;
    }
}
