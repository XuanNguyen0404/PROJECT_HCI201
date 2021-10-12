package com.example.football_field_booking.fragments;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.football_field_booking.R;

public class CartFragment extends Fragment {

    private TextView tv26;

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        tv26 = view.findViewById(R.id.textView26);

        tv26.setPaintFlags(tv26.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        return view;
    }
}