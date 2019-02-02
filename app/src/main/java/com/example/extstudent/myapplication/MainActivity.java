/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #1
 * <Otoshi>, <Emily>
 */

package com.example.extstudent.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String firstName;
    private String lastName;

    private TextView firstNameTextView = null;
    private TextView lastNameTextView = null;
    private Button submitButton = null;

    private TextView resultText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set set variables.
        this.firstNameTextView = (TextView)findViewById(R.id.editTextFirstName);
        this.lastNameTextView = (TextView)findViewById(R.id.editText2LastName);
        this.resultText = (TextView)findViewById(R.id.textViewResult);

        this.submitButton = (Button) findViewById(R.id.submitButton);
        this.submitButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("My Submit Button", "onClick pressed");
                setUserInfo();
                showResults();
                Log.d("First Name: ", firstName);
                Log.d("Last Name: ", lastName);
            }
        } );
    }

    private void setUserInfo() {
        if(this.firstNameTextView != null) {
            this.firstName = this.firstNameTextView.getText().toString();
            Log.i("First Name:", firstName);
        }

        if(this.lastNameTextView != null) {
            this.lastName = this.lastNameTextView.getText().toString();
            Log.i("Last Name:", lastName);
        }
    }
    private void showResults(){
        if (this.resultText != null) {
            // Construct the string result first.
            String resultStr = firstName + " " + lastName + ".\n Nice to meet you!";

            // Use the TextView widget to set the string value.
            this.resultText.setText(resultStr);

            // Center the text and resize it.
            this.resultText.setGravity(Gravity.CENTER);
            this.resultText.setTextSize(24f);


        }
    }

    }





