package com.example.football_field_booking.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.football_field_booking.fragments.HistoryNowFragment;
import com.example.football_field_booking.fragments.HistoryPastFragment;


public class PageHistoryAdapter extends FragmentStatePagerAdapter {


    public PageHistoryAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HistoryPastFragment();
            case 1:
                return new HistoryNowFragment();
            default:
                return new HistoryPastFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title ="";
        switch (position){
            case 0:
                title = "Past";
                break;
            case 1:
                title = "Now";
                break;
        }
        return title;
    }
}
