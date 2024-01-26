package com.julen.ejercicio2_tablayoutyviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.appbartabs);
        Fragment fragment = new tabbed1Fragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_fragment, fragment)
                .commit();
        
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            Fragment fragment;
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new tabbed1Fragment();
                        break;
                    case 1:
                        fragment = new tabbed2Fragment();
                        break;
                    case 2:
                        fragment = new tabbed3Fragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_fragment, fragment)
                        .commit();
                if (getSupportActionBar() != null) {
                    getSupportActionBar().setTitle(tab.getText());
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Implementación opcional para la pestaña no seleccionada
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Implementación opcional para la pestaña ya seleccionada nuevamente
            }
        });
    }
}
