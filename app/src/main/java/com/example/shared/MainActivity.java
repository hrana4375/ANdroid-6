package com.example.shared;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,password,contact;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        contact = findViewById(R.id.contact);
        signup = findViewById(R.id.button);


        final SharedPreferences sharedPreferences = getSharedPreferences("MY_FILE",0);

        final SharedPreferences.Editor editor = sharedPreferences.edit();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("Name",name.getText().toString());
                editor.putString("Password",password.getText().toString());
                editor.putString("Email",email.getText().toString());
                editor.putString("Contact",contact.getText().toString());
                editor.commit();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                startActivity(intent);
            }
        });

    }
}
