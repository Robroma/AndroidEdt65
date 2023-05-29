package com.example.edt65torrorobert.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edt65torrorobert.R;
import com.example.edt65torrorobert.adapters.ImageAdapter;
import com.example.edt65torrorobert.adapters.RestaurantAdapter;
import com.example.edt65torrorobert.adapters.SiteAdapter;
import com.example.edt65torrorobert.models.Site;
import com.example.edt65torrorobert.utils.InfoRecycler;
import androidx.fragment.app.Fragment;



public class SitesDetailFragment extends Fragment{
    private Site site;

    public SitesDetailFragment(Site site) {
        this.site = site;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sites_detail, container, false);

        ImageView itemImage = view.findViewById(R.id.imageView3);
        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemCity = view.findViewById(R.id.siteCityDetail);
        TextView itemPrice = view.findViewById(R.id.sitePriceDetail);
        RecyclerView itemImagesRecycler = view.findViewById(R.id.itemImages);


        itemImage.setImageResource(site.getSiteImage());
        itemName.setText(site.getSiteName());
        itemCity.setText(site.getSiteCity());
        itemPrice.setText(site.getSitePrice());


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        itemImagesRecycler.setLayoutManager(layoutManager);

        ImageAdapter imageAdapter = new ImageAdapter(site.getSiteImages(), getContext());
        itemImagesRecycler.setAdapter(imageAdapter);

        return view;
    }
}
