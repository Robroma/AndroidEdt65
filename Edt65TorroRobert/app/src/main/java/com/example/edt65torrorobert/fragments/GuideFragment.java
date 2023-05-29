package com.example.edt65torrorobert.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edt65torrorobert.R;
import com.example.edt65torrorobert.adapters.GuideAdapter;
import com.example.edt65torrorobert.utils.InfoRecycler;

public class GuideFragment extends Fragment {

    private RecyclerView recyclerView;

    public GuideFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        recyclerView = view.findViewById(R.id.guide_recycler_view);

        GuideAdapter guideAdapter = new GuideAdapter(getContext(), new InfoRecycler().getGuides());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(guideAdapter);

        return view;
    }
}
