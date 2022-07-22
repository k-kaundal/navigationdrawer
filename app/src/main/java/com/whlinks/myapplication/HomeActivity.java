package com.whlinks.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
Button click;
AlertDialog.Builder alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        click = findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog = new AlertDialog.Builder(HomeActivity.this);
                alertDialog.setTitle("Example").setMessage("This is demo message");
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(HomeActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(HomeActivity.this, "No", Toast.LENGTH_SHORT).show();
                      alertDialog.setCancelable(true);
//                        finish();
                    }
                });

                alertDialog.create();
                alertDialog.show();

            }
        });
    }
}