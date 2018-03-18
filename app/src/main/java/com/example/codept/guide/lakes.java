package com.example.codept.guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class lakes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakes);



    }
    public void location(View view){
        Uri gmmIntentUri = Uri.parse("geo:19.1235675,72.83608800000002?z=10&q=Talao pali lake, Near station,Shivaji Path, Ghantali, Thane west, Thane, maharashtra 400601");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }

    }
}
