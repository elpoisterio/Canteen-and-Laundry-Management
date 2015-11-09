package io.rishabh.canteenmanagement.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gc.materialdesign.views.ButtonRectangle;

import io.rishabh.canteenmanagement.R;

/**
 * Created by rishabh on 11/10/15.
 */
public class Welcome extends Activity implements View.OnClickListener {
    ButtonRectangle signUp;
    ButtonRectangle explore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        initView();
    }
    //Defining views of class
    public void initView(){
        signUp = (ButtonRectangle) findViewById(R.id.sign_up);
        explore = (ButtonRectangle) findViewById(R.id.explore);
        signUp.setOnClickListener(this);
        explore.setOnClickListener(this);

    }
//Onclick Listener
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.sign_up:
                moveToSignUp();
                break;
            case R.id.explore:
                moveToHome();
                break;
        }
    }
    //Intent to move to next screen

    private void moveToHome() {
        Intent intent = new Intent(Welcome.this,Home.class);
        startActivity(intent);
        finish();
    }

    private void moveToSignUp() {
        Intent intent = new Intent(Welcome.this,StudentSignUp.class);
        startActivity(intent);
        finish();
    }
}
