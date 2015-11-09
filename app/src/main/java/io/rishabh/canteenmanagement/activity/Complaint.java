package io.rishabh.canteenmanagement.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;

import io.rishabh.canteenmanagement.R;

/**
 * Created by rishabh on 11/10/15.
 */
public class Complaint extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    EditText complaint;
    ButtonRectangle buttonSubmit;
    Toolbar toolbar;
    private Spinner typeSpinner, shopSpinner;
    private String shopName[] = {"Select Shop", "Amul", "Stationary", "Juice-Shop", "Laundry", "Food-Barn"};
    private RadioButton complain, request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
        initView();
        spinnerShopAdapter();
    }
//Views of class
    public void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Complain-Request Forum");
        complaint = (EditText) findViewById(R.id.complaint);
        complain = (RadioButton) findViewById(R.id.complain);
        request = (RadioButton) findViewById(R.id.request);
        shopSpinner = (Spinner) findViewById(R.id.spinner_shop);
        buttonSubmit = (ButtonRectangle) findViewById(R.id.submit);
        buttonSubmit.setOnClickListener(this);
    }
// Spinner to select shops

    public void spinnerShopAdapter() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, shopName);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shopSpinner.setAdapter(adapter);
        shopSpinner.setOnItemSelectedListener(this);
    }
    //on click listener

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.submit:
                Toast.makeText(Complaint.this, "Your complain has been posted", Toast.LENGTH_SHORT).show();
                moveToHome();
                break;

        }
    }
    //intent to move to home.

    private void moveToHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        finish();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Spinner spinner = (Spinner) parent;
        int id_spinner = spinner.getId();
        switch (id_spinner) {
            case R.id.spinner_shop:
                shopSpinner.setSelection(position);
                String shop = (String) shopSpinner.getSelectedItem();

                break;
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
//Radio buttons to check request or complain.
    public String onRadioButtonClicked(View view) {
        String check = "";
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.complain:
                if (checked) {
                    if (request.isChecked())
                        request.setChecked(false);
                    check = "complain";
                    return check;
                }

                break;
            case R.id.request:
                if (checked) {
                    if (complain.isChecked())
                        complain.setChecked(false);
                    check = "request";
                    return check;
                }

                break;
        }
        return check;
    }
}
