package edu.temple.lab4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    String color[] = {"Red","yellow","black","blue"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //在View创建一个spinner
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        //创建一个myAdapter的对象
        myAdapter customAdapter = new myAdapter(MainActivity.this,color);


        spin.setAdapter(customAdapter);



    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //创建一个intent，同时给处目的地
        Intent activityIntent = new Intent(MainActivity.this,Main2Activity.class);
        //intent把数据传到第二个activity里
        activityIntent.putExtra("colorBuffer",color[position]);
        //启动activity
        startActivity(activityIntent);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}