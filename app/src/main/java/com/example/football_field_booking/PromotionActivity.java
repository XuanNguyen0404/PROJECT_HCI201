package com.example.football_field_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class PromotionActivity extends AppCompatActivity {

    private TextView textIgnore1;
    private TextView textIgnore2;
    private TextView textIgnore3;
    private TextView textIgnore4;
    private TextView textIgnore5;
    private TextView textIgnore6;
    private MaterialToolbar topAppBar;
    private TextView tvViewMore1;
    private TextView tvViewMore2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion);

        textIgnore1 = findViewById(R.id.tvPriceIgnore1);
        textIgnore2 = findViewById(R.id.tvPriceIgnore2);
        textIgnore3 = findViewById(R.id.tvPriceIgnore3);
        textIgnore4 = findViewById(R.id.tvPriceIgnore4);
        textIgnore5 = findViewById(R.id.tvPriceIgnore5);
        textIgnore6 = findViewById(R.id.tvPriceIgnore6);

        tvViewMore1 = findViewById(R.id.tvViewMore1);
//        tvViewMore2 = findViewById(R.id.tvViewMore2);

        textIgnore1.setPaintFlags(textIgnore1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore2.setPaintFlags(textIgnore2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore3.setPaintFlags(textIgnore3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore4.setPaintFlags(textIgnore4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore5.setPaintFlags(textIgnore5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore6.setPaintFlags(textIgnore6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        tvViewMore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PromotionActivity.this, ListPromotionActivity.class);
                startActivity(intent);
            }
        });

        topAppBar=findViewById(R.id.topAppBar);
        topAppBar.setTitle("Promotion");
    }

    public void clickToViewDetailField(View view) {
        Intent intent=new Intent(this, UserFootballFieldDetailActivity.class);
        intent.putExtra("action","add to cart");
        startActivity(intent);
    }

    public void clickToViewDetailABigField(View view) {
        Intent intent=new Intent(this,ListPromotionActivity.class);
        startActivity(intent);
    }
}