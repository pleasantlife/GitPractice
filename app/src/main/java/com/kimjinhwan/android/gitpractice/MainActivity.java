package com.kimjinhwan.android.gitpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = new Button(this);
        Button b = new Button(this);
        Button c = new Button(this);
        Button d = new Button(this);
        Button e = new Button(this);
        Button f = new Button(this);
    }
}
