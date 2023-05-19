package com.example.toast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends

{
    private Button Toast1,Toast2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast1=findViewById(R.id.TOAST_BUTTON);
        Toast2=findViewById(R.id.intent_button);
        Toast2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent  Toast2= new Intent(getApplicationContext(),RachanaSri.class);
                startActivity(Toast2);
            }
        });

        Toast1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                Toast Toast1= Toast.makeText(getApplicationContext(),"srijarachana",Toast.LENGTH_SHORT);
                Toast1.show();
            }
        });

    }
}