package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an Image View to link to the Layout
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        // Create an array containing the ball images
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // Create a button and link it to the button in the layout
        Button myButton = findViewById(R.id.AskButton);

        // Create a Listener for the button that generates a random number
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Create a random number using the randomNumberGenerator's nextInt() method
                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}

