package com.acme.campaignproject.activity.dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.acme.campaignproject.adapters.CampaignListAdapter;
import com.acme.campaignproject.databinding.ActivityCampaignListBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\""},
        d2 = {"Lcom/acme/campaignproject/activity/dashboard/CampaignListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityCampaignListBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityCampaignListBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityCampaignListBinding;)V", "oldcampaign", "", "getOldcampaign", "()Z", "setOldcampaign", "(Z)V", "showMenus", "getShowMenus", "setShowMenus", "campaignList", "", "liveCampaignClick", "view", "Landroid/view/View;", "oldCampaignClick", "onAddSiteClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteSiteClick", "onItemClick", "position", "", "onPlusClick", "onRedoClientClick", "app_debug"}
)
public final class CampaignListActivity extends AppCompatActivity {
    public ActivityCampaignListBinding binding;
    private boolean oldcampaign = true;
    private boolean showMenus;

    @NotNull
    public final ActivityCampaignListBinding getBinding() {
        ActivityCampaignListBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityCampaignListBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    public final boolean getOldcampaign() {
        return this.oldcampaign;
    }

    public final void setOldcampaign(boolean var1) {
        this.oldcampaign = var1;
    }

    public final boolean getShowMenus() {
        return this.showMenus;
    }

    public final void setShowMenus(boolean var1) {
        this.showMenus = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, 1300005);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…t.activity_campaign_list)");
        this.binding = (ActivityCampaignListBinding)var10001;
        this.campaignList();
    }

    private final void campaignList() {
        GridLayoutManager layoutManager = new GridLayoutManager((Context)this, 2);
        ActivityCampaignListBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.rvCampaignList.setLayoutManager((RecyclerView.LayoutManager)layoutManager);
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObjectairbnb = new JSONObject();
        JSONObject jsonObjecthyundai = new JSONObject();
        JSONObject jsonObjectford = new JSONObject();
        JSONObject jsonObjectpatanjli = new JSONObject();
        jsonObjectairbnb.put("sitenumber", "001");
        jsonObjecthyundai.put("sitenumber", "002");
        jsonObjectford.put("sitenumber", "003");
        jsonObjectpatanjli.put("sitenumber", "004");
        jsonObjectairbnb.put("unitnumber", "#887001");
        jsonObjecthyundai.put("unitnumber", "#878002");
        jsonObjectford.put("unitnumber", "#765003");
        jsonObjectpatanjli.put("unitnumber", "#432004");
        jsonArray.put(jsonObjectairbnb);
        jsonArray.put(jsonObjecthyundai);
        jsonArray.put(jsonObjectford);
        jsonArray.put(jsonObjectpatanjli);
        CampaignListAdapter adapter = new CampaignListAdapter((Context)this, jsonArray);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        RecyclerView var8 = var10000.rvCampaignList;
        Intrinsics.checkNotNullExpressionValue(var8, "binding.rvCampaignList");
        var8.setAdapter((RecyclerView.Adapter)adapter);
    }

    public final void oldCampaignClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.oldcampaign = true;
        ActivityCampaignListBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvOldCampaign.setBackgroundResource(700022);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvLiveCampaign.setBackgroundResource(500013);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvOldCampaign.setTextColor(Color.parseColor("#FFFFFF"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvLiveCampaign.setTextColor(Color.parseColor("#0089BE"));
    }

    public final void liveCampaignClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.oldcampaign = false;
        ActivityCampaignListBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvLiveCampaign.setBackgroundResource(700022);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvOldCampaign.setBackgroundResource(500013);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvLiveCampaign.setTextColor(Color.parseColor("#FFFFFF"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvOldCampaign.setTextColor(Color.parseColor("#0089BE"));
    }

    public final void onPlusClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityCampaignListBinding var10000;
        TranslateAnimation animate;
        ImageView var3;
        if (this.showMenus) {
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivPlus.setImageResource(700024);
            this.showMenus = false;
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivAddSite;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivAddSite");
            var3.setVisibility(4);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivRedo;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivRedo");
            var3.setVisibility(4);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivDeleteSite;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivDeleteSite");
            var3.setVisibility(4);
            animate = new TranslateAnimation(0.0F, 0.0F, 0.0F, (float)view.getHeight());
            animate.setDuration(0L);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivAddSite.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivRedo.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivDeleteSite.startAnimation((Animation)animate);
        } else {
            this.showMenus = true;
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivAddSite;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivAddSite");
            var3.setVisibility(0);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivRedo;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivRedo");
            var3.setVisibility(0);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivDeleteSite;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivDeleteSite");
            var3.setVisibility(0);
            animate = new TranslateAnimation(0.0F, 0.0F, (float)view.getHeight(), 0.0F);
            animate.setDuration(500L);
            animate.setFillAfter(true);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivAddSite.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivRedo.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivDeleteSite.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivPlus.setImageResource(700025);
        }

    }

    public final void onAddSiteClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.startActivity(new Intent((Context)this, AddSiteDetailActivity.class));
    }

    public final void onRedoClientClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void onDeleteSiteClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void onItemClick(int position) {
        this.startActivity((new Intent((Context)this, ViewSiteDetailActivity.class)).putExtra("position", position).putExtra("campaignType", "old"));
    }
}
