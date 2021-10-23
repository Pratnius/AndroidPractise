package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = findViewById(R.id.button3);
        final TextView tv1 = findViewById(R.id.tv1);

        button3.setOnClickListener((v) -> {
            tv1.setText("GoodAfternoon");
            Log.d("MainAcitivity", "world");
        });

        Log.d("MainActivity", "hello");
    }
}