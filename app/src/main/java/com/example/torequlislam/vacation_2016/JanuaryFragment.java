package com.example.torequlislam.vacation_2016;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Torequl islam on 4/24/2016.
 */
public class JanuaryFragment extends Fragment {
    View myview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.january_2016, container,false);
        //return myview;

        myview.findViewById(R.id.d1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(getActivity());

                myBuilder.setNegativeButton("First May ", new DialogInterface.OnClickListener() {
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
