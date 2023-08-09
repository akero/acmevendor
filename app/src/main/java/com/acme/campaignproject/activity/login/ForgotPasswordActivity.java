package com.acme.campaignproject.activity.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.acme.campaignproject.R;
import com.acme.campaignproject.databinding.ActivityForgotPasswordBinding;
import com.acme.campaignproject.utility.NetworkUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0006\u0010\u0011\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"},
        d2 = {"Lcom/acme/campaignproject/activity/login/ForgotPasswordActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityForgotPasswordBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityForgotPasswordBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityForgotPasswordBinding;)V", "btnSigninClick", "", "view", "Landroid/view/View;", "btnSubmitClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showSuccessMessage", "app_debug"}
)
public final class ForgotPasswordActivity extends AppCompatActivity {
    public ActivityForgotPasswordBinding binding;

    @NotNull
    public final ActivityForgotPasswordBinding getBinding() {
        ActivityForgotPasswordBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityForgotPasswordBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, R.layout.activity_forgot_password);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…activity_forgot_password)");
        this.binding = (ActivityForgotPasswordBinding)var10001;
    }

    public final void btnSubmitClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityForgotPasswordBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        EditText var3 = var10000.etEmailId;
        Intrinsics.checkNotNullExpressionValue(var3, "binding.etEmailId");
        CharSequence var2 = (CharSequence)var3.getText();
        if (var2 == null || var2.length() == 0) {
            Toast.makeText((Context)this, (CharSequence)"Fill the Email", Toast.LENGTH_SHORT).show();
        } else if (!NetworkUtils.Companion.isNetworkAvailable((Context)this)) {
            Toast.makeText((Context)this, (CharSequence)"Check your Internet Connection and Try Again", Toast.LENGTH_SHORT).show();
        } else {
            this.showSuccessMessage();
        }

    }

    public final void btnSigninClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.startActivity(new Intent((Context)this, LoginActivity.class));
    }

    public final void showSuccessMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setCancelable(false);
        LayoutInflater inflater = LayoutInflater.from((Context)this);
        View var10000 = inflater.inflate(R.layout.custom_emailsent, (ViewGroup)null);
        Intrinsics.checkNotNullExpressionValue(var10000, "inflater.inflate(R.layout.custom_emailsent, null)");
        View view = var10000;
        TextView tvResubmit = (TextView)view.findViewById(R.id.tvResubmit);
        String text = "<font color=#0089BE>Can't get email? </font> <font color=#DA2829>Resubmit</font>";
        Intrinsics.checkNotNullExpressionValue(tvResubmit, "tvResubmit");
        tvResubmit.setText((CharSequence)Html.fromHtml(text));
        Button btnClose = (Button)view.findViewById(R.id.btnClose);
        builder.setView(view);
        AlertDialog var8 = builder.create();
        Intrinsics.checkNotNullExpressionValue(var8, "builder.create()");
        final AlertDialog dialog = var8;
        if (dialog != null) {
            Window var9 = dialog.getWindow();
            Intrinsics.checkNotNull(var9);
            Intrinsics.checkNotNullExpressionValue(var9, "dialog.window!!");
            var9.getDecorView().setBackgroundResource(android.R.color.transparent);
        }

        btnClose.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                if (dialog != null) {
                    dialog.dismiss();
                    ForgotPasswordActivity.this.finish();
                }

            }
        }));
        if (dialog != null) {
            dialog.show();
        }

    }
}
