package edu.temple.paletteactivity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CanvasActivity extends AppCompatActivity {
    ConstraintLayout backgroundcolor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView gridtext = new TextView(this);

        backgroundcolor =  findViewById(R.id.gridlayout);
        Intent intent = getIntent();
        int color = intent.getIntExtra(PaletteActivity.colorSelected, 0);


        if(color == 0 ){
            gridtext.setText("TRANSPARENT");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setBackgroundColor(Color.TRANSPARENT);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 1){
            backgroundcolor.setBackgroundColor(Color.MAGENTA);
            gridtext.setText("MAGENTA");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }
        else if(color == 2){
            backgroundcolor.setBackgroundColor(Color.CYAN);
            gridtext.setText("CYAN");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 3){
            backgroundcolor.setBackgroundColor(Color.DKGRAY);
            gridtext.setText("DARK GRAY");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 4){
            backgroundcolor.setBackgroundColor(Color.LTGRAY);
            gridtext.setText("LIGHT GRAY");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 5){
            backgroundcolor.setBackgroundColor(Color.GRAY);
            gridtext.setText("GRAY");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 6){
            backgroundcolor.setBackgroundColor(Color.WHITE);
            gridtext.setText("WHITE");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 7){
            backgroundcolor.setBackgroundColor(Color.BLACK);
            gridtext.setText("BLACK");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 8){
            backgroundcolor.setBackgroundColor(Color.BLUE);
            gridtext.setText("BLUE");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 9){
            backgroundcolor.setBackgroundColor(Color.GREEN);
            gridtext.setText("GREEN");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 10){
            backgroundcolor.setBackgroundColor(Color.YELLOW);
            gridtext.setText("YELLOW");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }else if(color == 11){
            backgroundcolor.setBackgroundColor(Color.RED);
            gridtext.setText("RED");
            backgroundcolor.addView(gridtext);
            backgroundcolor.setPadding(470,700,450,100);
        }
    }



}