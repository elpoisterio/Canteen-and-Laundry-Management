package io.rishabh.canteenmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gc.materialdesign.views.ButtonRectangle;

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
    public void initView(){
        signUp = (ButtonRectangle) findViewById(R.id.sign_up);
        explore = (ButtonRectangle) findViewById(R.id.explore);
        signUp.setOnClickListener(this);
        explore.setOnClickListener(this);

    }

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

    private void moveToHome() {
        Intent intent = new Intent(Welcome.this,Home.class);
        startActivity(intent);
        finish();
    }

    private void moveToSignUp() {
        Intent intent = new Intent(Welcome.this,SignUp.class);
        startActivity(intent);
        finish();
    }
}
