package com.example.cardviewdesign;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView v1, v2, v3, v4, v5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.language);
        v1.setImageResource(R.drawable.ic_language);

        v2 = findViewById(R.id.widgets);
        v2.setImageResource(R.drawable.ic_widgets);

        v3 = findViewById(R.id.charla);
        v3.setImageResource(R.drawable.ic_baseline_chat_24);


        v4 = findViewById(R.id.calendar);
        v4.setImageResource(R.drawable.ic_calendar);

        v5 = findViewById(R.id.informe);
        v5.setImageResource(R.drawable.ic_info);

        v5.setPadding(0,12,0,0);

    }




}