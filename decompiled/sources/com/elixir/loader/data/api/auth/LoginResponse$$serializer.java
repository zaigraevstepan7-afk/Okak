package com.elixir.loader.data.api.auth;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/elixir/loader/data/api/auth/LoginResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/elixir/loader/data/api/auth/LoginResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/elixir/loader/data/api/auth/LoginResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/elixir/loader/data/api/auth/LoginResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@f00
/* loaded from: classes.dex */
public final /* synthetic */ class LoginResponse$$serializer implements GeneratedSerializer<LoginResponse> {
    public static final int $stable;
    public static final LoginResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LoginResponse$$serializer loginResponse$$serializer = new LoginResponse$$serializer();
        INSTANCE = loginResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.elixir.loader.data.api.auth.LoginResponse", loginResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("success", false);
        pluginGeneratedSerialDescriptor.addElement("message", false);
        pluginGeneratedSerialDescriptor.addElement("code", false);
        pluginGeneratedSerialDescriptor.addElement("expiresIn", true);
        pluginGeneratedSerialDescriptor.addElement("lifeTime", true);
        pluginGeneratedSerialDescriptor.addElement("expires_in", true);
        pluginGeneratedSerialDescriptor.addElement("life_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LoginResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(booleanSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, stringSerializer, stringSerializer, nullable, nullable2, nullable3, nullable4};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0065. Please report as an issue. */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LoginResponse deserialize(Decoder decoder) {
        boolean z;
        Boolean bool;
        int i;
        String str;
        String str2;
        Long l;
        Boolean bool2;
        Long l2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Long l4 = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            bool = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            l2 = l4;
            l = l3;
            bool2 = bool3;
            str2 = decodeStringElement2;
            str = decodeStringElement;
            i = 127;
        } else {
            boolean z2 = true;
            z = false;
            String str3 = null;
            String str4 = null;
            Long l5 = null;
            Boolean bool4 = null;
            Long l6 = null;
            int i2 = 0;
            Boolean bool5 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                    case 0:
                        i2 |= 1;
                        z = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                    case 1:
                        str3 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                    case 2:
                        str4 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                    case 3:
                        l5 = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l5);
                        i2 |= 8;
                    case 4:
                        bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool4);
                        i2 |= 16;
                    case 5:
                        l6 = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l6);
                        i2 |= 32;
                    case 6:
                        bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool5);
                        i2 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            bool = bool5;
            i = i2;
            str = str3;
            str2 = str4;
            l = l5;
            bool2 = bool4;
            l2 = l6;
        }
        boolean z3 = z;
        beginStructure.endStructure(serialDescriptor);
        return new LoginResponse(i, z3, str, str2, l, bool2, l2, bool, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, LoginResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        LoginResponse.write$Self$app_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
