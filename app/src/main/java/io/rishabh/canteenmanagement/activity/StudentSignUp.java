package io.rishabh.canteenmanagement.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.gc.materialdesign.views.ButtonRectangle;

import io.rishabh.canteenmanagement.R;

/**
 * Created by rishabh on 11/10/15.
 */
public class StudentSignUp extends Activity implements View.OnClickListener {
    ButtonRectangle signIn;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_up);
        initView();
    }

    public void initView(){
        signIn = (ButtonRectangle) findViewById(R.id.sign_in);
        name = (EditText) findViewById(R.id.itemName);
        name.getText();
        // sets click lstener on button
        signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.sign_in:
                moveToOtp();
                break;

        }

    }

    private void moveToOtp() {
        Intent intent = new Intent(StudentSignUp.this,Home.class);
        startActivity(intent);
        finish();
    }
}
