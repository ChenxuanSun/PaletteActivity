package edu.temple.paletteactivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements PaletteFragment.OnItemSelectedListener{
    final  String [] colors = {"RED","YELLOW","WHITE","GREEN","BLUE","GRAY","WHITE","BLACK","CYAN","GREEN","MAGENTA","RED"};
    public  static final String COLOR_KEY ="colorkey";

    private CanvasFragment canvasFragment;
    private PaletteFragment paletteFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(R.string.PaletteActivity);


          paletteFragment= new PaletteFragment();
       getSupportFragmentManager().beginTransaction().add(R.id.fragment_palette,paletteFragment).commit();



         canvasFragment= new CanvasFragment();
      getSupportFragmentManager().beginTransaction().add(R.id.fragment_canvas,canvasFragment).commit();

        paletteFragment.addColorSelectListener(this);
    }

    @Override
    public void onItemSelected(String colorHex) {
        canvasFragment.setBackgroundColor(colorHex);

    }
    public void CanvasName(String colorHex) {
        canvasFragment.changeCanvasName(colorHex);
    }
}