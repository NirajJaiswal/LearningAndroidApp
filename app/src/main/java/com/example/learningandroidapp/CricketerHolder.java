package com.example.learningandroidapp;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CricketerHolder extends RecyclerView.ViewHolder {
    public ImageView mImageView;

   public TextView mEditTextName;
    public TextView mEditTextAge;




    public CricketerHolder(@NonNull View itemView) {
        super(itemView);
        mImageView=itemView.findViewById(R.id.cricket_iv);
       mEditTextName=itemView.findViewById(R.id.cricket_et_name);
       mEditTextAge=itemView.findViewById(R.id.cricket_et_age);
    }

    public void onDataSet(final CricketerModel cricketerModel,final CricketData cricketData){
        mImageView.setImageResource(cricketerModel.getCricketImage());
        mEditTextName.setText(cricketerModel.getCricketName());
        mEditTextAge.setText(cricketerModel.getCricketAge());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cricketData.onClick(cricketerModel);
            }
        });
    }
}
