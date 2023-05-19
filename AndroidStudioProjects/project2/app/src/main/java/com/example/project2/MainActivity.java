package com.example.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private TextView tv_text;
    private EditText et_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        et_name=(EditText) findViewById(R.id.et_name);
        tv_text=(TextView) findViewById(R.id.tv_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=et_name.getText().toString();
                if(name.length()>0){
                    tv_text.setText("Hello" +name+ "GVP welcomes you to two days hands on workshop on android app development" );
                }else {
                    Toast Toast1= Toast.makeText(getApplicationContext(),"name cannot be empty",Toast.LENGTH_SHORT);
                    Toast1.show();
                }
            }
        });

    }
}