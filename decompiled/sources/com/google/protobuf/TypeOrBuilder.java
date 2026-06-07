package com.google.protobuf;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Field getFields(int i);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i);

    ByteString getOneofsBytes(int i);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
