package com.justinross.highestmountain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button showMeButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMeButton = (Button) findViewById(R.id.buttonId);
        showTextView = (TextView) findViewById(R.id.textViewId);

        final String[] mountains = {"Everest", "Killimonjaro", "Makulu", "Kabet", "Trivor", "Ultar", "Mana"};

        showMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randomNum = rand.nextInt(mountains.length);

                showTextView.setText(mountains[randomNum]);
                Toast.makeText(MainActivity.this, "There ya go!", Toast.LENGTH_SHORT).show();
                //Toast with butter, YUM!
                //TODO: Make the array into a hash map, make it a tiny bit more complex
                //TODO: Like a BOSS

            }
        });
    }
}
