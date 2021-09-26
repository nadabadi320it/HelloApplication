package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    Button button1;
    TextView textViewName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName=(EditText)findViewById(R.id.editTextName);
        button1=(Button) findViewById(R.id.button1);
        textViewName=(TextView) findViewById(R.id.textViewName);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= editTextName.getText().toString();
                textViewName.setText("Hello,"+name);
            }
        });

    }
}