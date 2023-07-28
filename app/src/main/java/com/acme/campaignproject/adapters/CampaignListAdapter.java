package com.acme.campaignproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.acme.campaignproject.activity.dashboard.AdminDashboardActivity;
import com.acme.campaignproject.activity.dashboard.CampaignListActivity;
import com.acme.campaignproject.activity.dashboard.ClientDashBoardActivity;
import com.acme.campaignproject.activity.vender.VenderDashBoardActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata(
        mv = {1, 7, 0},
        k = 1,
        d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"},
        d2 = {"Lcom/acme/campaignproject/adapters/CampaignListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/acme/campaignproject/adapters/CampaignListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "jsonArray", "Lorg/json/JSONArray;", "(Landroid/content/Context;Lorg/json/JSONArray;)V", "getContext", "()Landroid/content/Context;", "getJsonArray", "()Lorg/json/JSONArray;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"}
)
public final class CampaignListAdapter extends RecyclerView.Adapter {
    @NotNull
    private final Context context;
    @NotNull
    private final JSONArray jsonArray;

    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(1300003, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getTvSiteNo().setText((CharSequence)("Site No. " + this.jsonArray.getJSONObject(position).getString("sitenumber")));
        holder.getTvUnitNo().setText((CharSequence)("Unit Id:- " + this.jsonArray.getJSONObject(position).getString("unitnumber")));
        holder.itemView.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                if (CampaignListAdapter.this.getContext() instanceof CampaignListActivity) {
                    ((CampaignListActivity)CampaignListAdapter.this.getContext()).onItemClick(position);
                } else if (CampaignListAdapter.this.getContext() instanceof ClientDashBoardActivity) {
                    ((ClientDashBoardActivity)CampaignListAdapter.this.getContext()).onItemClick(position);
                } else if (CampaignListAdapter.this.getContext() instanceof VenderDashBoardActivity) {
                    ((VenderDashBoardActivity)CampaignListAdapter.this.getContext()).onItemClick(position);
                } else if (CampaignListAdapter.this.getContext() instanceof AdminDashboardActivity) {
                    ((AdminDashboardActivity)CampaignListAdapter.this.getContext()).onItemClick(position);
                }

            }
        }));
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(RecyclerView.ViewHolder var1, int var2) {
        this.onBindViewHolder((ViewHolder)var1, var2);
    }

    public int getItemCount() {
        return this.jsonArray.length();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final JSONArray getJsonArray() {
        return this.jsonArray;
    }

    public CampaignListAdapter(@NotNull Context context, @NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        super();
        this.context = context;
        this.jsonArray = jsonArray;
    }

    @Metadata(
            mv = {1, 7, 0},
            k = 1,
            d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"},
            d2 = {"Lcom/acme/campaignproject/adapters/CampaignListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ivCampaign", "Landroid/widget/ImageView;", "getIvCampaign", "()Landroid/widget/ImageView;", "tvSiteNo", "Landroid/widget/TextView;", "getTvSiteNo", "()Landroid/widget/TextView;", "tvUnitNo", "getTvUnitNo", "app_debug"}
    )
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private final ImageView ivCampaign;
        @NotNull
        private final TextView tvSiteNo;
        @NotNull
        private final TextView tvUnitNo;

        @NotNull
        public final ImageView getIvCampaign() {
            return this.ivCampaign;
        }

        @NotNull
        public final TextView getTvSiteNo() {
            return this.tvSiteNo;
        }

        @NotNull
        public final TextView getTvUnitNo() {
            return this.tvUnitNo;
        }

        public ViewHolder(@NotNull View itemView) {
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            super(itemView);
            View var10001 = itemView.findViewById(1000051);
            Intrinsics.checkNotNullExpressionValue(var10001, "itemView.findViewById(R.id.ivCampaign)");
            this.ivCampaign = (ImageView)var10001;
            var10001 = itemView.findViewById(1000040);
            Intrinsics.checkNotNullExpressionValue(var10001, "itemView.findViewById(R.id.tvSiteNo)");
            this.tvSiteNo = (TextView)var10001;
            var10001 = itemView.findViewById(1000112);
            Intrinsics.checkNotNullExpressionValue(var10001, "itemView.findViewById(R.id.tvUnitNo)");
            this.tvUnitNo = (TextView)var10001;
        }
    }
}
