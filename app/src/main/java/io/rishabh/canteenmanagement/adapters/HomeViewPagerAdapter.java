package io.rishabh.canteenmanagement.adapters;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import io.rishabh.canteenmanagement.fragments.Laundry;
import io.rishabh.canteenmanagement.fragments.Canteen;

/**
 * Created by rishabh on 11/10/15.
 */
public class HomeViewPagerAdapter extends FragmentStatePagerAdapter {
    CharSequence titles[]; //titles of tabs
    int ntabs;             // no. of tabs
    Context context;

    public HomeViewPagerAdapter(FragmentManager fm, CharSequence titles[], int ntabs, Context context) {
        super(fm);
        this.titles = titles;
        this.ntabs = ntabs;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new Canteen();
            return fragment;

        } else if (position == 1) {
            fragment = new Laundry();
            return fragment;
        } else
            return null;
    }

    public CharSequence getPageTitle(int position) {

        return titles[position];
    }

    @Override
    public int getCount() {
        return ntabs;
    }
}
