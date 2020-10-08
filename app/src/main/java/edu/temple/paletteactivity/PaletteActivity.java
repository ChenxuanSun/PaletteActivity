package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity {
    GridView gridView;
    public static final String colorSelected = "Value";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!= null)
            getSupportActionBar().setTitle("PaletteActivity");


    gridView = (GridView) findViewById(R.id.gridviewid);

    String [] colors = {"TRANSPARENT","MAGENTA","CYAN","DARK GRAY","LIGHTGRAY","GRAY","WHITE","BLACK","BLUE","GREEN","YELLOW","RED"};
        BaseAdapter adapter = new ColorAdapter(this,colors);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                intent.putExtra(colorSelected,i);
                startActivity(intent);
            }
        });
    }
}