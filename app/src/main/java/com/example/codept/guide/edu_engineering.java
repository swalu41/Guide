package com.example.codept.guide;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;

public class edu_engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu_engineering);
    }

    public void vjti(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(edu_engineering.this);
        builder.setMessage((Html.fromHtml(""+"<b>"+"V.J.T.I"+"</b>"+"<br>Location: Matunga <br>Year of establishment: 1887<br>Affiliation: Autonomous <br>Fees: ₹76,701")))
                .setPositiveButton("More detail",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {Intent intent = new Intent(edu_engineering.this, college_detail.class);
                        edu_engineering.this.startActivity(intent);
                    }
                })
                .setNeutralButton("Back",null)
                .setNegativeButton(" ", null)
                .create()
                .show();

    }

    public void spit(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(edu_engineering.this);
        builder.setMessage(Html.fromHtml(""+"<b>"+"S.P.I.T"+"</b>"+"<br>Location: Andheri <br>Year of establishment: 2005<br>Affiliation: Autonomous <br>Fees: ₹130,000"))
                .setPositiveButton("More detail",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {Intent intent = new Intent(edu_engineering.this, college_detail.class);
                        edu_engineering.this.startActivity(intent);
                    }
                })
                .setNeutralButton("Back",null)
                .setNegativeButton(" ", null)

                .create()
                .show();
    }

    public void dj(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(edu_engineering.this);
        builder.setMessage(Html.fromHtml(""+"<b>"+"D.J. Shanghavi"+"</b>"+"<br>Location: Vile Parle <br>Year of establishment: 1998<br>Affiliation: Mumbai University <br>Fees: ₹143,656"))
                .setPositiveButton("More detail",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {Intent intent = new Intent(edu_engineering.this, college_detail.class);
                        edu_engineering.this.startActivity(intent);
                    }
                })
                .setNeutralButton("Back",null)
                .setNegativeButton(" ", null)
                .create()
                .show();
    }

    public void rait(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(edu_engineering.this);
        builder.setMessage((Html.fromHtml(""+"<b>"+"R.A.I.T"+"</b>"+"<br>Location: Nerul <br>Year of establishment: 1982<br>Affiliation: Autonomous <br>Fees: ₹86,701")))
                .setPositiveButton("More detail",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {Intent intent = new Intent(edu_engineering.this, college_detail.class);
                        edu_engineering.this.startActivity(intent);
                    }
                })
                .setNeutralButton("Back",null)
                .setNegativeButton(" ", null)
                .create()
                .show();

    }

}
