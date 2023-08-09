package com.acme.campaignproject.activity.vender;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.acme.campaignproject.R;
import com.acme.campaignproject.databinding.ActivityUpdateSiteDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"},
        d2 = {"Lcom/acme/campaignproject/activity/vender/UpdateSiteDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityUpdateSiteDetailBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityUpdateSiteDetailBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityUpdateSiteDetailBinding;)V", "btnCloseClick", "", "view", "Landroid/view/View;", "btnSaveClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class UpdateSiteDetailActivity extends AppCompatActivity {
    public ActivityUpdateSiteDetailBinding binding;

    @NotNull
    public final ActivityUpdateSiteDetailBinding getBinding() {
        ActivityUpdateSiteDetailBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityUpdateSiteDetailBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, R.layout.activity_update_site_detail);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…ivity_update_site_detail)");
        this.binding = (ActivityUpdateSiteDetailBinding)var10001;
    }

    public final void btnCloseClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.finish();
    }

    public final void btnSaveClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
