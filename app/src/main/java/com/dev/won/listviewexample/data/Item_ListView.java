package com.dev.won.listviewexample.data;

public class Item_ListView {
    private String tv_listView_title;
    private String tv_listView_content;

    public Item_ListView(String tv_listView_title, String tv_listView_content) {
        this.tv_listView_title = tv_listView_title;
        this.tv_listView_content = tv_listView_content;
    }

    public String getTv_listView_title() {
        return tv_listView_title;
    }

    public void setTv_listView_title(String tv_listView_title) {
        this.tv_listView_title = tv_listView_title;
    }

    public String getTv_listView_content() {
        return tv_listView_content;
    }

    public void setTv_listView_content(String tv_listView_content) {
        this.tv_listView_content = tv_listView_content;
    }
}
