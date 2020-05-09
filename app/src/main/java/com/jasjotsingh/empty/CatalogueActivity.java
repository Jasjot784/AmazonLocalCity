package com.jasjotsingh.empty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CatalogueActivity extends AppCompatActivity {
    ListView listView;
    List<String> liststring ;
    ArrayAdapter<String> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);

        listView = (ListView)findViewById(R.id.listview2);

        liststring = new ArrayList<String>();

        liststring.add("Grocery");
        liststring.add("Stationary");
        liststring.add("Furniture");
        liststring.add("Books");
        liststring.add("Medicine");

        adapter = new ArrayAdapter<String>(CatalogueActivity.this,
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
