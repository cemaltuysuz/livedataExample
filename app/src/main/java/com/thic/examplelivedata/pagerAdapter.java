package com.thic.examplelivedata;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class pagerAdapter extends FragmentPagerAdapter {

    private static int state_num =2;
    public pagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return firstFragment.newInstance();
        }
        else {
            return secondFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
