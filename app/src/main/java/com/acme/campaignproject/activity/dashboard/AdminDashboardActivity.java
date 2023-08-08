package com.acme.campaignproject.activity.dashboard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.acme.campaignproject.R;
import com.acme.campaignproject.adapters.CampaignListAdapter;
import com.acme.campaignproject.adapters.ClientListAdapter;
import com.acme.campaignproject.databinding.ActivityMainBinding;
import com.acme.campaignproject.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010%\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006-"},
        d2 = {"Lcom/acme/campaignproject/activity/dashboard/AdminDashboardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/acme/campaignproject/databinding/ActivityMainBinding;", "getBinding", "()Lcom/acme/campaignproject/databinding/ActivityMainBinding;", "setBinding", "(Lcom/acme/campaignproject/databinding/ActivityMainBinding;)V", "jsonArray", "Lorg/json/JSONArray;", "getJsonArray", "()Lorg/json/JSONArray;", "setJsonArray", "(Lorg/json/JSONArray;)V", "mainViewModel", "Lcom/acme/campaignproject/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/acme/campaignproject/viewmodel/MainViewModel;", "setMainViewModel", "(Lcom/acme/campaignproject/viewmodel/MainViewModel;)V", "showMenus", "", "getShowMenus", "()Z", "setShowMenus", "(Z)V", "btnClientClick", "", "view", "Landroid/view/View;", "btnCompaignClick", "btnVenderClick", "campaignList", "clientList", "onAddClientClick", "onAddVenderClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteClientClick", "onItemClick", "position", "", "onPlusClick", "app_debug"}
)
public final class AdminDashboardActivity extends AppCompatActivity {
    public MainViewModel mainViewModel;
    public ActivityMainBinding binding;
    public JSONArray jsonArray;
    private boolean showMenus;

    @NotNull
    public final MainViewModel getMainViewModel() {
        MainViewModel var10000 = this.mainViewModel;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainViewModel");
        }

