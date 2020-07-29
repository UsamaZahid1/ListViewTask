package com.example.task2_tabs.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.task2_tabs.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TodayItemAdapter extends RecyclerView.Adapter<TodayItemAdapter.MyViewHolder> {

    String[] data;
    String[] subData;
    int[] img1, img2, img3;
    Context context;

    public TodayItemAdapter(Context context,String[] data, String[] subData, int[] img1, int[] img2, int[] img3) {

        this.context=context;
        this.data = data;
        this.subData = subData;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_today, parent, false);

        return (new MyViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String title = data[position];
        String subtitle = subData[position];

        holder.tvmainTitle.setText(title);
        holder.tvsubtitle.setText(subtitle);

        holder.rv.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

        TodaySubItemAdapter itemAdapter = new TodaySubItemAdapter(img1, img2, img3);

        holder.rv.setAdapter(itemAdapter);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvmainTitle, tvsubtitle;
        RecyclerView rv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvmainTitle = itemView.findViewById(R.id.tv_itemToday_main);
            tvsubtitle = itemView.findViewById(R.id.tv_itemToday_sub);
            rv = itemView.findViewById(R.id.rv_img);

        }
    }
}
