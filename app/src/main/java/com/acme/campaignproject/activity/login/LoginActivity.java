package com.acme.campaignproject.activity.login;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import com.acme.campaignproject.R;
import com.acme.campaignproject.activity.dashboard.AdminDashboardActivity;
import com.acme.campaignproject.activity.dashboard.BaseActivity;
import com.acme.campaignproject.activity.dashboard.ClientDashBoardActivity;
import com.acme.campaignproject.activity.vender.VenderDashBoardActivity;
import com.acme.campaignproject.databinding.ActivityLoginBinding;
import com.acme.campaignproject.models.SendOtpResponseModel;
import com.acme.campaignproject.utility.AppPreferences;
import com.acme.campaignproject.utility.NetworkUtils;
import com.acme.campaignproject.viewmodel.LoginActivityViewModel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"},
        d2 = {"Lcom/acme/campaignproject/activity/login/LoginActivity;", "Lcom/acme/campaignproject/activity/dashboard/BaseActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityLoginBinding;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "hidePassword", "", "getHidePassword", "()Z", "setHidePassword", "(Z)V", "loginActivityViewModel", "Lcom/acme/campaignproject/viewmodel/LoginActivityViewModel;", "loginType", "", "getLoginType", "()I", "setLoginType", "(I)V", "btnAdminClick", "", "view", "Landroid/view/View;", "btnClientClick", "btnVenderClick", "btnloginClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onForgotPasswordClick", "onHidePassword", "app_debug"}
)
public final class LoginActivity extends BaseActivity {
    private ActivityLoginBinding binding;
    private boolean hidePassword = true;
    private int loginType = 1;
    private LoginActivityViewModel loginActivityViewModel;
    private final CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getMain());

    public final boolean getHidePassword() {
        return this.hidePassword;
    }

    public final void setHidePassword(boolean var1) {
        this.hidePassword = var1;
    }

    public final int getLoginType() {
        return this.loginType;
    }

    public final void setLoginType(int var1) {
        this.loginType = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, 1300013);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…,R.layout.activity_login)");
        this.binding = (ActivityLoginBinding)var10001;
        ActivityLoginBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        EditText var2;
        String var6;
        label22: {
            var2 = var10000.etLoginid;
            Intent var4 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(var4, "intent");
            Bundle var5 = var4.getExtras();
            if (var5 != null) {
                var6 = var5.getString("Email", "");
                if (var6 != null) {
                    break label22;
                }
            }

            var6 = "";
        }

        var2.setText((CharSequence)var6);
        ViewModel var7 = (new ViewModelProvider((ViewModelStoreOwner)this)).get(LoginActivityViewModel.class);
        Intrinsics.checkNotNullExpressionValue(var7, "ViewModelProvider(this)[…ityViewModel::class.java]");
        this.loginActivityViewModel = (LoginActivityViewModel)var7;
        LoginActivityViewModel var3 = this.loginActivityViewModel;
        if (var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginActivityViewModel");
        }

        var3.getSuccessresponse().observe((LifecycleOwner)this, (Observer)(new Observer() {
            // $FF: synthetic method
            // $FF: bridge method
            public void onChanged(Object var1) {
                this.onChanged((SendOtpResponseModel)var1);
            }

            public final void onChanged(SendOtpResponseModel it) {
                LoginActivity.this.hideProgressDialog();
                Toast.makeText((Context)LoginActivity.this, (CharSequence)it.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("result", "ressponse " + it);
                AppPreferences.Companion.getInstance((Context)LoginActivity.this).saveUserData(it.toString());
                if (LoginActivity.this.getLoginType() == 0) {
                    LoginActivity.this.startActivity(new Intent((Context)LoginActivity.this, ClientDashBoardActivity.class));
                } else if (LoginActivity.this.getLoginType() == 1) {
                    LoginActivity.this.startActivity(new Intent((Context)LoginActivity.this, AdminDashboardActivity.class));
                } else {
                    LoginActivity.this.startActivity(new Intent((Context)LoginActivity.this, VenderDashBoardActivity.class));
                }

            }
        }));
        var3 = this.loginActivityViewModel;
        if (var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginActivityViewModel");
        }

        var3.getErrorMessage().observe((LifecycleOwner)this, (Observer)(new Observer() {
            // $FF: synthetic method
            // $FF: bridge method
            public void onChanged(Object var1) {
                this.onChanged((String)var1);
            }

            public final void onChanged(String it) {
                LoginActivity.this.hideProgressDialog();
                Toast.makeText((Context)LoginActivity.this, (CharSequence)it, Toast.LENGTH_SHORT).show();
                Log.d("result", "ressponse " + it);
            }
        }));
    }

    public final void btnloginClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityLoginBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        EditText var3 = var10000.etLoginid;
        Intrinsics.checkNotNullExpressionValue(var3, "binding.etLoginid");
        CharSequence var2 = (CharSequence)var3.getText();
        if (var2 != null && var2.length() != 0) {
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.etPassword;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.etPassword");
            var2 = (CharSequence)var3.getText();
            if (var2 != null && var2.length() != 0) {
                if (!NetworkUtils.Companion.isNetworkAvailable((Context)this)) {
                    Toast.makeText((Context)this, (CharSequence)"Check your Internet Connection and Try Again", Toast.LENGTH_SHORT).show();
                } else {
                    (new Thread((Runnable)(new Runnable() {
                        public final void run() {
                            LoginActivity.this.showProgressDialog();
                            LoginActivityViewModel var10000 = LoginActivity.access$getLoginActivityViewModel$p(LoginActivity.this);
                            EditText var10001 = LoginActivity.access$getBinding$p(LoginActivity.this).etLoginid;
                            Intrinsics.checkNotNullExpressionValue(var10001, "binding.etLoginid");
                            String var1 = var10001.getText().toString();
                            EditText var10002 = LoginActivity.access$getBinding$p(LoginActivity.this).etPassword;
                            Intrinsics.checkNotNullExpressionValue(var10002, "binding.etPassword");
                            var10000.callLogin(var1, var10002.getText().toString());
                        }
                    }))).start();
                }

                return;
            }
        }

        Toast.makeText((Context)this, (CharSequence)"Fill all the fields", Toast.LENGTH_SHORT).show();
    }

    @SuppressLint({"ResourceAsColor"})
    public final void btnAdminClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.loginType = 1;
        ActivityLoginBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvAdminLogin.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClientLogin.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVenderLogin.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvAdminLogin.setTextColor(Color.parseColor("#FFFFFF"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClientLogin.setTextColor(Color.parseColor("#0089BE"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVenderLogin.setTextColor(Color.parseColor("#0089BE"));
    }

    @SuppressLint({"ResourceAsColor"})
    public final void btnVenderClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.loginType = 2;
        ActivityLoginBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVenderLogin.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClientLogin.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvAdminLogin.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvAdminLogin.setTextColor(Color.parseColor("#0089BE"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClientLogin.setTextColor(Color.parseColor("#0089BE"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVenderLogin.setTextColor(Color.parseColor("#FFFFFF"));
    }

    @SuppressLint({"ResourceAsColor"})
    public final void btnClientClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.loginType = 0;
        ActivityLoginBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvAdminLogin.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClientLogin.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVenderLogin.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvAdminLogin.setTextColor(Color.parseColor("#0089BE"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClientLogin.setTextColor(Color.parseColor("#FFFFFF"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVenderLogin.setTextColor(Color.parseColor("#0089BE"));
    }

    public final void onForgotPasswordClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.startActivity(new Intent((Context)this, ForgotPasswordActivity.class));
    }

    public final void onHidePassword(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityLoginBinding var10000;
        EditText var2;
        if (this.hidePassword) {
            this.hidePassword = false;
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivHidepassword.setImageResource(R.drawable.ic_eye);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var2 = var10000.etPassword;
            Intrinsics.checkNotNullExpressionValue(var2, "binding.etPassword");
            var2.setTransformationMethod((TransformationMethod)HideReturnsTransformationMethod.getInstance());
        } else {
            this.hidePassword = true;
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivHidepassword.setImageResource(R.drawable.ic_eye_hide);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var2 = var10000.etPassword;
            Intrinsics.checkNotNullExpressionValue(var2, "binding.etPassword");
            var2.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }

    }

    // $FF: synthetic method
    public static final LoginActivityViewModel access$getLoginActivityViewModel$p(LoginActivity $this) {
        LoginActivityViewModel var10000 = $this.loginActivityViewModel;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginActivityViewModel");
        }

        return var10000;
    }

    // $FF: synthetic method
    public static final void access$setLoginActivityViewModel$p(LoginActivity $this, LoginActivityViewModel var1) {
        $this.loginActivityViewModel = var1;
    }

    // $FF: synthetic method
    public static final ActivityLoginBinding access$getBinding$p(LoginActivity $this) {
        ActivityLoginBinding var10000 = $this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    // $FF: synthetic method
    public static final void access$setBinding$p(LoginActivity $this, ActivityLoginBinding var1) {
        $this.binding = var1;
    }
}
