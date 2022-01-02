package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }
    void initView(){
        TextView tv_second = findViewById(R.id.tv_second);
        User user = (User) getIntent().getSerializableExtra("user");
        tv_second.setText(user.toString());
    }
}