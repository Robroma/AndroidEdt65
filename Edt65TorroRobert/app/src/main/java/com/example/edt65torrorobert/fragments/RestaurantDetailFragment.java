package com.example.edt65torrorobert.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edt65torrorobert.R;
import com.example.edt65torrorobert.adapters.ImageAdapter;
import com.example.edt65torrorobert.models.Restaurant;

public class RestaurantDetailFragment extends Fragment {

    private Restaurant restaurant;

    public RestaurantDetailFragment(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.restaurant_detail, container, false);

        ImageView itemImage = view.findViewById(R.id.imageView3);
        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemType = view.findViewById(R.id.itemType);
        TextView itemRating = view.findViewById(R.id.itemRating);
        TextView itemRange = view.findViewById(R.id.itemRange);
        TextView itemCity = view.findViewById(R.id.itemCity);
        TextView itemAddress = view.findViewById(R.id.itemAddress);
        TextView itemTel = view.findViewById(R.id.itemTel);
        TextView itemDescription = view.findViewById(R.id.itemDescription);
        RecyclerView itemImagesRecycler = view.findViewById(R.id.itemImages);

        itemImage.setImageResource(restaurant.getItemImage());
        itemName.setText(restaurant.getItemName());
        itemType.setText(restaurant.getItemType());
        itemRating.setText(restaurant.getItemRating());
        itemRange.setText(restaurant.getItemRange());
        itemCity.setText(restaurant.getItemCity());
        itemAddress.setText(restaurant.getItemAddress());
        itemTel.setText(restaurant.getItemTel());
        itemDescription.setText(restaurant.getItemDescription());

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        itemImagesRecycler.setLayoutManager(layoutManager);

        ImageAdapter imageAdapter = new ImageAdapter(restaurant.getItemImages(), getContext());
        itemImagesRecycler.setAdapter(imageAdapter);

        return view;
    }
}

