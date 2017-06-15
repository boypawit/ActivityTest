package com.example.boyvi.intactivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        Intent intent = getIntent();
        String getEditT = intent.getStringExtra("editText");
        String getEditT2 = intent.getStringExtra("name");
        String getEditT3 = intent.getStringExtra("ID");
        String getEditT4 = intent.getStringExtra("Address");

        TextView textName = (TextView) findViewById(R.id.textView); //รับค่าจาก id
        textName.setText(getEditT);

        TextView textLname = (TextView) findViewById(R.id.textView2); //รับค่าจาก id
        textLname.setText(getEditT2);

        TextView textID = (TextView) findViewById(R.id.textView3); //รับค่าจาก id
        textID.setText(getEditT3);

        TextView texAddress = (TextView) findViewById(R.id.textView4); //รับค่าจาก id
        texAddress.setText(getEditT4);

        /*
        //ใช้ SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("boy", Context.MODE_PRIVATE);
        String name =sharedPreferences.getString("name","");
        //textName.setText(name);//โชว์ ชื่อ pawit ใน MainActivity
        */
    }


}
