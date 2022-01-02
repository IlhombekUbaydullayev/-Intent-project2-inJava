package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    void initView(){
        Button b_open_second = findViewById(R.id.b_open_second);
        b_open_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User("Ilhombek",24);
                openSecondActivity(user);
            }
        });
    }
    void openSecondActivity(User user){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
}