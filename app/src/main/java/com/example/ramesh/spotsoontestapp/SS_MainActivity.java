package com.example.ramesh.spotsoontestapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class SS_MainActivity extends AppCompatActivity {

    ViewPager mViewPager;
    SS_PagerAdapter mSS_PagerAdapter;
    ImageView mLeftImg,mRightImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---init widget----//
        mViewPager = (ViewPager) findViewById(R.id.viewpager_id);
        mLeftImg=(ImageView)findViewById(R.id.left_img_id);
        mRightImg=(ImageView)findViewById(R.id.right_img_id);

        //---set viewpager to adapter----//
        mSS_PagerAdapter = new SS_PagerAdapter(this);
        mViewPager.setAdapter(mSS_PagerAdapter);

        //----onscroll page change init-----//
        mViewPager.addOnPageChangeListener(onPageChangeListener);


        //----Left arrow onclick change image-----//
        mLeftImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = mViewPager.getCurrentItem();
                if (tab > 0) {
                    tab--;
                    mViewPager.setCurrentItem(tab);

                } else if (tab == 0) {
                    mViewPager.setCurrentItem(tab);

                }
            }
        });

        //----Right arrow onclick change image-----//
        mRightImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = mViewPager.getCurrentItem();
                tab++;
                mViewPager.setCurrentItem(tab);
            }
        });

    }

    //----onscroll change image and arrow [Hide/View]-----//
    final ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }
        @Override
        public void onPageSelected(int position) {

            if (position == mSS_PagerAdapter.mResources.length - 1) {
                mRightImg.setVisibility(View.INVISIBLE);
                mLeftImg.setVisibility(View.VISIBLE);
            }

            else if (position == 0) {
                mLeftImg.setVisibility(View.INVISIBLE);
                mRightImg.setVisibility(View.VISIBLE);
            }

            else {
                mLeftImg.setVisibility(View.VISIBLE);
                mRightImg.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}
