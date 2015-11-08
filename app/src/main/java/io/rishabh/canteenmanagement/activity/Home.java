package io.rishabh.canteenmanagement.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import io.rishabh.canteenmanagement.adapters.HomeViewPagerAdapter;
import io.rishabh.canteenmanagement.R;
import io.rishabh.canteenmanagement.utility.SlidingTabLayout;

/**
 * Created by rishabh on 11/10/15.
 */
public class Home extends AppCompatActivity {
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



    }
}
