package com.example.task2_tabs.Adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.task2_tabs.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.task2_tabs.R.anim.right;

public class TodaySubLifeHackAdapter extends RecyclerView.Adapter<TodaySubLifeHackAdapter.SubViewHolder> {
    int[] img1, img2, img3;
    Context context;


    public TodaySubLifeHackAdapter(Context context, int[] img1, int[] img2, int[] img3) {
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.context = context;
    }


    @NonNull
    @Override
    public SubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_sublifehacks_today, parent, false);
        return (new SubViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull SubViewHolder holder, int position) {

        holder.ivfirst.setImageResource(img1[position]);
        holder.ivSecond.setImageResource(img2[position]);
        holder.ivThird.setImageResource(img3[position]);

        Animation animfirst = AnimationUtils.loadAnimation(context,R.anim.left);
        Animation animSecond = AnimationUtils.loadAnimation(context, right);


        holder.ivfirst.startAnimation(animfirst);
        holder.ivSecond.startAnimation(animSecond);
        holder.ivThird.startAnimation(animfirst);

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
