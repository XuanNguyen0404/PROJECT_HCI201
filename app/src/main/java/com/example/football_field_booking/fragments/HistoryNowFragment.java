package com.example.football_field_booking.fragments;

import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.football_field_booking.FilterDialogFragment;
import com.example.football_field_booking.R;

public class HistoryNowFragment extends Fragment {

    private TextView tv16;
    private TextView tv24;
    private Button btnDelete;

    public HistoryNowFragment() {
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
        View view = inflater.inflate(R.layout.fragment_history_now, container, false);
        tv16 = view.findViewById(R.id.textView16);
        tv24 = view.findViewById(R.id.textView24);
        btnDelete=view.findViewById(R.id.btnDelete);

        tv16.setPaintFlags(tv16.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        tv24.setPaintFlags(tv24.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CancelDialogFragment cancelDialogFragment=new CancelDialogFragment();
                cancelDialogFragment.show(getFragmentManager(), CancelDialogFragment.TAG);
            }
        });
        return view;
    }
}