        return var10000;
    }

    public final void setMainViewModel(@NotNull MainViewModel var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.mainViewModel = var1;
    }

    @NotNull
    public final ActivityMainBinding getBinding() {
        ActivityMainBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        return var10000;
    }

    public final void setBinding(@NotNull ActivityMainBinding var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.binding = var1;
    }

    @NotNull
    public final JSONArray getJsonArray() {
        JSONArray var10000 = this.jsonArray;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsonArray");
        }

        return var10000;
    }

    public final void setJsonArray(@NotNull JSONArray var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.jsonArray = var1;
    }

    public final boolean getShowMenus() {
        return this.showMenus;
    }

    public final void setShowMenus(boolean var1) {
        this.showMenus = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding var10001 = DataBindingUtil.setContentView((Activity)this, 1300017);
        Intrinsics.checkNotNullExpressionValue(var10001, "DataBindingUtil.setConte…, R.layout.activity_main)");
        this.binding = (ActivityMainBinding)var10001;
        this.clientList();
        this.campaignList();
    }

    public final void campaignList() {
        GridLayoutManager layoutManager = new GridLayoutManager((Context)this, 2);
        ActivityMainBinding var10000 = this.binding;
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
            Log.d("tag1",e.toString() );}
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

    public final void clientList() {
        GridLayoutManager layoutManager1 = new GridLayoutManager((Context) this, 2);
        GridLayoutManager layoutManager2 = new GridLayoutManager((Context) this, 2);
        ActivityMainBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.rvClientList.setLayoutManager((RecyclerView.LayoutManager) layoutManager1);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.rvVenderList.setLayoutManager((RecyclerView.LayoutManager) layoutManager2);
        this.jsonArray = new JSONArray();
        JSONObject jsonObjectairbnb = new JSONObject();
        JSONObject jsonObjecthyundai = new JSONObject();
        JSONObject jsonObjectford = new JSONObject();
        JSONObject jsonObjectpatanjli = new JSONObject();
        try {
            jsonObjectairbnb.put("image", 700008);
            jsonObjecthyundai.put("image", 700003);
            jsonObjectford.put("image", 700011);
            jsonObjectpatanjli.put("image", 700018);
            jsonObjectairbnb.put("name", "Airbnb");
            jsonObjecthyundai.put("name", "Hyundai");
            jsonObjectford.put("name", "Ford");
            jsonObjectpatanjli.put("name", "Patanjli");
        } catch (Exception e) {
            Log.d("tag1", e.toString());
        }
        JSONArray var9 = this.jsonArray;
        if (var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsonArray");
        }

        var9.put(jsonObjectairbnb);
        var9 = this.jsonArray;
        if (var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsonArray");
        }

        var9.put(jsonObjecthyundai);
        var9 = this.jsonArray;
        if (var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsonArray");
        }

        var9.put(jsonObjectford);
        var9 = this.jsonArray;
        if (var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsonArray");
        }

        var9.put(jsonObjectpatanjli);
        Context var10002 = (Context) this;
        JSONArray var10003 = this.jsonArray;
        if (var10003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsonArray");
        }


        var10002 = (Context) this;
        var10003 = this.jsonArray;
        if (var10003 == null) {
            throw new NullPointerException("jsonArray is not initialized");
        }
        ClientListAdapter adapter1 = new ClientListAdapter(var10002, var10003);

        var10002 = (Context) this;
        var10003 = this.jsonArray;
        if (var10003 == null) {
            throw new NullPointerException("jsonArray is not initialized");
        }
        ClientListAdapter adapter2 = new ClientListAdapter(var10002, var10003);

        var10000 = this.binding;
        if (var10000 == null) {
            throw new NullPointerException("binding is not initialized");
        }

        RecyclerView var11 = var10000.rvVenderList;
        if (var11 == null) {
            throw new NullPointerException("binding.rvVenderList is not initialized");
        }
        var11.setAdapter(adapter1);

        var10000 = this.binding;
        if (var10000 == null) {
            throw new NullPointerException("binding is not initialized");
        }

        var11 = var10000.rvClientList;
        if (var11 == null) {
            throw new NullPointerException("binding.rvClientList is not initialized");
        }
        var11.setAdapter(adapter2);
    }

        public final void onPlusClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityMainBinding var10000;
        TranslateAnimation animate;
        ImageView var3;
        if (this.showMenus) {
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivPlus.setImageResource(R.drawable.ic_add);
            this.showMenus = false;
            animate = new TranslateAnimation(0.0F, 0.0F, 0.0F, (float)view.getHeight());
            animate.setDuration(0L);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivAddClient.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivRedo.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivDeleteClient.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivAddClient;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivAddClient");
            var3.setVisibility(View.INVISIBLE);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivRedo;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivRedo");
            var3.setVisibility(View.INVISIBLE);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivDeleteClient;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivDeleteClient");
            var3.setVisibility(View.INVISIBLE);
        } else {
            this.showMenus = true;
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivAddClient;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivAddClient");
            var3.setVisibility(View.VISIBLE);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivRedo;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivRedo");
            var3.setVisibility(View.VISIBLE);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var3 = var10000.ivDeleteClient;
            Intrinsics.checkNotNullExpressionValue(var3, "binding.ivDeleteClient");
            var3.setVisibility(View.VISIBLE);
            animate = new TranslateAnimation(0.0F, 0.0F, (float)view.getHeight(), 0.0F);
            animate.setDuration(500L);
            animate.setFillAfter(true);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivAddClient.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivRedo.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivDeleteClient.startAnimation((Animation)animate);
            var10000 = this.binding;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }

            var10000.ivPlus.setImageResource(R.drawable.ic_cross);
        }

    }

    public final void onAddClientClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.startActivity(new Intent((Context)this, AddClientActivity.class));
    }

    public final void onAddVenderClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.startActivity(new Intent((Context)this, AddVenderActivity.class));
    }

    public final void onDeleteClientClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @SuppressLint({"ResourceAsColor"})
    public final void btnCompaignClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityMainBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        RecyclerView var2 = var10000.rvCampaignList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvCampaignList");
        var2.setVisibility(View.VISIBLE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var2 = var10000.rvClientList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvClientList");
        var2.setVisibility(View.GONE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var2 = var10000.rvVenderList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvVenderList");
        var2.setVisibility(View.GONE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvCompaign.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVender.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClient.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvCompaign.setTextColor(Color.parseColor("#FFFFFF"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVender.setTextColor(Color.parseColor("#0089BE"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClient.setTextColor(Color.parseColor("#0089BE"));
    }

    @SuppressLint({"ResourceAsColor"})
    public final void btnVenderClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityMainBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        RecyclerView var2 = var10000.rvCampaignList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvCampaignList");
        var2.setVisibility(View.GONE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var2 = var10000.rvClientList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvClientList");
        var2.setVisibility(View.GONE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var2 = var10000.rvVenderList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvVenderList");
        var2.setVisibility(View.VISIBLE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVender.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvCompaign.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClient.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClient.setTextColor(Color.parseColor("#0089BE"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvCompaign.setTextColor(Color.parseColor("#0089BE"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVender.setTextColor(Color.parseColor("#FFFFFF"));
    }

    @SuppressLint({"ResourceAsColor"})
    public final void btnClientClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ActivityMainBinding var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        RecyclerView var2 = var10000.rvCampaignList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvCampaignList");
        var2.setVisibility(View.GONE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var2 = var10000.rvClientList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvClientList");
        var2.setVisibility(View.VISIBLE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var2 = var10000.rvVenderList;
        Intrinsics.checkNotNullExpressionValue(var2, "binding.rvVenderList");
        var2.setVisibility(View.GONE);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvCompaign.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClient.setBackgroundResource(R.drawable.primaryround);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVender.setBackgroundResource(R.color.coloryellow);
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvCompaign.setTextColor(Color.parseColor("#0089BE"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvClient.setTextColor(Color.parseColor("#FFFFFF"));
        var10000 = this.binding;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }

        var10000.tvVender.setTextColor(Color.parseColor("#0089BE"));
    }

    public final void onItemClick(int position) {
        this.startActivity((new Intent((Context)this, ViewSiteDetailActivity.class)).putExtra("position", position).putExtra("campaignType", "old"));
    }
}
