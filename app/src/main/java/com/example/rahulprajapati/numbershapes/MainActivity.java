package com.example.rahulprajapati.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import static java.lang.Math.max;
import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.et);
    }

    public void Check(View view) {

        int value = Integer.parseInt(editText.getText().toString());
        Double value1 = Math.sqrt(value);
        int value2 = value1.intValue();
        Double value3 = pow(value2,2);
        int value4 = value*2; //for triangular shape
        Double value5 = Math.sqrt(value4); //for triangular shape
        int value6 = value5.intValue(); //for triangular shape
        int value7 = (value6*value6 + value6)/2;
        if(value3 == value){
            Toast.makeText(this,value + "is Square shape But not Trianguler shape",Toast.LENGTH_LONG).show();
        }else if(value7 == value)
        {
            Toast.makeText(this,value + "is Trianguler  shape But not Square shape",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,value + "is not Square or Triangular shape",Toast.LENGTH_LONG).show();
        }





    }


}
