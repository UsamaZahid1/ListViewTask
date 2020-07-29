package com.example.task2_tabs.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.task2_tabs.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TodayItemAdapter extends RecyclerView.Adapter<TodayItemAdapter.MyViewHolder> {

    String[] mainData, subData, mainDataDaily, subDataDaily;
    int[] imgLife1, imgLife2, imgLife3, imgDaily;
    Context context;

    public TodayItemAdapter(String[] mainData, String[] subData, String[] dataDaily, String[] subDataDaily, int[] imgLife1, int[] imgLife2, int[] imgLife3, int[] imgDaily, Context context) {
        this.mainData = mainData;
        this.subData = subData;
        this.mainDataDaily = dataDaily;
        this.subDataDaily = subDataDaily;
        this.imgLife1 = imgLife1;
        this.imgLife2 = imgLife2;
        this.imgLife3 = imgLife3;
        this.imgDaily = imgDaily;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_today, parent, false);

        return (new MyViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String title = mainData[position];
        String subtitle = subData[position];

        holder.tvmainTitle.setText(title);
        holder.tvsubtitle.setText(subtitle);

        //Life hack Layout Manager
        holder.rvLifeHacks.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));


        //Life Hack adapter
        TodaySubLifeHackAdapter itemAdapter = new TodaySubLifeHackAdapter(context, imgLife1, imgLife2, imgLife3);


        holder.rvLifeHacks.setAdapter(itemAdapter);


        //Daily List Layout Manager
        holder.rvDailyList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));


        //Daily List adapter
        TodaySubDailyListAdapter adapter = new TodaySubDailyListAdapter(imgDaily, mainDataDaily, subDataDaily, context);

        holder.rvDailyList.setAdapter(adapter);


    }


    @Override
    public int getItemCount() {
        return mainData.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvmainTitle, tvsubtitle;
        RecyclerView rvLifeHacks, rvDailyList;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvmainTitle = itemView.findViewById(R.id.tv_itemToday_main);
            tvsubtitle = itemView.findViewById(R.id.tv_itemToday_sub);
            rvLifeHacks = itemView.findViewById(R.id.rv_img);
            rvDailyList = itemView.findViewById(R.id.rv_vertical);

        }
    }
}
