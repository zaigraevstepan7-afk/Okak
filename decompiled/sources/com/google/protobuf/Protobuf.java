package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@CheckReturnValue
/* loaded from: classes.dex */
public final class Protobuf {
    private static final Protobuf INSTANCE = new Protobuf();
    private final ConcurrentMap<Class<?>, Schema<?>> schemaCache = new ConcurrentHashMap();
    private final SchemaFactory schemaFactory = new ManifestSchemaFactory();

    private Protobuf() {
    }

    public static Protobuf getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int i = 0;
        for (Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof MessageSchema) {
                i += ((MessageSchema) schema).getSchemaSize();
            }
        }
        return i;
    }

    public <T> boolean isInitialized(T t) {
        return schemaFor((Protobuf) t).isInitialized(t);
    }

    public <T> void makeImmutable(T t) {
        schemaFor((Protobuf) t).makeImmutable(t);
    }

    public <T> void mergeFrom(T t, Reader reader) {
        mergeFrom(t, reader, ExtensionRegistryLite.getEmptyRegistry());
    }

    public Schema<?> registerSchema(Class<?> cls, Schema<?> schema) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(cls, schema);
    }

    public Schema<?> registerSchemaOverride(Class<?> cls, Schema<?> schema) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(cls, schema);
    }

    public <T> Schema<T> schemaFor(Class<T> cls) {
        Internal.checkNotNull(cls, "messageType");
        Schema<T> schema = (Schema) this.schemaCache.get(cls);
        if (schema == null) {
            schema = this.schemaFactory.createSchema(cls);
            Schema<T> schema2 = (Schema<T>) registerSchema(cls, schema);
            if (schema2 != null) {
                return schema2;
            }
        }
        return schema;
    }

    public <T> void writeTo(T t, Writer writer) {
        schemaFor((Protobuf) t).writeTo(t, writer);
    }

    public <T> void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        schemaFor((Protobuf) t).mergeFrom(t, reader, extensionRegistryLite);
    }

    public <T> Schema<T> schemaFor(T t) {
        return schemaFor((Class) t.getClass());
    }
}
