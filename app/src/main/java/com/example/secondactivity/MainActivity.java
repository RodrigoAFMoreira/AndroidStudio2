package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private Button login;
    private Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.usernameTV);
        password = (EditText)findViewById(R.id.passwordTV);
        login = (Button)findViewById(R.id.loginB);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                validate(name.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String userName,String userPassword){
        if((userName == "admin") && (userPassword == "admin")){
            Intent intent = new Intent(MainActivity.this, Galeria.class);
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this,"valores incorretos", Toast.LENGTH_SHORT).show();
        }
    }
}