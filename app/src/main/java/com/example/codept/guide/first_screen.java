package com.example.codept.guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class first_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);


    }

    public void education(View view) {
        Intent intent = new Intent(first_screen.this, education.class);
        first_screen.this.startActivity(intent);

    }
    public void job(View view) {
        Intent intent = new Intent(first_screen.this, job.class);
        first_screen.this.startActivity(intent);

    }
    public void tourism(View view) {
        Intent intent = new Intent(first_screen.this, MainActivity.class);
        first_screen.this.startActivity(intent);

    }
    }
