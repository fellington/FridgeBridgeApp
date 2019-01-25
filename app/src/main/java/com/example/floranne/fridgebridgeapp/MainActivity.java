package com.example.floranne.fridgebridgeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.*;

public class MainActivity extends AppCompatActivity {
    private Button contents;
    private Button history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contents = (Button) findViewById(R.id.FridgeContents);
        history = (Button) findViewById(R.id.FridgeHistory);

        contents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(int2);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this, Activity3.class);
                startActivity(int3);
            }
        });

    }
}
