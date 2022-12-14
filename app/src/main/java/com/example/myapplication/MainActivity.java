package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton startButton;
    private ImageView androids;
    private TextView hiWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         startButton = (ImageButton) findViewById(R.id.startButton);
         androids = (ImageView) findViewById(R.id.androids);
         hiWorld = (TextView) findViewById(R.id.textHello);
    }
    public void onclick (View view){
        androids.setVisibility(View.VISIBLE);
        hiWorld.setVisibility(View.VISIBLE);
        startButton.setVisibility(View.INVISIBLE);
        startButton.setClickable(false);
    }
}