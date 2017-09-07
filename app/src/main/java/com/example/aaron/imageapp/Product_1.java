package com.example.aaron.imageapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Aaron on 15-12-2016.
 */
public class Product_1 extends Activity {
    View myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //onClick();
        setContentView(R.layout.product_1);

        ImageView imageView1 = (ImageView)findViewById(R.id.Commercial_Chinese_Gas);
        ImageView imageView2 = (ImageView)findViewById(R.id.Commercial_Single_Burner);
        ImageView imageView3 = (ImageView)findViewById(R.id.Commercial_Two_Burner);
        ImageView imageView4 = (ImageView)findViewById(R.id.Commercial_four);
        ImageView imageView5 = (ImageView)findViewById(R.id.Commercial_six);
        ImageView imageView6 = (ImageView)findViewById(R.id.Commercial_tilting_boiling);
        ImageView imageView7 = (ImageView)findViewById(R.id.Commercial_tilting_bratts);
        ImageView imageView8 = (ImageView)findViewById(R.id.Commercial_mobile_tandoor);
        ImageView imageView9 = (ImageView)findViewById(R.id.Commercial_mobile_shawarma);
        ImageView imageView10 = (ImageView)findViewById(R.id.Commercial_chapati_making);
        ImageView imageView11;
        ImageView imageView12;
        ImageView imageView13;
        ImageView imageView14;
        ImageView imageView15;
        ImageView imageView16;

        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                Intent myIntent = new Intent(Product_1.this, Products_1_details1.class);
                startActivity(myIntent);
            }
        });


        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                Intent myIntent = new Intent(Product_1.this, Products_1_details2.class);
                startActivity(myIntent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                Intent myIntent2 = new Intent(Product_1.this, Products_1_details3.class);
                startActivity(myIntent2);
            }
        });


        imageView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
                Intent myIntent3 = new Intent(Product_1.this, Products_1_details4.class);
                startActivity(myIntent3);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View)
            {
                Intent myIntent4 = new Intent(Product_1.this, Products_1_details5.class);
                startActivity(myIntent4);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View)
            {
                Intent myIntent5 = new Intent(Product_1.this, Products_1_details6.class);
                startActivity(myIntent5);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View)
            {
                Intent myIntent = new Intent(Product_1.this, Products_1_details7.class);
                startActivity(myIntent);
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View)
            {
                Intent myIntent = new Intent(Product_1.this, Products_1_details8.class);
                startActivity(myIntent);
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View)
            {
                Intent myIntent = new Intent(Product_1.this, Products_1_details9.class);
                startActivity(myIntent);
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent myIntent = new Intent(Product_1.this, Products_1_details10.class);
                startActivity(myIntent);
            }
        });

    }
}
