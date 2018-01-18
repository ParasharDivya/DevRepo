package android.divya.com.divyapoc.adapter;

import android.divya.com.divyapoc.fragment.DesignFragment;
import android.divya.com.divyapoc.fragment.MovieFragment;
import android.divya.com.divyapoc.fragment.PoliticsFragment;
import android.divya.com.divyapoc.fragment.TechFragment;
import android.divya.com.divyapoc.fragment.sportsFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabViewPagerAdapter extends FragmentStatePagerAdapter {
    int count;
    public TabViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.count = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                sportsFragment sportsFragment = new sportsFragment();
                return  sportsFragment;
            case 1:
                TechFragment techFragment = new TechFragment();
                return techFragment;
            case 2:
                DesignFragment designFragment = new DesignFragment();
                return designFragment;
            case 3:
                PoliticsFragment politicsFragment = new PoliticsFragment();
                return politicsFragment;
            case 4:
                MovieFragment movieFragment = new MovieFragment();
                return movieFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
