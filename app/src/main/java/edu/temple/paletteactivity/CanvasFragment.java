package edu.temple.paletteactivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


public class CanvasFragment extends Fragment {
    View l;
     FrameLayout FragmentCanvas ;
      TextView CanvasColorName;

    public  static CanvasFragment newInstance (){
        return new CanvasFragment();
    }
    public CanvasFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


         View l =  inflater.inflate(R.layout.fragment_canvas, container, false);
       // l.findViewById(R.id.FragmentCanvas).setBackgroundColor(Color.BLUE);
        FragmentCanvas = l.findViewById(R.id.FragmentCanvas);
        CanvasColorName = l.findViewById(R.id.CanvasText);
        return l;
    }

    public void setBackgroundColor(String colorHex) {
        FragmentCanvas.setBackgroundColor(Color.parseColor(colorHex));
    }

    public void changeCanvasName(String Name){
        CanvasColorName.setText(Name);
        CanvasColorName.setTextSize(20);

    }

}
