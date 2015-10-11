package io.rishabh.canteenmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.gc.materialdesign.views.ButtonRectangle;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    ButtonRectangle button_shopkeeper,button_faculty,button_student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initView();
    }

   public void initView(){
       button_shopkeeper = (ButtonRectangle) findViewById(R.id.button_shopkeeper);
       button_faculty = (ButtonRectangle) findViewById(R.id.button_faculty);
       button_student = (ButtonRectangle) findViewById(R.id.button_student);
       button_student.setOnClickListener(this);
   }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.button_student:
                moveToSignUpForm();
                break;

        }

    }

    private void moveToSignUpForm() {
        Intent intent = new Intent(SignUp.this,StudentSignUp.class);
        startActivity(intent);
        finish();
    }
}
