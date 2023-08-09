package com.acme.campaignproject.activity.dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.acme.campaignproject.R;
import com.acme.campaignproject.adapters.CampaignListAdapter;
import com.acme.campaignproject.databinding.ActivityClientDashBoardBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001b"},
        d2 = {"Lcom/acme/campaignproject/activity/dashboard/ClientDashBoardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityClientDashBoardBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityClientDashBoardBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityClientDashBoardBinding;)V", "oldcampaign", "", "getOldcampaign", "()Z", "setOldcampaign", "(Z)V", "campaignList", "", "liveCampaignClick", "view", "Landroid/view/View;", "oldCampaignClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "position", "", "app_debug"}
)
public final class ClientDashBoardActivity extends AppCompatActivity {
    public ActivityClientDashBoardBinding binding;
    private boolean oldcampaign = true;

    @NotNull
    public final ActivityClientDashBoardBinding getBinding() {
        ActivityClientDashBoardBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityClientDashBoardBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    public final boolean getOldcampaign() {
        return this.oldcampaign;
    }

    public final void setOldcampaign(boolean var1) {
        this.oldcampaign = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, R.layout.activity_client_dash_board);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…tivity_client_dash_board)");
        this.binding = (ActivityClientDashBoardBinding)var10001;
        this.campaignList();
    }

    public final void oldCampaignClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.oldcampaign = true;
        ActivityClientDashBoardBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvOldCampaign.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvLiveCampaign.setBackgroundResource(R.color.coloryellow);
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
        ActivityClientDashBoardBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvLiveCampaign.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvOldCampaign.setBackgroundResource(R.color.coloryellow);
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

    private final void campaignList() {
        GridLayoutManager layoutManager = new GridLayoutManager((Context)this, 2);
        ActivityClientDashBoardBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.rvCampaignList.setLayoutManager((RecyclerView.LayoutManager)layoutManager);
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObjectairbnb = new JSONObject();
        JSONObject jsonObjecthyundai = new JSONObject();
        JSONObject jsonObjectford = new JSONObject();
        JSONObject jsonObjectpatanjli = new JSONObject();
        try {
            jsonObjectairbnb.put("sitenumber", "001");
            jsonObjecthyundai.put("sitenumber", "002");
            jsonObjectford.put("sitenumber", "003");
            jsonObjectpatanjli.put("sitenumber", "004");
            jsonObjectairbnb.put("unitnumber", "#887001");
            jsonObjecthyundai.put("unitnumber", "#878002");
            jsonObjectford.put("unitnumber", "#765003");
            jsonObjectpatanjli.put("unitnumber", "#432004");
        }catch(Exception e){
            Log.d("tag1", e.toString());
        }
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

    public final void onItemClick(int position) {
        this.startActivity((new Intent((Context)this, ViewSiteDetailActivity.class)).putExtra("position", position).putExtra("campaignType", "old"));
    }
}
