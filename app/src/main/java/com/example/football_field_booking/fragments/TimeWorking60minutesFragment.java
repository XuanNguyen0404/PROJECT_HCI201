package com.example.football_field_booking.fragments;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.football_field_booking.R;


public class TimeWorking60minutesFragment extends Fragment {

    public TimeWorking60minutesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_time_working60minutes, container, false);
        TextView textIgnore1 = view.findViewById(R.id.txtTextPriceDiscount);

        textIgnore1.setPaintFlags(textIgnore1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        return view;
    }
}