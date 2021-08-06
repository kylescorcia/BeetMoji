package com.syncappdata.keyboard.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import android.widget.Button;

import com.syncappdata.keyboard.R;
import com.syncappdata.keyboard.adapters.ImagePagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    ArrayList<Integer> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_home_screen);
        init();
    }

    private void init() {
        mList = new ArrayList<>();
        /**
         * For Showing Installation and How to use application images below
         */
        mList.add(R.mipmap.first_image);
        mList.add(R.mipmap.second_image);
        mList.add(R.mipmap.thrid_image);
        mList.add(R.mipmap.fourth_image);
        mList.add(R.mipmap.fivth_images);
        ImagePagerAdapter customPagerAdapter = new ImagePagerAdapter(this, mList);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(customPagerAdapter);
        CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.indicator1);
        indicator.setRadius(12);
        indicator.setViewPager(mViewPager);

        Button close = (Button) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
