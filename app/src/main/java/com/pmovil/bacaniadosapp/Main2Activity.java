package com.pmovil.bacaniadosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    Spinner DESTINO;
    Button buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

   /*codigo spinner*/
        DESTINO = (Spinner) findViewById(R.id.lugares);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.DESTINO, android.R.layout.simple_spinner_item);
        DESTINO.setAdapter(adapter);

        /*codigo pasar actividad*/
        buscar = (Button)findViewById(R.id.buscar);
        buscar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                Intent buscar = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(buscar);
            }
        }
        );

    }

}


