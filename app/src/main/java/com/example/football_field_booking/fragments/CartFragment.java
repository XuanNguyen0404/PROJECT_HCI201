package com.example.football_field_booking.fragments;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.football_field_booking.BookingSuccessActivity;
import com.example.football_field_booking.R;

public class CartFragment extends Fragment {

    private TextView tv16;
    private TextView tv24;
    private Button btnBook;
    private ImageView imageDelete;

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
        tv16 = view.findViewById(R.id.textView16);
        tv24 = view.findViewById(R.id.textView24);
        btnBook=view.findViewById(R.id.btnBook);
        imageDelete=view.findViewById(R.id.imageDelete);

        tv16.setPaintFlags(tv16.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        tv24.setPaintFlags(tv24.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), BookingSuccessActivity.class);
                startActivity(intent);
            }
        });

        imageDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeleteDialogFragment dialogFragment=new DeleteDialogFragment();
                dialogFragment.show(getFragmentManager(), DeleteDialogFragment.TAG);

            }
        });
        return view;
    }
}