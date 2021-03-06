package io.rishabh.canteenmanagement.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gc.materialdesign.views.ButtonFloat;

import io.rishabh.canteenmanagement.R;
import io.rishabh.canteenmanagement.activity.Complaint;

/**
 * Created by rishabh on 11/10/15.
 */
public class Laundry extends Fragment implements View.OnClickListener{
    ButtonFloat complaint;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_laundry,container,false);
        initView(view);
        return view ;
    }
    public void initView(View view){
        complaint = (ButtonFloat) view.findViewById(R.id.complaint);
        complaint.setOnClickListener(this);
        complaint.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.complaint:
                moveToComplaint(v);
                break;


        }

    }

    private void moveToComplaint(View v) {
        Intent intent = new Intent(getActivity(),Complaint.class);
        startActivity(intent);
        getActivity().finish();

    }
}
