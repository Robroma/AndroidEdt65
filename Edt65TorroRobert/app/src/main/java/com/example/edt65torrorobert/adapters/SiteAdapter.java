package com.example.edt65torrorobert.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edt65torrorobert.R;
import com.example.edt65torrorobert.fragments.SitesDetailFragment;
import com.example.edt65torrorobert.models.Site;
import java.util.ArrayList;

public class SiteAdapter extends RecyclerView.Adapter<SiteAdapter.SiteViewHolder> {
    private Context context;
    private ArrayList<Site> sites;

    public SiteAdapter(Context context, ArrayList<Site> sites) {
        this.context = context;
        this.sites = sites;
    }

    @NonNull
    @Override
    public SiteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.site_item, parent, false);
        return new SiteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SiteViewHolder holder, int position) {
        Site site = sites.get(position);
        holder.siteImage.setImageResource(site.getSiteImage());
        holder.siteName.setText(site.getSiteName());
        holder.siteCity.setText(site.getSiteCity());
        holder.sitePrice.setText(site.getSitePrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SitesDetailFragment sitesDetailFragment = new SitesDetailFragment(sites.get(holder.getAdapterPosition()));
                FragmentManager fragmentManager = ((FragmentActivity)context).getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, sitesDetailFragment)
                        .addToBackStack(null)
                        .commit();

            }
        });

    }

    @Override
    public int getItemCount() {
        return sites.size();
    }

    public static class SiteViewHolder extends RecyclerView.ViewHolder {
        ImageView siteImage;
        TextView siteName;
        TextView siteCity;
        TextView sitePrice;

        public SiteViewHolder(@NonNull View itemView) {
            super(itemView);
            siteImage = itemView.findViewById(R.id.site_image);
            siteName = itemView.findViewById(R.id.site_name);
            siteCity = itemView.findViewById(R.id.site_city);
            sitePrice = itemView.findViewById(R.id.site_price);
        }
    }
}

