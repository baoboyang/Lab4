package edu.temple.lab4;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity2);

        Intent myintent = getIntent();
        String name;
        name = myintent.getStringExtra("colorBuffer");

        layout.setBackgroundColor(Color.parseColor(name));
        //startActivity(myintent);

    }
}
