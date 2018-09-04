package com.dev.won.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_ListView extends BaseAdapter {
    private Context context;
    private List<Item_ListView> item_listViews;

    TextView tv_listView_title, tv_listView_content;

    public Adapter_ListView(Context context, List<Item_ListView> item_listViews) {
        this.context = context;
        this.item_listViews = item_listViews;
    }

    @Override
    public int getCount() {
        return item_listViews.size();
    }

    @Override
    public Object getItem(int position) {
        return item_listViews.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listview, parent, false);

            tv_listView_title = convertView.findViewById(R.id.tv_listView_title);
            tv_listView_content = convertView.findViewById(R.id.tv_listView_content);
        }
        Item_ListView item_listView = item_listViews.get(position);

        tv_listView_title.setText(item_listView.getTv_listView_title());
        tv_listView_content.setText(item_listView.getTv_listView_content());
        return convertView;
    }
}
