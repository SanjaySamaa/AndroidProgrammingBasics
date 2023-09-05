package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText i;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=findViewById(R.id.input);
                String a = i.getText().toString();
                int baseNumber = Integer.parseInt(a);
                for(int i = 0;i<5;i++){
//                    int n = i+1;
                    int mul = baseNumber* (i+1);
                    String result = Integer.toString(mul);
//                textView = findViewById(R.id.textView1);
//                        textView.setText(result.toString());
//                    String id = "textView"+n;
                    if(i==0) {
                        textView = findViewById(R.id.textView1);
                        textView.setText(result.toString());
                    }
                    if(i==1) {
                        textView = findViewById(R.id.textView2);
                        textView.setText(result.toString());
                    }
                    if(i==2) {
                        textView = findViewById(R.id.textView3);
                        textView.setText(result.toString());
                    }
                    if(i==3) {
                        textView = findViewById(R.id.textView4);
                        textView.setText(result.toString());
                    }
                    if(i==4) {
                        textView = findViewById(R.id.textView5);
                        textView.setText(result.toString());
                    }

                }
            }
        });
    }
}