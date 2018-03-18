package com.example.codept.guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Bandra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandra);

        final Button lake_button = (Button) findViewById(R.id.beachesbutton);

        lake_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Bandra.this, beaches.class);
                Bandra.this.startActivity(intent);

            }
        });


    }
}
