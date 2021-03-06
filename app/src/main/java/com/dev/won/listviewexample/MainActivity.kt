package com.dev.won.listviewexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_customList.setOnClickListener(this)
        bt_checkableList.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.bt_customList -> startActivity(Intent(this, CustomListViewActivity::class.java))
            R.id.bt_checkableList -> startActivity(Intent(this, CheckableListViewActivity::class.java))
        }
    }

}