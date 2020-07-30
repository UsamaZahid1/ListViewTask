package com.example.task2_tabs.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task2_tabs.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TodayItemAdapter extends RecyclerView.Adapter<TodayItemAdapter.MyViewHolder> {

    String[] mainData, subData, mainDataDaily, subDataDaily, gameOfThe, gameFirstText, gameSecondText;
    int[] imgLife1, imgLife2, imgLife3, imgDaily, gameMainPic, gameIcon;
    Context context;

    public TodayItemAdapter(String[] mainData, String[] subData, String[] dataDaily, String[] subDataDaily, int[] imgLife1, int[] imgLife2, int[] imgLife3, int[] imgDaily, String[] gameOfThe, String[] gameFirstText, String[] gameSecondText, int[] gameMainPic, int[] gameIcon, Context context) {
        this.mainData = mainData;
        this.subData = subData;
        this.mainDataDaily = dataDaily;
        this.subDataDaily = subDataDaily;
        this.imgLife1 = imgLife1;
        this.imgLife2 = imgLife2;
        this.imgLife3 = imgLife3;
        this.imgDaily = imgDaily;
        this.context = context;
        this.gameOfThe = gameOfThe;
        this.gameFirstText = gameFirstText;
        this.gameSecondText = gameSecondText;
        this.gameMainPic = gameMainPic;
        this.gameIcon = gameIcon;
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
        holder.rvLifeHacks.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));


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
        TextView tvmainTitle, tvsubtitle, gameFirst, gameSecond, gameOfTheDay;
        RecyclerView rvLifeHacks, rvDailyList;
        ImageView ivMain, ivIcon;
        Button btn;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvmainTitle = itemView.findViewById(R.id.tv_itemToday_main);
            tvsubtitle = itemView.findViewById(R.id.tv_itemToday_sub);
            rvLifeHacks = itemView.findViewById(R.id.rv_img);
            rvDailyList = itemView.findViewById(R.id.rv_vertical);
            gameFirst = itemView.findViewById(R.id.tv_firsttext_game);
            gameSecond = itemView.findViewById(R.id.tvsecondtext_game);
            gameOfTheDay = itemView.findViewById(R.id.tv_gameoftheday);
            ivMain = itemView.findViewById(R.id.iv_maingamepic);
            ivIcon = itemView.findViewById(R.id.iv_icongame);
            btn = itemView.findViewById(R.id.btn_game);

        }
    }
}
