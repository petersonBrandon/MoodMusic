package com.example.moodmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoodScreen extends AppCompatActivity {
    Button btnHappy, btnSad, btnAngry, btnRelax, btnLikeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_screen);


    }
}