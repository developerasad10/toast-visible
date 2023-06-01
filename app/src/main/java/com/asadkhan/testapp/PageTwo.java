package com.asadkhan.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageTwo extends AppCompatActivity {

    Button previousPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        previousPage = findViewById(R.id.previousPage);
        previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previousIntent = new Intent(PageTwo.this, MainActivity.class);
                startActivity(previousIntent);
            }
        });
    }
}