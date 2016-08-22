package com.a4bit.we.tourmate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToCreateNewEventActivityMainActivityBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToCreateNewEventActivityMainActivityBTN = (Button) findViewById(R.id.goToCreateNewEventActivityViewBTN);
    }

    public void goToCreateNewEventActivity(View view) {

        Intent intent =new Intent(this, CreateNewEventActivity.class);
        startActivity(intent);
    }
}
