package com.example.moodmusic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText _txtUser, _txtPassword;
    Button _bttnLogin;
//    ListView listView;
//    String[] meses;

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

//        listView= findViewById(R.id.listSongs);
//        meses = new DateFormatSymbols().getMonths();
//        ArrayAdapter<String> mesesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,meses);
     //   listView.setAdapter(mesesAdapter);

//        listView=(ListView) findViewById(R.id.listSongs);
//        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("Lo Mejor de Mi by Paul Mackanie");
//        arrayList.add("Te Lo Dije by John Lenon");
//        arrayList.add("Yo no Lo Sabia");
//
//        //Array adapter
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
//        listView.setAdapter(arrayAdapter);


    }
}