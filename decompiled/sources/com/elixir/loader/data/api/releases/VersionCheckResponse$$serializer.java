package com.elixir.loader.data.api.releases;

import defpackage.f00;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/elixir/loader/data/api/releases/VersionCheckResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/elixir/loader/data/api/releases/VersionCheckResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/elixir/loader/data/api/releases/VersionCheckResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/elixir/loader/data/api/releases/VersionCheckResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@f00
/* loaded from: classes.dex */
public final /* synthetic */ class VersionCheckResponse$$serializer implements GeneratedSerializer<VersionCheckResponse> {
    public static final int $stable;
    public static final VersionCheckResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VersionCheckResponse$$serializer versionCheckResponse$$serializer = new VersionCheckResponse$$serializer();
        INSTANCE = versionCheckResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.elixir.loader.data.api.releases.VersionCheckResponse", versionCheckResponse$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("latest_version", false);
        pluginGeneratedSerialDescriptor.addElement("game_version", false);
        pluginGeneratedSerialDescriptor.addElement("changelog", false);
        pluginGeneratedSerialDescriptor.addElement("is_outdated", false);
        pluginGeneratedSerialDescriptor.addElement("hash", false);
        pluginGeneratedSerialDescriptor.addElement("download_url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VersionCheckResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004e. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final VersionCheckResponse deserialize(Decoder decoder) {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(serialDescriptor, 0);
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            str2 = beginStructure.decodeStringElement(serialDescriptor, 5);
            z = decodeBooleanElement;
            str3 = decodeStringElement3;
            str4 = decodeStringElement2;
            str5 = decodeStringElement;
            i = 63;
        } else {
            str = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                    case 0:
                        str = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                    case 1:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                    case 2:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                    case 3:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 |= 8;
                    case 4:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                    case 5:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str6;
            z = z3;
            str3 = str7;
            str4 = str8;
            str5 = str9;
            i = i2;
        }
        String str10 = str;
        beginStructure.endStructure(serialDescriptor);
        return new VersionCheckResponse(i, str10, str5, str4, z, str3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, VersionCheckResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        VersionCheckResponse.write$Self$app_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
