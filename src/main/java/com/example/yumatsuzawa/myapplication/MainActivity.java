package com.example.yumatsuzawa.myapplication;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.activity_main);
//
//        Button button = (Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Yo Men!", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        Button button2 = (Button)findViewById(R.id.button2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
//                        .setMessage("Hey Jude")
//                        .setPositiveButton("Don't make it bad", null)
//                        .create();
//                alertDialog.show();
//            }
//        });
//
//        HelloWorldView hwView = new HelloWorldView(this);
//        setContentView(hwView); // setContentView replaces RootView of this app.

        ListView lsView = new ListView(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);

        lsView.setAdapter(adapter);

        adapter.add("Alpha");
        adapter.add("Beta");
        adapter.add("Charlie");

        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
            }
        });

        setContentView(lsView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
