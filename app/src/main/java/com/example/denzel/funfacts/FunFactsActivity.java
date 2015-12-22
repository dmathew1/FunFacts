package com.example.denzel.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    //Declare a new FactBook object to get facts from
    private FactBook mFactBook = new FactBook();
    //Declare a new ColorWheel object to get colors from
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare the view variables and initialize them to the view we want
        //Initializes the fact
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout showBackground = (RelativeLayout) findViewById(R.id.relativeLayout);

        //The function the button should execute when it is clicked
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the fact from the FactBook
                String Fact = mFactBook.getFact();
                factLabel.setText(Fact);

                //Change the Color of the background with every click
                int Color = mColorWheel.getColor();
                showBackground.setBackgroundColor(Color);

                //Changes the color of the button text to match with the background
                showButton.setTextColor(Color);

            }
        };

        showButton.setOnClickListener(listener);

    }
}
