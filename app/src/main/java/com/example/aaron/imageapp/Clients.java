package com.example.aaron.imageapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Aaron on 22-01-2017.
 */

public class Clients extends Fragment
{

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.clients, container, false);






        ImageView display = (ImageView)myView.findViewById(R.id.client_corporates);
        ImageView display1 = (ImageView)myView.findViewById(R.id.client_hotels);
        ImageView display2 = (ImageView)myView.findViewById(R.id.client_restarunts);
        ImageView display3 = (ImageView)myView.findViewById(R.id.client_hospitals);

        display.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(final View v) {
                //FragmentManager fragmentManager = getFragmentManager();
                Intent intent = new Intent(getActivity(), Clients_corporates_page.class);
                startActivity(intent);
            }
        });


        display1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(final View v) {
                //FragmentManager fragmentManager = getFragmentManager();
                Intent intent = new Intent(getActivity(), Clients_fivestarhotels_page.class);
                startActivity(intent);
            }
        });

        display2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(final View v) {
                //FragmentManager fragmentManager = getFragmentManager();
                Intent intent = new Intent(getActivity(), Clients_fivestarrest_page.class);
                startActivity(intent);
            }
        });

        display3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(final View v) {
                //FragmentManager fragmentManager = getFragmentManager();
                Intent intent = new Intent(getActivity(), Clients_hospitals_page.class);
                startActivity(intent);
            }
        });



        return myView;
    }
}
