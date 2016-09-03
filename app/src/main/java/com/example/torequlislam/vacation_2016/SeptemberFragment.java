package com.example.torequlislam.vacation_2016;

import android.app.AlertDialog;
import android.support.v4.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Torequl islam on 4/25/2016.
 */
public class SeptemberFragment extends Fragment{
    View myview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.september_2016_layout, container,false);
        //return myview;

        myview.findViewById(R.id.d11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(getActivity());

                myBuilder.setNegativeButton("রবিবার, ১১ সেপ্টেম্বর' ২০১৬, ঈদ-উল-আযহা।", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });

                AlertDialog mydialog= myBuilder.create();
                mydialog.show();

            }
        });
        myview.findViewById(R.id.d12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(getActivity());

                myBuilder.setNegativeButton("সোমবার, ১২ সেপ্টেম্বর' ২০১৬, ঈদ-উল-আযহা।", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });

                AlertDialog mydialog= myBuilder.create();
                mydialog.show();

            }
        });
        myview.findViewById(R.id.d13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(getActivity());

                myBuilder.setNegativeButton("মঙ্গলবার, ১৩ সেপ্টেম্বর' ২০১৬, ঈদ-উল-আযহা।", new DialogInterface.OnClickListener() {
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
