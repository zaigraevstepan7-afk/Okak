package com.elixir.loader.data.api.configs;

import defpackage.f00;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/elixir/loader/data/api/configs/ConfigSingleResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@f00
/* loaded from: classes.dex */
public final /* synthetic */ class ConfigSingleResponse$$serializer implements GeneratedSerializer<ConfigSingleResponse> {
    public static final int $stable;
    public static final ConfigSingleResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConfigSingleResponse$$serializer configSingleResponse$$serializer = new ConfigSingleResponse$$serializer();
        INSTANCE = configSingleResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.elixir.loader.data.api.configs.ConfigSingleResponse", configSingleResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("success", false);
        pluginGeneratedSerialDescriptor.addElement("message", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("config_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfigSingleResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigResponse$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final ConfigSingleResponse deserialize(Decoder decoder) {
        boolean z;
        int i;
        String str;
        ConfigResponse configResponse;
        Integer num;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
            String str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            ConfigResponse configResponse2 = (ConfigResponse) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ConfigResponse$$serializer.INSTANCE, null);
            num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            configResponse = configResponse2;
            str = str2;
            i = 15;
        } else {
            boolean z2 = true;
            z = false;
            String str3 = null;
            ConfigResponse configResponse3 = null;
            Integer num2 = null;
            int i2 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex != -1) {
                    if (decodeElementIndex != 0) {
                        if (decodeElementIndex != 1) {
                            if (decodeElementIndex != 2) {
                                if (decodeElementIndex == 3) {
                                    num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num2);
                                    i2 |= 8;
                                } else {
                                    throw new UnknownFieldException(decodeElementIndex);
                                }
                            } else {
                                configResponse3 = (ConfigResponse) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ConfigResponse$$serializer.INSTANCE, configResponse3);
                                i2 |= 4;
                            }
                        } else {
                            str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str3);
                            i2 |= 2;
                        }
                    } else {
                        z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 |= 1;
                    }
                } else {
                    z2 = false;
                }
            }
            i = i2;
            str = str3;
            configResponse = configResponse3;
            num = num2;
        }
        boolean z3 = z;
        beginStructure.endStructure(serialDescriptor);
        return new ConfigSingleResponse(i, z3, str, configResponse, num, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, ConfigSingleResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        ConfigSingleResponse.write$Self$app_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
