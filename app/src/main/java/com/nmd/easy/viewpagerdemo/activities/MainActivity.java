package com.nmd.easy.viewpagerdemo.activities;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.nmd.easy.viewpagerdemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatTextView tvPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();


    }

    private void initData() {
        tvPagerAdapter.setOnClickListener(this);
    }

    private void initView() {
        tvPagerAdapter = findViewById(R.id.tv_pager_adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_pager_adapter:
                startActivity(new Intent(this, PagerAdapterDemoActivity.class));
                break;
        }
    }
}
