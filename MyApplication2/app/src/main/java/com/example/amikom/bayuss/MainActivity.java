package com.example.amikom.bayuss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button btnTest;

    public void wedus(View view) {
        Toast.makeText(MainActivity.this, "Wedus", Toast.LENGTH_SHORT).show();
    }
}
