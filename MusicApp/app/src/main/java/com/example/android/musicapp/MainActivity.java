package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button play = findViewById(R.id.start_button);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent musicPage= new Intent(MainActivity.this, MusicPage.class);
                startActivity(musicPage);
            }
        });
    }



}
