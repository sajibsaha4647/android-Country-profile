package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonone,buttontwo,buttonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonone = findViewById(R.id.btnone);
        buttontwo = findViewById(R.id.btntwo);
        buttonThree = findViewById(R.id.btnthree);


    }
}