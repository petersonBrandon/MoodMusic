package com.example.moodmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;

public class user extends AppCompatActivity {
    Button btnHappy, btnSad, btnAngry, btnRelax, btnLikeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //Get the Happy Songs
        btnHappy = (Button) findViewById(R.id.btnHappy);
        btnHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, SelectSong.class);
                startActivity(intent);
            }
        });

        //Get the Relax Songs
        btnRelax = (Button) findViewById(R.id.btnRelax);
        btnRelax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, SelectSong.class);
                startActivity(intent);
            }
        });

        //Get the Sad Songs
        btnSad = (Button) findViewById(R.id.btnSad);
        btnSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, SelectSong.class);
                startActivity(intent);
            }
        });

        //Get the Angry Songs
        btnAngry = (Button) findViewById(R.id.btnAngry);
        btnAngry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, SelectSong.class);
                startActivity(intent);
            }
        });

      //Get the LikeList Screen
        btnLikeList = (Button) findViewById(R.id.btnLikeList);

        btnLikeList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(user.this, LikeList.class);
                startActivity(intent);
            }
        });
    }
}