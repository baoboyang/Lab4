package edu.temple.lab4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by boyangbao on 9/22/16.
 */
public class myAdapter extends BaseAdapter {
    Context context;
    String color[];

    LayoutInflater inflater;

    public myAdapter (Context applicationtext, String[] color) {
        this.context = applicationtext;
        this.color = color;
        inflater = (LayoutInflater.from(applicationtext));
    }

    @Override
    public int getCount() {
        return color.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        convertView = inflater.inflate(R.layout.custom_spinner_items,null);
        TextView names = (TextView) convertView.findViewById(R.id.textView);

        names.setText(color[position]);

        if (names.getText().toString().equals("red")){
            names.setBackgroundColor(Color.RED);
        }

        if (names.getText().toString().equals("yellow")){
            names.setBackgroundColor(Color.YELLOW);
        }

        if (names.getText().toString().equals("blue")){
            names.setBackgroundColor(Color.BLUE);
        }

        if (names.getText().toString().equals("black")){
            names.setBackgroundColor(Color.BLACK);
        }


//        View v = super.getView(position,counterView,ViewGroup parent);
//        v.setBackgroundColor(Color.parseColor(color[position]));
//
//        v.setText(color[position]);
        return convertView;
    }
}
