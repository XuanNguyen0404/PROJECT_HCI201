package com.example.football_field_booking;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.football_field_booking.fragments.TimeWorkingFragment;
import com.example.football_field_booking.fragments.UserHomeFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

public class UserFootballFieldDetailActivity extends AppCompatActivity {

    private TextView txtSelectDate;
    private DatePickerDialog datePickerDialog;
    private int year, month, day;
    private Calendar calendar;
    String now;
    private FloatingActionButton btnBack;
    private ToggleButton toggleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_football_field_detail);
//        Intent intent=this.getIntent();
//        String fieldID=intent.getStringExtra("fieldID");
        calendar = Calendar.getInstance();
        txtSelectDate = findViewById(R.id.txtSelectDate);
        btnBack=findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        now = calendar.get(Calendar.DAY_OF_MONTH) +
                "/" + (calendar.get(Calendar.MONTH) + 1) +
                "/" + calendar.get(Calendar.YEAR);
        txtSelectDate.setText(now);
        System.out.println("Now:"+now);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new TimeWorkingFragment()).commit();
    }

    public void clickToChangeDate(View view) {
        String[] selectedDate = txtSelectDate.getText().toString().split("/");
        if(!txtSelectDate.getText().equals(now)){
            day = Integer.parseInt(selectedDate[0]);
            month = Integer.parseInt(selectedDate[1])-1;
            year = Integer.parseInt(selectedDate[2]);
        }
        System.out.println(day + "/" + month + "/" + year);
        datePickerDialog = new DatePickerDialog(UserFootballFieldDetailActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                txtSelectDate.setText(d + "/" + (m + 1) + "/" + y);
            }
        }, year, month, day);
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
        datePickerDialog.show();

    }

    public void clickToAddToCart(View view) {
        Intent intent=new Intent(UserFootballFieldDetailActivity.this,MainActivity.class);
        startActivity(intent);
    }
}