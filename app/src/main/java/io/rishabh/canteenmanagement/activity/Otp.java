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
public class Otp extends Activity implements View.OnClickListener{
    ButtonRectangle verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        initView();

    }
    /*
    * view of screen is defined here
    * */
    public void initView(){
        verify = (ButtonRectangle) findViewById(R.id.verify_otp);
        verify.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.verify_otp:
                movetoHome();
                break;
        }
    }

    private void movetoHome() {
        Intent intent = new Intent(Otp.this,Home.class);
        startActivity(intent);
        finish();
    }
}
