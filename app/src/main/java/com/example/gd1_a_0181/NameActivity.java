package com.example.gd1_a_0181;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        // Definisikan view dan connectkan view tersebut ke layoutnya
        TextView tvName = findViewById(R.id.tvName);

        //  Ambil data yang dikirim dari main activity
        String myName = getIntent().getStringExtra("my_name");

        //  Ubah text dari tvName menjadi nama kita
        tvName.setText(myName);
    }
}