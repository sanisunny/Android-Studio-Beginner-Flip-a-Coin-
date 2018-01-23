package com.example.sunshine.flipacoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView coinView;
    Button flipCoinButton;
    int flipValue;
    Random randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "CLICK TO FLIP THE COIN", Toast.LENGTH_SHORT).show();

        flipCoinButton = (Button) findViewById(R.id.flipButton);
        coinView = (ImageView) findViewById(R.id.imageOfCoin);

        flipCoinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumber = new Random();
                flipValue = randomNumber.nextInt(2);

                if (flipValue == 0){
                    coinView.setImageResource(R.drawable.chead);
                    Toast.makeText(MainActivity.this, "HEADS", Toast.LENGTH_SHORT).show();
                } else if (flipValue == 1){
                    coinView.setImageResource(R.drawable.ctail);
                    Toast.makeText(MainActivity.this, "TAILS", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
