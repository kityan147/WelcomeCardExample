package com.example.kit.welcomecardexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView tv = (TextView)findViewById(R.id.tv);
        //tv.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
