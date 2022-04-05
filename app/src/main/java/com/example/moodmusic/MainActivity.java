package com.example.moodmusic;
//------SPOTIFY LIBRARIES -----
//import com.spotify.android.appremote.api.ConnectionParams;
//import com.spotify.android.appremote.api.Connector;
//import com.spotify.android.appremote.api.SpotifyAppRemote;
//import com.spotify.protocol.types.Track;
//////////////////////////////////
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
/**
 * The Mood Music app will have different moods to select from and
 * give a playlist from Spotify (audio stream service) based on the
 * selected mood. The Spotify playlist information will be pulled via
 * Spotify’s API and the information. The main features are:
 * - User authentication
 * - User account creation: The user authentication will read the user
 * - preferences to connect to Spotify account from Mood Music app
 * - User preferences stored in local storage
 * - Pull data from Spotify API
 * - Music controls
 * - Mood selection
 * - The application should be built with a user-friendly interface
 * - Themes
 * April 1st, 2022 - Ver. 1.0, Team#8
 */
public class MainActivity extends AppCompatActivity {

    //START CODE FOR CONNECTION
//    // This is the connection to the API
//    private static final String CLIENT_ID = "5e48b58845994c88aba86482d713c202"; // need to change to your client ID to work
//    private static final String REDIRECT_URI = "com.example.mood2://callback";
//    private SpotifyAppRemote mSpotifyAppRemote;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        ConnectionParams connectionParams =
//                new ConnectionParams.Builder(CLIENT_ID)
//                        .setRedirectUri(REDIRECT_URI)
//                        .showAuthView(true)
//                        .build();
//
//        SpotifyAppRemote.connect(this, connectionParams,
//                new Connector.ConnectionListener() {
//
//                    public void onConnected(SpotifyAppRemote spotifyAppRemote) {
//                        mSpotifyAppRemote = spotifyAppRemote;
//                        Log.d("MainActivity", "Connected! Yay!");
//
//                        // Now you can start interacting with App Remote
//                        connected();
//
//                    }
//
//                    public void onFailure(Throwable throwable) {
//                        Log.e("MyActivity", throwable.getMessage(), throwable);
//
//                        // Something went wrong when attempting to connect! Handle errors here
//                    }
//                });
//    }
//// Connect to a User account
//
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        SpotifyAppRemote.disconnect(mSpotifyAppRemote);
//    }
//
//    private void connected() {
//        // Play a playlist
//        mSpotifyAppRemote.getPlayerApi().play("spotify:playlist:37i9dQZF1DX2sUQwD7tbmL");
//
//        // Subscribe to PlayerState
//        mSpotifyAppRemote.getPlayerApi()
//                .subscribeToPlayerState()
//                .setEventCallback(playerState -> {
//                    final Track track = playerState.track;
//                    if (track != null) {
//                        Log.d("MainActivity", track.name + " by " + track.artist.name);
//                    }
//                });



//////////SCREENS/////////////////////////////

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

        ///CODE FOR LIST TO BE IMPLEMENTED
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
