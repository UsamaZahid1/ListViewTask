package com.example.task2_tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.task2_tabs.Adapters.SettingAdapter;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SettingFragment extends Fragment {

   ListView lv;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_setting, container, false);


       lv=view.findViewById(R.id.lv_setting);


        ArrayList<Object> list=new ArrayList<>();
        list.add(new String("Wireless & networks"));
        list.add(new SettingItems("Dual card management",R.drawable.sim,R.drawable.arrow));
        list.add(new SettingItems("Wifi",R.drawable.wifi,R.drawable.arrow));
        list.add(new SettingItems("Bluetooth",R.drawable.bluetooth,R.drawable.arrow));
        list.add(new SettingItems("Data traffic management",R.drawable.repeat,R.drawable.arrow));
        list.add(new SettingItems("More",R.drawable.more,R.drawable.arrow));

        list.add(new String("Device"));
        list.add(new SettingItems("Home Screen style",R.drawable.homerun,R.drawable.arrow));
        list.add(new SettingItems("Display",R.drawable.rendering,R.drawable.arrow));
        list.add(new SettingItems("Sound",R.drawable.speaker,R.drawable.arrow));
        list.add(new SettingItems("Storage",R.drawable.database,R.drawable.arrow));
        list.add(new SettingItems("Battery",R.drawable.batterylevel,R.drawable.arrow));
        list.add(new SettingItems("Power Saving",R.drawable.recycle,R.drawable.arrow));

        list.add(new String("Privacy & Security"));
        list.add(new SettingItems("Screen lock & password",R.drawable.lock,R.drawable.arrow));
        list.add(new SettingItems("Location access",R.drawable.location,R.drawable.arrow));
        list.add(new SettingItems("Do not disturb",R.drawable.block,R.drawable.arrow));
        list.add(new SettingItems("Notification Center",R.drawable.notification,R.drawable.arrow));
        list.add(new SettingItems("Protected apps",R.drawable.password,R.drawable.arrow));
        list.add(new SettingItems("Security",R.drawable.shield,R.drawable.arrow));
        list.add(new SettingItems("Backup & reset",R.drawable.save,R.drawable.arrow));

        list.add(new String("Accounts"));
        list.add(new SettingItems("Huawei Cloud+",R.drawable.cloud,R.drawable.arrow));
        list.add(new SettingItems("Accounts",R.drawable.account,R.drawable.arrow));

        SettingAdapter adapter= new SettingAdapter(list,view.getContext());

        lv.setAdapter(adapter);

        return view;
    }
}
