package com.example.learningandroidapp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learningandroidapp.R;
import com.example.learningandroidapp.model.CricketerModel;

public class CricketDetailActivity extends AppCompatActivity {
    private View view;
    private ImageView mProfile;
    private TextView mName,mAge;
    private CricketerModel cricketerModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_detail);
        initView();
cricketerModel= (CricketerModel) getIntent().getSerializableExtra("details");

        if(cricketerModel!=null) {
            getCricketerDetails(cricketerModel);
        }
        else{
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        }
    }

    private void initView() {
        mProfile=findViewById(R.id.cricketer_image);
        mName=findViewById(R.id.cricket_name);
        mAge=findViewById(R.id.cricket_age);
    }
    private  void getCricketerDetails(CricketerModel cricketerModel){
        mProfile.setImageResource(cricketerModel.getCricketImage());
        mName.setText(cricketerModel.getCricketName());
        mAge.setText(cricketerModel.getCricketAge());
    }
}