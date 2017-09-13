package com.example.krishna.citygo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.os.Build.VERSION_CODES.M;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView carUser = (ImageView) findViewById(R.id.caruser);
        carUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(Menu.this,CarUser.class);

                startActivity(numbersIntent);
            }
        });
        ImageView user = (ImageView) findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(Menu.this,User.class);

                startActivity(numbersIntent);
            }
        });
        ImageView card = (ImageView) findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(Menu.this,Card.class);

                startActivity(numbersIntent);
            }
        });
        ImageView contactus = (ImageView) findViewById(R.id.contactus);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(Menu.this,ContactUs.class);

                startActivity(numbersIntent);
            }
        });
        ImageView traffic = (ImageView) findViewById(R.id.traffic);
        traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(Menu.this,Traffic.class);

                startActivity(numbersIntent);
            }
        });
        ImageView sos = (ImageView) findViewById(R.id.sos);
        sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(Menu.this,Sos.class);

                startActivity(numbersIntent);
            }
        });
    }
}
