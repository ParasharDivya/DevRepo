package android.divya.com.divyapoc;

import android.divya.com.divyapoc.adapter.TabViewPagerAdapter;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.layout_tabs);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.sports));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tech));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.design));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.politics));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.movie));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        setUpTabsAndViewPager(tabLayout);
    }

    private void setUpTabsAndViewPager(final TabLayout tabLayout) {


        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        TabViewPagerAdapter tabViewPagerAdapter = new TabViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        mViewPager.setAdapter(tabViewPagerAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
