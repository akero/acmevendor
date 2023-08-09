package com.acme.campaignproject.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.acme.campaignproject.R;
import com.acme.campaignproject.activity.dashboard.CampaignListActivity;
import org.json.JSONArray;
import org.json.JSONException;

public class ClientListAdapter extends RecyclerView.Adapter<ClientListAdapter.ViewHolder> {

    private Context context;
    private JSONArray jsonArray;

    public ClientListAdapter(Context context, JSONArray jsonArray) {
        this.context = context;
        this.jsonArray = jsonArray;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivCampaign;
        TextView tvClientName;
        TextView tvUnitNo;

        public ViewHolder(View itemView) {
            super(itemView);
            ivCampaign = itemView.findViewById(R.id.ivCampaign);
            tvClientName = itemView.findViewById(R.id.tvClientName);
            tvUnitNo = itemView.findViewById(R.id.tvUnitNo);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_client_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        try {
            holder.tvClientName.setText(jsonArray.getJSONObject(position).getString("name"));
            holder.ivCampaign.setImageResource(jsonArray.getJSONObject(position).getInt("image"));

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, CampaignListActivity.class));
                }
            });

            // Commented-out code was retained, but it can be removed or uncommented as needed
            // holder.tvUnitNo.setText("Unit Id:- ");
            // Glide.with(context).load(media).into(holder.ivCampaign);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return jsonArray.length();
    }
}
