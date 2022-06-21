package com.example.basicnativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.flutter).setOnClickListener(v->{
//            Intent i = new Intent(MainActivity.this,MainActivity2.class);
//            MainActivity.this.startActivity(i);
            startActivity(
                    FlutterActivity.createDefaultIntent(this)
            );
        });
    }
}