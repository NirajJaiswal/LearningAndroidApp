package com.example.learningandroidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CricketerAdapter extends RecyclerView.Adapter<CricketerHolder> {
    private List<CricketerModel> mList;
    private Context mContext;
    private CricketData cricketData;




    public CricketerAdapter(List<CricketerModel> mList, Context mContext){
this.mList=mList;
this.mContext=mContext;
this.cricketData= (CricketData) mContext;
    }
    @NonNull
    @Override
    public CricketerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.cricketer_list,parent,false);

        return new CricketerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CricketerHolder holder, int position) {
    holder.onDataSet(mList.get(position),cricketData);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
