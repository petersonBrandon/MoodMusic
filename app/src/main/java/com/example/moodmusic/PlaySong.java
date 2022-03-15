package com.example.moodmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaySong extends AppCompatActivity {
    Button _btnLikeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

      //Get the LikeList screen
      _btnLikeList = (Button) findViewById(R.id.btnAddLike);
      _btnLikeList.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(PlaySong.this, LikeList.class);
              startActivity(intent);
          }
      });

    }
}