package com.example.codept.guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class job_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);

        final Intent intent = getIntent();
        final Boolean medical = Boolean.valueOf(intent.getStringExtra("Medical"));

            location("Mumbai");
            salary("₹ 30,000");
            skill("Smart");
            bond("1 Year");

    }

    private void location(String Quantity) {
        TextView Username = (TextView)findViewById(R.id.Location);
        Username.setText("" + Quantity);
    }
    private void salary(String Quantity) {
        TextView Username = (TextView)findViewById(R.id.salary);
        Username.setText("" + Quantity);
    }
    private void skill(String Quantity) {
        TextView Username = (TextView)findViewById(R.id.time);
        Username.setText("" + Quantity);
    }
    private void bond(String Quantity) {
        TextView Username = (TextView)findViewById(R.id.bond);
        Username.setText("" + Quantity);
    }

}
