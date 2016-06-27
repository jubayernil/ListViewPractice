package com.example.mobileappdevelop.listviewwithimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Poet> poetsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.ListView);
        final Poet oPoet = new Poet();

        poetsList = oPoet.getAllPoets();

        ArrayAdapter<Poet> adapter = new ArrayAdapter<Poet>(getApplicationContext(), R.layout.list_view_layout, R.id.TextViewForList, poetsList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String name = (String) parent.getItemAtPosition(position);
                String name =poetsList.get(position).getName();
                String country = poetsList.get(position).getCountry();
                String district = poetsList.get(position).getDistrict();

                Intent intent = new Intent(MainActivity.this, PoetActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("country", country);
                intent.putExtra("district", district);
                startActivity(intent);
            }
        });
    }
    public static String generateString(){
        Random ran = new Random();
        int top = 5;
        char data = ' ';
        String dat = "";

        for (int i=0; i<=top; i++) {
            data = (char)(ran.nextInt(25)+67);
            dat = data + dat;
        }
        return dat;
    }
}
