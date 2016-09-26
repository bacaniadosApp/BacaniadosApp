package com.pmovil.bacaniadosapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {
    CustomAdapter adapter;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        viewPager = (ViewPager) findViewById(R.id.view_paper);
        adapter = new CustomAdapter(this);
        viewPager.setAdapter(adapter);
    }
}