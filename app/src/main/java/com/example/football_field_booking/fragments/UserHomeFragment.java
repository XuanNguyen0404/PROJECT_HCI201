package com.example.football_field_booking.fragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.football_field_booking.FilterDialogFragment;
import com.example.football_field_booking.R;

public class UserHomeFragment extends Fragment{

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
        return view;
    }
}