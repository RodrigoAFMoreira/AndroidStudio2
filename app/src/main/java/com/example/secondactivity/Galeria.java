package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;

public class Galeria extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper viewFlipper;
    private Button next;
    private Button last;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        next = (Button) findViewById(R.id.fowardB);
        last = (Button) findViewById(R.id.backwardB);

        next.setOnClickListener(this);
        last.setOnClickListener(this);
    }
            @Override
            public void onClick(View view){
                if (view == next){
                    viewFlipper.showNext();
                }
                else if(view == last){
                    viewFlipper.showPrevious();
            }

    }
}