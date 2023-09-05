package com.example.namepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText tx;
    public static final String Extra_Name = "com.example.namepassing.extra_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view);
            }
        });
    }
    public void openActivity(View v){
        Toast.makeText(MainActivity.this, "opening new activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        tx = findViewById(R.id.name);
        String name = tx.getText().toString();
        intent.putExtra(Extra_Name,name);
        startActivity(intent);
    }
}