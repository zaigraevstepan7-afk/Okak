package defpackage;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u9 {
    public final v9 a;
    public final s9 b;
    public final s9 c;
    public final View d;

    public u9(v9 v9Var, s9 s9Var, s9 s9Var2, View view) {
        this.a = v9Var;
        this.b = s9Var;
        this.c = s9Var2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        int i2;
        int i3;
        h62 h62Var = (h62) this.b.invoke();
        final int i4 = 0;
        if (sn0.r(h62Var, null)) {
            return false;
        }
        menu.clear();
        List list = h62Var.a;
        int size = list.size();
        final int i5 = 1;
        int i6 = 0;
        int i7 = 1;
        int i8 = 1;
        while (i6 < size) {
            g62 g62Var = (g62) list.get(i6);
            int i9 = 2;
            if (g62Var instanceof o62) {
                i = i7 + 1;
                final o62 o62Var = (o62) g62Var;
                MenuItem add = menu.add(i8, i7, i7, o62Var.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: t9
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i10;
                        ActivityOptions pendingIntentBackgroundActivityStartMode;
                        int i11 = i4;
                        Object obj = this;
                        Object obj2 = o62Var;
                        switch (i11) {
                            case 0:
                                ((o62) obj2).d.invoke(((u9) obj).a);
                                return true;
                            default:
                                Context context = (Context) obj2;
                                TextClassification textClassification = (TextClassification) obj;
                                String text = textClassification.getText();
                                if (text != null) {
                                    i10 = text.hashCode();
                                } else {
                                    i10 = 0;
                                }
                                PendingIntent activity = PendingIntent.getActivity(context, i10, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    try {
                                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                    }
                                } else {
                                    activity.send();
                                }
                                return true;
                        }
                    }
                });
            } else if (g62Var instanceof u62) {
                i = i7 + 1;
                final Context context = this.d.getContext();
                u62 u62Var = (u62) g62Var;
                final TextClassification textClassification = u62Var.b;
                int i10 = u62Var.c;
                if (i10 < 0) {
                    MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i7, textClassification.getLabel());
                    add2.setShowAsAction(2);
                    add2.setIcon(textClassification.getIcon());
                    add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: t9
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            int i102;
                            ActivityOptions pendingIntentBackgroundActivityStartMode;
                            int i11 = i5;
                            Object obj = textClassification;
                            Object obj2 = context;
                            switch (i11) {
                                case 0:
                                    ((o62) obj2).d.invoke(((u9) obj).a);
                                    return true;
                                default:
                                    Context context2 = (Context) obj2;
                                    TextClassification textClassification2 = (TextClassification) obj;
                                    String text = textClassification2.getText();
                                    if (text != null) {
                                        i102 = text.hashCode();
                                    } else {
                                        i102 = 0;
                                    }
                                    PendingIntent activity = PendingIntent.getActivity(context2, i102, textClassification2.getIntent(), 201326592);
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        try {
                                            pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                            activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                        } catch (PendingIntent.CanceledException e) {
                                            Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                        }
                                    } else {
                                        activity.send();
                                    }
                                    return true;
                            }
                        }
                    });
                } else {
                    if (i10 == 0) {
                        i2 = 1;
                    } else {
                        i2 = i4;
                    }
                    final RemoteAction remoteAction = textClassification.getActions().get(i10);
                    if (i2 != 0) {
                        i3 = 16908353;
                    } else {
                        i3 = i4;
                    }
                    MenuItem add3 = menu.add(R.id.textAssist, i3, i7, remoteAction.getTitle());
                    if (i2 == 0) {
                        i9 = 0;
                    }
                    add3.setShowAsAction(i9);
                    if (i2 != 0 || remoteAction.shouldShowIcon()) {
                        add3.setIcon(remoteAction.getIcon().loadDrawable(context));
                    }
                    add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: m92
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            ActivityOptions pendingIntentBackgroundActivityStartMode;
                            PendingIntent actionIntent = remoteAction.getActionIntent();
                            if (Build.VERSION.SDK_INT >= 34) {
                                try {
                                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                    actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                } catch (PendingIntent.CanceledException e) {
                                    Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                }
                                return true;
                            }
                            actionIntent.send();
                            return true;
                        }
                    });
                }
            } else {
                if (g62Var instanceof s62) {
                    i8++;
                }
                i6++;
                i4 = 0;
            }
            i7 = i;
            i6++;
            i4 = 0;
        }
        return true;
    }
}
