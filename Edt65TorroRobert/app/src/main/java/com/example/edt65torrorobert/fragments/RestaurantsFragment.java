package com.example.edt65torrorobert.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edt65torrorobert.R;
import com.example.edt65torrorobert.adapters.RestaurantAdapter;
import com.example.edt65torrorobert.utils.InfoRecycler;

public class RestaurantsFragment extends Fragment {

    private RecyclerView recyclerView;

    public RestaurantsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        recyclerView = view.findViewById(R.id.restaurants_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RestaurantAdapter adapter = new RestaurantAdapter(new InfoRecycler().getRestaurants(), getContext());
        recyclerView.setAdapter(adapter);


        return view;
    }
}
