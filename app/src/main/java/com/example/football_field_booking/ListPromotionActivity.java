package com.example.football_field_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListPromotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_promotion);

        TextView textIgnore1 = findViewById(R.id.tvChildPriceIgnore1);
        TextView textIgnore2 = findViewById(R.id.tvChildPriceIgnore2);
        TextView textIgnore3 = findViewById(R.id.tvChildPriceIgnore3);
        TextView textIgnore4 = findViewById(R.id.tvChildPriceIgnore4);
        TextView textIgnore5 = findViewById(R.id.tvChildPriceIgnore5);
        TextView textIgnore6 = findViewById(R.id.tvChildPriceIgnore6);

        textIgnore1.setPaintFlags(textIgnore1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore2.setPaintFlags(textIgnore2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore3.setPaintFlags(textIgnore3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore4.setPaintFlags(textIgnore4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore5.setPaintFlags(textIgnore5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore6.setPaintFlags(textIgnore6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

    }

    public void clickToViewDetailField(View view) {
        Intent intent=new Intent(this,UserFootballFieldDetailActivity.class);
        startActivity(intent);
    }
}