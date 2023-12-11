package com.example.examendi_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.examendi_1.databinding.ActivityHotelsBinding;

import java.util.ArrayList;
import java.util.List;

public class ActivityHotels extends AppCompatActivity {

    private ActivityHotelsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        binding = ActivityHotelsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        List<Hotel> listaHoteles = new ArrayList<>();
        listaHoteles.add(new Hotel(R.drawable.hotel1, "Hotel 1", "Calle 1"));
        listaHoteles.add(new Hotel(R.drawable.hotel2, "Hotel 2", "Calle 2"));
        listaHoteles.add(new Hotel(R.drawable.hotel3, "Hotel 3", "Calle 3"));
        listaHoteles.add(new Hotel(R.drawable.hotel4, "Hotel 4", "Calle 4"));
        listaHoteles.add(new Hotel(R.drawable.hotel5, "Hotel 5", "Calle 5"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new HotelsAdapter(listaHoteles));




    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuhoteles, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_hotels) {
            startActivities(new Intent[]{new Intent(this, Activity_visited.class)});
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}