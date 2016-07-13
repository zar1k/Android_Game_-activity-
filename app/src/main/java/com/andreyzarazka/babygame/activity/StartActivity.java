package com.andreyzarazka.babygame.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.andreyzarazka.babygame.R;
import com.purplebrain.adbuddiz.sdk.AdBuddiz;

public class StartActivity extends Activity {

    private ImageButton carImageButton;
    private ImageButton shapeImageButton;
    private ImageButton animalsImageButton;
    private ImageButton colorImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Показ рекламмы
        AdBuddiz.isReadyToShowAd(this);
        AdBuddiz.showAd(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        carImageButton = (ImageButton) findViewById(R.id.car_button);
        carImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,
                        CarActivity.class);
                startActivity(intent);
            }
        });

        shapeImageButton = (ImageButton) findViewById(R.id.form_button);
        shapeImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,
                        ShapeActivity.class);
                startActivity(intent);
            }
        });

        animalsImageButton = (ImageButton) findViewById(R.id.enimals_button);
        animalsImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,
                        AnimalsActivity.class);
                startActivity(intent);
            }
        });

        colorImageButton = (ImageButton) findViewById(R.id.color_button);
        colorImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,
                        ColorActivity.class);
                startActivity(intent);
            }
        });
    }
}
