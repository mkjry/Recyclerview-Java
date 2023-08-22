package com.ssj.recyclerview_java;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import data.CustomDataModel;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.AdapterViewHolder> {

    ArrayList<CustomDataModel> dataList;

    public RecyclerAdapter(ArrayList<CustomDataModel> loadDummyDataList) {
        this.dataList = loadDummyDataList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new AdapterViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.AdapterViewHolder holder, int position) {
        holder.itemImage.setImageResource(dataList.get(position).getImage());
        holder.itemTitle.setText(dataList.get(position).getTitle());
        holder.itemDescription.setText(dataList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemTitle, itemDescription;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.iv_Image);
            itemTitle = itemView.findViewById(R.id.tv_Title);
            itemDescription = itemView.findViewById(R.id.tv_Description);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), Integer.toString(getAdapterPosition() + 1) + " Clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
