package com.dev.won.listviewexample.adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

import com.dev.won.listviewexample.data.Item_ListView
import com.dev.won.listviewexample.R

class Adapter_ListView(private val context: Context, private val item_listViews: List<Item_ListView>) : BaseAdapter() {

    override fun getCount(): Int {
        return item_listViews.size
    }

    override fun getItem(position: Int): Any {
        return item_listViews[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listview, parent, false)
        }

        val tv_listView_title = convertView!!.findViewById<TextView>(R.id.tv_listView_title)
        val tv_listview_content = convertView!!.findViewById<TextView>(R.id.tv_listView_content)

        val item_listView = item_listViews[position]

        tv_listView_title.text = item_listView.tv_listView_title
        tv_listview_content.text = item_listView.tv_listView_content

        return convertView
    }
}
