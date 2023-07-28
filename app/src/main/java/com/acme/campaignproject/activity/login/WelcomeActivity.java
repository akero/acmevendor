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
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.acme.campaignproject.activity.dashboard.BaseActivity;
import com.acme.campaignproject.databinding.ActivityWelcomeBinding;
import com.acme.campaignproject.models.SendOtpResponseModel;
import com.acme.campaignproject.utility.NetworkUtils;
import com.acme.campaignproject.viewmodel.WelcomeActivityViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0014"},
        d2 = {"Lcom/acme/campaignproject/activity/login/WelcomeActivity;", "Lcom/acme/campaignproject/activity/dashboard/BaseActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityWelcomeBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityWelcomeBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityWelcomeBinding;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "welcomeActivityViewModel", "Lcom/acme/campaignproject/viewmodel/WelcomeActivityViewModel;", "btnSubmitClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class WelcomeActivity extends BaseActivity {
    public ActivityWelcomeBinding binding;
    private WelcomeActivityViewModel welcomeActivityViewModel;
    private final CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getMain());

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
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, 1300008);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte….layout.activity_welcome)");
        this.binding = (ActivityWelcomeBinding)var10001;
        ViewModel var2 = (new ViewModelProvider((ViewModelStoreOwner)this)).get(WelcomeActivityViewModel.class);
        Intrinsics.checkNotNullExpressionValue(var2, "ViewModelProvider(this)[…ityViewModel::class.java]");
        this.welcomeActivityViewModel = (WelcomeActivityViewModel)var2;
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
                Toast.makeText((Context)WelcomeActivity.this, (CharSequence)it.getMessage(), 1).show();
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
                Toast.makeText((Context)WelcomeActivity.this, (CharSequence)it, 1).show();
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
            Toast.makeText((Context)this, (CharSequence)"Fill the Email", 1).show();
        } else if (!NetworkUtils.Companion.isNetworkAvailable((Context)this)) {
            Toast.makeText((Context)this, (CharSequence)"Check your Internet Connection and Try Again", 1).show();
        } else {
            BuildersKt.launch$default(this.coroutineScope, (CoroutineContext)null, (CoroutineStart)null, (Function2)(new Function2((Continuation)null) {
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object var1) {
                    Object var2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure(var1);
                            WelcomeActivity.this.showProgressDialog();
                            WelcomeActivityViewModel var10000 = WelcomeActivity.access$getWelcomeActivityViewModel$p(WelcomeActivity.this);
                            EditText var10002 = WelcomeActivity.this.getBinding().etEmailId;
                            Intrinsics.checkNotNullExpressionValue(var10002, "binding.etEmailId");
                            var10000.callOtp("+91", var10002.getText().toString());
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @NotNull
                public final Continuation create(@Nullable Object value, @NotNull Continuation completion) {
                    Intrinsics.checkNotNullParameter(completion, "completion");
                    Function2 var3 = new <anonymous constructor>(completion);
                    return var3;
                }

                public final Object invoke(Object var1, Object var2) {
                    return ((<undefinedtype>)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
                }
            }), 3, (Object)null);
        }

    }

    // $FF: synthetic method
    public static final WelcomeActivityViewModel access$getWelcomeActivityViewModel$p(WelcomeActivity $this) {
        WelcomeActivityViewModel var10000 = $this.welcomeActivityViewModel;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("welcomeActivityViewModel");
        }

        return var10000;
    }

    // $FF: synthetic method
    public static final void access$setWelcomeActivityViewModel$p(WelcomeActivity $this, WelcomeActivityViewModel var1) {
        $this.welcomeActivityViewModel = var1;
    }
}
