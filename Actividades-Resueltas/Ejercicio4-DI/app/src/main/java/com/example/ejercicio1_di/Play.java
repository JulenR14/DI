package com.example.ejercicio1_di;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Play extends AppCompatActivity {

    ArrayList<String> listaBotonesSeleccionados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        FloatingActionButton fab = findViewById(R.id.my_fab);

        CheckBox checkBoxAngryBird = findViewById(R.id.checkBoxAngryBird);
        CheckBox checkBoxDragonFly = findViewById(R.id.checkBoxDragonFly);
        CheckBox checkBoxHillClimbingRacing = findViewById(R.id.checkBoxHillClimbingRacing);
        CheckBox checkBoxRadiantDefense = findViewById(R.id.checkBoxRadiantDefense);
        CheckBox checkBoxPocketSoccer = findViewById(R.id.checkBoxPocketSoccer);
        CheckBox checkBoxNinjaJump = findViewById(R.id.checkBoxNinjaJump);
        CheckBox checkBoxAirControl = findViewById(R.id.checkBoxAirControl);

        almacenarCheckBox(checkBoxAngryBird);
        almacenarCheckBox(checkBoxDragonFly);
        almacenarCheckBox(checkBoxHillClimbingRacing);
        almacenarCheckBox(checkBoxRadiantDefense);
        almacenarCheckBox(checkBoxPocketSoccer);
        almacenarCheckBox(checkBoxNinjaJump);
        almacenarCheckBox(checkBoxAirControl);

        fab.setOnClickListener(new View.OnClickListener() {
            String mensaje = "";
            @Override
            public void onClick(View v) {

                if(!listaBotonesSeleccionados.isEmpty()){
                    for (int c = 0; c < listaBotonesSeleccionados.size(); c++){
                        if(c != listaBotonesSeleccionados.size()-2){
                            mensaje += listaBotonesSeleccionados.get(c) + ", ";
                        }else if (c != listaBotonesSeleccionados.size()-1){
                            mensaje += listaBotonesSeleccionados.get(c) + " y ";
                        }else{
                            mensaje += listaBotonesSeleccionados.get(c);
                        }
                    }
                }else{
                    mensaje = "";
                }

                if(!mensaje.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Has elegido - " + mensaje, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "No has elegido ninguna opcion.", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public void almacenarCheckBox(CheckBox checkBox){
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()){
                    listaBotonesSeleccionados.add(checkBox.getText().toString());
                }
            }
        });
    }
}