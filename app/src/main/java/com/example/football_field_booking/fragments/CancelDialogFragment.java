package com.example.football_field_booking.fragments;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.football_field_booking.R;

import java.util.ArrayList;
import java.util.List;


public class CancelDialogFragment extends DialogFragment {


    public static final String TAG = "CancelDialog";
    private AutoCompleteTextView completeTextView;
    private List<String> reasonList;
    private Button btnCancel;

    public CancelDialogFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mRootView=inflater.inflate(R.layout.cancel_dialog, container, false);
        completeTextView=mRootView.findViewById(R.id.acReason);
        btnCancel=mRootView.findViewById(R.id.button_cancel);
        reasonList=new ArrayList<>();
        reasonList.add("Bad weather");
        reasonList.add("Busy");
        reasonList.add("Wrong field");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CancelDialogFragment.this.getContext(), android.R.layout.simple_spinner_item,reasonList);
        completeTextView.setAdapter(adapter);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return mRootView;
    }
}