package com.example.football_field_booking.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.football_field_booking.fragments.TimeWorking90minutesFragment;
import com.example.football_field_booking.fragments.TimeWorking60minutesFragment;

public class TimeWorkingAdapter extends FragmentStateAdapter {


    public TimeWorkingAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TimeWorking60minutesFragment();
            case 1:
                return new TimeWorking90minutesFragment();
            default:
                return new TimeWorking60minutesFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}