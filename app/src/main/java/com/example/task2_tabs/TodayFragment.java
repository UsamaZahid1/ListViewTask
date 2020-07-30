package com.example.task2_tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.task2_tabs.Adapters.TodayItemAdapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TodayFragment extends Fragment {


    RecyclerView verticalRecyclerView;
    String[] dataLife = {"LIFE HACK"};
    String[] subdataLife = {"Run your business on the go"};
    int[] imgLife1 = {R.drawable.pay, R.drawable.startrek, R.drawable.team, R.drawable.linkedin,
            R.drawable.idea, R.drawable.growth, R.drawable.pay, R.drawable.startrek, R.drawable.team, R.drawable.linkedin,
            R.drawable.idea, R.drawable.growth};

    int[] imglife2 = {R.drawable.hours, R.drawable.ins, R.drawable.search, R.drawable.rocket,
            R.drawable.presentation, R.drawable.book, R.drawable.hours, R.drawable.ins, R.drawable.search, R.drawable.rocket,
            R.drawable.presentation, R.drawable.book};

    int[] imgLife3 = {R.drawable.coins, R.drawable.coffee, R.drawable.clipboard, R.drawable.champion,
            R.drawable.book, R.drawable.fb, R.drawable.coins, R.drawable.coffee, R.drawable.clipboard, R.drawable.champion,
            R.drawable.book, R.drawable.fb};

    int[] imgDaily1 = {R.drawable.infinity, R.drawable.camera, R.drawable.loop, R.drawable.mission, R.drawable.world,
            R.drawable.monitor, R.drawable.graphic, R.drawable.food, R.drawable.money, R.drawable.homerun, R.drawable.paypal,
            R.drawable.filesandfolders, R.drawable.code, R.drawable.cup, R.drawable.shoppingcart};

    String[] dataMainDaily = {"Boomerang from instagram", "Plotagraph", "Loopsie - 3D Photos", "Gif Maker by Momento",
            "Make your own World", "Work professionally", "Grow your company", "Food foodie", "Make money",
            "Build houses", "Paypal", "Files nd Folders", "Coders World", "Success Trophy", "Shoping cart"};

    String[] dataSubDaily = {"Photo & Video", "Photo & Video Creative Bundle", "3D Camera & D3D Dazz Cam",
            "Video to GIF & Stop Motion", "Make your own World", "Work professionally", "Grow your company", "Food foodie", "Make money",
            "Build houses", "Paypal", "Files nd Folders", "Coders World", "Success Trophy", "Shoping cart"};

    String[] gameOfThe={"GAME OF THE DAY","GAME OF THE DAY","GAME OF THE DAY"};
    String[] gameFirstText={"Kung Fu Clicker: Idle Dojo","Kung Fu Clicker: Idle Dojo","Kung Fu Clicker: Idle Dojo"};
    String[] gameSecondText={"Fight to defend your idle dojo","Fight to defend your idle dojo","Fight to defend your idle dojo","Fight to defend your idle dojo"};
    String[] gameBtn={"GET","GET","GET","GET"};
    int[] gameMainPic={R.drawable.game,R.drawable.game,R.drawable.game};
    int[] gameIcon={R.drawable.icon,R.drawable.icon,R.drawable.icon};



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_today, container, false);


        TextView tv = view.findViewById(R.id.tv_fragtoday_date);
        verticalRecyclerView = view.findViewById(R.id.verticalRecyclerview);

        tv.setText(getcurrentDateAndTime());


        verticalRecyclerView.setHasFixedSize(true);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));


        TodayItemAdapter adapter = new TodayItemAdapter(dataLife, subdataLife, dataMainDaily, dataSubDaily, imgLife1, imglife2, imgLife3, imgDaily1,gameOfThe,gameFirstText,gameSecondText,gameMainPic,gameIcon,gameBtn,view.getContext());

        verticalRecyclerView.setAdapter(adapter);


        return view;
    }

    public static String getcurrentDateAndTime() {

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd LLLL");
        String formattedDate = simpleDateFormat.format(c);
        return formattedDate;
    }


}
