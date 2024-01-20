package com.example.samplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    ListView lstCountry;
    String[] country = {"Cambodia", "France", "USA",
            "Lao", "Indonesia", "Singapore", "England",
            "Germany", "Russia", "China", "Canada", "Australia"

    };
    String[] detail = {"This is Cambodia",
            "This is France", "This is USA",
            "This is Lao", "This is Indonesia",
            "This is Singapore", "This is England",
            "This is Germany", "This is Russia",
            "This is China", "This is Canada", "This is Australia"
    };
    int[] img = new int[]{R.drawable.cambodiaflag,R.drawable.franceflag, R.drawable.usa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstCountry=(ListView) findViewById(R.id.lstCountry);
        ArrayAdapter<String> myadapter=new ArrayAdapter<String>(this,R.layout.single_row,R.id.txtCountryName,country);
        lstCountry.setAdapter(myadapter);

        lstCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str =(String) adapterView.getItemAtPosition(i);
//                Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();

                Intent j =new Intent(MainActivity.this,CountryDetail.class);
                j.putExtra("Key1",str);
                j.putExtra("Key2",detail[i]);
                j.putExtra("Key3",i);
                j.putExtra("Key4",img[i]);
                startActivity(j);
            }
        });
    }
}