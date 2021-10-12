package com.example.football_field_booking.fragments;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.football_field_booking.R;

public class HistoryNowFragment extends Fragment {

    public HistoryNowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history_now, container, false);
        TextView tv26 = view.findViewById(R.id.textView26);
        tv26.setPaintFlags(tv26.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        return view;
    }
}