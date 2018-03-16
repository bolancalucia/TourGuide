package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private final int NUMBER_OF_SITE_TABS = 5;
    private Context mContext;

    public CategoryAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        mContext = context;
        // dodali smo context zato da kad uzimamo naslove tabova, ne moramo uzet hardkodirane stringove nego pristupit preko strings.xml
    }

    @Override
    public int getCount() {
        return NUMBER_OF_SITE_TABS;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new LandmarkFragment();
        else if (position == 1)
            return new MuseumFragment();
        else if (position == 2)
            return new RestaurantFragment();
        else if (position == 3)
            return new NightClubFragment();
        else return new BeachFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.landmark);
        else if (position == 1)
            return mContext.getString(R.string.museum);
        else if (position == 2)
            return mContext.getString(R.string.restaurant);
        else if (position == 3)
            return mContext.getString(R.string.night_club);
        else return mContext.getString(R.string.beach);
    }
}
