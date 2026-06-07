package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import defpackage.yq1;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class FileDescriptorProtoKt {
    public static final FileDescriptorProtoKt INSTANCE = new FileDescriptorProtoKt();

    private FileDescriptorProtoKt() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ¢\u00012\u00020\u0001:\u0012¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0087\n¢\u0006\u0004\b\u001f\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0012H\u0087\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\"\u0010%J'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'0\u00112\u0006\u0010\u0014\u001a\u00020 H\u0007¢\u0006\u0004\b(\u0010)J(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'0\u00112\u0006\u0010\u0014\u001a\u00020 H\u0087\n¢\u0006\u0004\b*\u0010)J-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020 0\u001aH\u0007¢\u0006\u0004\b+\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020 0\u001aH\u0087\n¢\u0006\u0004\b,\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'0\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 H\u0087\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'0\u0011H\u0007¢\u0006\u0004\b/\u0010%J'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002000\u00112\u0006\u0010\u0014\u001a\u00020 H\u0007¢\u0006\u0004\b1\u0010)J(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002000\u00112\u0006\u0010\u0014\u001a\u00020 H\u0087\n¢\u0006\u0004\b2\u0010)J-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002000\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020 0\u001aH\u0007¢\u0006\u0004\b3\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002000\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020 0\u001aH\u0087\n¢\u0006\u0004\b4\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002000\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 H\u0087\u0002¢\u0006\u0004\b5\u0010.J\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002000\u0011H\u0007¢\u0006\u0004\b6\u0010%J'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002070\u00112\u0006\u0010\u0014\u001a\u00020\u0012H\u0007¢\u0006\u0004\b8\u0010\u0016J(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002070\u00112\u0006\u0010\u0014\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b9\u0010\u0016J-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002070\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0007¢\u0006\u0004\b:\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002070\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0087\n¢\u0006\u0004\b;\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002070\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0012H\u0087\u0002¢\u0006\u0004\b<\u0010#J\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002070\u0011H\u0007¢\u0006\u0004\b<\u0010%J'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u00112\u0006\u0010\u0014\u001a\u00020=H\u0007¢\u0006\u0004\b?\u0010@J(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u00112\u0006\u0010\u0014\u001a\u00020=H\u0087\n¢\u0006\u0004\bA\u0010@J-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020=0\u001aH\u0007¢\u0006\u0004\bB\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020=0\u001aH\u0087\n¢\u0006\u0004\bC\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020=H\u0087\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u0011H\u0007¢\u0006\u0004\bF\u0010%J'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u00112\u0006\u0010\u0014\u001a\u00020GH\u0007¢\u0006\u0004\bI\u0010JJ(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u00112\u0006\u0010\u0014\u001a\u00020GH\u0087\n¢\u0006\u0004\bK\u0010JJ-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020G0\u001aH\u0007¢\u0006\u0004\bL\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020G0\u001aH\u0087\n¢\u0006\u0004\bM\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020GH\u0087\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u0011H\u0007¢\u0006\u0004\bP\u0010%J'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0\u00112\u0006\u0010\u0014\u001a\u00020QH\u0007¢\u0006\u0004\bS\u0010TJ(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0\u00112\u0006\u0010\u0014\u001a\u00020QH\u0087\n¢\u0006\u0004\bU\u0010TJ-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020Q0\u001aH\u0007¢\u0006\u0004\bV\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020Q0\u001aH\u0087\n¢\u0006\u0004\bW\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020QH\u0087\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0\u0011H\u0007¢\u0006\u0004\bZ\u0010%J'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u00112\u0006\u0010\u0014\u001a\u00020[H\u0007¢\u0006\u0004\b]\u0010^J(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u00112\u0006\u0010\u0014\u001a\u00020[H\u0087\n¢\u0006\u0004\b_\u0010^J-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020[0\u001aH\u0007¢\u0006\u0004\b`\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020[0\u001aH\u0087\n¢\u0006\u0004\ba\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020[H\u0087\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u0011H\u0007¢\u0006\u0004\bd\u0010%J\r\u0010e\u001a\u00020\t¢\u0006\u0004\be\u0010\u000bJ\r\u0010f\u001a\u00020\f¢\u0006\u0004\bf\u0010\u000eJ\r\u0010g\u001a\u00020\t¢\u0006\u0004\bg\u0010\u000bJ\r\u0010h\u001a\u00020\f¢\u0006\u0004\bh\u0010\u000eJ\r\u0010i\u001a\u00020\t¢\u0006\u0004\bi\u0010\u000bJ\r\u0010j\u001a\u00020\f¢\u0006\u0004\bj\u0010\u000eJ\r\u0010k\u001a\u00020\t¢\u0006\u0004\bk\u0010\u000bJ\r\u0010l\u001a\u00020\f¢\u0006\u0004\bl\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010mR$\u0010r\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010u\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010o\"\u0004\bt\u0010qR\u001d\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001d\u0010z\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'0\u00118F¢\u0006\u0006\u001a\u0004\by\u0010wR\u001d\u0010|\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002000\u00118F¢\u0006\u0006\u001a\u0004\b{\u0010wR\u001d\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002070\u00118F¢\u0006\u0006\u001a\u0004\b}\u0010wR\u001e\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u00118F¢\u0006\u0006\u001a\u0004\b\u007f\u0010wR\u001f\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0\u00118F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010wR\u001f\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020R0\u00118F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010wR\u001f\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0\u00118F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010wR+\u0010\u008c\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0014\u001a\u00030\u0087\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0087\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R+\u0010\u0095\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0014\u001a\u00030\u0090\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0090\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R'\u0010\u009b\u0001\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010o\"\u0005\b\u009a\u0001\u0010qR+\u0010¡\u0001\u001a\u00030\u009c\u00012\u0007\u0010\u0014\u001a\u00030\u009c\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001¨\u0006«\u0001"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;", "_build", "()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;", "Lod2;", "clearName", "()V", "", "hasName", "()Z", "clearPackage_", "hasPackage_", "Lcom/google/protobuf/kotlin/DslList;", "", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$DependencyProxy;", "value", "addDependency", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignDependency", "plusAssign", "", "values", "addAllDependency", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllDependency", "", "index", "setDependency", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$PublicDependencyProxy;", "addPublicDependency", "(Lcom/google/protobuf/kotlin/DslList;I)V", "plusAssignPublicDependency", "addAllPublicDependency", "plusAssignAllPublicDependency", "setPublicDependency", "(Lcom/google/protobuf/kotlin/DslList;II)V", "clearPublicDependency", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$WeakDependencyProxy;", "addWeakDependency", "plusAssignWeakDependency", "addAllWeakDependency", "plusAssignAllWeakDependency", "setWeakDependency", "clearWeakDependency", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$OptionDependencyProxy;", "addOptionDependency", "plusAssignOptionDependency", "addAllOptionDependency", "plusAssignAllOptionDependency", "setOptionDependency", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto;", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$MessageTypeProxy;", "addMessageType", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$DescriptorProto;)V", "plusAssignMessageType", "addAllMessageType", "plusAssignAllMessageType", "setMessageType", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$DescriptorProto;)V", "clearMessageType", "Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$EnumTypeProxy;", "addEnumType", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;)V", "plusAssignEnumType", "addAllEnumType", "plusAssignAllEnumType", "setEnumType", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;)V", "clearEnumType", "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$ServiceProxy;", "addService", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)V", "plusAssignService", "addAllService", "plusAssignAllService", "setService", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;)V", "clearService", "Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$ExtensionProxy;", "addExtension", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;)V", "plusAssignExtension", "addAllExtension", "plusAssignAllExtension", "setExtension", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;)V", "clearExtension", "clearOptions", "hasOptions", "clearSourceCodeInfo", "hasSourceCodeInfo", "clearSyntax", "hasSyntax", "clearEdition", "hasEdition", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getPackage_", "setPackage_", "package_", "getDependency", "()Lcom/google/protobuf/kotlin/DslList;", "dependency", "getPublicDependency", "publicDependency", "getWeakDependency", "weakDependency", "getOptionDependency", "optionDependency", "getMessageType", "messageType", "getEnumType", "enumType", "getService", "service", "getExtension", "extension", "Lcom/google/protobuf/DescriptorProtos$FileOptions;", "getOptions", "()Lcom/google/protobuf/DescriptorProtos$FileOptions;", "setOptions", "(Lcom/google/protobuf/DescriptorProtos$FileOptions;)V", "options", "getOptionsOrNull", "(Lcom/google/protobuf/FileDescriptorProtoKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$FileOptions;", "optionsOrNull", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;", "getSourceCodeInfo", "()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;", "setSourceCodeInfo", "(Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;)V", "sourceCodeInfo", "getSourceCodeInfoOrNull", "(Lcom/google/protobuf/FileDescriptorProtoKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;", "sourceCodeInfoOrNull", "getSyntax", "setSyntax", "syntax", "Lcom/google/protobuf/DescriptorProtos$Edition;", "getEdition", "()Lcom/google/protobuf/DescriptorProtos$Edition;", "setEdition", "(Lcom/google/protobuf/DescriptorProtos$Edition;)V", "edition", "Companion", "DependencyProxy", "EnumTypeProxy", "ExtensionProxy", "MessageTypeProxy", "OptionDependencyProxy", "PublicDependencyProxy", "ServiceProxy", "WeakDependencyProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.FileDescriptorProto.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$DependencyProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class DependencyProxy extends DslProxy {
            private DependencyProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$EnumTypeProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class EnumTypeProxy extends DslProxy {
            private EnumTypeProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$ExtensionProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class ExtensionProxy extends DslProxy {
            private ExtensionProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$MessageTypeProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class MessageTypeProxy extends DslProxy {
            private MessageTypeProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$OptionDependencyProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class OptionDependencyProxy extends DslProxy {
            private OptionDependencyProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$PublicDependencyProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class PublicDependencyProxy extends DslProxy {
            private PublicDependencyProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$ServiceProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class ServiceProxy extends DslProxy {
            private ServiceProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$WeakDependencyProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class WeakDependencyProxy extends DslProxy {
            private WeakDependencyProxy() {
            }
        }

        private Dsl(DescriptorProtos.FileDescriptorProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DescriptorProtos.FileDescriptorProto _build() {
            DescriptorProtos.FileDescriptorProto build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllDependency(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllDependency(iterable);
        }

        public final /* synthetic */ void addAllEnumType(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllEnumType(iterable);
        }

        public final /* synthetic */ void addAllExtension(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllExtension(iterable);
        }

        public final /* synthetic */ void addAllMessageType(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllMessageType(iterable);
        }

        public final /* synthetic */ void addAllOptionDependency(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllOptionDependency(iterable);
        }

        public final /* synthetic */ void addAllPublicDependency(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllPublicDependency(iterable);
        }

        public final /* synthetic */ void addAllService(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllService(iterable);
        }

        public final /* synthetic */ void addAllWeakDependency(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllWeakDependency(iterable);
        }

        public final /* synthetic */ void addDependency(DslList dslList, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.addDependency(str);
        }

        public final /* synthetic */ void addEnumType(DslList dslList, DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            dslList.getClass();
            enumDescriptorProto.getClass();
            this._builder.addEnumType(enumDescriptorProto);
        }

        public final /* synthetic */ void addExtension(DslList dslList, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            this._builder.addExtension(fieldDescriptorProto);
        }

        public final /* synthetic */ void addMessageType(DslList dslList, DescriptorProtos.DescriptorProto descriptorProto) {
            dslList.getClass();
            descriptorProto.getClass();
            this._builder.addMessageType(descriptorProto);
        }

        public final /* synthetic */ void addOptionDependency(DslList dslList, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.addOptionDependency(str);
        }

        public final /* synthetic */ void addPublicDependency(DslList dslList, int i) {
            dslList.getClass();
            this._builder.addPublicDependency(i);
        }

        public final /* synthetic */ void addService(DslList dslList, DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) {
            dslList.getClass();
            serviceDescriptorProto.getClass();
            this._builder.addService(serviceDescriptorProto);
        }

        public final /* synthetic */ void addWeakDependency(DslList dslList, int i) {
            dslList.getClass();
            this._builder.addWeakDependency(i);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearEnumType(DslList dslList) {
            dslList.getClass();
            this._builder.clearEnumType();
        }

        public final /* synthetic */ void clearExtension(DslList dslList) {
            dslList.getClass();
            this._builder.clearExtension();
        }

        public final /* synthetic */ void clearMessageType(DslList dslList) {
            dslList.getClass();
            this._builder.clearMessageType();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearOptions() {
            this._builder.clearOptions();
        }

        public final void clearPackage_() {
            this._builder.clearPackage();
        }

        public final /* synthetic */ void clearPublicDependency(DslList dslList) {
            dslList.getClass();
            this._builder.clearPublicDependency();
        }

        public final /* synthetic */ void clearService(DslList dslList) {
            dslList.getClass();
            this._builder.clearService();
        }

        public final void clearSourceCodeInfo() {
            this._builder.clearSourceCodeInfo();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final /* synthetic */ void clearWeakDependency(DslList dslList) {
            dslList.getClass();
            this._builder.clearWeakDependency();
        }

        public final DslList<String, DependencyProxy> getDependency() {
            List<String> dependencyList = this._builder.getDependencyList();
            dependencyList.getClass();
            return new DslList<>(dependencyList);
        }

        public final DescriptorProtos.Edition getEdition() {
            DescriptorProtos.Edition edition = this._builder.getEdition();
            edition.getClass();
            return edition;
        }

        public final /* synthetic */ DslList getEnumType() {
            List<DescriptorProtos.EnumDescriptorProto> enumTypeList = this._builder.getEnumTypeList();
            enumTypeList.getClass();
            return new DslList(enumTypeList);
        }

        public final /* synthetic */ DslList getExtension() {
            List<DescriptorProtos.FieldDescriptorProto> extensionList = this._builder.getExtensionList();
            extensionList.getClass();
            return new DslList(extensionList);
        }

        public final /* synthetic */ DslList getMessageType() {
            List<DescriptorProtos.DescriptorProto> messageTypeList = this._builder.getMessageTypeList();
            messageTypeList.getClass();
            return new DslList(messageTypeList);
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final DslList<String, OptionDependencyProxy> getOptionDependency() {
            List<String> optionDependencyList = this._builder.getOptionDependencyList();
            optionDependencyList.getClass();
            return new DslList<>(optionDependencyList);
        }

        public final DescriptorProtos.FileOptions getOptions() {
            DescriptorProtos.FileOptions options = this._builder.getOptions();
            options.getClass();
            return options;
        }

        public final DescriptorProtos.FileOptions getOptionsOrNull(Dsl dsl) {
            dsl.getClass();
            return FileDescriptorProtoKtKt.getOptionsOrNull(dsl._builder);
        }

        public final String getPackage_() {
            String str = this._builder.getPackage();
            str.getClass();
            return str;
        }

        public final /* synthetic */ DslList getPublicDependency() {
            List<Integer> publicDependencyList = this._builder.getPublicDependencyList();
            publicDependencyList.getClass();
            return new DslList(publicDependencyList);
        }

        public final /* synthetic */ DslList getService() {
            List<DescriptorProtos.ServiceDescriptorProto> serviceList = this._builder.getServiceList();
            serviceList.getClass();
            return new DslList(serviceList);
        }

        public final DescriptorProtos.SourceCodeInfo getSourceCodeInfo() {
            DescriptorProtos.SourceCodeInfo sourceCodeInfo = this._builder.getSourceCodeInfo();
            sourceCodeInfo.getClass();
            return sourceCodeInfo;
        }

        public final DescriptorProtos.SourceCodeInfo getSourceCodeInfoOrNull(Dsl dsl) {
            dsl.getClass();
            return FileDescriptorProtoKtKt.getSourceCodeInfoOrNull(dsl._builder);
        }

        public final String getSyntax() {
            String syntax = this._builder.getSyntax();
            syntax.getClass();
            return syntax;
        }

        public final /* synthetic */ DslList getWeakDependency() {
            List<Integer> weakDependencyList = this._builder.getWeakDependencyList();
            weakDependencyList.getClass();
            return new DslList(weakDependencyList);
        }

        public final boolean hasEdition() {
            return this._builder.hasEdition();
        }

        public final boolean hasName() {
            return this._builder.hasName();
        }

        public final boolean hasOptions() {
            return this._builder.hasOptions();
        }

        public final boolean hasPackage_() {
            return this._builder.hasPackage();
        }

        public final boolean hasSourceCodeInfo() {
            return this._builder.hasSourceCodeInfo();
        }

        public final boolean hasSyntax() {
            return this._builder.hasSyntax();
        }

        public final /* synthetic */ void plusAssignAllDependency(DslList<String, DependencyProxy> dslList, Iterable<String> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllDependency(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllEnumType(DslList<DescriptorProtos.EnumDescriptorProto, EnumTypeProxy> dslList, Iterable<DescriptorProtos.EnumDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllEnumType(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllExtension(DslList<DescriptorProtos.FieldDescriptorProto, ExtensionProxy> dslList, Iterable<DescriptorProtos.FieldDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllExtension(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllMessageType(DslList<DescriptorProtos.DescriptorProto, MessageTypeProxy> dslList, Iterable<DescriptorProtos.DescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllMessageType(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptionDependency(DslList<String, OptionDependencyProxy> dslList, Iterable<String> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllOptionDependency(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllPublicDependency(DslList<Integer, PublicDependencyProxy> dslList, Iterable<Integer> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllPublicDependency(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllService(DslList<DescriptorProtos.ServiceDescriptorProto, ServiceProxy> dslList, Iterable<DescriptorProtos.ServiceDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllService(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllWeakDependency(DslList<Integer, WeakDependencyProxy> dslList, Iterable<Integer> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllWeakDependency(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignDependency(DslList<String, DependencyProxy> dslList, String str) {
            dslList.getClass();
            str.getClass();
            addDependency(dslList, str);
        }

        public final /* synthetic */ void plusAssignEnumType(DslList<DescriptorProtos.EnumDescriptorProto, EnumTypeProxy> dslList, DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            dslList.getClass();
            enumDescriptorProto.getClass();
            addEnumType(dslList, enumDescriptorProto);
        }

        public final /* synthetic */ void plusAssignExtension(DslList<DescriptorProtos.FieldDescriptorProto, ExtensionProxy> dslList, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            addExtension(dslList, fieldDescriptorProto);
        }

        public final /* synthetic */ void plusAssignMessageType(DslList<DescriptorProtos.DescriptorProto, MessageTypeProxy> dslList, DescriptorProtos.DescriptorProto descriptorProto) {
            dslList.getClass();
            descriptorProto.getClass();
            addMessageType(dslList, descriptorProto);
        }

        public final /* synthetic */ void plusAssignOptionDependency(DslList<String, OptionDependencyProxy> dslList, String str) {
            dslList.getClass();
            str.getClass();
            addOptionDependency(dslList, str);
        }

        public final /* synthetic */ void plusAssignPublicDependency(DslList<Integer, PublicDependencyProxy> dslList, int i) {
            dslList.getClass();
            addPublicDependency(dslList, i);
        }

        public final /* synthetic */ void plusAssignService(DslList<DescriptorProtos.ServiceDescriptorProto, ServiceProxy> dslList, DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) {
            dslList.getClass();
            serviceDescriptorProto.getClass();
            addService(dslList, serviceDescriptorProto);
        }

        public final /* synthetic */ void plusAssignWeakDependency(DslList<Integer, WeakDependencyProxy> dslList, int i) {
            dslList.getClass();
            addWeakDependency(dslList, i);
        }

        public final /* synthetic */ void setDependency(DslList dslList, int i, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.setDependency(i, str);
        }

        public final void setEdition(DescriptorProtos.Edition edition) {
            edition.getClass();
            this._builder.setEdition(edition);
        }

        public final /* synthetic */ void setEnumType(DslList dslList, int i, DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            dslList.getClass();
            enumDescriptorProto.getClass();
            this._builder.setEnumType(i, enumDescriptorProto);
        }

        public final /* synthetic */ void setExtension(DslList dslList, int i, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            this._builder.setExtension(i, fieldDescriptorProto);
        }

        public final /* synthetic */ void setMessageType(DslList dslList, int i, DescriptorProtos.DescriptorProto descriptorProto) {
            dslList.getClass();
            descriptorProto.getClass();
            this._builder.setMessageType(i, descriptorProto);
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOptionDependency(DslList dslList, int i, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.setOptionDependency(i, str);
        }

        public final void setOptions(DescriptorProtos.FileOptions fileOptions) {
            fileOptions.getClass();
            this._builder.setOptions(fileOptions);
        }

        public final void setPackage_(String str) {
            str.getClass();
            this._builder.setPackage(str);
        }

        public final /* synthetic */ void setPublicDependency(DslList dslList, int i, int i2) {
            dslList.getClass();
            this._builder.setPublicDependency(i, i2);
        }

        public final /* synthetic */ void setService(DslList dslList, int i, DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) {
            dslList.getClass();
            serviceDescriptorProto.getClass();
            this._builder.setService(i, serviceDescriptorProto);
        }

        public final void setSourceCodeInfo(DescriptorProtos.SourceCodeInfo sourceCodeInfo) {
            sourceCodeInfo.getClass();
            this._builder.setSourceCodeInfo(sourceCodeInfo);
        }

        public final void setSyntax(String str) {
            str.getClass();
            this._builder.setSyntax(str);
        }

        public final /* synthetic */ void setWeakDependency(DslList dslList, int i, int i2) {
            dslList.getClass();
            this._builder.setWeakDependency(i, i2);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FileDescriptorProtoKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FileDescriptorProtoKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.FileDescriptorProto.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.FileDescriptorProto.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ void setDependency(DslList dslList) {
            dslList.getClass();
            this._builder.clearDependency();
        }

        public final /* synthetic */ void setOptionDependency(DslList dslList) {
            dslList.getClass();
            this._builder.clearOptionDependency();
        }
    }
}
