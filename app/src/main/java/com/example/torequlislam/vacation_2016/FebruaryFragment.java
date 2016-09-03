package com.example.torequlislam.vacation_2016;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Torequl islam on 4/24/2016.
 */
public class FebruaryFragment extends android.support.v4.app.Fragment{
    View myview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.february_2016_layout, container,false);

        myview.findViewById(R.id.d21).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(getActivity());

                myBuilder.setNegativeButton(" 21 ফেব্রুয়ারি 2016,আন্তর্জাতিক মাতৃভাষা দিবস", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });

                AlertDialog mydialog= myBuilder.create();
                mydialog.show();

            }
        });
        return myview;
    }
}
