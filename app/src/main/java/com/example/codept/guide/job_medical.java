package com.example.codept.guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class job_medical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_medical);
    }
    public void medical_job_detail(View view){
        Intent intent = new Intent(job_medical.this, job_detail.class);
        intent.putExtra("Medical",true);
        job_medical.this.startActivity(intent);

    }
}
