package com.nmd.easy.viewpagerdemo.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.nmd.easy.viewpagerdemo.R;
import com.nmd.easy.viewpagerdemo.adapters.MyFragmentStateAdapter;
import com.nmd.easy.viewpagerdemo.fragments.*;

import java.util.ArrayList;
import java.util.List;

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
        populateTabsData();
        populateViewPagerData();
    }

    private void populateViewPagerData() {
        List<Fragment> mList = new ArrayList<>();
        mList.add(new AnimeFragment());
        mList.add(new TvFragment());
        mList.add(new LoLFragment());
        mList.add(new KingGloryFragment());
        mList.add(new PeaceFragment());
        viewPager.setAdapter(new MyFragmentStateAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, mList));
        tabLayout.setupWithViewPager(viewPager, false);//自动绑定viewpager，实现联动效果
    }

    private void populateTabsData() {
        String[] arr = new String[]{
                "动漫", "电视剧", "LOL", "王者荣耀", "和平精英",
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
