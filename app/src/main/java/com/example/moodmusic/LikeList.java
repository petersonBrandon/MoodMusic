package com.example.moodmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LikeList extends AppCompatActivity {
    Button _btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like_list);

        //Get Home after seeing the LikeList
        _btnHome = (Button) findViewById(R.id.bntHome);
        _btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LikeList.this, user.class);
                startActivity(intent);
            }
        });

    }
}