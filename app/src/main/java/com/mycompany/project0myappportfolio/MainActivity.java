package com.mycompany.project0myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    //display toast message for each button item on click
    public void sendMessage(View view) {
        Context context = getApplicationContext();
        Button btn = (Button)view;
        String btnText = "This button will launch my " + btn.getText().toString() + " project!";
        int duration = Toast.LENGTH_SHORT;

        //stop previous toast to prevent delay
        if(mAppToast != null) {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(context, btnText, duration);
        mAppToast.show();
    }
}
