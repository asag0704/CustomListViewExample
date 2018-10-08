package com.dev.won.listviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.dev.won.listviewexample.adpater.Adapter_CheckableListView
import com.dev.won.listviewexample.data.Item_Checkable
import kotlinx.android.synthetic.main.activity_checkable_list.*

class CheckableListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkable_list)

        val lists = ArrayList<Item_Checkable>()

        for (i in 0..5) {
            lists.add(Item_Checkable("Title", false))
        }

        val adapter_checkableListView = Adapter_CheckableListView(applicationContext, lists)

        lv_checkable.adapter = adapter_checkableListView
    }
}
