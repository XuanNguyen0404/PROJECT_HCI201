package com.example.football_field_booking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.football_field_booking.fragments.CartFragment;
import com.example.football_field_booking.fragments.ProfileFragment;
import com.example.football_field_booking.fragments.TabFragment;
import com.example.football_field_booking.fragments.UserHomeFragment;
import com.example.football_field_booking.validations.Validation;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private MaterialToolbar topAppBar;
    private BottomNavigationView bottomNavigationView;

    private Validation validation = new Validation();

    private FilterDialogFragment mFilterDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        updateUI(user);

        topAppBar = findViewById(R.id.topAppBar);
        topAppBar.setTitleTextAppearance(this, R.style.FontLogo);
        View logo = topAppBar.getChildAt(0);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new UserHomeFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.pageHome:
                        selectedFragment = new UserHomeFragment();
                        break;
                    case R.id.pageAccount:
                        if (validation.isUser()) {
                            selectedFragment = new ProfileFragment();
                        } else {
                            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                            startActivity(intent);
                            return true;
                        }
                        break;
                    case R.id.page_2:
                        selectedFragment = new CartFragment();
                        break;
                    case R.id.page_3:
                        selectedFragment = new TabFragment();
                        break;
                    default:
                        return false;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit();
                return true;
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        Intent intent = this.getIntent();
        if (intent.getStringExtra("action") != null){
            if (intent.getStringExtra("action").equals("add to cart")) {
                Fragment selectedFragment = new CartFragment();
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit();
            }
        }
    }


    private void updateUI(FirebaseUser user) {
        if (user != null) {
            SharedPreferences userSPREF = getSharedPreferences(
                    getResources().getString(R.string.user_share_pref), MODE_PRIVATE);
            String role = userSPREF.getString("role", null);
            if (role != null) {
                switch (role) {
                    case "owner": {
                        Intent intent = new Intent(MainActivity.this, OwnerHomeActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        MainActivity.this.finish();
                        break;
                    }
                    case "admin":
                        Intent intent = new Intent(MainActivity.this, AdminMainActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        MainActivity.this.finish();
                        break;
                }
            }
        }
    }


    public void clickToViewMorePromotion(View view) {
        Intent intent = new Intent(MainActivity.this, PromotionActivity.class);
        startActivity(intent);
    }

    public void clickToViewDetalFootballField(View view) {
        Intent intent = new Intent(MainActivity.this, UserFootballFieldDetailActivity.class);
        startActivity(intent);
    }
}