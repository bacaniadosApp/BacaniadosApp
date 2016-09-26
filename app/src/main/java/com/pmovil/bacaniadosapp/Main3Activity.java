package com.pmovil.bacaniadosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        entrar = (Button) findViewById(R.id.btn1);
        entrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                Intent entrar = new Intent(Main3Activity.this,CustomAdapter.class);
                startActivity(entrar);
            }
        }
        );
    }
}
