package com.pmovil.bacaniadosapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresar = (Button)findViewById(R.id.Ingresar);

        ingresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                Intent ingresar = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(ingresar);
            }

        }
        );
    }
}
