package com.clc.vpd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MyPagerAdapter extends PagerAdapter {
    private List<String> mStrList;
    private Context mContext;

    public MyPagerAdapter(Context context, List strList) {
        mContext = context;
        mStrList = strList;
    }

    @Override
    public int getCount() {
        return mStrList == null ? 0 : mStrList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        TextView view = (TextView) LayoutInflater.from(mContext).inflate(R.layout.page_item, container, false);
        view.setText(mStrList.get(position));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
