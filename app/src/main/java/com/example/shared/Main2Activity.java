package com.example.shared;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView name,email,password,contact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        contact = findViewById(R.id.contact);


        SharedPreferences sharedPreferences = getSharedPreferences("MY_FILE",0);

        name.setText(sharedPreferences.getString("Name",""));

        email.setText(sharedPreferences.getString("Email",""));

        password.setText(sharedPreferences.getString("Password",""));

        contact.setText(sharedPreferences.getString("Contact",""));




    }
}
