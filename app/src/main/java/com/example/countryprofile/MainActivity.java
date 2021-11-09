package com.example.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonone,buttontwo,buttonThree;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent();

        buttonone = findViewById(R.id.btnone);
        buttontwo = findViewById(R.id.btntwo);
        buttonThree = findViewById(R.id.btnthree);

        buttontwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonone.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnone){
            intent = new Intent(MainActivity.this,Profile.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }else if(v.getId() == R.id.btntwo){
            intent = new Intent(MainActivity.this,Profile.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }else if(v.getId() == R.id.btnthree){
            intent = new Intent(MainActivity.this,Profile.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }


    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        AlertDialog alertDialogBuilder  = new AlertDialog.Builder(this).setIcon(R.drawable.image1)
        .setTitle(R.string.alert_title)
        .setMessage(R.string.alert_message)
       .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        }).show();
    }
}