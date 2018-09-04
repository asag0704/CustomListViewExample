package com.dev.won.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    List<Item_ListView> item_listViews = new ArrayList<>();

    Adapter_ListView adapter_listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        for (int i=0; i<10; i++) {
            item_listViews.add(new Item_ListView("Title", "Content"));
        }

        adapter_listView = new Adapter_ListView(getApplicationContext(), item_listViews);

        listView.setAdapter(adapter_listView);

    }
}
