package com.example.moodmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class SelectSong extends AppCompatActivity {
    Button _btnSelectSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_song);


        //Get the selected song
        _btnSelectSong = (Button) findViewById(R.id.btnSelectSong);
        _btnSelectSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectSong.this, PlaySong.class);
                startActivity(intent);

            }
        });
    }
}


