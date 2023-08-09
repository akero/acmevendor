package com.acme.campaignproject.activity.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import com.acme.campaignproject.R;
import com.acme.campaignproject.activity.dashboard.BaseActivity;
import com.acme.campaignproject.databinding.ActivityWelcomeBinding;
import com.acme.campaignproject.models.SendOtpResponseModel;
import com.acme.campaignproject.utility.NetworkUtils;
import com.acme.campaignproject.viewmodel.WelcomeActivityViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"},
        d2 = {"Lcom/acme/campaignproject/activity/login/WelcomeActivity;", "Lcom/acme/campaignproject/activity/dashboard/BaseActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityWelcomeBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityWelcomeBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityWelcomeBinding;)V", "welcomeActivityViewModel", "Lcom/acme/campaignproject/viewmodel/WelcomeActivityViewModel;", "btnSubmitClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class WelcomeActivity extends BaseActivity {
    public ActivityWelcomeBinding binding;
    private WelcomeActivityViewModel welcomeActivityViewModel;

    @NotNull
    public final ActivityWelcomeBinding getBinding() {
        ActivityWelcomeBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityWelcomeBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, R.layout.activity_welcome);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte….layout.activity_welcome)");
        this.binding = (ActivityWelcomeBinding)var10001;
        this.welcomeActivityViewModel = (WelcomeActivityViewModel)(new ViewModelProvider((ViewModelStoreOwner)this)).get(WelcomeActivityViewModel.class);
        WelcomeActivityViewModel var10000 = this.welcomeActivityViewModel;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("welcomeActivityViewModel");
        }

        var10000.getSuccessresponse().observe((LifecycleOwner)this, (Observer)(new Observer() {
            // $FF: synthetic method
            // $FF: bridge method
            public void onChanged(Object var1) {
                this.onChanged((SendOtpResponseModel)var1);
            }

            public final void onChanged(SendOtpResponseModel it) {
                WelcomeActivity.this.hideProgressDialog();
                Toast.makeText((Context)WelcomeActivity.this, (CharSequence)it.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("result", "ressponse " + it);
                WelcomeActivity var10000 = WelcomeActivity.this;
                Intent var10001 = new Intent((Context)WelcomeActivity.this, LoginActivity.class);
                EditText var10003 = WelcomeActivity.this.getBinding().etEmailId;
                Intrinsics.checkNotNullExpressionValue(var10003, "binding.etEmailId");
                var10000.startActivity(var10001.putExtra("Email", var10003.getText().toString()));
            }
        }));
        var10000 = this.welcomeActivityViewModel;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("welcomeActivityViewModel");
        }

        var10000.getErrorMessage().observe((LifecycleOwner)this, (Observer)(new Observer() {
            // $FF: synthetic method
            // $FF: bridge method
            public void onChanged(Object var1) {
                this.onChanged((String)var1);
            }

            public final void onChanged(String it) {
                WelcomeActivity.this.hideProgressDialog();
                Toast.makeText((Context)WelcomeActivity.this, (CharSequence)it, Toast.LENGTH_SHORT).show();
                Log.d("result", "ressponse " + it);
            }
        }));
    }

    public final void btnSubmitClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityWelcomeBinding var10000 = this.binding;
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
            this.showProgressDialog();
            WelcomeActivityViewModel var4 = this.welcomeActivityViewModel;
            if (var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("welcomeActivityViewModel");
            }

            ActivityWelcomeBinding var10002 = this.binding;
            if (var10002 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            EditText var5 = var10002.etEmailId;
            Intrinsics.checkNotNullExpressionValue(var5, "binding.etEmailId");
            var4.callOtp("+91", var5.getText().toString());
        }
    }
}
