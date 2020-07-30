package com.example.task2_tabs;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task2_tabs.Adapters.GamesItemAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GamesFragment extends Fragment {
    RecyclerView rv;

    String[] pageMain={"MAJOR UPDATE"};
    String[] pageSub={"Seekers Notes®: Hidden Mystery"};
    String[] pageSubToSub={"Solve all_new mysteries"};
    String[] relativeMainTitle={"This week's favourities"};
    String[] relativeMainTitleSec={"What We're Playing"};
    String[] relativeSubTitle={"See All"};
    String[] relativeSubTitleSec={"See All"};
    String[] firstMain={"PUBG MOBILE - NEW \nMAP: LIVIK"};
    String[] firstMainSec={"Mario kart Tour"};
    String[] firstSub={"Be the Winner in 15 Minutes"};
    String[] firstSubSec={"Race around the world"};
    String[] secondMain={"Minecraft"};
    String[] secondMainSec={"F1 Manager"};
    String[] secondSub={"Create, explore and survive!"};
    String[] secondSubSec={"2020 Season Now Live!"};
    String[] thirdMain={"Candy Crush Saga"};
    String[] thirdMainSec={"Left to Survive: \nZombie Games"};
    String[] thirdSub={"Play top match 3 puzzle games"};
    String[] thirdSubSec={"Play top match 3 puzzle games"};

    String[] firstButton={"GET"};
    String[] firstButtonSec={"GET"};
    String[] secondButton={"Rs 1,100.00"};
    String[] secondButtonSec={"GET"};
    String[] thirdButton={"GET"};
    String[] thirdButtonSec={"GET"};

    int[] imgMain={R.drawable.gamestabpic};
    int[] imgFirst={R.drawable.pubg};
    int[] imgFirstSec={R.drawable.mario};
    int[] imgSecond={R.drawable.mine};
    int[] imgSecondSec={R.drawable.ff};
    int[] imgThird={R.drawable.candy};
    int[] imgThirdSec={R.drawable.zoombie};






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_games, container, false);


        rv=view.findViewById(R.id.games_recyclerView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL,false));
        GamesItemAdapter adapter=new GamesItemAdapter(pageMain,pageSub,pageSubToSub,relativeMainTitle,relativeSubTitle,firstMain,firstSub,secondMain,secondSub,thirdMain,thirdSub,firstButton,secondButton,thirdButton,relativeMainTitleSec,relativeSubTitleSec,firstMainSec,firstSubSec,secondMainSec,secondSubSec,thirdMainSec,thirdSubSec,firstButtonSec,secondButtonSec,thirdButtonSec,imgMain,imgFirst,imgSecond,imgThird,imgFirstSec,imgSecondSec,imgThirdSec);
        rv.setAdapter(adapter);

        return view;
    }
}
