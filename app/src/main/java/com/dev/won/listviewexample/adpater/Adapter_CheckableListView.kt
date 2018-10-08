package com.dev.won.listviewexample.adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView

import com.dev.won.listviewexample.R
import com.dev.won.listviewexample.data.Item_Checkable

class Adapter_CheckableListView(private val context: Context, private val item_checkables: List<Item_Checkable>) : BaseAdapter() {

    override fun getCount(): Int = item_checkables.size

    override fun getItem(position: Int): Any = item_checkables[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup): View? {
        var view = convertView
        if (convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.item_checkable, viewGroup, false)
        }

        val tv_checkable_title = view!!.findViewById<TextView>(R.id.tv_checkable_title)

        val item_checkable = item_checkables[position]

        tv_checkable_title.text = item_checkable.tv_checkable_title

        return view
    }
}
