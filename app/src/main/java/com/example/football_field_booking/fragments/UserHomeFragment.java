package com.example.football_field_booking.fragments;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.football_field_booking.R;

public class UserHomeFragment extends Fragment {
    private TextView textIgnore1;
    private TextView textIgnore2;
    private TextView textIgnore3;
    private TextView textIgnore4;
    private TextView textIgnore5;
    private TextView textIgnore6;

    public UserHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_home, container, false);
        textIgnore1 = view.findViewById(R.id.textIgnore1);
        textIgnore2 = view.findViewById(R.id.textIgnore2);
        textIgnore3 = view.findViewById(R.id.textIgnore3);
        textIgnore4 = view.findViewById(R.id.textIgnore4);
        textIgnore5 = view.findViewById(R.id.textIgnore5);
        textIgnore6 = view.findViewById(R.id.textIgnore6);

        textIgnore1.setPaintFlags(textIgnore1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore2.setPaintFlags(textIgnore2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore3.setPaintFlags(textIgnore3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore1.setPaintFlags(textIgnore4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore2.setPaintFlags(textIgnore5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        textIgnore3.setPaintFlags(textIgnore6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        return view;

    }
}