package com.example.boyvi.intactivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String editTex,lname,ID,Address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //onCreate ถูกทำเเค่ครั้งเดียว
/*
        Button button = (Button) findViewById(R.id.button2);
        SharedPreferences sharedPre = getSharedPreferences("boy", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPre.edit();
        editor.putString("name","pawit");
        editor.putInt("sTest",9);
        editor.commit();


        button.setOnClickListener(
                new View.OnClickListener(){
                    public void Onclick(View v){}
                    EditText editTexteName = (EditText) findViewById(R.id.editText);
                    editTex = editTexteName.getText().toString();
                    Intent intent = new Intent(this,Second2Activity.class);
                    intent.putExtra("editText",editTex);
                    startActivity(intent);

                }

        );*/
    }

    public void sendData(View view){ //รับข้อมูลมาจากปุ่ม

        EditText editTexteName = (EditText) findViewById(R.id.editText);
        EditText llname = (EditText) findViewById(R.id.editText2);
        EditText idName = (EditText) findViewById(R.id.editText3);
        EditText addres = (EditText) findViewById(R.id.editText4);
        //สร้างออพเจ็คเพื่อรับข้อมูลจาก editText ใน xml ที่มี R เพราะทุกอย่างมันอยู่ใน class R
        editTex = editTexteName.getText().toString();
        lname = llname.getText().toString();
        ID = idName.getText().toString();
        Address = addres.getText().toString();

        //get ข้อมูลจาก edittext โดยแปลงให้เป็น String .toString()

        Intent intent = new Intent(this,Second2Activity.class);
        intent.putExtra("editText",editTex);
        intent.putExtra("name",lname);
        intent.putExtra("ID",ID);
        intent.putExtra("Address",Address);

        //editText สีเขียวคือ id หรือ fild
        //intent.putExtra("tel","08430180"); //editText สีเขียวคือ id หรือ fild
        //ส่งไปหน้า secondAtivity

        startActivity(intent);

    }
}
