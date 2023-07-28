package com.acme.campaignproject.activity.dashboard;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
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
import com.acme.campaignproject.databinding.ActivityAddClientBinding;
import com.acme.campaignproject.utility.NetworkUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0006\u0010\u0011\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"},
        d2 = {"Lcom/acme/campaignproject/activity/dashboard/AddClientActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityAddClientBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityAddClientBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityAddClientBinding;)V", "btnCloseClick", "", "view", "Landroid/view/View;", "btnSaveClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showSuccessMessage", "app_debug"}
)
public final class AddClientActivity extends AppCompatActivity {
    public ActivityAddClientBinding binding;

    @NotNull
    public final ActivityAddClientBinding getBinding() {
        ActivityAddClientBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityAddClientBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, 1300002);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…yout.activity_add_client)");
        this.binding = (ActivityAddClientBinding)var10001;
    }

    public final void btnCloseClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.finish();
    }

    public final void btnSaveClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityAddClientBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        EditText var3 = var10000.etFullName;
        Intrinsics.checkNotNullExpressionValue(var3, "binding.etFullName");
        CharSequence var2 = (CharSequence)var3.getText();
        if (var2 != null && var2.length() != 0) {
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.etEmail;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.etEmail");
            var2 = (CharSequence)var3.getText();
            if (var2 != null && var2.length() != 0) {
                var10000 = this.binding;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }

                var3 = var10000.etCompanyName;
                Intrinsics.checkNotNullExpressionValue(var3, "binding.etCompanyName");
                var2 = (CharSequence)var3.getText();
                if (var2 != null && var2.length() != 0) {
                    var10000 = this.binding;
                    if (var10000 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }

                    var3 = var10000.etCompanyAddress;
                    Intrinsics.checkNotNullExpressionValue(var3, "binding.etCompanyAddress");
                    var2 = (CharSequence)var3.getText();
                    if (var2 != null && var2.length() != 0) {
                        var10000 = this.binding;
                        if (var10000 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        }

                        var3 = var10000.etGst;
                        Intrinsics.checkNotNullExpressionValue(var3, "binding.etGst");
                        var2 = (CharSequence)var3.getText();
                        if (var2 != null && var2.length() != 0) {
                            var10000 = this.binding;
                            if (var10000 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            }

                            var3 = var10000.etPhone;
                            Intrinsics.checkNotNullExpressionValue(var3, "binding.etPhone");
                            var2 = (CharSequence)var3.getText();
                            if (var2 != null && var2.length() != 0) {
                                if (!NetworkUtils.Companion.isNetworkAvailable((Context)this)) {
                                    Toast.makeText((Context)this, (CharSequence)"Check your Internet Connection and Try Again", 1).show();
                                } else {
                                    var10000 = this.binding;
                                    if (var10000 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    }

                                    var10000.etFullName.setText((CharSequence)"");
                                    var10000 = this.binding;
                                    if (var10000 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    }

                                    var10000.etEmail.setText((CharSequence)"");
                                    var10000 = this.binding;
                                    if (var10000 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    }

                                    var10000.etCompanyName.setText((CharSequence)"");
                                    var10000 = this.binding;
                                    if (var10000 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    }

                                    var10000.etCompanyAddress.setText((CharSequence)"");
                                    var10000 = this.binding;
                                    if (var10000 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    }

                                    var10000.etGst.setText((CharSequence)"");
                                    var10000 = this.binding;
                                    if (var10000 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    }

                                    var10000.etPhone.setText((CharSequence)"");
                                    this.showSuccessMessage();
                                }

                                return;
                            }
                        }
                    }
                }
            }
        }

        Toast.makeText((Context)this, (CharSequence)"Fill all the fields", 1).show();
    }

    public final void showSuccessMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setCancelable(false);
        LayoutInflater inflater = LayoutInflater.from((Context)this);
        View var10000 = inflater.inflate(1300011, (ViewGroup)null);
        Intrinsics.checkNotNullExpressionValue(var10000, "inflater.inflate(R.layout.custom_emailsent, null)");
        View view = var10000;
        TextView tvMsg = (TextView)view.findViewById(1000003);
        TextView tvResubmit = (TextView)view.findViewById(1000006);
        Intrinsics.checkNotNullExpressionValue(tvResubmit, "tvResubmit");
        tvResubmit.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(tvMsg, "tvMsg");
        tvMsg.setText((CharSequence)"Client Added Successfully");
        Button btnClose = (Button)view.findViewById(1000101);
        builder.setView(view);
        AlertDialog var8 = builder.create();
        Intrinsics.checkNotNullExpressionValue(var8, "builder.create()");
        final AlertDialog dialog = var8;
        if (dialog != null) {
            Window var9 = dialog.getWindow();
            Intrinsics.checkNotNull(var9);
            Intrinsics.checkNotNullExpressionValue(var9, "dialog.window!!");
            var9.getDecorView().setBackgroundResource(17170445);
        }

        btnClose.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
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
}
