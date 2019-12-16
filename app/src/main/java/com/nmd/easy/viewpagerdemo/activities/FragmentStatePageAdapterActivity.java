package com.nmd.easy.viewpagerdemo.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.nmd.easy.viewpagerdemo.R;

public class FragmentStatePageAdapterActivity extends AppCompatActivity {

    private com.google.android.material.tabs.TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_state_page_adapter);
        getSupportActionBar().hide();
        initView();
        initData();

    }

    private void initData() {
        String[] arr = new String[]{
                "精选", "动漫", "电视剧", "少儿",
                "LOL", "王者荣耀", "和平精英", "短视屏"
        };
        for (String s : arr) {
            tabLayout.addTab(tabLayout.newTab().setText(s));//注意这里的对象使用（不要直接new tabLayout.newTab().setText(s)，使用的对象要为同一个）
        }
    }

    private void initView() {
        tabLayout = findViewById(R.id.my_tab_layout);
        viewPager = findViewById(R.id.vp_pager);
    }
}
