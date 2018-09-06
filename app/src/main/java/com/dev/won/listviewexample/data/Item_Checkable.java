package com.dev.won.listviewexample.data;

public class Item_Checkable {
    private String tv_checkable_title;
    private boolean cb_checkable_check;

    public Item_Checkable(String tv_checkable_title, boolean cb_checkable_check) {
        this.tv_checkable_title = tv_checkable_title;
        this.cb_checkable_check = cb_checkable_check;
    }

    public Item_Checkable(String tv_checkable_title) {
        this.tv_checkable_title = tv_checkable_title;
    }

    public Item_Checkable() {
    }

    public String getTv_checkable_title() {
        return tv_checkable_title;
    }

    public void setTv_checkable_title(String tv_checkable_title) {
        this.tv_checkable_title = tv_checkable_title;
    }

    public boolean isCb_checkable_check() {
        return cb_checkable_check;
    }

    public void setCb_checkable_check(boolean cb_checkable_check) {
        this.cb_checkable_check = cb_checkable_check;
    }
}
