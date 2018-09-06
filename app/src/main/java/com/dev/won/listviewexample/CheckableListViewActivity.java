package com.dev.won.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.dev.won.listviewexample.adpater.Adapter_CheckableListView;
import com.dev.won.listviewexample.data.Item_Checkable;

import java.util.ArrayList;
import java.util.List;

public class CheckableListViewActivity extends AppCompatActivity {
    ListView lv_checkable;

    List<Item_Checkable> list_checkable = new ArrayList<>();

    Adapter_CheckableListView adapter_checkableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkable_list);

        lv_checkable = findViewById(R.id.lv_checkable);

        adapter_checkableListView = new Adapter_CheckableListView(getApplicationContext(), list_checkable);

        for (int i=0; i<10; i++) {
            list_checkable.add(new Item_Checkable("title"));
        }

        lv_checkable.setAdapter(adapter_checkableListView);
    }
}
