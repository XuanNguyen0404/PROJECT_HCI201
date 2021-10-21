package com.example.football_field_booking;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.football_field_booking.daos.FootballFieldDAO;
import com.example.football_field_booking.dtos.FootballFieldDTO;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class SearchByNameActivity extends AppCompatActivity {

    private EditText edtSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_name);
        edtSearch=findViewById(R.id.edtSearch);
//        listFootballField=findViewById(R.id.listFootballField);
//        edtSearch.requestFocus();
//        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }


//    public void clickToSearchByLikeName(View view) {
//        listFootballField.setVisibility(View.VISIBLE);
//    }

    @Override
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    public void clickToBack(View view) {
        onBackPressed();
    }

    public void clickToViewDetailABigField(View view) {
        Intent intent=new Intent(SearchByNameActivity.this,ListPromotionActivity.class);
        startActivity(intent);
    }

    public void clickToViewDetailField(View view) {
        Intent intent=new Intent(this, UserFootballFieldDetailActivity.class);
        intent.putExtra("action","add to cart");
        startActivity(intent);
    }
}