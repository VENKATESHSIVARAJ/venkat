package com.example.venkateshsivaraj.mindtrick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Screen8 extends AppCompatActivity {

    Button next;
    TextView display;
    int val1;
    int val2;
    Screen7 obj = new Screen7();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen8);
        next = (Button) findViewById(R.id.button);
        display = (TextView) findViewById(R.id.textView2);

        val1 = obj.i;
        val1 = val1 - 25;
        val2 = val1 % 10;
        val1 = (val1 - val2)/10;
        display.setText("The first number is " +val1+"\nThe second number is "+val2);


        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Class ourClass = null;
                try {
                    ourClass = Class.forName("com.example.venkateshsivaraj.mindtrick.Screen1");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent ourIntent = new Intent(Screen8.this,ourClass);
                startActivity(ourIntent);

            }
        });
    }
}
