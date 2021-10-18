package com.example.football_field_booking.fragments;

import android.app.DatePickerDialog;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.football_field_booking.FilterDialogFragment;
import com.example.football_field_booking.R;

import java.util.Calendar;

public class UserHomeFragment extends Fragment{

    private TextView textIgnore1;
    private TextView textIgnore2;
    private TextView textIgnore3;
    private TextView textIgnore4;
    private TextView textIgnore5;
    private TextView textIgnore6;

    private TextView txtSelectDate;
    private DatePickerDialog datePickerDialog;
    private int year, month, day;
    private Calendar calendar;
    String now;
    private Button btnChangeDate;

    private FilterDialogFragment mFilterDialog;

    private CardView filter_bar;

    private ImageView button_clear_filter;

    public UserHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_user_home, container, false);

        filter_bar=view.findViewById(R.id.filter_bar);
        button_clear_filter=view.findViewById(R.id.button_clear_filter);
        filter_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFilterDialog = new FilterDialogFragment();
                mFilterDialog.show(getFragmentManager(), FilterDialogFragment.TAG);
            }
        });

        button_clear_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFilterDialog.resetFilters();
            }
        });

        textIgnore1 = view.findViewById(R.id.tvPriceIgnore1);
        textIgnore2 = view.findViewById(R.id.tvPriceIgnore2);
        textIgnore3 = view.findViewById(R.id.tvPriceIgnore3);
        textIgnore4 = view.findViewById(R.id.tvPriceIgnore4);
        textIgnore5 = view.findViewById(R.id.tvPriceIgnore5);
        textIgnore6 = view.findViewById(R.id.tvPriceIgnore6);

        textIgnore1.setPaintFlags(textIgnore1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore2.setPaintFlags(textIgnore2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore3.setPaintFlags(textIgnore3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore4.setPaintFlags(textIgnore4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore5.setPaintFlags(textIgnore5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore6.setPaintFlags(textIgnore6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        calendar = Calendar.getInstance();
        txtSelectDate = view.findViewById(R.id.txtSelectDate);
        btnChangeDate = view.findViewById(R.id.btnChangeDate);

        now = calendar.get(Calendar.DAY_OF_MONTH) +
                "/" + (calendar.get(Calendar.MONTH) + 1) +
                "/" + calendar.get(Calendar.YEAR);
        txtSelectDate.setText(now);
        System.out.println("Now:"+now);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);

        btnChangeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] selectedDate = txtSelectDate.getText().toString().split("/");
                if(!txtSelectDate.getText().equals(now)){
                    day = Integer.parseInt(selectedDate[0]);
                    month = Integer.parseInt(selectedDate[1])-1;
                    year = Integer.parseInt(selectedDate[2]);
                }
                System.out.println(day + "/" + month + "/" + year);
                datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                        txtSelectDate.setText(d + "/" + (m + 1) + "/" + y);
                    }
                }, year, month, day);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                datePickerDialog.show();
            }
        });

        return view;
    }
}