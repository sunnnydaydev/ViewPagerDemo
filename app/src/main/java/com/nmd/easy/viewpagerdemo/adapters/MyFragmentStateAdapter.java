package com.nmd.easy.viewpagerdemo.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;


/**
 * Created by sunnyDay on 2019/12/16 19:46
 */
public class MyFragmentStateAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mList;

    public MyFragmentStateAdapter(@NonNull FragmentManager fm, int behavior, List<Fragment> mlist) {
        super(fm, behavior);
        this.mList = mlist;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    /**
     * view pager 和 tab layout 联动时这个方法必须重写 否则 tab 标题会被全部置空
     * */
//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        String[] arr = new String[]{
//                "动漫", "电视剧", "LOL", "王者荣耀", "和平精英",
//        };
//        return arr[position];
//    }
}
