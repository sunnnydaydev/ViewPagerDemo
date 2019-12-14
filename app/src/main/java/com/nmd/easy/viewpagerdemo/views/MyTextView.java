package com.nmd.easy.viewpagerdemo.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;

import java.lang.annotation.Annotation;

/**
 * Created by sunnyDay on 2019/12/14 16:54
 */
@ViewPager.DecorView
public class MyTextView extends AppCompatTextView implements ViewPager.DecorView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public Class<? extends Annotation> annotationType() {
        return ViewPager.DecorView.class;
    }
}
