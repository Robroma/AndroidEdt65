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
import com.example.edt65torrorobert.fragments.RestaurantDetailFragment;
import com.example.edt65torrorobert.models.Restaurant;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private Context context;
    private ArrayList<Restaurant> restaurants;

    public RestaurantAdapter(ArrayList<Restaurant> restaurants, Context context) {
        this.context = context;
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_item, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant currentRestaurant = restaurants.get(holder.getAdapterPosition());
        holder.imageView.setImageResource(currentRestaurant.getItemImage());
        holder.nameTextView.setText(currentRestaurant.getItemName());
        holder.typeTextView.setText(currentRestaurant.getItemType());
        holder.ratingTextView.setText(currentRestaurant.getItemRating());
        holder.rangeTextView.setText(currentRestaurant.getItemRange());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RestaurantDetailFragment restaurantDetailFragment = new RestaurantDetailFragment(restaurants.get(holder.getAdapterPosition()));
                FragmentManager fragmentManager = ((FragmentActivity)context).getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, restaurantDetailFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView nameTextView;
        public TextView typeTextView;
        public TextView ratingTextView;
        public TextView rangeTextView;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            nameTextView = itemView.findViewById(R.id.name_text_view);
            typeTextView = itemView.findViewById(R.id.type_text_view);
            ratingTextView = itemView.findViewById(R.id.rating_text_view);
            rangeTextView = itemView.findViewById(R.id.range_text_view);


        }
    }
}

