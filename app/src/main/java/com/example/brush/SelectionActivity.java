package com.example.brush;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity {


    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        TextView user_name = (TextView) findViewById(R.id.selection_username);

        Bundle extras = getIntent().getExtras();
        String username = extras.getString("username");

        user_name.setText(username);
         //get the rest of the extras
        //String username_string = extras.getString("EXTRA_USERNAME");
        //String username_string = extras.getString("EXTRA_USERNAME");
        //String username_string = extras.getString("EXTRA_USERNAME");
        //String username_string = extras.getString("EXTRA_USERNAME");
        //String username_string = extras.getString("EXTRA_USERNAME");
        //String username_string = extras.getString("EXTRA_USERNAME");
    }
}
