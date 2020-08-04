package com.example.task2_tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.task2_tabs.Adapters.TodayItemAdapterFirst;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TodayFragment extends Fragment {

    View view;

    private TodayItemAdapterFirst adapter;

    private ArrayList<ModelItemGame> GameList;
    private ArrayList<ModelItemLife> LifeList;
    RecyclerView verticalRecyclerView;
    Button btnAdd, btnRefresh;
    EditText etAdd;

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

    String[] dataMainDaily = {"Boomerang\n from instagram", "Plotagraph", "Loopsie - 3D Photos", "Gif Maker by Momento",
            "Make your own World", "Work professionally", "Grow your company", "Food foodie", "Make money",
            "Build houses", "Paypal", "Files nd Folders", "Coders World", "Success Trophy", "Shoping cart"};

    String[] dataSubDaily = {"Photo & Video", "Photo & Video Creative Bundle", "3D Camera & D3D Dazz Cam",
            "Video to GIF & Stop Motion", "Make your own World", "Work professionally", "Grow your company", "Food foodie", "Make money",
            "Build houses", "Paypal", "Files nd Folders", "Coders World", "Success Trophy", "Shoping cart"};




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_today, container, false);

        createExampleList();
        TextView tv = view.findViewById(R.id.tv_fragtoday_date);
        verticalRecyclerView = view.findViewById(R.id.verticalRecyclerview);
        btnAdd = view.findViewById(R.id.btn_today_addItem);
        btnRefresh = view.findViewById(R.id.btn_today_refresh);
        etAdd = view.findViewById(R.id.et_today_add);

        tv.setText(getcurrentDateAndTime());


        verticalRecyclerView.setHasFixedSize(true);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));


        adapter = new TodayItemAdapterFirst( imgLife1, imglife2, imgLife3, imgDaily1,LifeList, view.getContext());


        verticalRecyclerView.setAdapter(adapter);

//
//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int position = Integer.parseInt(etAdd.getText().toString());
//                insertItem(position);
//
//            }
//        });


        return view;
    }

//    public void insertItem(int position) {
//        GameList.add(position, new ModelItemGame("Game Of The Day","Kung fu Clicker","Fight to defend","GET",R.drawable.game,R.drawable.icon));
//        adapter.notifyItemInserted(position);
//    }


    public void createExampleList() {
//        GameList = new ArrayList<>();
        LifeList = new ArrayList<>();
//        GameList.add(new ModelItemGame("Game Of The Day","Kung fu Clicker","Fight to defend","GET",R.drawable.game,R.drawable.icon));
       LifeList.add(new ModelItemLife("Life Hack","Run Your Business on the go"));

    }

    public static String getcurrentDateAndTime() {

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd LLLL");
        String formattedDate = simpleDateFormat.format(c);
        return formattedDate;
    }


}
