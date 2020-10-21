package edu.temple.paletteactivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;


public class PaletteFragment extends Fragment {
        GridView gridView;
    private OnItemSelectedListener listener;
    String color;
    final  String [] colors = {"RED","YELLOW","WHITE","GREEN","BLUE","GRAY","WHITE","BLACK","CYAN","GREEN","MAGENTA","RED"};
    public PaletteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


       final  View l =  inflater.inflate(R.layout.fragment_palette, container, false);


        Resources res = getResources();
        final String[] gridLabels = res.getStringArray(R.array.MyArray);

        gridView = l.findViewById(R.id.gridView);
        gridView.setNumColumns(3);
        BaseAdapter adapter = new ColorAdapter(getActivity(),gridLabels);

        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String color = colors[position];
             listener.onItemSelected(color);
             String colorname = gridLabels[position];
             listener.CanvasName(colorname);
            }
        });
        return l;
    }

    public void addColorSelectListener(OnItemSelectedListener listener){
        this.listener = listener;
    }

    public interface OnItemSelectedListener{
        void onItemSelected(String colorHex);
        void CanvasName(String colorname);
    }
}