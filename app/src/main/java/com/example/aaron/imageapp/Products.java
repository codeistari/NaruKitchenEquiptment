package com.example.aaron.imageapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Aaron on 15-12-2016.
 */
public class Products extends Fragment{

    View myView;
    /*
    String selected;
    ImageView imageview1, imageview2, imageview3, imageview4;
    */


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.products, container, false);
        //Starts Here






        //Ends Here

        ImageView display = (ImageView)myView.findViewById(R.id.image1);



        //******image1
        display.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(final View v) {
                //FragmentManager fragmentManager = getFragmentManager();


                // - http://stackoverflow.com/questions/33019565/android-studio-switch-statement-on-imageview
                // - https://www.youtube.com/watch?v=n0n3NRf-6JI

                        Intent intent = new Intent(getActivity(), Product_1.class);
                        startActivity(intent);
            }
        });


        //********image2


        return myView;

    }




}






