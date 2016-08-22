package com.a4bit.we.tourmate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateNewEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_event);
    }

    public void openGoogleMap(View view) {

        Intent intent =new Intent(this, SelectPlaceMapsActivity.class);
        startActivity(intent);
    }
}
