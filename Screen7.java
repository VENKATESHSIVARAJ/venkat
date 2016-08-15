package com.example.venkateshsivaraj.mindtrick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Screen7 extends AppCompatActivity {

    Button next;
    EditText val;
    String value;
    public static int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);
        next = (Button) findViewById(R.id.button);
        val = (EditText)this.findViewById(R.id.editText);

        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Class ourClass = null;
                value = val.getText().toString();
                i = Integer.parseInt(value);
                try {
                    ourClass = Class.forName("com.example.venkateshsivaraj.mindtrick.Screen8");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent ourIntent = new Intent(Screen7.this,ourClass);
                startActivity(ourIntent);

            }
        });
    }
}
