package com.google.protobuf;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface MethodOrBuilder extends MessageLiteOrBuilder {
    @Deprecated
    String getEdition();

    @Deprecated
    ByteString getEditionBytes();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    ByteString getResponseTypeUrlBytes();

    @Deprecated
    Syntax getSyntax();

    @Deprecated
    int getSyntaxValue();
}
