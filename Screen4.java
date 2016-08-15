package com.example.venkateshsivaraj.mindtrick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen4 extends AppCompatActivity {

    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Class ourClass = null;
                try {
                    ourClass = Class.forName("com.example.venkateshsivaraj.mindtrick.Screen5");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent ourIntent = new Intent(Screen4.this,ourClass);
                startActivity(ourIntent);

            }
        });
    }
}
