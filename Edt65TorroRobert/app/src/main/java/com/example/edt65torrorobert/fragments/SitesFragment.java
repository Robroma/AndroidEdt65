package com.example.edt65torrorobert.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edt65torrorobert.R;
import com.example.edt65torrorobert.adapters.SiteAdapter;
import com.example.edt65torrorobert.utils.InfoRecycler;

public class SitesFragment extends Fragment {

    private RecyclerView recyclerView;

    public SitesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sites, container, false);
        recyclerView = view.findViewById(R.id.sites_recycler_view);


        SiteAdapter siteAdapter = new SiteAdapter(getContext(), new InfoRecycler().getSites());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(siteAdapter);

        return view;
    }
}

