package com.example.task2_tabs.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task2_tabs.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodaySubDailyListAdapter extends RecyclerView.Adapter<TodaySubDailyListAdapter.DailyListHolder> {
    int[] img;
    String[] mainData, subData;
    Context context;

    public TodaySubDailyListAdapter(int[] img, String[] mainData, String[] subData, Context context) {
        this.img = img;
        this.mainData = mainData;
        this.subData = subData;
        this.context = context;
    }

    @NonNull
    @Override
    public DailyListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_subdailylist_today, parent, false);
        return (new DailyListHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull DailyListHolder holder, int position) {
        holder.iv.setImageResource(img[position]);
        holder.tvMain.setText(mainData[position]);
        holder.tvSub.setText(subData[position]);

    }

    @Override
    public int getItemCount() {
        return mainData.length;
    }

    public class DailyListHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        TextView tvMain, tvSub;

        public DailyListHolder(@NonNull View itemView) {
            super(itemView);

            iv = itemView.findViewById(R.id.iv_dailylist);
            tvMain = itemView.findViewById(R.id.tv_dailylist_main);
            tvSub = itemView.findViewById(R.id.tv_dailylist_sub);
        }
    }
}
