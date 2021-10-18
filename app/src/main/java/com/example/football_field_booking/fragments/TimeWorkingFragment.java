package com.example.football_field_booking.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.football_field_booking.R;
import com.example.football_field_booking.adapters.PageHistoryAdapter;
import com.example.football_field_booking.adapters.TimeWorkingAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class TimeWorkingFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private View view;

    public TimeWorkingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_time_working, container, false);

        tabLayout = view.findViewById(R.id.tblTimeWorking);
        viewPager = view.findViewById(R.id.viewPager);

        TimeWorkingAdapter timeWorkingAdapter = new TimeWorkingAdapter(this.getActivity());

        viewPager.setAdapter(timeWorkingAdapter);

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position ==0){
                    tab.setText("30 minutes");
                }else {
                    tab.setText("60 minutes");
                }
            }
        }).attach();

        return view;
    }
}