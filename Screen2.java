package com.example.venkateshsivaraj.mindtrick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2 extends AppCompatActivity {

    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Class ourClass = null;
                try {
                    ourClass = Class.forName("com.example.venkateshsivaraj.mindtrick.Screen3");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent ourIntent = new Intent(Screen2.this,ourClass);
                startActivity(ourIntent);

            }
        });
    }
}
