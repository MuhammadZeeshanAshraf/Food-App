package com.sometning.zeesh.dashboard.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sometning.zeesh.dashboard.Fragments.SearchItemsFragment;
import com.sometning.zeesh.dashboard.Fragments.SearchStoreFragment;

public class TabAdapter  extends FragmentPagerAdapter {
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                SearchStoreFragment searchStoreFragment = new SearchStoreFragment();
                return  searchStoreFragment;

            case 1:
                SearchItemsFragment searchItemsFragment = new SearchItemsFragment();
                return  searchItemsFragment;



            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Stores (32)";
            case 1:
                return "Items (50)";

            default:
                return null;
        }


    }
}
