package com.example.learningandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button mBtnMessage;
private Button mBtnUrl;
private Button mBtnRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnMessage=findViewById(R.id.btn_message);
        mBtnUrl=findViewById(R.id.btn_url);
        mBtnRecycler=findViewById(R.id.btn_recycler);


        mBtnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hi, How are you?", Toast.LENGTH_SHORT).show();
            }
        });
        mBtnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CricketerDataActivity.class);
                startActivity(intent);
            }
        });
        mBtnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com")));
            }
        });

    }
}