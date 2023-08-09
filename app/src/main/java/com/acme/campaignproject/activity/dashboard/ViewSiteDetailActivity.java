package com.acme.campaignproject.activity.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.acme.campaignproject.R;
import com.acme.campaignproject.databinding.ActivityViewSiteDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "},
        d2 = {"Lcom/acme/campaignproject/activity/dashboard/ViewSiteDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityViewSiteDetailBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityViewSiteDetailBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityViewSiteDetailBinding;)V", "campaignType", "", "getCampaignType", "()Ljava/lang/String;", "setCampaignType", "(Ljava/lang/String;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "btnCloseClick", "", "view", "Landroid/view/View;", "btnNextClick", "liveCampaignClick", "oldCampaignClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDownloadClick", "app_debug"}
)
public final class ViewSiteDetailActivity extends AppCompatActivity {
    @NotNull
    private String campaignType = "";
    private int position;
    public ActivityViewSiteDetailBinding binding;

    @NotNull
    public final String getCampaignType() {
        return this.campaignType;
    }

    public final void setCampaignType(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.campaignType = var1;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setPosition(int var1) {
        this.position = var1;
    }

    @NotNull
    public final ActivityViewSiteDetailBinding getBinding() {
        ActivityViewSiteDetailBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityViewSiteDetailBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Intent var2;
        Bundle var3;
        String var4;
        label29: {
            super.onCreate(savedInstanceState);
            ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, R.layout.activity_view_site_detail);
            Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…ctivity_view_site_detail)");
            this.binding = (ActivityViewSiteDetailBinding)var10001;
            var2 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(var2, "intent");
            var3 = var2.getExtras();
            if (var3 != null) {
                var4 = var3.getString("campaignType", "");
                if (var4 != null) {
                    break label29;
                }
            }

            var4 = "";
        }

        this.campaignType = var4;
        var2 = this.getIntent();
        Intrinsics.checkNotNullExpressionValue(var2, "intent");
        var3 = var2.getExtras();
        this.position = var3 != null ? var3.getInt("position", 0) : 0;
        ActivityViewSiteDetailBinding var10000;
        if (StringsKt.equals(this.campaignType, "old", true)) {
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.tvOldCampaign.performClick();
        } else {
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.tvLiveCampaign.performClick();
        }

    }

    public final void btnCloseClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.finish();
    }

    public final void btnNextClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void onDownloadClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void oldCampaignClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityViewSiteDetailBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvOldCampaign.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvLiveCampaign.setBackgroundResource(R.color.coloryellow);
    }

    public final void liveCampaignClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityViewSiteDetailBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvLiveCampaign.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvOldCampaign.setBackgroundResource(R.color.coloryellow);
    }
}
