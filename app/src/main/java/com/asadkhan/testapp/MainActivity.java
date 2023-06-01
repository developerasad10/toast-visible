package com.asadkhan.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        ImageView pic;
        Button visible,invisible, toast;
        Button nextPage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-------------------Id added to the value---------------------
        pic = findViewById(R.id.pic);
        visible = findViewById(R.id.visible);
        invisible = findViewById(R.id.invisible);
        toast = findViewById(R.id.toast);
        nextPage1 = findViewById(R.id.nextPage1);

        //-----------------------Event Listner-------------------------

        nextPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myAction = new Intent(MainActivity.this, PageTwo.class);
                startActivity(myAction);
            }
        });

        visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic.setVisibility(View.VISIBLE);
            }
        });
        invisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic.setVisibility(View.INVISIBLE);
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "App installed", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "Program Error", Toast.LENGTH_LONG).show();
            }
        });

    }
}