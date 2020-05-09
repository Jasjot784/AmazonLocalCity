package com.jasjotsingh.empty;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShopkeeperActivity extends AppCompatActivity {

    ListView listView;
    List<String> liststring ;
    ArrayAdapter<String> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopkeeper);
        listView = (ListView)findViewById(R.id.listview1);

        liststring = new ArrayList<String>();

        liststring.add("Shop 1");
        liststring.add("Shop 2");
        liststring.add("Shop 3");
        liststring.add("Shop 4");
        liststring.add("Shop 5");

        adapter = new ArrayAdapter<String>(ShopkeeperActivity.this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1, liststring);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}
