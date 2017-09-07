package com.example.aaron.imageapp;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//import android.support.v4.app.FragmentTransaction;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuItem;

public class WelcomeActiviti extends Activity {

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_activiti);
        imageView = (ImageView)findViewById(R.id.imageView3);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.welcome_animation);
        imageView.setAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {


                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                //startActivity(new Intent(WelcomeActiviti.this, HomePage.class));
                //Intent myIntent = new Intent(imageView.getContext(), HomePage.class);
                //Intent myIntent = new Intent(MainActivity.this.getActivity(), HomePage.class);
                //Intent intent = new Intent(getActivity(),HomePage.class);
                //Intent i = new Intent(WelcomeActiviti.this, MainActivity.class);
                //startActivity(i);


/*
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.imageView3, new HomePage()).commit();


*/
                /*
                Fragment newFragemnt = new HomePage();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.imageView4, newFragemnt);
                transaction.commit();
*/
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}

/*
public class WelcomeActiviti extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_activiti);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(WelcomeActiviti.this, HomePage.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}

*/