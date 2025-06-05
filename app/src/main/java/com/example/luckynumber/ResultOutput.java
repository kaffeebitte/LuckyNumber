package com.example.luckynumber;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultOutput extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_output);
        int luckyNumber = getIntent().getIntExtra("luckyNumber", 0);
        String name = getIntent().getStringExtra("name");
        TextView nameText = findViewById(R.id.nameText);
        nameText.setText("Hey " + name + "!");
        TextView resultText = findViewById(R.id.resultText);
        resultText.setText(String.valueOf(luckyNumber));

        Button shareBtn = findViewById(R.id.shareBtn);
        shareBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
