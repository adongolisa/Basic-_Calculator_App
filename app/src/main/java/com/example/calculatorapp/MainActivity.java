package com.example.calculatorapp;


import androidx.appcompat.app.AppCompatActivity; // Importing the AppCompatActivity class
import android.os.Bundle; // Importing the Bundle class
import android.view.View; // Importing the View class
import android.widget.Button; // Importing the Button class
import android.widget.EditText; // Importing the EditText class
import android.widget.TextView; // Importing the TextView class

 public class MainActivity extends AppCompatActivity { // Defining the MainActivity class and extending AppCompatActivity

     EditText et1, et2; // Declaring EditText variables et1 and et2
     TextView t1, result; // Declaring TextView variables t1 and result
     Button b1, b2, b3, b4; // Declaring Button variables b1, b2, b3, and b4

     @Override
     protected void onCreate(Bundle savedInstanceState) { // onCreate method, called when the activity is created
                 super.onCreate(savedInstanceState); // Call the superclass's onCreate method
                 setContentView(R.layout.activity_main); // Set the layout for this activity
                 et1 = findViewById(R.id.firstVal); // Initialize et1 with the EditText from the layout
                 et2 = findViewById(R.id.secondVal); // Initialize et2 with the EditText from the layout
                 b1 = findViewById(R.id.add); // Initialize b1 with the Button from the layout
                 b2 = findViewById(R.id.sub); // Initialize b2 with the Button from the layout
                 b3 = findViewById(R.id.div); // Initialize b3 with the Button from the layout
                 b4 = findViewById(R.id.times); // Initialize b4 with the Button from the layout
                 result = findViewById(R.id.result); // Initialize result with the TextView from the layout
             }

     public void add(View view) { // Method to handle addition
                 String firstVal = et1.getText().toString(); // Get the text from et1
                 String secondVal = et2.getText().toString(); // Get the text from et2
                 double x = Double.parseDouble(firstVal); // Convert the first value to a double
                 double y = Double.parseDouble(secondVal); // Convert the second value to a double
                 result.setText("" + (x + y)); // Set the result TextView to the sum of x and y
             }

     public void sub(View view) { // Method to handle subtraction
                 String firstVal = et1.getText().toString(); // Get the text from et1
                 String secondVal = et2.getText().toString(); // Get the text from et2
                 double x = Double.parseDouble(firstVal); // Convert the first value to a double
                 double y = Double.parseDouble(secondVal); // Convert the second value to a double
                 result.setText("" + (x - y)); // Set the result TextView to the difference of x and y
             }

     public void div(View view) { // Method to handle division
                 String firstVal = et1.getText().toString(); // Get the text from et1
                 String secondVal = et2.getText().toString(); // Get the text from et2
                 double x = Double.parseDouble(firstVal); // Convert the first value to a double
                 double y = Double.parseDouble(secondVal); // Convert the second value to a double
                 result.setText("" + (x / y)); // Set the result TextView to the division of x by y
             }
    public void times(View view) { // Method to handle multiplication
                 String firstVal = et1.getText().toString(); // Get the text from et1
                 String secondVal = et2.getText().toString(); // Get the text from et2
                 double x = Double.parseDouble(firstVal); // Convert the first value to a double
                 double y = Double.parseDouble(secondVal); // Convert the second value to a double
                 result.setText("" + (x * y)); // Set the result TextView to the product of x and y
             }

     public void reset(View view) { // Method to reset the EditText fields
                 String firstVal = et1.getText().toString(); // Get the text from et1
                 String secondVal = et2.getText().toString(); // Get the text from et2
                 et1.setText(null); // Set et1 text to null (clear)
                 et2.setText(null); // Set et2 text to null (clear)
             }
 }
