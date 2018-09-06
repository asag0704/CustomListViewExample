package com.dev.won.listviewexample;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CheckableLinearLayout extends LinearLayout implements Checkable {

    // 만약 CheckBox 가 아닌 View 를 추가한다면 아래의 변수 사용 가능
    // private boolean mIsChecked

    public CheckableLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        // mIsChecked = false;
    }

    // 현재 checked 상태를 리턴
    @Override
    public boolean isChecked() {
        CheckBox cb_checkable_checkbox = findViewById(R.id.cb_checkable_checkbox);

        // return mIsChecked;
        return cb_checkable_checkbox.isChecked();
    }

    // 현재 checked 상태를 바꿈(UI에 반영)
    @Override
    public void toggle() {
        CheckBox cb_checkable_checkbox = findViewById(R.id.cb_checkable_checkbox);

        setChecked(cb_checkable_checkbox.isChecked() ? false : true);
    }

    // checked 상태를 checked 변수대로 설정
    @Override
    public void setChecked(boolean checked) {
        CheckBox cb_checkable_checkbox = findViewById(R.id.cb_checkable_checkbox);
        if (cb_checkable_checkbox.isChecked() != checked) {
            cb_checkable_checkbox.setChecked(checked);
        }

        // CheckBox 가 아닌 View 의 상태 변경
    }
}
