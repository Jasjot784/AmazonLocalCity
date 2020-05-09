package com.jasjotsingh.empty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ZomatoActivity extends AppCompatActivity {
    ListView listView;
    List<String> liststring ;
    ArrayAdapter<String> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zomato);

        listView = (ListView)findViewById(R.id.listview4);

        liststring = new ArrayList<String>();

        liststring.add("Home Delivery");
        liststring.add("Gold Offers");
        liststring.add("Shop Pickup Token");
        liststring.add("Nearest Shops");
        liststring.add("Others");

        adapter = new ArrayAdapter<String>(ZomatoActivity.this,
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
