package com.example.excersise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;






    public class MainActivity extends AppCompatActivity {
        private TextView tv_text;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcomepage);
            String name=getIntent().getStringExtra("Name");
            tv_text=(TextView) findViewById(R.id.tv_text);
            tv_text.setText(("welcome"+name+"!"));







        }
    }

