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
import com.example.edt65torrorobert.fragments.GuideDetailFragment;
import com.example.edt65torrorobert.fragments.RestaurantDetailFragment;
import com.example.edt65torrorobert.models.Guide;
import java.util.ArrayList;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.GuideViewHolder> {
    private Context context;
    private ArrayList<Guide> guides;

    public GuideAdapter(Context context, ArrayList<Guide> guides) {
        this.context = context;
        this.guides = guides;
    }

    @NonNull
    @Override
    public GuideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.guide_item, parent, false);
        return new GuideViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GuideViewHolder holder, int position) {
        Guide guide = guides.get(position);
        holder.guideImage.setImageResource(guide.getGuideImage());
        holder.guideName.setText(guide.getGuideName());
        holder.guideCity.setText(guide.getGuideCity());
        holder.guidePrice.setText(guide.getGuidePrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GuideDetailFragment guideDetailFragment = new GuideDetailFragment(guides.get(holder.getAdapterPosition()));
                FragmentManager fragmentManager = ((FragmentActivity)context).getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, guideDetailFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return guides.size();
    }

    public static class GuideViewHolder extends RecyclerView.ViewHolder {
        ImageView guideImage;
        TextView guideName;
        TextView guideCity;
        TextView guidePrice;

        public GuideViewHolder(@NonNull View itemView) {
            super(itemView);
            guideImage = itemView.findViewById(R.id.guide_image);
            guideName = itemView.findViewById(R.id.guide_name);
            guideCity = itemView.findViewById(R.id.guide_city);
            guidePrice = itemView.findViewById(R.id.guide_price);
        }
    }
}

