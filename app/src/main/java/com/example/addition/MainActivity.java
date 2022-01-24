package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1,editTextNumber2;
    private TextView textView;
    private Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
    }

    private void addListnerOnButton() {
        editTextNumber1=(EditText)findViewById(R.id.editTextNumber1);
        editTextNumber2=(EditText) findViewById(R.id.editTextNumber2);
        textView=findViewById(R.id.textView);
        Add=(Button) findViewById(R.id.Button);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Value1=editTextNumber1.getText().toString();
                String Value2=editTextNumber2.getText().toString();

                int a=Integer.parseInt(Value1);
                int b=Integer.parseInt(Value2);

                int sum=a+b;
                textView.setText("The Addition is :"+sum);
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();
            }
        });
    }
}