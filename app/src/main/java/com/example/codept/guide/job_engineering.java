package com.example.codept.guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class job_engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_engineering);

    }
    public void l2(View view){
        Intent intent = new Intent(job_engineering.this, job_detail.class);
        job_engineering.this.startActivity(intent);

    }
}
