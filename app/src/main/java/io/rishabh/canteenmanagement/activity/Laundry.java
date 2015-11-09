package io.rishabh.canteenmanagement.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import io.rishabh.canteenmanagement.R;
import io.rishabh.canteenmanagement.adapters.LaundryAdapter;

/**
 * Created by rishabh on 9/11/15.
 */
public class Laundry extends Activity {
    ListView itemListView;
    private LaundryAdapter laundryAdapter;
    private ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry);
        initView();
        laundryAdapter = new LaundryAdapter(Laundry.this,items);
    }
    private void initView(){
        itemListView = (ListView) findViewById(R.id.itemList);
    }
}
