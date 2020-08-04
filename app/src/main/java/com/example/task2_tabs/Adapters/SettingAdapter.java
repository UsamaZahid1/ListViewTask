package com.example.task2_tabs.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task2_tabs.R;
import com.example.task2_tabs.SettingItems;

import java.util.ArrayList;

public class SettingAdapter extends BaseAdapter {
    ArrayList<Object> list;
    private static final int ITEMS = 0;
    private static final int HEADER = 1;
    private LayoutInflater inflater;

    public SettingAdapter(ArrayList<Object> list, Context context) {
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            switch (getItemViewType(i)) {
                case ITEMS:
                    view = inflater.inflate(R.layout.setting_list_item, null);
                    break;
                case HEADER:
                    view = inflater.inflate(R.layout.header_setting, null);
                    break;
            }
            switch (getItemViewType(i)) {
                case ITEMS:
                    ImageView iv=view.findViewById(R.id.iv_setting);
                    ImageView ivArrow=view.findViewById(R.id.iv_setting_arrow);
                    TextView tv=view.findViewById(R.id.tv_setting);

                    iv.setImageResource(((SettingItems)list.get(i)).getImg());
                    ivArrow.setImageResource(((SettingItems)list.get(i)).getImgArrow());
                    tv.setText(((SettingItems)list.get(i)).getName());
                    break;
                case HEADER:

                    TextView title=view.findViewById(R.id.tv_header);
                    title.setText((String)list.get(i));
                    break;
            }
        }


        return view;
    }

    @Override
    public int getItemViewType(int position) {
        if (list.get(position) instanceof SettingItems) {
            return ITEMS;
        } else {
            return HEADER;
        }

    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }
}
