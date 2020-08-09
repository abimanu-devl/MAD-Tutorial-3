package com.example.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    public static final String Extra_Message1 = "com.example.IntentsProject";
    public static final String Extra_Message2 = "com.example.IntentsProject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void sendMessage(View view){

        Intent intent =new Intent(FirstActivity.this,SecondActivity.class);

        EditText text1 = findViewById(R.id.numb1);
        EditText text2 = findViewById(R.id.numb2);

        String message1 = text1.getText().toString();
        String message2 = text2.getText().toString();

        intent.putExtra(Extra_Message1,message1);
        intent.putExtra(Extra_Message2,message2);

        startActivity(intent);

        Context context = getApplicationContext();

        CharSequence message = "You just clicked the OK button";

        int duration = Toast.LENGTH_SHORT; //How long the toast

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP| Gravity.LEFT, 300, 2000);




    }
}