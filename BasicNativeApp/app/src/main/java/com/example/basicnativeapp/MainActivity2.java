package com.example.basicnativeapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.home).setOnClickListener(v->{
            Intent i = new Intent(MainActivity2.this, MainActivity.class);
            MainActivity2.this.startActivity(i);
        });
    }
}