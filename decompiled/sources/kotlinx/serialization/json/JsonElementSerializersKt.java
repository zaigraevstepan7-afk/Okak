package kotlinx.serialization.json;

import defpackage.de0;
import defpackage.lo;
import defpackage.rr0;
import defpackage.se;
import defpackage.yl1;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "encoder", "Lod2;", "verify", "(Lkotlinx/serialization/encoding/Encoder;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "(Lkotlinx/serialization/encoding/Decoder;)V", "Lkotlinx/serialization/json/JsonDecoder;", "asJsonDecoder", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/json/JsonEncoder;", "asJsonEncoder", "(Lkotlinx/serialization/encoding/Encoder;)Lkotlinx/serialization/json/JsonEncoder;", "Lkotlin/Function0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "defer", "(Lde0;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonElementSerializersKt {
    public static final /* synthetic */ SerialDescriptor access$defer(de0 de0Var) {
        return defer(de0Var);
    }

    public static final /* synthetic */ void access$verify(Decoder decoder) {
        verify(decoder);
    }

    public static final JsonDecoder asJsonDecoder(Decoder decoder) {
        JsonDecoder jsonDecoder;
        decoder.getClass();
        if (decoder instanceof JsonDecoder) {
            jsonDecoder = (JsonDecoder) decoder;
        } else {
            jsonDecoder = null;
        }
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        se.g(yl1.a(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final JsonEncoder asJsonEncoder(Encoder encoder) {
        JsonEncoder jsonEncoder;
        encoder.getClass();
        if (encoder instanceof JsonEncoder) {
            jsonEncoder = (JsonEncoder) encoder;
        } else {
            jsonEncoder = null;
        }
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        se.g(yl1.a(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        return null;
    }

    public static final SerialDescriptor defer(de0 de0Var) {
        return new SerialDescriptor(de0Var) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

            /* renamed from: original$delegate, reason: from kotlin metadata */
            private final rr0 original;

            {
                this.original = lo.P(de0Var);
            }

            private final SerialDescriptor getOriginal() {
                return (SerialDescriptor) this.original.getValue();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public List<Annotation> getAnnotations() {
                return super.getAnnotations();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public List<Annotation> getElementAnnotations(int index) {
                return getOriginal().getElementAnnotations(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public SerialDescriptor getElementDescriptor(int index) {
                return getOriginal().getElementDescriptor(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementIndex(String name) {
                name.getClass();
                return getOriginal().getElementIndex(name);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public String getElementName(int index) {
                return getOriginal().getElementName(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementsCount() {
                return getOriginal().getElementsCount();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public SerialKind getKind() {
                return getOriginal().getKind();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public String getSerialName() {
                return getOriginal().getSerialName();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isElementOptional(int index) {
                return getOriginal().isElementOptional(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            /* renamed from: isInline */
            public boolean getIsInline() {
                return super.getIsInline();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isNullable() {
                return super.isNullable();
            }
        };
    }

    public static final void verify(Encoder encoder) {
        asJsonEncoder(encoder);
    }

    public static final /* synthetic */ void access$verify(Encoder encoder) {
        verify(encoder);
    }

    public static final void verify(Decoder decoder) {
        asJsonDecoder(decoder);
    }
}
