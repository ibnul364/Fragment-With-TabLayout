package com.example.fragmentwithtablayout;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapter extends FragmentPagerAdapter {
int tabCount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0: return new Tab1();

            case 1: return new Tab2();

            case 2: return new Tab3();

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
