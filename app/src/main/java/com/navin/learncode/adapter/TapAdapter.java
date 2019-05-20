package com.navin.learncode.adapter;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TapAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragmentList=new ArrayList<>();
    private List<String> mFragmentTitleList=new ArrayList<>();


    public TapAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }
    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       // return mFragmentTitleList.get(position);
        return null;
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
