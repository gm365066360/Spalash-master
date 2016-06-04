package com.gaom.spalash.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.gaom.spalash.base.LauncherBaseFragment;

import java.util.List;


/**
 * Created by gaom on 2015/5/5.
 */
public class BaseFragmentAdapter extends FragmentStatePagerAdapter {
    private List<LauncherBaseFragment>list;
    public BaseFragmentAdapter(FragmentManager fm, List<LauncherBaseFragment> list) {
        super(fm);
        this.list = list;
    }

    public BaseFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int postion) {
        return list.get(postion);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
