package com.masak_in.masakin.bayem;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.masak_in.masakin.R;
import com.masak_in.masakin.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class BayemstepActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private TextView textbar;

    private TextView[] mDots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayemstep);

        Typeface Bold = Typeface.createFromAsset(getAssets(),  "fonts/GothamRoundedBold.ttf");
        textbar = (TextView)findViewById(R.id.textbar);
        textbar.setTypeface(Bold);

        mSlideViewPager = (ViewPager)findViewById(R.id.slideViewPager);
        setupViewPager(mSlideViewPager);
        mDotLayout = (LinearLayout)findViewById(R.id.dotsLayout);
        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Bayem1Slide(), "ONE");
        adapter.addFrag(new Bayem2Slide(), "TWO");
        adapter.addFrag(new Bayem1Slide(), "THREE");
        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


    public void addDotsIndicator(int position){
        mDots = new TextView[4];
        mDotLayout.removeAllViews();
        for (int i=0; i<mDots.length; i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.textmedium));

            mDotLayout.addView(mDots[i]);
        }

        if (mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.textdark));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

}
