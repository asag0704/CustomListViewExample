package com.dev.won.listviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.dev.won.listviewexample.adpater.Adapter_ListView;
import com.dev.won.listviewexample.data.Item_ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt_customList, bt_checkableList;
    ListView listView;

    List<Item_ListView> item_listViews = new ArrayList<>();

    Adapter_ListView adapter_listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_customList = findViewById(R.id.bt_customList);
        bt_checkableList = findViewById(R.id.bt_checkableList);

        bt_customList.setOnClickListener(this);
        bt_checkableList.setOnClickListener(this);

//        listView = findViewById(R.id.listView);
//
//        for (int i=0; i<10; i++) {
//            item_listViews.add(new Item_ListView("Title", "Content"));
//        }
//
//        adapter_listView = new Adapter_ListView(getApplicationContext(), item_listViews);
//
//        listView.setAdapter(adapter_listView);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_customList:
                startActivity(new Intent(this, CustomListViewActivity.class));
                break;
            case R.id.bt_checkableList:
                startActivity(new Intent(this, CheckableListViewActivity.class));
                break;
        }
    }
}
