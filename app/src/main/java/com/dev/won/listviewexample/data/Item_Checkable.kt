package com.dev.won.listviewexample.data

class Item_Checkable {
    var tv_checkable_title: String? = null
    var isCb_checkable_check: Boolean = false

    constructor(title: String, check: Boolean) {
        tv_checkable_title = title
        isCb_checkable_check = check
    }
}