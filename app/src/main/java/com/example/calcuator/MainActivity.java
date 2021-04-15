package com.example.calcuator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView res;
    EditText n1,n2;

    int num1,num2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.btnadd);
        b2=findViewById(R.id.btnminus);
        b3=findViewById(R.id.btnmultiply);
        b4=findViewById(R.id.btndivide);

        res=findViewById(R.id.result);

        n1=findViewById(R.id.number1);
        n2=findViewById(R.id.number2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result=num1+num2;

                res.setText(String.valueOf(result));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result=num1-num2;

                res.setText(String.valueOf(result));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result=num1*num2;

                res.setText(String.valueOf(result));

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result=num1/num2;

                res.setText(String.valueOf(result));

            }
        });



    }
}