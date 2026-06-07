package com.google.android.filament.gltfio;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface MaterialProvider {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class MaterialKey {
        public int alphaMode;
        public int aoUV;
        public int baseColorUV;
        public int clearCoatNormalUV;
        public int clearCoatRoughnessUV;
        public int clearCoatUV;
        public boolean doubleSided;
        public int emissiveUV;
        public boolean enableDiagnostics;
        public boolean hasBaseColorTexture;
        public boolean hasClearCoat;
        public boolean hasClearCoatNormalTexture;
        public boolean hasClearCoatRoughnessTexture;
        public boolean hasClearCoatTexture;
        public boolean hasEmissiveTexture;
        public boolean hasIOR;
        public boolean hasMetallicRoughnessTexture;
        public boolean hasNormalTexture;
        public boolean hasOcclusionTexture;
        public boolean hasSheen;
        public boolean hasSheenColorTexture;
        public boolean hasSheenRoughnessTexture;
        public boolean hasTextureTransforms;
        public boolean hasTransmission;
        public boolean hasTransmissionTexture;
        public boolean hasVertexColors;
        public boolean hasVolumeThicknessTexture;
        public int metallicRoughnessUV;
        public int normalUV;
        public int sheenColorUV;
        public int sheenRoughnessUV;
        public int transmissionUV;
        public boolean unlit;
        public boolean useSpecularGlossiness;
        public int volumeThicknessUV;

        static {
            nGlobalInit();
        }

        private static native void nGlobalInit();
    }
}
