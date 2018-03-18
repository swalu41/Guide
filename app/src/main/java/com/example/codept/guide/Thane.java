package com.example.codept.guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Thane extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thane);

        final Button lake_button = (Button) findViewById(R.id.lakebutton);

        lake_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Thane.this,lakes.class);
                Thane.this.startActivity(intent);

            }
        });

    }
}
