package com.example.codept.guide;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class education extends AppCompatActivity {

//    final CheckBox eng = (CheckBox) findViewById(R.id.engineering);
//    final   CheckBox health = (CheckBox) findViewById(R.id.health);
//    final   CheckBox maths = (CheckBox) findViewById(R.id.maths1);
//    final   CheckBox bio = (CheckBox) findViewById(R.id.bio1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        final CheckBox m = (CheckBox) findViewById(R.id.maths1);
        final CheckBox b = (CheckBox) findViewById(R.id.bio1);
        final CheckBox e = (CheckBox) findViewById(R.id.engineering);
        final CheckBox h = (CheckBox) findViewById(R.id.health);
        Button button = (Button) findViewById(R.id.check);






        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






                if (m.isChecked() && e.isChecked()) {

                                AlertDialog.Builder builder = new AlertDialog.Builder(education.this);
                                builder.setMessage("You best suit to engineering")
                                        .setNegativeButton("back", null)
                                        .create()
                                        .show();

                            } else if (b.isChecked()&& h.isChecked()){
                                AlertDialog.Builder builder = new AlertDialog.Builder(education.this);
                                builder.setMessage("You best suit to Medical")
                                        .setNegativeButton("back", null)
                                        .create()
                                        .show();
                            }
                            else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(education.this);
                    builder.setMessage("Select an appropriate Interest and Subject")
                            .setNegativeButton("back", null)
                            .create()
                            .show();
                            }

                        }








    });
    }
    public void edu_engineering(View view) {
        Intent intent = new Intent(education.this, edu_engineering.class);
        education.this.startActivity(intent);

    }
    public void edu_pharmacy(View view) {
        Intent intent = new Intent(education.this, edu_pharmacy.class);
        education.this.startActivity(intent);

    }
    public void edu_medical(View view) {
        Intent intent = new Intent(education.this, edu_medical.class);
        education.this.startActivity(intent);

    }
}
