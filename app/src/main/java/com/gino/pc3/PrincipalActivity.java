package com.gino.pc3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.gino.pc3.databinding.ActivityPrincipalBinding;
import com.gino.pc3.fragments.HomeFragment;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;
    public static String EMAIL = "EMAIL";
    public String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tbPlayzoom.setTitle("Bienvenido Usuario");
        setSupportActionBar(binding.tbPlayzoom);
        setSession();
        addHomeFragment();
    }

    private void addHomeFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(binding.fcvMain.getId(), new HomeFragment()).commit();
    }

    private void setSession() {
        Intent getIntent = getIntent();
        email = getIntent.getStringExtra(EMAIL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
