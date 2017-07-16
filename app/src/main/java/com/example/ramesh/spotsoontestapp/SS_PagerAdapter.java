package com.example.ramesh.spotsoontestapp;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ram on 13-07-2017.
 */

public class SS_PagerAdapter extends PagerAdapter {

Context mContext;
    LayoutInflater mLayoutInflater;


    public SS_PagerAdapter(SS_MainActivity ss_mainActivity) {

        mContext=ss_mainActivity;
        mLayoutInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View aView=mLayoutInflater.inflate(R.layout.ss_image_list_item,container,false);

        ImageView aImageView=(ImageView)aView.findViewById(R.id.imageView);

        aImageView.setImageResource(mResources[position]);

        container.addView(aView);

        return aView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

    int[] mResources = {
            R.mipmap.about_us,
            R.mipmap.image,
            R.mipmap.milestone,
            R.mipmap.navi_milestone,
            R.mipmap.play,
            R.mipmap.select_about_us,
            R.mipmap.select_image,
            R.mipmap.select_milesstone,
            R.mipmap.select_navi_milestone,
            R.mipmap.select_video,
            R.mipmap.select_vr_video,
            R.mipmap.video,
            R.mipmap.vr_videos

    };
}
