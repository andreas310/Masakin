package com.masak_in.masakin.bayem;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.masak_in.masakin.R;

public class BayemActivity extends AppCompatActivity {

    TextView textbar,waktumakanan,postmakanan,desmakanan,textalat,alat,textbahan,bahan,textbumbu,bumbu;
    Button buttonstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayem);

        //Deklarasi font
        Typeface Medium = Typeface.createFromAsset(getAssets(),  "fonts/GothamRoundedMedium.ttf");
        Typeface Bold = Typeface.createFromAsset(getAssets(),  "fonts/GothamRoundedBold.ttf");
        Typeface Regular = Typeface.createFromAsset(getAssets(),  "fonts/GothamRoundedBook.ttf");

        //deklarasi textview
        textbar = (TextView)findViewById(R.id.textbar);
        waktumakanan = (TextView)findViewById(R.id.waktumakanan);
        postmakanan = (TextView)findViewById(R.id.postmakanan);
        desmakanan = (TextView)findViewById(R.id.desmakanan);
        textalat = (TextView)findViewById(R.id.textalat);
        alat = (TextView)findViewById(R.id.alat);
        textbahan = (TextView)findViewById(R.id.textbahan);
        bahan = (TextView)findViewById(R.id.bahan);
        textbumbu = (TextView)findViewById(R.id.textbumbu);
        bumbu = (TextView)findViewById(R.id.bumbu);
        buttonstart = (Button)findViewById(R.id.buttonstart);

        //implementasi font family
        textbar.setTypeface(Bold);
        waktumakanan.setTypeface(Medium);
        postmakanan.setTypeface(Bold);
        desmakanan.setTypeface(Regular);
        textalat.setTypeface(Bold);
        alat.setTypeface(Medium);
        textbahan.setTypeface(Bold);
        bahan.setTypeface(Medium);
        textbumbu.setTypeface(Bold);
        bumbu.setTypeface(Medium);
        buttonstart.setTypeface(Bold);

        //fungsi button
        findViewById(R.id.buttonback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        findViewById(R.id.buttonstart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BayemstepActivity.class));
                finish();
            }
        });


    }
}
