package com.example.task2_tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.task2_tabs.Adapters.TodayItemAdapter;
import com.example.task2_tabs.Model.ModelItemDaily;
import com.example.task2_tabs.Model.ModelItemGame;
import com.example.task2_tabs.Model.ModelItemLife;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TodayFragment extends Fragment {

    TodayItemAdapter adapter;

    List list = new ArrayList();

    Button btnAdd;
    EditText etPosition, etItem;
    RecyclerView verticalRecyclerView;

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


        View view = inflater.inflate(R.layout.fragment_today, container, false);


        TextView tv = view.findViewById(R.id.tv_fragtoday_date);
        verticalRecyclerView = view.findViewById(R.id.verticalRecyclerview);

        btnAdd = view.findViewById(R.id.btn_today_addItem);
        etPosition = view.findViewById(R.id.et_today_position);
        etItem = view.findViewById(R.id.et_today_item);


        tv.setText(getcurrentDateAndTime());


        verticalRecyclerView.setHasFixedSize(true);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        createList();


        TodayItemAdapter adapter = new TodayItemAdapter(imgLife1, imglife2, imgLife3, list, imgDaily1, dataMainDaily, dataSubDaily, view.getContext());

        verticalRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = Integer.parseInt(etPosition.getText().toString());
                insert(position);
            }
        });


        return view;
    }


    public void insert(int position) {
        int item = Integer.parseInt(etItem.getText().toString());
        if (item == 1) {
            list.add(position, new ModelItemLife("Life Hack", "Run Your Business on the go"));
        } else if (item == 2) {
            list.add(position, new ModelItemDaily("The Daily List", "Get In The Loop"));

        } else {
            list.add(position, new ModelItemGame("Game Of The Day", "Kung Fu Clicker: Idle Dojo", "Fight To Defend Your Idle Dojo", R.drawable.game, R.drawable.icon));
        }

    }


    public void createList() {
        list.add(new ModelItemLife("Life Hack", "Run Your Business on the go"));
        list.add(new ModelItemDaily("The Daily List", "Get In The Loop"));
        list.add(new ModelItemGame("Game Of The Day", "Kung Fu Clicker: Idle Dojo", "Fight To Defend Your Idle Dojo", R.drawable.game, R.drawable.icon));

        for (int i = 3; i < 100; i++) {


        }
    }


    //Time & date method
    public static String getcurrentDateAndTime() {

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd LLLL");
        String formattedDate = simpleDateFormat.format(c);
        return formattedDate;
    }


}
