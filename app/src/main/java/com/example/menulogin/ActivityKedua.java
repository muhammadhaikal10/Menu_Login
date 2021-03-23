package com.example.menulogin;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.constraintlayout.R;

public class ActivityKedua extends AppCompatActivity {
    TextView textView;
    String Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = (TextView) findViewById(R.id.textView1);
        Bundle b2 = this.getIntent().getExtras();
        Email = b2.getString("Parameter");

        textView.setText("Selamat Datang" + Email);
    }
}