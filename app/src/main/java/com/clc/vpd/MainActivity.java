package com.clc.vpd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.vp_container);

        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(this, list);
        mViewPager.setAdapter(pagerAdapter);
    }
}