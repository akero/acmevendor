package com.acme.campaignproject.activity.login;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.acme.campaignproject.R;
import com.acme.campaignproject.databinding.ActivityChangePasswordBinding;
import com.acme.campaignproject.utility.NetworkUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"},
        d2 = {"Lcom/acme/campaignproject/activity/login/ChangePasswordActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityChangePasswordBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityChangePasswordBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityChangePasswordBinding;)V", "btnResetClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class ChangePasswordActivity extends AppCompatActivity {
    public ActivityChangePasswordBinding binding;

    @NotNull
    public final ActivityChangePasswordBinding getBinding() {
        ActivityChangePasswordBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityChangePasswordBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, R.layout.activity_change_password);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…activity_change_password)");
        this.binding = (ActivityChangePasswordBinding)var10001;
    }

    public final void btnResetClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityChangePasswordBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        EditText var3 = var10000.etOldPassword;
        Intrinsics.checkNotNullExpressionValue(var3, "binding.etOldPassword");
        CharSequence var2 = (CharSequence)var3.getText();
        if (var2 != null && var2.length() != 0) {
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.etNewPassword;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.etNewPassword");
            var2 = (CharSequence)var3.getText();
            if (var2 != null && var2.length() != 0) {
                var10000 = this.binding;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }

                var3 = var10000.etConfirmPassword;
                Intrinsics.checkNotNullExpressionValue(var3, "binding.etConfirmPassword");
                var2 = (CharSequence)var3.getText();
                if (var2 != null && var2.length() != 0) {
                    var10000 = this.binding;
                    if (var10000 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }

                    var3 = var10000.etNewPassword;
                    Intrinsics.checkNotNullExpressionValue(var3, "binding.etNewPassword");
                    var2 = (CharSequence)var3.getText();
                    Boolean var5 = var2 == null || var2.length() == 0;
                    ActivityChangePasswordBinding var10001 = this.binding;
                    if (var10001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }

                    EditText var4 = var10001.etConfirmPassword;
                    Intrinsics.checkNotNullExpressionValue(var4, "binding.etConfirmPassword");
                    var2 = (CharSequence)var4.getText();
                    if (!var5.equals(var2 == null || var2.length() == 0)) {
                        Toast.makeText((Context)this, (CharSequence)"New and Confirm Passwords must be same", Toast.LENGTH_SHORT).show();
                    } else if (!NetworkUtils.Companion.isNetworkAvailable((Context)this)) {
                        Toast.makeText((Context)this, (CharSequence)"Check your Internet Connection and Try Again", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    return;
                }
            }
        }

        Toast.makeText((Context)this, (CharSequence)"Fill all the fields", Toast.LENGTH_SHORT).show();
    }
}
