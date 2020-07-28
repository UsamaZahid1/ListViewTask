package com.example.task2_tabs;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TodayFragment extends Fragment {

//    ListView lv;
//    int img[] = {R.drawable.ins, R.drawable.hours, R.drawable.book, R.drawable.champion, R.drawable.clipboard,
//            R.drawable.coffee, R.drawable.coins, R.drawable.growth, R.drawable.idea, R.drawable.linkedin,
//            R.drawable.team, R.drawable.startrek, R.drawable.pay};
//    TextView tvDate, tvToday, tvLifeHacks, tvRunYour;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_today, container, false);
        TextView tv = view.findViewById(R.id.textview);
        tv.setText(getcurrentDateAndTime());


        return view;
    }

    public static String getcurrentDateAndTime() {

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLL, yyyy");
        String formattedDate = simpleDateFormat.format(c);
        return formattedDate;
    }


}
