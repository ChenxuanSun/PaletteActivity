package edu.temple.paletteactivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String colors[];

     int [] AddColors = {Color.TRANSPARENT,Color.MAGENTA,Color.CYAN,Color.DKGRAY,Color.LTGRAY,Color.GRAY,Color.WHITE,Color.BLACK,Color.BLUE,Color.GREEN,Color.YELLOW,Color.RED};

    public ColorAdapter(Context context, String[] colors){
        this.context = context;
        this.colors = colors;

    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {


        TextView textView;
        if(view == null){
            textView = new TextView(context);
        }else{
            textView = (TextView) view;
        }
        //set up textView
        textView.setPadding(20,20,20,20);
        textView.setText(getItem(i).toString());
        textView.setBackgroundColor(AddColors[i % AddColors.length]);
        return textView;
    }
    public View getDropDownView(int i, View view, ViewGroup parent){
        return getView(i,view,parent);
    }
}
