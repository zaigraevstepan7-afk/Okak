package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ec1 implements j01 {
    public final oe0 a;
    public final boolean b;
    public final o72 c;
    public final l72 d;
    public final pc1 e;
    public final float f;

    public ec1(oe0 oe0Var, boolean z, o72 o72Var, l72 l72Var, pc1 pc1Var, float f) {
        this.a = oe0Var;
        this.b = z;
        this.c = o72Var;
        this.d = l72Var;
        this.e = pc1Var;
        this.f = f;
    }

    public static final int j(int i, ec1 ec1Var, int i2, int i3, ig1 ig1Var, ig1 ig1Var2) {
        int i4;
        if (ec1Var.b) {
            i3 = Math.round(((i2 - ig1Var2.f) / 2.0f) * 1.0f);
        }
        int i5 = i + i3;
        if (ig1Var != null) {
            i4 = ig1Var.f;
        } else {
            i4 = 0;
        }
        return Math.max(i5, i4 / 2);
    }

    @Override // defpackage.j01
    public final int a(mn0 mn0Var, List list, int i) {
        return i(mn0Var, list, i, new p11(4));
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, wl1] */
    @Override // defpackage.j01
    public final k01 b(final l01 l01Var, List list, long j) {
        Object obj;
        ig1 ig1Var;
        int i;
        int i2;
        Object obj2;
        ig1 ig1Var2;
        int i3;
        ig1 ig1Var3;
        int i4;
        int i5;
        Object obj3;
        ig1 ig1Var4;
        int i6;
        ig1 ig1Var5;
        int i7;
        int i8;
        Object obj4;
        ig1 ig1Var6;
        int i9;
        ig1 ig1Var7;
        int i10;
        int i11;
        Object obj5;
        ig1 ig1Var8;
        long j2;
        Object obj6;
        int i12;
        int i13;
        Object obj7;
        ig1 ig1Var9;
        int i14;
        int i15;
        int i16;
        int i17;
        ig1 ig1Var10;
        int i18;
        wl1 wl1Var;
        int i19;
        wl1 wl1Var2;
        ig1 ig1Var11;
        int i20;
        long j3;
        int i21;
        ig1 ig1Var12;
        ig1 ig1Var13;
        int i22;
        ig1 ig1Var14;
        e01 e01Var;
        ec1 ec1Var;
        l01 l01Var2;
        ig1 ig1Var15;
        int i23;
        ig1 ig1Var16;
        ig1 ig1Var17;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        ig1 ig1Var18;
        int i30;
        int i31;
        int i32;
        wl1 wl1Var3;
        int i33;
        ec1 ec1Var2;
        ig1 ig1Var19;
        ig1 ig1Var20;
        int i34;
        ig1 ig1Var21;
        int i35;
        l01 l01Var3;
        float f;
        int i36;
        int i37;
        List list2 = list;
        float invoke = this.d.invoke();
        pc1 pc1Var = this.e;
        int j0 = l01Var.j0(pc1Var.a());
        long a = us.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i38 = 0;
        while (true) {
            if (i38 < size) {
                obj = list2.get(i38);
                if (sn0.r(sn0.E((e01) obj), "Leading")) {
                    break;
                }
                i38++;
            } else {
                obj = null;
                break;
            }
        }
        e01 e01Var2 = (e01) obj;
        if (e01Var2 != null) {
            ig1Var = e01Var2.x(a);
        } else {
            ig1Var = null;
        }
        if (ig1Var != null) {
            i = ig1Var.e;
        } else {
            i = 0;
        }
        if (ig1Var != null) {
            i2 = ig1Var.f;
        } else {
            i2 = 0;
        }
        int max = Math.max(0, i2);
        int size2 = list2.size();
        int i39 = 0;
        while (true) {
            if (i39 < size2) {
                obj2 = list2.get(i39);
                if (sn0.r(sn0.E((e01) obj2), "Trailing")) {
                    break;
                }
                i39++;
            } else {
                obj2 = null;
                break;
            }
        }
        e01 e01Var3 = (e01) obj2;
        if (e01Var3 != null) {
            ig1Var2 = ig1Var;
            i3 = i;
            ig1Var3 = e01Var3.x(vs.j(-i, 0, 2, a));
        } else {
            ig1Var2 = ig1Var;
            i3 = i;
            ig1Var3 = null;
        }
        if (ig1Var3 != null) {
            i4 = ig1Var3.e;
        } else {
            i4 = 0;
        }
        int i40 = i3 + i4;
        if (ig1Var3 != null) {
            i5 = ig1Var3.f;
        } else {
            i5 = 0;
        }
        int max2 = Math.max(max, i5);
        int size3 = list2.size();
        int i41 = 0;
        while (true) {
            if (i41 < size3) {
                obj3 = list2.get(i41);
                int i42 = size3;
                if (sn0.r(sn0.E((e01) obj3), "Prefix")) {
                    break;
                }
                i41++;
                size3 = i42;
            } else {
                obj3 = null;
                break;
            }
        }
        e01 e01Var4 = (e01) obj3;
        if (e01Var4 != null) {
            ig1Var4 = ig1Var3;
            i6 = i40;
            ig1Var5 = e01Var4.x(vs.j(-i40, 0, 2, a));
        } else {
            ig1Var4 = ig1Var3;
            i6 = i40;
            ig1Var5 = null;
        }
        if (ig1Var5 != null) {
            i7 = ig1Var5.e;
        } else {
            i7 = 0;
        }
        int i43 = i6 + i7;
        if (ig1Var5 != null) {
            i8 = ig1Var5.f;
        } else {
            i8 = 0;
        }
        int max3 = Math.max(max2, i8);
        int size4 = list2.size();
        int i44 = 0;
        while (true) {
            if (i44 < size4) {
                obj4 = list2.get(i44);
                int i45 = size4;
                if (sn0.r(sn0.E((e01) obj4), "Suffix")) {
                    break;
                }
                i44++;
                size4 = i45;
            } else {
                obj4 = null;
                break;
            }
        }
        e01 e01Var5 = (e01) obj4;
        if (e01Var5 != null) {
            ig1Var6 = ig1Var5;
            i9 = i43;
            ig1Var7 = e01Var5.x(vs.j(-i43, 0, 2, a));
        } else {
            ig1Var6 = ig1Var5;
            i9 = i43;
            ig1Var7 = null;
        }
        if (ig1Var7 != null) {
            i10 = ig1Var7.e;
        } else {
            i10 = 0;
        }
        int i46 = i9 + i10;
        if (ig1Var7 != null) {
            i11 = ig1Var7.f;
        } else {
            i11 = 0;
        }
        int max4 = Math.max(max3, i11);
        int size5 = list2.size();
        int i47 = 0;
        while (true) {
            if (i47 < size5) {
                obj5 = list2.get(i47);
                int i48 = size5;
                if (sn0.r(sn0.E((e01) obj5), "Label")) {
                    break;
                }
                i47++;
                size5 = i48;
            } else {
                obj5 = null;
                break;
            }
        }
        e01 e01Var6 = (e01) obj5;
        ?? obj8 = new Object();
        int j02 = l01Var.j0(pc1Var.c(l01Var.getLayoutDirection())) + l01Var.j0(pc1Var.b(l01Var.getLayoutDirection()));
        int i49 = -lo.R(invoke, i46 + j02, j02);
        int i50 = -j0;
        long i51 = vs.i(a, i49, i50);
        if (e01Var6 != null) {
            ig1Var8 = e01Var6.x(i51);
        } else {
            ig1Var8 = null;
        }
        obj8.e = ig1Var8;
        if (ig1Var8 != null) {
            float f2 = ig1Var8.e;
            float f3 = ig1Var8.f;
            j2 = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        } else {
            j2 = 0;
        }
        this.a.invoke(new fy1(j2));
        int size6 = list2.size();
        int i52 = 0;
        while (true) {
            if (i52 < size6) {
                obj6 = list2.get(i52);
                if (sn0.r(sn0.E((e01) obj6), "Supporting")) {
                    break;
                }
                i52++;
            } else {
                obj6 = null;
                break;
            }
        }
        e01 e01Var7 = (e01) obj6;
        if (e01Var7 != null) {
            i12 = e01Var7.Y(us.j(j));
        } else {
            i12 = 0;
        }
        ig1 ig1Var22 = (ig1) obj8.e;
        if (ig1Var22 != null) {
            i13 = ig1Var22.f;
        } else {
            i13 = 0;
        }
        int max5 = Math.max(i13 / 2, l01Var.j0(pc1Var.d()));
        long j4 = j;
        long i53 = vs.i(j4, -i46, (i50 - max5) - i12);
        e01 e01Var8 = e01Var7;
        long a2 = us.a(i53, 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i54 = 0;
        while (i54 < size7) {
            e01 e01Var9 = e01Var8;
            e01 e01Var10 = (e01) list2.get(i54);
            int i55 = max5;
            int i56 = size7;
            if (sn0.r(sn0.E(e01Var10), "TextField")) {
                ig1 x = e01Var10.x(a2);
                long a3 = us.a(a2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i57 = 0;
                while (true) {
                    if (i57 < size8) {
                        Object obj9 = list2.get(i57);
                        int i58 = size8;
                        if (sn0.r(sn0.E((e01) obj9), "Hint")) {
                            obj7 = obj9;
                            break;
                        }
                        i57++;
                        size8 = i58;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                e01 e01Var11 = (e01) obj7;
                if (e01Var11 != null) {
                    ig1Var9 = e01Var11.x(a3);
                } else {
                    ig1Var9 = null;
                }
                int i59 = x.f;
                if (ig1Var9 != null) {
                    i14 = ig1Var9.f;
                } else {
                    i14 = 0;
                }
                int max6 = Math.max(max4, Math.max(i59, i14) + i55 + j0);
                if (ig1Var2 != null) {
                    i15 = ig1Var2.e;
                } else {
                    i15 = 0;
                }
                ig1 ig1Var23 = ig1Var4;
                if (ig1Var4 != null) {
                    i16 = ig1Var23.e;
                } else {
                    i16 = 0;
                }
                ig1 ig1Var24 = ig1Var6;
                if (ig1Var6 != null) {
                    i17 = ig1Var24.e;
                } else {
                    i17 = 0;
                }
                int i60 = i17;
                if (ig1Var7 != null) {
                    i18 = ig1Var7.e;
                    ig1Var10 = ig1Var23;
                } else {
                    ig1Var10 = ig1Var23;
                    i18 = 0;
                }
                int i61 = x.e;
                ig1 ig1Var25 = ig1Var10;
                ig1 ig1Var26 = (ig1) obj8.e;
                if (ig1Var26 != null) {
                    i19 = ig1Var26.e;
                    wl1Var = obj8;
                } else {
                    wl1Var = obj8;
                    i19 = 0;
                }
                if (ig1Var9 != null) {
                    ig1Var11 = x;
                    i20 = i15;
                    wl1Var2 = wl1Var;
                    j3 = j4;
                    i21 = ig1Var9.e;
                    ig1Var12 = ig1Var9;
                    ig1Var13 = ig1Var7;
                    i22 = i60;
                    ig1Var14 = ig1Var24;
                    e01Var = e01Var9;
                    ec1Var = this;
                    ig1Var15 = ig1Var2;
                    i23 = max6;
                    ig1Var16 = ig1Var25;
                    l01Var2 = l01Var;
                } else {
                    wl1Var2 = wl1Var;
                    ig1Var11 = x;
                    i20 = i15;
                    j3 = j4;
                    i21 = 0;
                    ig1Var12 = ig1Var9;
                    ig1Var13 = ig1Var7;
                    i22 = i60;
                    ig1Var14 = ig1Var24;
                    e01Var = e01Var9;
                    ec1Var = this;
                    l01Var2 = l01Var;
                    ig1Var15 = ig1Var2;
                    i23 = max6;
                    ig1Var16 = ig1Var25;
                }
                final int g = ec1Var.g(l01Var2, i20, i16, i22, i18, i61, i19, i21, j3, invoke);
                long a4 = us.a(vs.j(0, -i23, 1, a), 0, g, 0, 0, 9);
                if (e01Var != null) {
                    ig1Var17 = e01Var.x(a4);
                } else {
                    ig1Var17 = null;
                }
                if (ig1Var17 != null) {
                    i24 = ig1Var17.f;
                } else {
                    i24 = 0;
                }
                ig1 ig1Var27 = ig1Var15;
                if (ig1Var15 != null) {
                    i25 = ig1Var27.f;
                } else {
                    i25 = 0;
                }
                final ig1 ig1Var28 = ig1Var16;
                if (ig1Var16 != null) {
                    i26 = ig1Var28.f;
                } else {
                    i26 = 0;
                }
                ig1 ig1Var29 = ig1Var14;
                if (ig1Var29 != null) {
                    i27 = ig1Var29.f;
                } else {
                    i27 = 0;
                }
                ig1 ig1Var30 = ig1Var13;
                if (ig1Var30 != null) {
                    i28 = ig1Var30.f;
                } else {
                    i28 = 0;
                }
                ig1 ig1Var31 = ig1Var11;
                int i62 = ig1Var31.f;
                wl1 wl1Var4 = wl1Var2;
                ig1 ig1Var32 = (ig1) wl1Var4.e;
                if (ig1Var32 != null) {
                    i29 = ig1Var32.f;
                } else {
                    i29 = 0;
                }
                int i63 = i24;
                final ig1 ig1Var33 = ig1Var12;
                if (ig1Var33 != null) {
                    ig1Var18 = ig1Var30;
                    i30 = i28;
                    i31 = i62;
                    i32 = ig1Var33.f;
                } else {
                    ig1Var18 = ig1Var30;
                    i30 = i28;
                    i31 = i62;
                    i32 = 0;
                }
                if (ig1Var17 != null) {
                    wl1Var3 = wl1Var4;
                    i33 = ig1Var17.f;
                    ig1Var19 = ig1Var29;
                    ig1Var20 = ig1Var31;
                    i34 = i29;
                    ig1Var21 = ig1Var27;
                    i35 = 0;
                    l01Var3 = l01Var;
                    f = invoke;
                    ec1Var2 = this;
                } else {
                    wl1Var3 = wl1Var4;
                    i33 = 0;
                    ec1Var2 = this;
                    ig1Var19 = ig1Var29;
                    ig1Var20 = ig1Var31;
                    i34 = i29;
                    ig1Var21 = ig1Var27;
                    i35 = 0;
                    l01Var3 = l01Var;
                    f = invoke;
                }
                final int f4 = ec1Var2.f(l01Var3, i25, i26, i27, i30, i31, i34, i32, i33, j, f);
                final float f5 = f;
                int i64 = f4 - i63;
                int size9 = list.size();
                int i65 = i35;
                while (i65 < size9) {
                    e01 e01Var12 = (e01) list.get(i65);
                    if (sn0.r(sn0.E(e01Var12), "Container")) {
                        if (g != Integer.MAX_VALUE) {
                            i36 = g;
                        } else {
                            i36 = i35;
                        }
                        if (i64 != Integer.MAX_VALUE) {
                            i37 = i64;
                        } else {
                            i37 = i35;
                        }
                        final ig1 x2 = e01Var12.x(vs.a(i36, g, i37, i64));
                        final ig1 ig1Var34 = ig1Var21;
                        final ig1 ig1Var35 = ig1Var19;
                        final ig1 ig1Var36 = ig1Var18;
                        final wl1 wl1Var5 = wl1Var3;
                        final ig1 ig1Var37 = ig1Var20;
                        final ig1 ig1Var38 = ig1Var17;
                        return l01Var.s0(g, f4, m60.e, new oe0() { // from class: dc1
                            @Override // defpackage.oe0
                            public final Object invoke(Object obj10) {
                                int i66;
                                int i67;
                                ec1 ec1Var3;
                                int i68;
                                int i69;
                                ec1 ec1Var4;
                                int i70;
                                int i71;
                                int i72;
                                int i73;
                                int i74;
                                int i75;
                                float f6;
                                float f7;
                                float f8;
                                float f9;
                                float f10;
                                hg1 hg1Var = (hg1) obj10;
                                ig1 ig1Var39 = (ig1) wl1Var5.e;
                                l01 l01Var4 = l01Var;
                                float a5 = l01Var4.a();
                                jq0 layoutDirection = l01Var4.getLayoutDirection();
                                ec1 ec1Var5 = ec1.this;
                                float W = l01Var4.W(ec1Var5.f);
                                o72 o72Var = ec1Var5.c;
                                pc1 pc1Var2 = ec1Var5.e;
                                hg1.i(hg1Var, x2, 0, 0);
                                ig1 ig1Var40 = ig1Var38;
                                if (ig1Var40 != null) {
                                    i66 = ig1Var40.f;
                                } else {
                                    i66 = 0;
                                }
                                int i76 = f4 - i66;
                                int R = c01.R(pc1Var2.d() * a5);
                                ig1 ig1Var41 = ig1Var34;
                                if (ig1Var41 != null) {
                                    hg1.k(hg1Var, ig1Var41, 0, Math.round(((i76 - ig1Var41.f) / 2.0f) * 1.0f));
                                }
                                int i77 = g;
                                ig1 ig1Var42 = ig1Var28;
                                if (ig1Var39 != null) {
                                    if (ec1Var5.b) {
                                        i75 = Math.round(((i76 - ig1Var39.f) / 2.0f) * 1.0f);
                                    } else {
                                        i75 = R;
                                    }
                                    int i78 = -(ig1Var39.f / 2);
                                    i67 = i77;
                                    float f11 = f5;
                                    int R2 = lo.R(f11, i75, i78);
                                    float u = sn0.u(pc1Var2, layoutDirection) * a5;
                                    float t = sn0.t(pc1Var2, layoutDirection) * a5;
                                    if (ig1Var41 == null) {
                                        f7 = u;
                                        f6 = 0.0f;
                                    } else {
                                        f6 = 0.0f;
                                        float f12 = ig1Var41.e;
                                        float f13 = u - W;
                                        if (f13 < 0.0f) {
                                            f13 = 0.0f;
                                        }
                                        f7 = f12 + f13;
                                    }
                                    if (ig1Var42 == null) {
                                        ec1Var3 = ec1Var5;
                                        f8 = t;
                                    } else {
                                        ec1Var3 = ec1Var5;
                                        float f14 = ig1Var42.e;
                                        float f15 = t - W;
                                        if (f15 < f6) {
                                            f15 = f6;
                                        }
                                        f8 = f14 + f15;
                                    }
                                    jq0 jq0Var = jq0.e;
                                    if (layoutDirection == jq0Var) {
                                        f9 = u;
                                    } else {
                                        f9 = t;
                                    }
                                    if (layoutDirection == jq0Var) {
                                        f10 = f7;
                                    } else {
                                        f10 = f8;
                                    }
                                    hg1.i(hg1Var, ig1Var39, c01.R(lo.Q(o72Var.b.a(ig1Var39.e, i67 - c01.R(f7 + f8), layoutDirection) + f10, ((ii) pp1.p(o72Var)).a(ig1Var39.e, i67 - c01.R(u + t), layoutDirection) + f9, f11)), R2);
                                } else {
                                    i67 = i77;
                                    ec1Var3 = ec1Var5;
                                }
                                ig1 ig1Var43 = ig1Var35;
                                if (ig1Var43 != null) {
                                    if (ig1Var41 != null) {
                                        i74 = ig1Var41.e;
                                    } else {
                                        i74 = 0;
                                    }
                                    i68 = R;
                                    i69 = i76;
                                    ec1Var4 = ec1Var3;
                                    i70 = 0;
                                    hg1.k(hg1Var, ig1Var43, i74, ec1.j(0, ec1Var4, i69, i68, ig1Var39, ig1Var43));
                                } else {
                                    i68 = R;
                                    i69 = i76;
                                    ec1Var4 = ec1Var3;
                                    i70 = 0;
                                }
                                if (ig1Var41 != null) {
                                    i71 = ig1Var41.e;
                                } else {
                                    i71 = 0;
                                }
                                if (ig1Var43 != null) {
                                    i72 = ig1Var43.e;
                                } else {
                                    i72 = 0;
                                }
                                int i79 = i71 + i72;
                                ig1 ig1Var44 = ig1Var37;
                                hg1.k(hg1Var, ig1Var44, i79, ec1.j(i70, ec1Var4, i69, i68, ig1Var39, ig1Var44));
                                ig1 ig1Var45 = ig1Var33;
                                if (ig1Var45 != null) {
                                    hg1.k(hg1Var, ig1Var45, i79, ec1.j(i70, ec1Var4, i69, i68, ig1Var39, ig1Var45));
                                }
                                ig1 ig1Var46 = ig1Var36;
                                if (ig1Var46 != null) {
                                    if (ig1Var42 != null) {
                                        i73 = ig1Var42.e;
                                    } else {
                                        i73 = 0;
                                    }
                                    hg1.k(hg1Var, ig1Var46, (i67 - i73) - ig1Var46.e, ec1.j(i70, ec1Var4, i69, i68, ig1Var39, ig1Var46));
                                }
                                if (ig1Var42 != null) {
                                    hg1.k(hg1Var, ig1Var42, i67 - ig1Var42.e, Math.round(((i69 - ig1Var42.f) / 2.0f) * 1.0f));
                                }
                                if (ig1Var40 != null) {
                                    hg1.k(hg1Var, ig1Var40, 0, i69);
                                }
                                return od2.a;
                            }
                        });
                    }
                    i65++;
                    f4 = f4;
                }
                iw0.b("Collection contains no element matching the predicate.");
                se.c();
                return null;
            }
            i54++;
            j4 = j;
            e01Var8 = e01Var9;
            size7 = i56;
            ig1Var6 = ig1Var6;
            list2 = list2;
            max5 = i55;
        }
        iw0.b("Collection contains no element matching the predicate.");
        se.c();
        return null;
    }

    @Override // defpackage.j01
    public final int c(mn0 mn0Var, List list, int i) {
        return i(mn0Var, list, i, new p11(6));
    }

    @Override // defpackage.j01
    public final int d(mn0 mn0Var, List list, int i) {
        return h(mn0Var, list, i, new p11(5));
    }

    @Override // defpackage.j01
    public final int e(mn0 mn0Var, List list, int i) {
        return h(mn0Var, list, i, new p11(3));
    }

    public final int f(mn0 mn0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, lo.R(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        pc1 pc1Var = this.e;
        float W = mn0Var.W(pc1Var.d());
        return vs.f(Math.max(i, Math.max(i2, c01.R(lo.Q(W, Math.max(W, i6 / 2.0f), f) + i5 + mn0Var.W(pc1Var.a())))) + i8, j);
    }

    public final int g(mn0 mn0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, lo.R(f, i6, 0))) + i + i2;
        pc1 pc1Var = this.e;
        jq0 jq0Var = jq0.e;
        return vs.g(Math.max(max, c01.R((i6 + mn0Var.W(pc1Var.c(jq0Var) + pc1Var.b(jq0Var))) * f)), j);
    }

    public final int h(mn0 mn0Var, List list, int i, se0 se0Var) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        int i5;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        int i8;
        Object obj7;
        int i9;
        ec1 ec1Var = this;
        float invoke = ec1Var.d.invoke();
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (sn0.r(xn.B((e01) obj), "Leading")) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        e01 e01Var = (e01) obj;
        if (e01Var != null) {
            i2 = xn.T(i, e01Var.s(Integer.MAX_VALUE));
            i3 = ((Number) se0Var.invoke(e01Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                obj2 = list.get(i11);
                if (sn0.r(xn.B((e01) obj2), "Trailing")) {
                    break;
                }
                i11++;
            } else {
                obj2 = null;
                break;
            }
        }
        e01 e01Var2 = (e01) obj2;
        if (e01Var2 != null) {
            i2 = xn.T(i2, e01Var2.s(Integer.MAX_VALUE));
            i4 = ((Number) se0Var.invoke(e01Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 < size3) {
                obj3 = list.get(i12);
                if (sn0.r(xn.B((e01) obj3), "Label")) {
                    break;
                }
                i12++;
            } else {
                obj3 = null;
                break;
            }
        }
        Object obj8 = (e01) obj3;
        if (obj8 != null) {
            i5 = ((Number) se0Var.invoke(obj8, Integer.valueOf(lo.R(invoke, i2, i)))).intValue();
        } else {
            i5 = 0;
        }
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 < size4) {
                obj4 = list.get(i13);
                if (sn0.r(xn.B((e01) obj4), "Prefix")) {
                    break;
                }
                i13++;
            } else {
                obj4 = null;
                break;
            }
        }
        e01 e01Var3 = (e01) obj4;
        if (e01Var3 != null) {
            i6 = ((Number) se0Var.invoke(e01Var3, Integer.valueOf(i2))).intValue();
            i2 = xn.T(i2, e01Var3.s(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size5) {
                obj5 = list.get(i14);
                if (sn0.r(xn.B((e01) obj5), "Suffix")) {
                    break;
                }
                i14++;
            } else {
                obj5 = null;
                break;
            }
        }
        e01 e01Var4 = (e01) obj5;
        if (e01Var4 != null) {
            i7 = ((Number) se0Var.invoke(e01Var4, Integer.valueOf(i2))).intValue();
            i2 = xn.T(i2, e01Var4.s(Integer.MAX_VALUE));
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        int i15 = 0;
        while (i15 < size6) {
            Object obj9 = list.get(i15);
            if (sn0.r(xn.B((e01) obj9), "TextField")) {
                int intValue = ((Number) se0Var.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size7) {
                        obj6 = list.get(i16);
                        if (sn0.r(xn.B((e01) obj6), "Hint")) {
                            break;
                        }
                        i16++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                Object obj10 = (e01) obj6;
                if (obj10 != null) {
                    i8 = ((Number) se0Var.invoke(obj10, Integer.valueOf(i2))).intValue();
                } else {
                    i8 = 0;
                }
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size8) {
                        obj7 = list.get(i17);
                        if (sn0.r(xn.B((e01) obj7), "Supporting")) {
                            break;
                        }
                        i17++;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                Object obj11 = (e01) obj7;
                if (obj11 != null) {
                    i9 = ((Number) se0Var.invoke(obj11, Integer.valueOf(i))).intValue();
                } else {
                    i9 = 0;
                }
                int i18 = i4;
                int i19 = i9;
                return ec1Var.f(mn0Var, i3, i18, i6, i7, intValue, i5, i8, i19, vs.b(0, 0, 15), invoke);
            }
            i15++;
            i7 = i7;
            ec1Var = this;
            i6 = i6;
        }
        iw0.b("Collection contains no element matching the predicate.");
        se.c();
        return 0;
    }

    public final int i(mn0 mn0Var, List list, int i, se0 se0Var) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        Object obj5;
        int i5;
        Object obj6;
        int i6;
        int i7;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj7 = list.get(i8);
            if (sn0.r(xn.B((e01) obj7), "TextField")) {
                int intValue = ((Number) se0Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i9 = 0;
                while (true) {
                    obj = null;
                    if (i9 < size2) {
                        obj2 = list.get(i9);
                        if (sn0.r(xn.B((e01) obj2), "Label")) {
                            break;
                        }
                        i9++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                e01 e01Var = (e01) obj2;
                if (e01Var != null) {
                    i2 = ((Number) se0Var.invoke(e01Var, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                int size3 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size3) {
                        obj3 = list.get(i10);
                        if (sn0.r(xn.B((e01) obj3), "Trailing")) {
                            break;
                        }
                        i10++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                e01 e01Var2 = (e01) obj3;
                if (e01Var2 != null) {
                    i3 = ((Number) se0Var.invoke(e01Var2, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                int size4 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size4) {
                        obj4 = list.get(i11);
                        if (sn0.r(xn.B((e01) obj4), "Leading")) {
                            break;
                        }
                        i11++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                e01 e01Var3 = (e01) obj4;
                if (e01Var3 != null) {
                    i4 = ((Number) se0Var.invoke(e01Var3, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                int size5 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size5) {
                        obj5 = list.get(i12);
                        if (sn0.r(xn.B((e01) obj5), "Prefix")) {
                            break;
                        }
                        i12++;
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                e01 e01Var4 = (e01) obj5;
                if (e01Var4 != null) {
                    i5 = ((Number) se0Var.invoke(e01Var4, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                int size6 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size6) {
                        obj6 = list.get(i13);
                        if (sn0.r(xn.B((e01) obj6), "Suffix")) {
                            break;
                        }
                        i13++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                e01 e01Var5 = (e01) obj6;
                if (e01Var5 != null) {
                    i6 = ((Number) se0Var.invoke(e01Var5, Integer.valueOf(i))).intValue();
                } else {
                    i6 = 0;
                }
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i14);
                    if (sn0.r(xn.B((e01) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i14++;
                }
                e01 e01Var6 = (e01) obj;
                if (e01Var6 != null) {
                    i7 = ((Number) se0Var.invoke(e01Var6, Integer.valueOf(i))).intValue();
                } else {
                    i7 = 0;
                }
                return g(mn0Var, i4, i3, i5, i6, intValue, i2, i7, vs.b(0, 0, 15), this.d.invoke());
            }
        }
        iw0.b("Collection contains no element matching the predicate.");
        se.c();
        return 0;
    }
}
