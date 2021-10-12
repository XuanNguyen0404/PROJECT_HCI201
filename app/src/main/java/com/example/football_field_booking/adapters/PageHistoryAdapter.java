package com.example.football_field_booking.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.football_field_booking.fragments.HistoryNowFragment;
import com.example.football_field_booking.fragments.HistoryPastFragment;


public class PageHistoryAdapter extends FragmentStateAdapter {


    public PageHistoryAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
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
    public int getItemCount() {
        return 2;
    }
}
