package com.example.task2_tabs.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.task2_tabs.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodayItemAdapter extends RecyclerView.Adapter<TodayItemAdapter.MyViewHolder> {

    String[] data;
    String[] subData;

    public TodayItemAdapter(String[] data, String[] subData) {
        this.data = data;
        this.subData = subData;
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

        String title=data[position];
        String subtitle=subData[position];

         holder.tvmainTitle.setText(title);
         holder.tvsubtitle.setText(subtitle);
         holder.rv.




    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvmainTitle,tvsubtitle;
        RecyclerView rv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvmainTitle = itemView.findViewById(R.id.tv_itemToday_main);
            tvsubtitle = itemView.findViewById(R.id.tv_itemToday_sub);
            rv = itemView.findViewById(R.id.rv_img);

        }
    }
}
