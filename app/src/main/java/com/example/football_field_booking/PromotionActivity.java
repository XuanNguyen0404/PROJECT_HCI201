package com.example.football_field_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class PromotionActivity extends AppCompatActivity {

    private TextView textIgnore1;
    private TextView textIgnore2;
    private TextView textIgnore3;
    private MaterialToolbar topAppBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion);

        textIgnore1 = findViewById(R.id.tvPriceIgnore1);
        textIgnore2 = findViewById(R.id.tvPriceIgnore2);
        textIgnore3 = findViewById(R.id.tvPriceIgnore3);

        textIgnore1.setPaintFlags(textIgnore1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore2.setPaintFlags(textIgnore2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore3.setPaintFlags(textIgnore3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        topAppBar=findViewById(R.id.topAppBar);
        topAppBar.setTitle("Promotion");


    }
}