package com.example.task2_tabs.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task2_tabs.Model.ModelItemDaily;
import com.example.task2_tabs.Model.ModelItemGame;
import com.example.task2_tabs.Model.ModelItemLife;
import com.example.task2_tabs.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TodayItemAdapter extends RecyclerView.Adapter {


    private List list;
    int[] imgLife1, imgLife2, imgLife3, imgDaily;
    Context context;

    String[] mainDataDaily, subDataDaily;


    public TodayItemAdapter(int[] imgLife1, int[] imgLife2, int[] imgLife3, List list, int[] imgDaily, String[] mainDataDaily, String[] subDataDaily, Context context) {

        this.imgLife1 = imgLife1;
        this.imgLife2 = imgLife2;
        this.imgLife3 = imgLife3;
        this.context = context;
        this.list = list;
        this.imgDaily = imgDaily;
        this.mainDataDaily = mainDataDaily;
        this.subDataDaily = subDataDaily;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (this.getItemViewType(viewType) == 0) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_today_first, parent, false);

            FirstViewHolder holder = new FirstViewHolder(view);
            return holder;

        } else if (this.getItemViewType(viewType) == 1) {

            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_today_second, parent, false);

            SecondViewHolder secondViewHolder = new SecondViewHolder(view);
            return secondViewHolder;

        } else {

            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_today_third, parent, false);
            ThirdViewHolder thirdViewHolder = new ThirdViewHolder(view);
            return thirdViewHolder;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (this.getItemViewType(position) == 0) {
            //  for (ModelItemLife life: list.get(position).getObjects()) {
            FirstViewHolder firstViewHolder = (FirstViewHolder) holder;

            ModelItemLife LifecurrentItem = (ModelItemLife) list.get(position);


            firstViewHolder.tvmainTitleLife.setText(LifecurrentItem.getLife());
            firstViewHolder.tvsubtitleLife.setText(LifecurrentItem.getRun());

            //Life hack Layout Manager
            firstViewHolder.rvLifeHacks.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));


            //Life Hack adapter
            TodaySubLifeHackAdapter itemAdapter = new TodaySubLifeHackAdapter(context, imgLife1, imgLife2, imgLife3);


            firstViewHolder.rvLifeHacks.setAdapter(itemAdapter);
            //}

        } else if (this.getItemViewType(position) == 1) {

            ModelItemDaily dailycurrentItem = (ModelItemDaily) list.get(position);
            SecondViewHolder secondViewHolder = (SecondViewHolder) holder;


            secondViewHolder.tvmainTitleDaily.setText(dailycurrentItem.getDaiy());
            secondViewHolder.tvsubTitleDaily.setText(dailycurrentItem.getGetIn());


            //  Daily List Layout Manager
            secondViewHolder.rvDailyList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));


            //Daily List adapter
            TodaySubDailyListAdapter adapter = new TodaySubDailyListAdapter(imgDaily, mainDataDaily, subDataDaily, context);

            secondViewHolder.rvDailyList.setAdapter(adapter);

        } else {
            ModelItemGame gameCurrentItem = (ModelItemGame) list.get(position);
            ThirdViewHolder thirdViewHolder = (ThirdViewHolder) holder;

            thirdViewHolder.gameOfThe.setText(gameCurrentItem.getGameOfTheDay());
            thirdViewHolder.gameFirst.setText(gameCurrentItem.getGameFirstText());
            thirdViewHolder.gameSecond.setText(gameCurrentItem.getGameSecondText());
            thirdViewHolder.main.setImageResource(gameCurrentItem.getIvMain());
            thirdViewHolder.icon.setImageResource(gameCurrentItem.getIvIcon());

        }
    }


    @Override
    public int getItemViewType(int position) {
        if (ModelItemLife.class.isInstance(list.get(position))) {
            return 0;
        } else if (ModelItemDaily.class.isInstance(list.get(position))) {
            return 1;
        } else
            return 2;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class FirstViewHolder extends RecyclerView.ViewHolder {
        private TextView tvmainTitleLife, tvsubtitleLife;
        private RecyclerView rvLifeHacks;


        public FirstViewHolder(@NonNull View itemView) {
            super(itemView);


            tvmainTitleLife = itemView.findViewById(R.id.tv_itemToday_first_main);
            tvsubtitleLife = itemView.findViewById(R.id.tv_itemToday_first_sub);
            rvLifeHacks = itemView.findViewById(R.id.rv_img);


        }
    }

    static class SecondViewHolder extends RecyclerView.ViewHolder {
        private TextView tvmainTitleDaily, tvsubTitleDaily;
        private RecyclerView rvDailyList;

        public SecondViewHolder(@NonNull View itemView) {
            super(itemView);
            tvmainTitleDaily = itemView.findViewById(R.id.tv_itemToday_second_main);
            tvsubTitleDaily = itemView.findViewById(R.id.tv_itemToday_second_sub);
            rvDailyList = itemView.findViewById(R.id.rv_itemToday_second);
        }

    }

    static class ThirdViewHolder extends RecyclerView.ViewHolder {
        ImageView main, icon;
        TextView gameOfThe, gameFirst, gameSecond;


        public ThirdViewHolder(@NonNull View itemView) {
            super(itemView);
            main = itemView.findViewById(R.id.iv_maingamepic);
            icon = itemView.findViewById(R.id.iv_icongame);
            gameOfThe = itemView.findViewById(R.id.tv_gameoftheday);
            gameFirst = itemView.findViewById(R.id.tv_firsttext_game);
            gameSecond = itemView.findViewById(R.id.tvsecondtext_game);
        }
    }

}
