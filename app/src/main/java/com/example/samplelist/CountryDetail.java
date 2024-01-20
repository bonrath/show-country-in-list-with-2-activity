package com.example.samplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryDetail extends AppCompatActivity {
    ImageView imgflag;
    Button btnBack;
    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        imgflag=(ImageView) findViewById(R.id.imgflag);
        txtInfo=(TextView) findViewById(R.id.txtInfo);
        btnBack=(Button) findViewById(R.id.btnBack);

        Intent k = getIntent();
        String u= k.getStringExtra("Key1");
        String d= k.getStringExtra("Key2");
        int img= k.getIntExtra("Key4",0);



        txtInfo.setText("Welcome to " + u.toString() + ". " + "\n" + d.toString());


        imgflag.setImageResource(img);
//        if(u.equals("Cambodia")) {
//            imgflag.setImageResource(R.drawable.cambodiaflag);
//        }else if(u.equals("France")){
//            imgflag.setImageResource(R.drawable.franceflag);
//
//        }else if(u.equals("USA")){
//            imgflag.setImageResource(R.drawable.usa);
//        }else imgflag.setImageResource(R.drawable.none);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(CountryDetail.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}