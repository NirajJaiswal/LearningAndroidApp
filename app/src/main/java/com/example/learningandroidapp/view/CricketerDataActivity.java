package com.example.learningandroidapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.learningandroidapp.adapter.CricketerAdapter;
import com.example.learningandroidapp.model.CricketerModel;
import com.example.learningandroidapp.R;
import com.example.learningandroidapp.listener.CricketData;

import java.util.ArrayList;
import java.util.List;

public class CricketerDataActivity extends AppCompatActivity implements CricketData {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricketer_data);
        
        initView();
        setValue();
    }

    private void setValue() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CricketerAdapter cricketerAdapter=new CricketerAdapter(loadCricket(),this);
        recyclerView.setAdapter(cricketerAdapter);
    }

    private List<CricketerModel> loadCricket() {
        List<CricketerModel> mList=new ArrayList<>();
        //mList.add(new CricketerModel(R.drawable.mitchellJohnson,"Mitchell Johnson","34"));
       // mList.add(new CricketerModel(R.drawable.rohitSharma,"Rohit Sharma","35"));
        mList.add(new CricketerModel(R.drawable.shami,"Shami","36"));
        mList.add(new CricketerModel(R.drawable.shikhardhawan,"Shikhar Dhawan","60"));
        mList.add(new CricketerModel(R.drawable.smith,"Smith","45"));
        return mList;
    }

    private void initView() {
        recyclerView=findViewById(R.id.cricket_rv);
    }

    @Override
    public void onClick(CricketerModel cricketerModel) {
       Intent intent=new Intent(CricketerDataActivity.this, CricketDetailActivity.class);
       intent.putExtra("details",cricketerModel);
       startActivity(intent);
    }
}