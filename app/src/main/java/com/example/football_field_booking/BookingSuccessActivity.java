package com.example.football_field_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.football_field_booking.fragments.HistoryNowFragment;
import com.example.football_field_booking.fragments.UserHomeFragment;
import com.google.android.material.button.MaterialButton;

public class BookingSuccessActivity extends AppCompatActivity {

    private MaterialButton btnViewHistory,btnBackToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_success);
        btnViewHistory=findViewById(R.id.btnViewHistory);
        btnBackToHome=findViewById(R.id.btnBackToHome);

        btnViewHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BookingSuccessActivity.this,MainActivity.class);
                intent.putExtra("action","view_history");
                startActivity(intent);
            }
        });

        btnBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BookingSuccessActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}