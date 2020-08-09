package com.example.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String msg1 = intent.getStringExtra(FirstActivity.Extra_Message1);
        String msg2 = intent.getStringExtra(FirstActivity.Extra_Message2);

        EditText Text1 = findViewById(R.id.numb1);
        EditText Text2 = findViewById(R.id.numb2);

        Text1.setText(msg1);
        Text2.setText(msg2);

        final TextView textView = findViewById(R.id.textView);

        final double num1 = Double.parseDouble(msg1);
        final double num2 = Double.parseDouble(msg2);

        Button add = findViewById(R.id.button);
        Button sub = findViewById(R.id.button3);
        Button mul = findViewById(R.id.button4);
        Button div = findViewById(R.id.button5);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(num1+" + "+num2+" = "+(num1+num2));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(num1+" - "+num2+" = "+(num1-num2));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(num1+" * "+num2+" = "+(num1*num2));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(num1+" / "+num2+" = "+(num1/num2));

            }
        });

    }


}