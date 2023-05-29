package com.example.edt65torrorobert;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.edt65torrorobert.fragments.GuideFragment;
import com.example.edt65torrorobert.fragments.RestaurantsFragment;
import com.example.edt65torrorobert.fragments.SitesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;

    private Fragment selectedFragment;
    private int selectedColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        selectedColor = R.color.colorNoSeleccionado;
        updateNavigationBarColor();

        getSupportActionBar().setDisplayShowTitleEnabled(false);



        selectedFragment = new RestaurantsFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                selectedFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.icono1:
                System.out.println("asdasd");
                Toast.makeText(this, "mail", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.icono2:
                Toast.makeText(this, "language", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.icono3:
                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.nav_mail:
                            selectedFragment = new RestaurantsFragment();
                            selectedColor = R.color.colorNoSeleccionado;
                            break;
                        case R.id.nav_language:
                            selectedFragment = new SitesFragment();
                            selectedColor = R.color.colorSeleccionado;
                            break;
                        case R.id.nav_settings:
                            selectedFragment = new GuideFragment();
                            selectedColor = R.color.colorPrincipal;
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    updateNavigationBarColor();

                    return true;
                }
            };

    private void updateNavigationBarColor() {
        int color = ContextCompat.getColor(getApplicationContext(), selectedColor);
        bottomNavigationView.setBackgroundColor(color);
    }
}


