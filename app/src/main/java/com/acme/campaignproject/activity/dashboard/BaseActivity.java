package com.acme.campaignproject.activity.dashboard;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.acme.campaignproject.R;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000bH\u0014J\u0010\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001a"},
        d2 = {"Lcom/acme/campaignproject/activity/dashboard/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "pDialog", "Landroidx/appcompat/app/AlertDialog;", "getPDialog", "()Landroidx/appcompat/app/AlertDialog;", "setPDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "addProgress", "hideProgressDialog", "", "logMessage", "_TAG", "", "_message", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showAlert", "msg", "listener", "Lcom/acme/campaignproject/activity/dashboard/BaseActivity$OnDialogOkListener;", "showProgressDialog", "OnDialogOkListener", "app_debug"}
)
public abstract class BaseActivity extends AppCompatActivity {
    @Nullable
    private AlertDialog pDialog;

    @Nullable
    public final AlertDialog getPDialog() {
        return this.pDialog;
    }

    public final void setPDialog(@Nullable AlertDialog var1) {
        this.pDialog = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    public final AlertDialog addProgress() {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setCancelable(false);
        LayoutInflater inflater = LayoutInflater.from((Context)this);
        View view = inflater.inflate(R.layout.custom_progess, (ViewGroup)null);
        builder.setView(view);
        AlertDialog var10000 = builder.create();
        Intrinsics.checkNotNullExpressionValue(var10000, "builder.create()");
        AlertDialog dialog = var10000;
        if (dialog != null) {
            Window var5 = dialog.getWindow();
            Intrinsics.checkNotNull(var5);
            Intrinsics.checkNotNullExpressionValue(var5, "dialog.window!!");
            var5.getDecorView().setBackgroundResource(android.R.color.transparent);
        }

        return dialog;
    }

    public final void showProgressDialog() {
        AlertDialog var10000;
        if (this.pDialog == null) {
            this.pDialog = this.addProgress();
            var10000 = this.pDialog;
            Intrinsics.checkNotNull(var10000);
            var10000.show();
        } else {
            if (this.pDialog != null) {
                var10000 = this.pDialog;
                Intrinsics.checkNotNull(var10000);
                if (!var10000.isShowing()) {
                    var10000 = this.pDialog;
                    Intrinsics.checkNotNull(var10000);
                    var10000.show();
                } else {
                    var10000 = this.pDialog;
                    Intrinsics.checkNotNull(var10000);
                    var10000.dismiss();
                }
            }

            this.logMessage("dialogg", "not null");
        }

    }

    public final void hideProgressDialog() {
        if (this.pDialog != null) {
            AlertDialog var10000 = this.pDialog;
            Intrinsics.checkNotNull(var10000);
            if (var10000.isShowing()) {
                var10000 = this.pDialog;
                Intrinsics.checkNotNull(var10000);
                var10000.dismiss();
            }
        }

    }

    public final void logMessage(@Nullable String _TAG, @Nullable String _message) {
        Intrinsics.checkNotNull(_message);
        Log.e(_TAG, _message);
    }

    public final void showAlert(@Nullable String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setCancelable(false);
        LayoutInflater inflater = LayoutInflater.from((Context)this);
        View view = inflater.inflate(R.layout.custom_popup, (ViewGroup)null);
        TextView tvMsg = (TextView)view.findViewById(R.id.tvMsg);
        Intrinsics.checkNotNullExpressionValue(tvMsg, "tvMsg");
        tvMsg.setTypeface(Typeface.createFromAsset(this.getAssets(), "fonts/pregular.otf"));
        tvMsg.setText((CharSequence)msg);
        Button btnOk = (Button)view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(btnOk, "btnOk");
        btnOk.setTypeface(Typeface.createFromAsset(this.getAssets(), "fonts/pbold.otf"));
        builder.setView(view);
        AlertDialog var10000 = builder.create();
        Intrinsics.checkNotNullExpressionValue(var10000, "builder.create()");
        final AlertDialog dialog = var10000;
        if (dialog != null) {
            Window var8 = dialog.getWindow();
            Intrinsics.checkNotNull(var8);
            Intrinsics.checkNotNullExpressionValue(var8, "dialog.window!!");
            var8.getDecorView().setBackgroundResource(android.R.color.transparent);
        }

        btnOk.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                if (dialog != null) {
                    dialog.dismiss();
                }

            }
        }));
        if (dialog != null) {
            dialog.show();
        }

    }

    public final void showAlert(@Nullable String msg, @NotNull final OnDialogOkListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setCancelable(false);
        LayoutInflater inflater = LayoutInflater.from((Context)this);
        View view = inflater.inflate(R.layout.custom_popup, (ViewGroup)null);
        TextView tvMsg = (TextView)view.findViewById(R.id.tvMsg);
        Intrinsics.checkNotNullExpressionValue(tvMsg, "tvMsg");
        tvMsg.setTypeface(Typeface.createFromAsset(this.getAssets(), "fonts/pregular.otf"));
        tvMsg.setText((CharSequence)msg);
        Button btnOk = (Button)view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(btnOk, "btnOk");
        btnOk.setTypeface(Typeface.createFromAsset(this.getAssets(), "fonts/pbold.otf"));
        builder.setView(view);
        AlertDialog var10000 = builder.create();
        Intrinsics.checkNotNullExpressionValue(var10000, "builder.create()");
        final AlertDialog dialog = var10000;
        if (dialog != null) {
            Window var9 = dialog.getWindow();
            Intrinsics.checkNotNull(var9);
            Intrinsics.checkNotNullExpressionValue(var9, "dialog.window!!");
            var9.getDecorView().setBackgroundResource(android.R.color.transparent);
        }

        btnOk.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                if (dialog != null) {
                    dialog.dismiss();
                    listener.onOk();
                }

            }
        }));
        if (dialog != null) {
            dialog.show();
        }

    }

    protected void onDestroy() {
        this.hideProgressDialog();
        super.onDestroy();
    }

    @Metadata(
            mv = {1, 7, 0},
            k = 1,
            d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"},
            d2 = {"Lcom/acme/campaignproject/activity/dashboard/BaseActivity$OnDialogOkListener;", "", "onOk", "", "app_debug"}
    )
    public interface OnDialogOkListener {
        void onOk();
    }
}
