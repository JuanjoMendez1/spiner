package com.example.spiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner opciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opciones =(Spinner) findViewById(R.id.spjimmy);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource
                (this, R.array.opciones, android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);


    }
}
