package com.example.ammei.tourapplication;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ammei on 11/12/2016.
 */

public class MyCategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link MyCategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public MyCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public MyCategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new EventsFragment();
        } else if (position == 2) {
            return new HotelFragment();
        } else {
            return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.category_events);
        } else if (position == 2) {
            return mContext.getString(R.string.category_hotels);
        } else {
            return mContext.getString(R.string.category_restaurants);
        }
    }
}
