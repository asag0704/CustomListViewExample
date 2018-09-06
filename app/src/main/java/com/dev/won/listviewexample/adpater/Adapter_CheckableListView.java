package com.dev.won.listviewexample.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.dev.won.listviewexample.R;
import com.dev.won.listviewexample.data.Item_Checkable;

import java.util.List;

public class Adapter_CheckableListView extends BaseAdapter {
    private Context context;
    private List<Item_Checkable> item_checkables;

    public Adapter_CheckableListView(Context context, List<Item_Checkable> item_checkables) {
        this.context = context;
        this.item_checkables = item_checkables;
    }

    @Override
    public int getCount() {
        return item_checkables.size();
    }

    @Override
    public Object getItem(int position) {
        return item_checkables.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_checkable, viewGroup, false);
        }

        TextView tv_checkable_title = convertView.findViewById(R.id.tv_checkable_title);

        Item_Checkable item_checkable = item_checkables.get(position);

        tv_checkable_title.setText(item_checkable.getTv_checkable_title());

        return convertView;
    }
}
