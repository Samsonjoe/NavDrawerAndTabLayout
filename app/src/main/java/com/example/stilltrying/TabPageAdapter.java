package com.example.stilltrying;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabPageAdapter extends FragmentStatePagerAdapter {

    String[] tabarray = new String[]{"one","two","three"};
    Integer tabnumber= 3;


    public TabPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                one one1 = new one();
                return one1;
            case 1:
                two two2 = new two();
                return two2;
            case 2:
                three three3 = new three();
                return three3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }}
