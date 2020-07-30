package com.example.task2_tabs.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task2_tabs.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GamesItemAdapter extends RecyclerView.Adapter<GamesItemAdapter.GameHolder> {
    String[] pageMain, pageSub, pageSubToSub, relativeMainTitle, relativeSubTitle, firtMain, firstSub, secondMain, secondSub,
            thirdMain, thirdSub, firstButton, secondButton, thirdButton,relativeMainTitleSec,relativeSubTitle_sec,firstMainSec,firstSubSec,secondMainSec,secondSubSec,
            thirdMainSec, thirdSub_Sec,firstButtonSec, secondButtonSec, thirdButtonSec;
    int[] imgMain, imgFirst, imgSecond, imgThird,imgfirstSec, imgsecondSec, imgThirdSec;

    public GamesItemAdapter(String[] pageMain, String[] pageSub, String[] pageSubToSub, String[] relativeMainTitle, String[] relativeSubTitle, String[] firtMain, String[] firstSub, String[] secondMain, String[] secondSub, String[] thirdMain, String[] thirdSub, String[] firstButton, String[] secondButton, String[] thirdButton, String[] relativeMainTitleSec, String[] relativeSubTitle_sec, String[] firstMainSec, String[] firstSubSec, String[] secondMainSec, String[] secondSubSec, String[] thirdMainSec, String[] thirdSub_Sec, String[] firstSec, String[] secondSec, String[] thirdSec, int[] imgMain, int[] imgFirst, int[] imgSecond, int[] imgThird, int[] imgfirstSec, int[] imgsecondSec, int[] imgThirdSec) {
        this.pageMain = pageMain;
        this.pageSub = pageSub;
        this.pageSubToSub = pageSubToSub;
        this.relativeMainTitle = relativeMainTitle;
        this.relativeSubTitle = relativeSubTitle;
        this.firtMain = firtMain;
        this.firstSub = firstSub;
        this.secondMain = secondMain;
        this.secondSub = secondSub;
        this.thirdMain = thirdMain;
        this.thirdSub = thirdSub;
        this.firstButton = firstButton;
        this.secondButton = secondButton;
        this.thirdButton = thirdButton;
        this.relativeMainTitleSec = relativeMainTitleSec;
        this.relativeSubTitle_sec = relativeSubTitle_sec;
        this.firstMainSec = firstMainSec;
        this.firstSubSec = firstSubSec;
        this.secondMainSec = secondMainSec;
        this.secondSubSec = secondSubSec;
        this.thirdMainSec = thirdMainSec;
        this.thirdSub_Sec = thirdSub_Sec;
        this.firstButtonSec = firstSec;
        this.secondButtonSec = secondSec;
        this.thirdButtonSec = thirdSec;
        this.imgMain = imgMain;
        this.imgFirst = imgFirst;
        this.imgSecond = imgSecond;
        this.imgThird = imgThird;
        this.imgfirstSec = imgfirstSec;
        this.imgsecondSec = imgsecondSec;
        this.imgThirdSec = imgThirdSec;
    }

    @NonNull
    @Override
    public GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_games, parent, false);
        return (new GameHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull GameHolder holder, int position) {
        holder.tvpageMain.setText(pageMain[position]);
        holder.tvpageSub.setText(pageSub[position]);
        holder.tvpageSubToSub.setText(pageSubToSub[position]);
        holder.tvrelativeMainTitle.setText(relativeMainTitle[position]);
        holder.tvrelativeMainTitleSec.setText(relativeMainTitleSec[position]);
        holder.tvrelativeSubTitle.setText(relativeSubTitle[position]);
        holder.tvrelativeSubTitle_sec.setText(relativeSubTitle_sec[position]);
        holder.tvfirtMain.setText(firtMain[position]);
        holder.tvfirstMainSec.setText(firstMainSec[position]);
        holder.tvfirstSub.setText(firstSub[position]);
        holder.tvfirstSubSec.setText(firstSubSec[position]);
        holder.tvsecondMain.setText(secondMain[position]);
        holder.tvsecondMainSec.setText(secondMainSec[position]);
        holder.tvsecondSub.setText(secondSub[position]);
        holder.tvsecondSubSec.setText(secondSubSec[position]);
        holder.tvthirdMain.setText(thirdMain[position]);
        holder.tvthirdMainSec.setText(thirdMainSec[position]);
        holder.tvthirdSub.setText(thirdSub[position]);
        holder.tvthirdSub_Sec.setText(thirdSub_Sec[position]);

        holder.ivMain.setImageResource(imgMain[position]);
        holder.ivFirst.setImageResource(imgFirst[position]);
        holder.ivFirstSec.setImageResource(imgfirstSec[position]);
        holder.ivSecond.setImageResource(imgSecond[position]);
        holder.ivSecondSec.setImageResource(imgsecondSec[position]);
        holder.ivThird.setImageResource(imgThird[position]);
        holder.ivThirdSec.setImageResource(imgThirdSec[position]);

        holder.btnFirst.setText(firstButton[position]);
        holder.btnFirstSec.setText(firstButtonSec[position]);
        holder.btnSecond.setText(secondButton[position]);
        holder.btnSecondSec.setText(secondButtonSec[position]);
        holder.btnThird.setText(thirdButton[position]);
        holder.btnThirdSec.setText(thirdButtonSec[position]);

    }

    @Override
    public int getItemCount() {
        return pageMain.length;
    }

    public class GameHolder extends RecyclerView.ViewHolder {
        TextView tvpageMain, tvpageSub, tvpageSubToSub, tvrelativeMainTitle, tvrelativeSubTitle, tvfirtMain, tvfirstSub, tvsecondMain, tvsecondSub,
                tvthirdMain, tvthirdSub ,tvrelativeMainTitleSec,tvrelativeSubTitle_sec,tvfirstMainSec,tvfirstSubSec,tvsecondMainSec,tvsecondSubSec,
                tvthirdMainSec, tvthirdSub_Sec;
        ImageView ivMain, ivFirst, ivSecond, ivThird, ivFirstSec, ivSecondSec, ivThirdSec;
        Button btnFirst, btnSecond, btnThird,btnFirstSec, btnSecondSec, btnThirdSec;

        public GameHolder(@NonNull View itemView) {
            super(itemView);
            tvpageMain = itemView.findViewById(R.id.tv_games_main_page_title);
            tvpageSub = itemView.findViewById(R.id.tv_games_main_page_subtitle);
            tvpageSubToSub = itemView.findViewById(R.id.tv_games_main_page_sub_to_sub);
            tvrelativeMainTitle = itemView.findViewById(R.id.tv_games_relative_main);
            tvrelativeSubTitle = itemView.findViewById(R.id.tv_games_relative_sub_title);
            tvfirtMain = itemView.findViewById(R.id.tv_games_first_main);
            tvfirstSub = itemView.findViewById(R.id.tv_games_first_sub);
            tvsecondMain = itemView.findViewById(R.id.tv_games_second_main);
            tvsecondSub = itemView.findViewById(R.id.tv_games_second_sub);
            tvthirdMain = itemView.findViewById(R.id.tv_games_third_main);
            tvthirdSub = itemView.findViewById(R.id.tv_games_third_sub);
            tvrelativeMainTitleSec = itemView.findViewById(R.id.tv_games_relative_main_sec);
            tvrelativeSubTitle_sec = itemView.findViewById(R.id.tv_games_relative_sub_title_sec);
            tvfirstMainSec = itemView.findViewById(R.id.tv_games_first_main_sec);
            tvfirstSubSec = itemView.findViewById(R.id.tv_games_first_sub_sec);
            tvsecondMainSec = itemView.findViewById(R.id.tv_games_second_main_sec);
            tvsecondSubSec = itemView.findViewById(R.id.tv_games_second_sub_sec);
            tvthirdMainSec = itemView.findViewById(R.id.tv_games_third_main_sec);
            tvthirdSub_Sec = itemView.findViewById(R.id.tv_games_third_sub_sec);

            ivMain = itemView.findViewById(R.id.iv_games_main_pic);
            ivFirst = itemView.findViewById(R.id.iv_games_first);
            ivSecond = itemView.findViewById(R.id.iv_games_second);
            ivThird = itemView.findViewById(R.id.iv_games_third);
            ivFirstSec = itemView.findViewById(R.id.iv_games_first_sec);
            ivSecondSec = itemView.findViewById(R.id.iv_games_second_sec);
            ivThirdSec = itemView.findViewById(R.id.iv_games_third_sec);

            btnFirst = itemView.findViewById(R.id.btn_games_first_game);
            btnSecond = itemView.findViewById(R.id.btn_games_second_game);
            btnThird = itemView.findViewById(R.id.btn_games_third_game);
            btnFirstSec = itemView.findViewById(R.id.btn_games_first_game_sec);
            btnSecondSec = itemView.findViewById(R.id.btn_games_second_game_sec);
            btnThirdSec = itemView.findViewById(R.id.btn_games_third_game_sec);
        }
    }
}
