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
import com.example.edt65torrorobert.models.Guide;
import com.example.edt65torrorobert.models.Restaurant;

public class GuideDetailFragment extends Fragment {
    private Guide guide;

    public GuideDetailFragment(Guide restaurant) {
        this.guide = restaurant;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.guide_detail, container, false);

        ImageView itemImage = view.findViewById(R.id.imageView3);
        TextView guideName = view.findViewById(R.id.guideDetailName);
        TextView guideCity = view.findViewById(R.id.guideDetailCity);
        TextView guidePrice = view.findViewById(R.id.guideDetailPrice);
        TextView guideDesc = view.findViewById(R.id.guideDetailDescription);
        RecyclerView itemImagesRecycler = view.findViewById(R.id.itemImages);

        itemImage.setImageResource(guide.getGuideImage());
        guideName.setText(guide.getGuideName());
        guideCity.setText(guide.getGuideCity());
        guidePrice.setText(guide.getGuidePrice());
        guideDesc.setText(guide.getGuideDesc());

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        itemImagesRecycler.setLayoutManager(layoutManager);

        ImageAdapter imageAdapter = new ImageAdapter(guide.getGuideImages(), getContext());
        itemImagesRecycler.setAdapter(imageAdapter);

        return view;
    }
}
