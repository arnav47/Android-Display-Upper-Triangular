package com.example.arnav47.myapplication47;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Arnav47 on 21-10-2017.
 */

public class tabtwo extends Fragment {

    EditText A1,A2,A3,B1,B2,B3,C1,C2,C3;
    Button button;
    ImageView imageView3;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tabtwo, container, false);

        A1 = (EditText) rootView.findViewById(R.id.A1);
        A2 = (EditText) rootView.findViewById(R.id.A2);
        A3 = (EditText) rootView.findViewById(R.id.A3);
        B1 = (EditText) rootView.findViewById(R.id.B1);
        B2 = (EditText) rootView.findViewById(R.id.B2);
        B3 = (EditText) rootView.findViewById(R.id.B3);
        C1 = (EditText) rootView.findViewById(R.id.C1);
        C2 = (EditText) rootView.findViewById(R.id.C2);
        C3 = (EditText) rootView.findViewById(R.id.C3);

        button = (Button) rootView.findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          B1.setText("?");
                                          C1.setText("?");
                                          C2.setText("?");
                B1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                      B1.setText("0");

                    }
                },2000);

                                          C1.postDelayed(new Runnable() {
                                              @Override
                                              public void run() {
                                                  C1.setText("0");
                                          }
                                          },3000);


                                          C2.postDelayed(new Runnable() {
                                              @Override
                                              public void run() {
                                                  C2.setText("0");
                                              }
                                          },4000);


                                      }
                                  }
        );

        return rootView;


    }

}

