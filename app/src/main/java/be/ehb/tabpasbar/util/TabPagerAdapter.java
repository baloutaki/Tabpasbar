package be.ehb.tabpasbar.util;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import be.ehb.tabpasbar.fragments.InfoFragment;
import be.ehb.tabpasbar.fragments.OrderFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] fragments = {InfoFragment.newInstance(), OrderFragment.newInstance()};


    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       if(position == 0)
           return "Info";
       if(position == 1)
           return "order";
       return "";
    }
}
