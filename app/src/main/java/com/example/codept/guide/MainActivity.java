package com.example.codept.guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bandra_button = (Button) findViewById(R.id.bandrabutton);
        final Button thane_button = (Button) findViewById(R.id.thanebutton);


        bandra_button.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v)
                {
                Intent intent = new Intent(MainActivity.this, Bandra.class);
                    MainActivity.this.startActivity(intent);

                }
            });
        thane_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Thane.class);
                MainActivity.this.startActivity(intent);

            }
        });
    }
}