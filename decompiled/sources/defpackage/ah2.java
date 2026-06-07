package defpackage;

import android.graphics.Bitmap;
import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.LightManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.View;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.ResourceLoader;
import com.google.android.filament.gltfio.UbershaderProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ah2 {
    public static final zg2 Companion = new Object();
    public final t70 a;
    public Engine b;
    public Renderer c;
    public Scene d;
    public View e;
    public Camera f;
    public AssetLoader g;
    public ResourceLoader h;

    /* JADX WARN: Type inference failed for: r0v0, types: [zg2, java.lang.Object] */
    static {
        int i = f90.a;
        System.loadLibrary("filament-utils-jni");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public ah2() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new Object());
        newSingleThreadExecutor.getClass();
        this.a = new t70(newSingleThreadExecutor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.OutputStream, k80, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r9v1, types: [mm1, java.lang.Object] */
    public static final Bitmap a(ah2 ah2Var, String str, int i, int i2) {
        Renderer renderer;
        Scene scene;
        View view;
        Camera camera;
        FilamentAsset a;
        Engine engine;
        FilamentAsset filamentAsset;
        long nCreateBuilder;
        long nBuilderBuild;
        long nCreateBuilder2;
        boolean nBuilderBuild2;
        if (ah2Var.b == null) {
            nCreateBuilder = Engine.nCreateBuilder();
            new q60(0, nCreateBuilder);
            nBuilderBuild = Engine.nBuilderBuild(nCreateBuilder);
            if (nBuilderBuild != 0) {
                Engine engine2 = new Engine(nBuilderBuild);
                ah2Var.b = engine2;
                Renderer e = engine2.e();
                ?? obj = new Object();
                obj.b = true;
                obj.a = new double[]{0.0d, 0.0d, 0.0d, 0.0d};
                e.f(obj);
                ah2Var.c = e;
                Scene f = engine2.f();
                ah2Var.d = f;
                View h = engine2.h();
                h.e(f);
                h.b();
                h.d();
                ah2Var.e = h;
                EntityManager entityManager = d70.a;
                Camera d = engine2.d(entityManager.a());
                d.c();
                ah2Var.f = d;
                View view2 = ah2Var.e;
                view2.getClass();
                view2.c(d);
                int a2 = entityManager.a();
                nCreateBuilder2 = LightManager.nCreateBuilder(1);
                new q60(1, nCreateBuilder2);
                LightManager.nBuilderColor(nCreateBuilder2, 1.0f, 1.0f, 1.0f);
                LightManager.nBuilderIntensity(nCreateBuilder2, 100000.0f);
                LightManager.nBuilderDirection(nCreateBuilder2, 0.35f, -1.0f, -0.7f);
                LightManager.nBuilderCastShadows(nCreateBuilder2, false);
                nBuilderBuild2 = LightManager.nBuilderBuild(nCreateBuilder2, engine2.getNativeObject(), a2);
                if (nBuilderBuild2) {
                    f.b(a2);
                    ah2Var.g = new AssetLoader(engine2, new UbershaderProvider(engine2), entityManager);
                    ah2Var.h = new ResourceLoader(engine2);
                } else {
                    se.p(l90.i("Couldn't create Light component for entity ", a2, ", see log."));
                    return null;
                }
            } else {
                se.p("Couldn't create Engine");
                return null;
            }
        }
        Engine engine3 = ah2Var.b;
        if (engine3 == null || (renderer = ah2Var.c) == null || (scene = ah2Var.d) == null || (view = ah2Var.e) == null || (camera = ah2Var.f) == null) {
            return null;
        }
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i3 = (int) length;
                byte[] bArr = new byte[i3];
                int i4 = i3;
                int i5 = 0;
                while (i4 > 0) {
                    int read = fileInputStream.read(bArr, i5, i4);
                    if (read < 0) {
                        break;
                    }
                    i4 -= read;
                    i5 += read;
                }
                if (i4 > 0) {
                    bArr = Arrays.copyOf(bArr, i5);
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ?? byteArrayOutputStream = new ByteArrayOutputStream(8193);
                        byteArrayOutputStream.write(read2);
                        byte[] bArr2 = new byte[SharedConstants.DefaultBufferSize];
                        int read3 = fileInputStream.read(bArr2);
                        while (read3 >= 0) {
                            byteArrayOutputStream.write(bArr2, 0, read3);
                            read3 = fileInputStream.read(bArr2);
                            file = file;
                        }
                        File file2 = file;
                        int size = byteArrayOutputStream.size() + i3;
                        if (size >= 0) {
                            byte[] b = byteArrayOutputStream.b();
                            bArr = Arrays.copyOf(bArr, size);
                            bf.z(b, i3, bArr, 0, byteArrayOutputStream.size());
                        } else {
                            throw new OutOfMemoryError("File " + file2 + " is too big to fit in memory.");
                        }
                    }
                }
                fileInputStream.close();
                ByteBuffer put = ByteBuffer.allocateDirect(bArr.length).order(ByteOrder.nativeOrder()).put(bArr);
                put.rewind();
                AssetLoader assetLoader = ah2Var.g;
                if (assetLoader == null || (a = assetLoader.a(put)) == null) {
                    return null;
                }
                SwapChain g = engine3.g(i, i2);
                try {
                    ResourceLoader resourceLoader = ah2Var.h;
                    if (resourceLoader != null) {
                        resourceLoader.a(a);
                    }
                    scene.a(a.b());
                    a.c();
                    sl0 a3 = a.a();
                    float[] fArr = (float[]) a3.e;
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    float f4 = fArr[2];
                    float[] fArr2 = (float[]) a3.f;
                    float f5 = fArr2[1];
                    float f6 = fArr2[2];
                    float tan = ((float) (f5 / Math.tan(Math.toRadians(14.0d)))) * 1.12f;
                    try {
                        camera.d(i / i2, ((f5 + f6) * 4.0f) + tan + 1.0f);
                        double d2 = f2;
                        double d3 = f3;
                        camera.b(d2, d3, f4 - tan, d2, d3, f4);
                        view.f(new u80(i, i2));
                        if (!renderer.a(g, System.nanoTime())) {
                            scene.d(a.b());
                            AssetLoader assetLoader2 = ah2Var.g;
                            if (assetLoader2 != null) {
                                assetLoader2.b(a);
                            }
                            engine3.i(g);
                            return null;
                        }
                        filamentAsset = a;
                        engine = engine3;
                        try {
                            renderer.e(view);
                            ByteBuffer order = ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.nativeOrder());
                            gf0 gf0Var = new gf0(3);
                            gf0Var.e = order;
                            gf0Var.b = 1;
                            gf0Var.c = 1;
                            gf0Var.d = 7;
                            renderer.d(i, i2, gf0Var);
                            renderer.b();
                            engine.j();
                            order.rewind();
                            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            createBitmap.getClass();
                            createBitmap.copyPixelsFromBuffer(order);
                            scene.d(filamentAsset.b());
                            AssetLoader assetLoader3 = ah2Var.g;
                            if (assetLoader3 != null) {
                                assetLoader3.b(filamentAsset);
                            }
                            engine.i(g);
                            return createBitmap;
                        } catch (Throwable th) {
                            th = th;
                            scene.d(filamentAsset.b());
                            AssetLoader assetLoader4 = ah2Var.g;
                            if (assetLoader4 != null) {
                                assetLoader4.b(filamentAsset);
                            }
                            engine.i(g);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        filamentAsset = a;
                        engine = engine3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    engine = engine3;
                    filamentAsset = a;
                }
            } else {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                fc2.u(fileInputStream, th4);
                throw th5;
            }
        }
    }
}
