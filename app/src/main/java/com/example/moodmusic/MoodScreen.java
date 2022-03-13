package com.example.moodmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoodScreen extends AppCompatActivity {
    private  Button button6;
    private  Button button7;
    private  Button button8;
    private  Button button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_screen);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String happy = "happy";
                openSelectSong(happy);
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sad = "sad";
                openSelectSong(sad);
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angry = "angry";
                openSelectSong(angry);
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String relaxed = "relaxed";
                openSelectSong(relaxed);
            }
        });
    }
    public void openSelectSong( String string) {

        Intent intent = new Intent(this, SelectSong.class);
        startActivity(intent);
    }
}