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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/elixir/loader/data/api/releases/VersionResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/elixir/loader/data/api/releases/VersionResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/elixir/loader/data/api/releases/VersionResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/elixir/loader/data/api/releases/VersionResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@f00
/* loaded from: classes.dex */
public final /* synthetic */ class VersionResponse$$serializer implements GeneratedSerializer<VersionResponse> {
    public static final int $stable;
    public static final VersionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VersionResponse$$serializer versionResponse$$serializer = new VersionResponse$$serializer();
        INSTANCE = versionResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.elixir.loader.data.api.releases.VersionResponse", versionResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("game_version", false);
        pluginGeneratedSerialDescriptor.addElement("changelog", false);
        pluginGeneratedSerialDescriptor.addElement("upload_date", false);
        pluginGeneratedSerialDescriptor.addElement("filename", false);
        pluginGeneratedSerialDescriptor.addElement("hash", false);
        pluginGeneratedSerialDescriptor.addElement("sub_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VersionResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x005b. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final VersionResponse deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        long j;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(serialDescriptor, 0);
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            long decodeLongElement = beginStructure.decodeLongElement(serialDescriptor, 3);
            String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            str2 = beginStructure.decodeStringElement(serialDescriptor, 6);
            str3 = decodeStringElement4;
            str4 = decodeStringElement3;
            i = 127;
            str5 = decodeStringElement2;
            str6 = decodeStringElement;
            j = decodeLongElement;
        } else {
            str = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            boolean z = true;
            int i2 = 0;
            long j2 = 0;
            String str10 = null;
            String str11 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
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
                        j2 = beginStructure.decodeLongElement(serialDescriptor, 3);
                        i2 |= 8;
                    case 4:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                    case 5:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                    case 6:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str10;
            str3 = str11;
            str4 = str7;
            i = i2;
            str5 = str8;
            str6 = str9;
            j = j2;
        }
        String str12 = str;
        beginStructure.endStructure(serialDescriptor);
        return new VersionResponse(i, str12, str6, str5, j, str4, str3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, VersionResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        VersionResponse.write$Self$app_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
