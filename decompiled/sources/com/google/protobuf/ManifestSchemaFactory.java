package com.google.protobuf;

import defpackage.se;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@CheckReturnValue
/* loaded from: classes.dex */
public final class ManifestSchemaFactory implements SchemaFactory {
    private static final MessageInfoFactory EMPTY_FACTORY = new MessageInfoFactory() { // from class: com.google.protobuf.ManifestSchemaFactory.1
        @Override // com.google.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final MessageInfoFactory messageInfoFactory;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* renamed from: com.google.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class CompositeMessageInfoFactory implements MessageInfoFactory {
        private MessageInfoFactory[] factories;

        public CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
            this.factories = messageInfoFactoryArr;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            se.v("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.messageInfoFactory = (MessageInfoFactory) Internal.checkNotNull(messageInfoFactory, "messageInfoFactory");
    }

    private static boolean allowExtensions(MessageInfo messageInfo) {
        if (AnonymousClass2.$SwitchMap$com$google$protobuf$ProtoSyntax[messageInfo.getSyntax().ordinal()] != 1) {
            return true;
        }
        return false;
    }

    private static MessageInfoFactory getDefaultMessageInfoFactory() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static MessageInfoFactory getDescriptorMessageInfoFactory() {
        if (Android.assumeLiteRuntime) {
            return EMPTY_FACTORY;
        }
        try {
            return (MessageInfoFactory) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static <T> Schema<T> newSchema(Class<T> cls, MessageInfo messageInfo) {
        ExtensionSchema<?> extensionSchema = null;
        if (useLiteRuntime(cls)) {
            NewInstanceSchema lite = NewInstanceSchemas.lite();
            ListFieldSchema lite2 = ListFieldSchemas.lite();
            UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema = SchemaUtil.unknownFieldSetLiteSchema();
            if (allowExtensions(messageInfo)) {
                extensionSchema = ExtensionSchemas.lite();
            }
            return MessageSchema.newSchema(cls, messageInfo, lite, lite2, unknownFieldSetLiteSchema, extensionSchema, MapFieldSchemas.lite());
        }
        NewInstanceSchema full = NewInstanceSchemas.full();
        ExtensionSchema<?> extensionSchema2 = null;
        ListFieldSchema full2 = ListFieldSchemas.full();
        UnknownFieldSchema<?, ?> unknownFieldSetFullSchema = SchemaUtil.unknownFieldSetFullSchema();
        if (allowExtensions(messageInfo)) {
            extensionSchema2 = ExtensionSchemas.full();
        }
        return MessageSchema.newSchema(cls, messageInfo, full, full2, unknownFieldSetFullSchema, extensionSchema2, MapFieldSchemas.full());
    }

    private static boolean useLiteRuntime(Class<?> cls) {
        if (!Android.assumeLiteRuntime && !GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.SchemaFactory
    public <T> Schema<T> createSchema(Class<T> cls) {
        SchemaUtil.requireGeneratedMessage(cls);
        MessageInfo messageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            if (useLiteRuntime(cls)) {
                return MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), messageInfoFor.getDefaultInstance());
            }
            return MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetFullSchema(), ExtensionSchemas.full(), messageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, messageInfoFor);
    }

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }
}
