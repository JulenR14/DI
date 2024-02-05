package com.example.palette;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.palette.graphics.Palette;

public class ImagePalette extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_palette);

        // Obtén la imagen seleccionada del Intent
        int selectedImage = getIntent().getIntExtra("image_resource", 0);
        Toolbar toolbar = findViewById(R.id.toolbar);

        TextView lightVibrant = findViewById(R.id.lightVibrant);
        TextView muted = findViewById(R.id.muted);
        TextView darkMuted = findViewById(R.id.darkMuted);
        TextView lightMuted = findViewById(R.id.lightMuted);

        // Configura la imagen en el ImageView
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(selectedImage);

        // Crea un nuevo ImagePaletteFragment
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), selectedImage);

        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(@Nullable Palette palette) {
                // Obtiene la paleta de colores de la imagen
                int vibrantColor = palette.getVibrantColor(0);
                int darkVibrantColor = palette.getDarkVibrantColor(0);
                int lightVibrantColor = palette.getLightVibrantColor(0);
                int mutedColor = palette.getMutedColor(0);
                int darkMutedColor = palette.getDarkMutedColor(0);
                int lightMutedColor = palette.getLightMutedColor(0);

                toolbar.setBackgroundColor(vibrantColor);

                lightVibrant.setBackgroundColor(lightVibrantColor);
                muted.setBackgroundColor(mutedColor);
                darkMuted.setBackgroundColor(darkMutedColor);
                lightMuted.setBackgroundColor(lightMutedColor);
            }
        });
    }
}
