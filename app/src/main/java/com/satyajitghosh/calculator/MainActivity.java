package com.satyajitghosh.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button n9;
    private Button n8;
    private Button n7;
    private Button n6;
    private Button n5;
    private Button n4;
    private Button n3;
    private Button n2;
    private Button n1;
    private Button n0;
    private Button C;
    private Button Result;
    private Button mul;
    private Button sub;
    private Button add;
    private Button div;
    private TextView newView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n9=findViewById(R.id.n9);
        n8=findViewById(R.id.n8);
        n7=findViewById(R.id.n7);
        n6=findViewById(R.id.n6);
        n5=findViewById(R.id.n5);
        n4=findViewById(R.id.n4);
        n3=findViewById(R.id.n3);
        n2=findViewById(R.id.n2);
        n1=findViewById(R.id.n1);
        n0=findViewById(R.id.n0);
        newView=findViewById(R.id.textView);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        C=findViewById(R.id.Clear);
        Result=findViewById(R.id.calculate);


        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newView.setText("9");
            }
        });










        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });
    }
}