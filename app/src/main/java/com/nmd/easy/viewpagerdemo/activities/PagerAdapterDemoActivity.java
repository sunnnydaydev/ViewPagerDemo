package com.nmd.easy.viewpagerdemo.activities;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.nmd.easy.viewpagerdemo.R;
import com.nmd.easy.viewpagerdemo.adapters.MyPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapterDemoActivity extends AppCompatActivity {
    private int[] imgs = new int[]{
            R.drawable.img_yao, R.drawable.img_zhuge,
            R.drawable.img_libai, R.drawable.img_mingren,
            R.drawable.img_haizei, R.drawable.img_douluo};
    private List<View> mList;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_adapter_demo);
        offerData();
        initViewPager();
    }

    private void offerData() {
        mList = new ArrayList<>();
        for (int img : imgs) {
            View mView = LayoutInflater.from(this).inflate(R.layout.page_pageradapter, viewPager, false);
            AppCompatImageView imageView = mView.findViewById(R.id.img);
            imageView.setImageResource(img);
            mList.add(mView);
        }
    }

    private void initViewPager() {
        viewPager = findViewById(R.id.vp_pager);
        viewPager.setAdapter(new MyPagerAdapter(mList));
    }
    // https://www.jianshu.com/p/4b6c9a983744    坑
}
