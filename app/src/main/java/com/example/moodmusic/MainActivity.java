package com.example.moodmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText _txtUser, _txtPassword;
    Button _bttnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _txtPassword=(EditText) findViewById(R.id.txtPassword);
        _txtUser=(EditText) findViewById(R.id.txtUser);
        _bttnLogin=(Button) findViewById(R.id.btnLogin);
        _bttnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Take the User Credentials
                if(_txtUser.getText().toString().equals("Vilma") && _txtPassword.getText().toString().equals("Penelope1!")){
                    Intent intent = new Intent (MainActivity.this, user.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Invalid User or Password! Try Again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}