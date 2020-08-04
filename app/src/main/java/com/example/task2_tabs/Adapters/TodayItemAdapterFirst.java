package com.example.task2_tabs.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task2_tabs.ModelItemLife;
import com.example.task2_tabs.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TodayItemAdapterFirst extends RecyclerView.Adapter<TodayItemAdapterFirst.MyViewHolder> {


    private ArrayList<ModelItemLife> ListLife;


    int[] imgLife1, imgLife2, imgLife3, imgDaily;
    Context context;

    public TodayItemAdapterFirst(int[] imgLife1, int[] imgLife2, int[] imgLife3, int[] imgDaily, ArrayList<ModelItemLife> ListLife, Context context) {

        this.imgLife1 = imgLife1;
        this.imgLife2 = imgLife2;
        this.imgLife3 = imgLife3;
        this.imgDaily = imgDaily;
        this.context = context;
        this.ListLife = ListLife;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_today_first, parent, false);

        return (new MyViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ModelItemLife LifecurrentItem = ListLife.get(position);

        holder.tvmainTitle.setText(LifecurrentItem.getLife());
        holder.tvsubtitle.setText(LifecurrentItem.getRun());

//        holder.gameOfTheDay.setText(GameCurrentItem.getGameOfTheDay());
//        holder.gameFirst.setText(GameCurrentItem.getGameFirstText());
//        holder.gameSecond.setText(GameCurrentItem.getGameSecondText());
//
//        holder.ivMain.setImageResource(GameCurrentItem.getIvMain());
//        holder.ivIcon.setImageResource(GameCurrentItem.getIvIcon());
//        holder.btn.setText(GameCurrentItem.getGameBtn());


        //Life hack Layout Manager
        holder.rvLifeHacks.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));


        //Life Hack adapter
        TodaySubLifeHackAdapter itemAdapter = new TodaySubLifeHackAdapter(context, imgLife1, imgLife2, imgLife3);


        holder.rvLifeHacks.setAdapter(itemAdapter);


//        //Daily List Layout Manager
//        holder.rvDailyList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
//
//
//        //Daily List adapter
//        TodaySubDailyListAdapter adapter = new TodaySubDailyListAdapter(imgDaily, mainDataDaily, subDataDaily, context);
//
//        holder.rvDailyList.setAdapter(adapter);


    }


    @Override
    public int getItemCount() {
        return ListLife.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvmainTitle, tvsubtitle, gameFirst, gameSecond, gameOfTheDay;
        RecyclerView rvLifeHacks, rvDailyList;
        ImageView ivMain, ivIcon;
        Button btn;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            tvmainTitle = itemView.findViewById(R.id.tv_itemToday_first_main);
            tvsubtitle = itemView.findViewById(R.id.tv_itemToday_first_sub);
            rvLifeHacks = itemView.findViewById(R.id.rv_img);
//            rvDailyList = itemView.findViewById(R.id.rv_vertical);
//            gameFirst = itemView.findViewById(R.id.tv_firsttext_game);
//            gameSecond = itemView.findViewById(R.id.tvsecondtext_game);
//            gameOfTheDay = itemView.findViewById(R.id.tv_gameoftheday);
//            ivMain = itemView.findViewById(R.id.iv_maingamepic);
//            ivIcon = itemView.findViewById(R.id.iv_icongame);
//            btn = itemView.findViewById(R.id.btn_game);


        }
    }
}
