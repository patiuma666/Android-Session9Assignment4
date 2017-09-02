package com.example.iis5.contextmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //to the texview from xml file
        TextView tvw = (TextView) findViewById(R.id.texView);
        this.registerForContextMenu(tvw);
    }

    //overriding the onCreateContextMenu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v.getId() == R.id.texView) {
            this.getMenuInflater().inflate(R.menu.context_menu, menu);
            super.onCreateContextMenu(menu, v, menuInfo);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int selectedItemId = item.getItemId();
        // to the Main layout from xml file
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);
        //using the swith case to display the appropriate buttton selected in action
        switch (selectedItemId) {

            case R.id.Action1:
                Toast.makeText(getApplicationContext(), "Action 1  selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Action2:
                Toast.makeText(getApplicationContext(), "Action 2 selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Action3:
                Toast.makeText(getApplicationContext(), "Action 3 selected", Toast.LENGTH_LONG).show();
                break;


        }

        return super.onContextItemSelected(item);
    }
}