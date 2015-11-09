package io.rishabh.canteenmanagement.activity;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.gc.materialdesign.views.ButtonFloat;


import io.rishabh.canteenmanagement.R;


/**
 * Created by rishabh on 11/10/15.
 */
public class Home extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    ButtonFloat buttonComplaint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();

    }


    private void initViews() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        buttonComplaint = (ButtonFloat) findViewById(R.id.button_complaint);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        buttonComplaint.setOnClickListener(this);
        buttonComplaint.setBackgroundColor(getResources().getColor(R.color.colorPrimary));


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button_complaint:
                movetoComplaint();
                break;
        }
    }

    private void movetoComplaint() {
        Intent intent = new Intent(this, Complaint.class);
        startActivity(intent);
        finish();
    }
}
