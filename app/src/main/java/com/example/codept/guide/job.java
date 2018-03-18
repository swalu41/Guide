package com.example.codept.guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class job extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);


    }

    public void job_engineering(View view) {
        Intent intent = new Intent(job.this, job_engineering.class);
        job.this.startActivity(intent);

    }

    public void job_medical(View view) {
        Intent intent = new Intent(job.this, job_medical.class);
        job.this.startActivity(intent);

    }
}
