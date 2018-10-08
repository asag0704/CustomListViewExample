package com.dev.won.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dev.won.listviewexample.adpater.Adapter_CheckableListView;

public class CustomListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
    }
}
