package com.elixir.loader.data.api.configs;

import defpackage.to0;
import defpackage.yl1;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/elixir/loader/data/api/configs/BaseResponse;", "", "success", "", "getSuccess", "()Z", "message", "", "getMessage", "()Ljava/lang/String;", "Companion", "Lcom/elixir/loader/data/api/configs/CommonResponse;", "Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;", "Lcom/elixir/loader/data/api/configs/ConfigsListResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@Serializable
/* loaded from: classes.dex */
public interface BaseResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/elixir/loader/data/api/configs/BaseResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/elixir/loader/data/api/configs/BaseResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<BaseResponse> serializer() {
            return new SealedClassSerializer("com.elixir.loader.data.api.configs.BaseResponse", yl1.a(BaseResponse.class), new to0[]{yl1.a(CommonResponse.class), yl1.a(ConfigSingleResponse.class), yl1.a(ConfigsListResponse.class)}, new KSerializer[]{CommonResponse$$serializer.INSTANCE, ConfigSingleResponse$$serializer.INSTANCE, ConfigsListResponse$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    String getMessage();

    boolean getSuccess();
}
