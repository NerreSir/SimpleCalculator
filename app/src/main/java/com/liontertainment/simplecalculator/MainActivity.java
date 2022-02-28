package com.liontertainment.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1text;
    EditText number2text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1text = findViewById(R.id.number1Text);
        number2text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }


    public void sum(View view) {
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")) {
            resultText.setText("Enter number bro: ");
        } else {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 + number2;
            resultText.setText("Result: " + result);
        }
    }

    public void sub(View view) {
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")) {
            resultText.setText("Enter number bro: ");
        } else {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view) {

        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")) {
            resultText.setText("Enter number bro: ");
        } else {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }
    }

    public void divide(View view) {
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches("")) {
            resultText.setText("Enter number bro: ");
        } else {
            int number1 = Integer.parseInt(number1text.getText().toString());
            int number2 = Integer.parseInt(number2text.getText().toString());

            int result = number1 / number2;
            resultText.setText("Result: " + result);
        }
    }



}