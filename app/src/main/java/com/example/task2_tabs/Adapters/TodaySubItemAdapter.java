package com.example.task2_tabs.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.task2_tabs.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodaySubItemAdapter extends RecyclerView.Adapter<TodaySubItemAdapter.SubViewHolder> {
    int[] img1,img2,img3;


    public TodaySubItemAdapter(int[] img1,int[] img2,int[] img3) {
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
    }


    @NonNull
    @Override
    public SubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_subitem_today, parent, false);
        return (new SubViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull SubViewHolder holder, int position) {

        holder.ivfirst.setImageResource(img1[position]);
        holder.ivSecond.setImageResource(img2[position]);
        holder.ivThird.setImageResource(img3[position]);
    }


    @Override
    public int getItemCount() {
        return img1.length;
    }

    public class SubViewHolder extends RecyclerView.ViewHolder {

        ImageView ivfirst, ivSecond, ivThird;

        public SubViewHolder(@NonNull View itemView) {
            super(itemView);

            ivfirst = itemView.findViewById(R.id.firstRow);
            ivSecond = itemView.findViewById(R.id.secondRow);
            ivThird = itemView.findViewById(R.id.thirdRow);
        }
    }
}
