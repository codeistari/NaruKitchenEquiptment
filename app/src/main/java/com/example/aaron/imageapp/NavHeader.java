package com.example.aaron.imageapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Aaron on 14-12-2016.
 * This can be deleted as can work without this java file
 */
public class NavHeader extends MainActivity {
    View myView;
    ImageView imgHome;
    private NavigationView nvDrawer;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    View headerView = getLayoutInflater().inflate(R.layout.nav_header_main, nvDrawer, false);


    public void onCreateView(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_main);
        initHome();
    }

    public void initHome() {
        imgHome = (ImageView) headerView.findViewById(R.id.drawerImage);
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(NavHeader.this, WelcomeActiviti.class);
                startActivity(intent1);

            }
        });
        //startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
