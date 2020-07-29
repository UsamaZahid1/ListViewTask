package com.example.task2_tabs;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
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
    String[] data={"LIFE HACK","THE DAILY LIST"};
    String[] subdata={"Run your business on the go","Get in the loop"};
    int[] img1={R.drawable.pay,R.drawable.startrek,R.drawable.team,R.drawable.linkedin,
            R.drawable.idea,R.drawable.growth,R.drawable.pay,R.drawable.startrek,R.drawable.team,R.drawable.linkedin,
            R.drawable.idea,R.drawable.growth};

    int[] img2={R.drawable.hours,R.drawable.ins,R.drawable.search,R.drawable.rocket,
            R.drawable.presentation,R.drawable.book,R.drawable.hours,R.drawable.ins,R.drawable.search,R.drawable.rocket,
            R.drawable.presentation,R.drawable.book};

    int[] img3={R.drawable.coins,R.drawable.coffee,R.drawable.clipboard,R.drawable.champion,
            R.drawable.book,R.drawable.fb,R.drawable.coins,R.drawable.coffee,R.drawable.clipboard,R.drawable.champion,
            R.drawable.book,R.drawable.fb};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_today, container, false);


        TextView tv = view.findViewById(R.id.tv_fragtoday_date);
        verticalRecyclerView=view.findViewById(R.id.verticalRecyclerview);

        tv.setText(getcurrentDateAndTime());



        verticalRecyclerView.setHasFixedSize(true);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL,false));


        TodayItemAdapter adapter=new TodayItemAdapter(view.getContext(),data,subdata,img1,img2,img3);

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
