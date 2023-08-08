package com.acme.campaignproject.activity.vender;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.acme.campaignproject.adapters.CampaignListAdapter;
import com.acme.campaignproject.databinding.ActivityVenderDashBoardBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"},
        d2 = {"Lcom/acme/campaignproject/activity/vender/VenderDashBoardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityVenderDashBoardBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityVenderDashBoardBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityVenderDashBoardBinding;)V", "campaignList", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "position", "", "app_debug"}
)
public final class VenderDashBoardActivity extends AppCompatActivity {
    public ActivityVenderDashBoardBinding binding;

    @NotNull
    public final ActivityVenderDashBoardBinding getBinding() {
        ActivityVenderDashBoardBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityVenderDashBoardBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, 1300015);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…tivity_vender_dash_board)");
        this.binding = (ActivityVenderDashBoardBinding)var10001;
        this.campaignList();
    }

    private final void campaignList() {
        GridLayoutManager layoutManager = new GridLayoutManager((Context)this, 1);
        ActivityVenderDashBoardBinding var10000 = this.binding;
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
            Log.d("tag2", e.toString());
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
        this.startActivity(new Intent((Context)this, UpdateSiteDetailActivity.class));
    }
}
