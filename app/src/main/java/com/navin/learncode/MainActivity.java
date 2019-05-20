package com.navin.learncode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.navin.learncode.adapter.TapAdapter;
import com.navin.learncode.fragment.tabs.HomeFragment;
import com.navin.learncode.fragment.tabs.MobileFragment;
import com.navin.learncode.fragment.tabs.ProgrammingFragment;
import com.navin.learncode.fragment.tabs.WebDevelopmentFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

   @BindView(R.id.toolbar)
   Toolbar toolbar;
   @BindView(R.id.tabLayout)
   TabLayout tabLayout;
   @BindView(R.id.viewPager)
   ViewPager viewPager;
   TapAdapter tapAdapter;
    private int[] tabIcons = {
            R.drawable.home_selector,
            R.drawable.web_selector,
            R.drawable.mobile_selector,
            R.drawable.programming_selector
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        tapAdapter=new TapAdapter(getSupportFragmentManager());
        tapAdapter.addFragment(new HomeFragment(),"Home");
        tapAdapter.addFragment(new WebDevelopmentFragment(),"Web Development");
        tapAdapter.addFragment(new MobileFragment(),"Mobile");
        tapAdapter.addFragment(new ProgrammingFragment(),"Programming Languages");
        viewPager.setAdapter(tapAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);


    }
}
