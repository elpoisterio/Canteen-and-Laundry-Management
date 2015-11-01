package io.rishabh.canteenmanagement;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by rishabh on 11/10/15.
 */
public class Home extends AppCompatActivity {
    private ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout ;
    private int ntabs = 2;
    private CharSequence titles[]= {"Canteen","Laundry"};
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();

    }


    private void initViews() {

       toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new HomeViewPagerAdapter(getSupportFragmentManager(),titles, ntabs,Home.this));
        slidingTabLayout = (SlidingTabLayout)findViewById(R.id.hometabs);
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.green));

        slidingTabLayout.setViewPager(viewPager);


    }
}
