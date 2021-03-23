package com.example.menulogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.constraintlayout.R;


public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edEmail, edPassword;
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menulogin);

        btnLogin=findViewById(R.id.btnLogin);
        edEmail=findViewById(R.id.edEmail);
        edPassword=findViewById(R.id.edPassword);

        String email = "admin@mail.com";
        String pass = "123";
        Bundle b = new Bundle();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = edEmail.getText().toString();
                password = edPassword.getText().toString();

                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: "+nama+" dan Password anda: "+password+"", Toast.LENGTH_LONG);
                t.show();


            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnDaftar) {
            Intent i = new Intent(getApplicationContext(), ActivityKedua.class);
            startActivity(i);

        }
            return super.onOptionsItemSelected(item);

    }
}