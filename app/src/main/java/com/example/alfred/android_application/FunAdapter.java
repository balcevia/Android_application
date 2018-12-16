package com.example.alfred.android_application;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FunAdapter extends RecyclerView.Adapter<FunAdapter.MyViewHolder> {

    private List<fundusz> funList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, TFI ;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.articles);
            TFI = (TextView) view.findViewById(R.id.article_subtitle);
        }
    }

    public FunAdapter(List<fundusz> funList) {
        this.funList = funList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        fundusz fundusz = funList.get(position);
        holder.title.setText(fundusz.getTitle());
        holder.TFI.setText(fundusz.getTFI());
    }

    @Override
    public int getItemCount() {
        return funList.size();
    }

}
