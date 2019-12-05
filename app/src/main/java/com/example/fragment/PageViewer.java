package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.fragment.adapter.ViewPageAdapter;
import com.example.fragment.fragments.FirstFragment;
import com.example.fragment.fragments.SecondFragment;
import com.google.android.material.tabs.TabLayout;

public class PageViewer extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_viewer);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPageAdapter viewPageAdapter =new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdapter.addFragment(new FirstFragment(),"SUM");
        viewPageAdapter.addFragment(new SecondFragment(),"Area of Circle");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
