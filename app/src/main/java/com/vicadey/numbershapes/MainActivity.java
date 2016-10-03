package com.vicadey.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

import static com.vicadey.numbershapes.MainActivity.NumberShapes.*;

public class MainActivity extends AppCompatActivity {

    public class NumberShapes {

        void numberShapes() {

            EditText userInput = (EditText) findViewById(R.id.userInput);
            String text = userInput.getText().toString();
            String message = "";

            try {
                int num = Integer.parseInt(text);
                int x = 0;
                int counter = 1;

                while (x < num) {
                    x = x + counter;
                    counter++;
                }

                double temp = Math.sqrt((double) num);
                int newTemp = (int) temp;
                int holder = newTemp * newTemp;

                if (x == num && holder != num) {
                    message = " is a triangle number.";
                } else if (x != num && holder == num) {
                    message = " is a square number.";
                } else if (x == num && holder == num) {
                    message = " is both a square and a triangle number.";
                } else {
                    message = " is neither a square nor a triangle number.";

                }
                Toast.makeText(getApplicationContext(), num + message, Toast.LENGTH_SHORT).show();


            } catch (NumberFormatException e) {
                Toast.makeText(getApplicationContext(), "Sorry " + text + " is not a number! Please try again!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void buttonClicked(View view) {

        NumberShapes buttonClicked = new NumberShapes();

        buttonClicked.numberShapes();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
