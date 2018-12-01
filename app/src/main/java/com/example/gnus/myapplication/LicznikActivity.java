package com.example.gnus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LicznikActivity extends AppCompatActivity {
    private int licznik = 0
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(View View);
        TextView textView = new TextView(this);

        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
// Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(60);
        textView.setText(message);
// Set the text view as the activity layout
        setContentView(textView);
    }
}
