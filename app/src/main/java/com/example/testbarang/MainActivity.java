package com.example.testbarang;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import com.example.testbarang.R;

public class MainActivity extends AppCompatActivity {
    private Button bTambah;
    private Button bLihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bTambah = (Button) findViewById(R.id.btnTambah);
        bLihat = (Button) findViewById(R.id.btnLihat);

        bTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(TambahData.getActIntent(MainActivity.this));
            }
        });
        bLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

            }
        });

        bLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(LihatBarang.getActIntent(MainActivity.this));
            }
        });


    }
}

