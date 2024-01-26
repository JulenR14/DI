package com.julen.ejercicio2_tyv;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SectionsPagerAdapter extends FragmentStateAdapter {
    private final Context context;
    public SectionsPagerAdapter(Context context, FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        this.context = context;
    }
    @Override
    public int getItemCount() {
        return 3;
    }
    @Override
    public Fragment createFragment(int position) {
        return PlaceholderFragment.newInstance(position + 1);
    }

}
