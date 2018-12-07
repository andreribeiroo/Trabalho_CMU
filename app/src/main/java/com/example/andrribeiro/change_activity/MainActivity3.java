package com.example.andrribeiro.change_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {
    ListView lv;
    String[] characters = {"Percurso 1   , 3km , 5h", "Percurso 2   , 4km , 1h", "Percurso 3   , 144km , 2h30m",
            "Percurso 4   , 31km , 0.4h", "Percurso 5   , 46km , 1h", "Percurso 6   , 3000km , 78h",
            "Percurso 7   , 83km , 1.2h", "Percurso 8   , 56km , 0.5h", "Percurso 9   , 356km , 4.5h", "Percurso 10   , 23km , 0.2h",
            "Percurso 11   , 785km , 23h"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lv = (ListView) findViewById(R.id.idListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters);
        lv.setAdapter(adapter);
    }
}
