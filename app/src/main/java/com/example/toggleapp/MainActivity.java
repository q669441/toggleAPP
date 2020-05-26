package com.example.toggleapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private ImageView img_bub_on,img_bub_off;
    private ConstraintLayout constraintLayout;
    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_bub_on = findViewById(R.id.img_bub_on);
        img_bub_off =findViewById(R.id.img_bub_off);
        constraintLayout =findViewById(R.id.layout);
        toggleButton =findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(this);
        constraintLayout.setBackgroundColor(Color.parseColor("#FFFF33"));
        img_bub_off.setVisibility(View.INVISIBLE);


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton , boolean b) {
if(b) {
    constraintLayout.setBackgroundColor(Color.parseColor("Black"));
   img_bub_on.setVisibility(View.INVISIBLE);
    img_bub_off.setVisibility(View.VISIBLE);
}
else {
    constraintLayout.setBackgroundColor(Color.parseColor("Yellow"));
    img_bub_on.setVisibility(View.VISIBLE);
    img_bub_off.setVisibility(View.INVISIBLE);
}
    }
}
