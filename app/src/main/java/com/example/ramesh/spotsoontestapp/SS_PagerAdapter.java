package com.example.ramesh.spotsoontestapp;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class SS_PagerAdapter extends PagerAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;

    public SS_PagerAdapter(SS_MainActivity ss_mainActivity) {

        //---- init context and layoutinflater----//
        mContext=ss_mainActivity;
        mLayoutInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        //---- Image items count----//
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        //---- linearlayout obj init----//
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        //---- Set values to layout items----//
        View aView=mLayoutInflater.inflate(R.layout.ss_image_list_item,container,false);

        ImageView aImageView=(ImageView)aView.findViewById(R.id.imageView);
        TextView aTitleTxt=(TextView)aView.findViewById(R.id.titleTxt_id);

        aImageView.setImageResource(mResources[position]);
        aTitleTxt.setText(TitleTxt[position]);

        aImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        container.addView(aView);

        return aView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        //---- remove layout items----//
        container.removeView((LinearLayout)object);
    }

    String[] TitleTxt = {
            "Google",
            "Twitter",
            "Windows",
            "Bing",
            "Itunes",
            "Wordpress",
            "Facebook",
            "Twitter",
            "Windows",
            "Bing",
            "Itunes",
            "Wordpress",
            "Facebook"

    } ;


    //---- image list items----//
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
