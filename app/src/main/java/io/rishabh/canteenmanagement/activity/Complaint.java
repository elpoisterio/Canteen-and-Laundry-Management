package io.rishabh.canteenmanagement.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.gc.materialdesign.views.ButtonRectangle;

import io.rishabh.canteenmanagement.R;

/**
 * Created by rishabh on 11/10/15.
 */
public class Complaint extends AppCompatActivity implements View.OnClickListener{
    EditText complaint;
    ButtonRectangle buttonSubmit;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
        initView();

    }
    public void initView(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Complain Forum");
        complaint = (EditText) findViewById(R.id.complaint);
        buttonSubmit = (ButtonRectangle) findViewById(R.id.submit);
        buttonSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.submit:
                moveToHome();
                break;

        }
    }

    private void moveToHome() {
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
        finish();
    }
}
