package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private ImageView imageone;
    private TextView textone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageone = findViewById(R.id.imageone);
        textone = findViewById(R.id.textone);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String Countryname = bundle.getString("name");
            showDetails(Countryname);
        }

    }

    void showDetails (String Countryname){

        if(Countryname.equals("bangladesh") ){
            imageone.setImageResource(R.drawable.image1);
            textone.setText(R.string.bangladesh);
        }else if(Countryname.equals("india") ){
            imageone.setImageResource(R.drawable.rrr);
            textone.setText(R.string.india);
        }else if(Countryname.equals("pakistan")){
            imageone.setImageResource(R.drawable.image2);
            textone.setText(R.string.pakistan);
        }
    }
}