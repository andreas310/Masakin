package com.masak_in.masakin;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.ico_mn2,
            R.drawable.ico_mk2,
            R.drawable.ico_pm2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {

        Typeface Medium = Typeface.createFromAsset(getAssets(),  "fonts/GothamRoundedMedium.ttf");
        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Minuman");
        tabOne.setTypeface(Medium);
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ico_mn2, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Makanan Utama");
        tabOne.setTypeface(Medium);
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ico_mk2, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("Pencuci Mulut");
        tabOne.setTypeface(Medium);
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ico_pm2, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
    }




//    public void setCustomFont() {
//
//        ViewGroup vg = (ViewGroup) mCustomFontTab.getChildAt(0);
//        int tabsCount = vg.getChildCount();
//
//        for (int j = 0; j < tabsCount; j++) {
//            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
//
//            int tabChildsCount = vgTab.getChildCount();
//
//            for (int i = 0; i < tabChildsCount; i++) {
//                View tabViewChild = vgTab.getChildAt(i);
//                if (tabViewChild instanceof TextView) {
//                    //Put your font in assests folder
//                    //assign name of the font here (Must be case sensitive)
//                    ((TextView) tabViewChild).setTypeface(Typeface.createFromAsset(getAssets(), "fonts/GothamRoundedMedium.ttf"));
//                }
//            }
//        }
//    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FragmentMinuman(), "ONE");
        adapter.addFrag(new FragmentMakanan(), "TWO");
        adapter.addFrag(new FragmentPencuci(), "THREE");
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

}

