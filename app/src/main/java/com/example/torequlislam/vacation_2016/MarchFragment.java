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
 * Created by Torequl islam on 4/25/2016.
 */
public class MarchFragment extends android.support.v4.app.Fragment {
    View myview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.march_2016_layout, container,false);
        //return myview;

        myview.findViewById(R.id.d17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(getActivity());

                myBuilder.setNegativeButton("বৃহঃবার, ১৭ মার্চ' ২০১৬, জাতির জনক বঙ্গ বন্ধু শেখ মজিবর রাহমান এর জন্মদিন ।", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });

                AlertDialog mydialog= myBuilder.create();
                mydialog.show();

            }
        });
        myview.findViewById(R.id.d26).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(getActivity());

                myBuilder.setNegativeButton("শনিবার, ২৬ মার্চ' ২০১৬\n" +
                        "স্বাধীনতা ও জাতীয় দিবস ।", new DialogInterface.OnClickListener() {
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
