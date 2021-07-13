package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Cinterface extends AppCompatActivity {

    private CardView backButton, qrButton;
    ImageView gambarKomponen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinterface);

        gambarKomponen = findViewById(R.id.gambarNew);
        backButton = findViewById(R.id.back);
        qrButton = findViewById(R.id.camBtn);

        String urlGambar = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FC%20interface.jpg?alt=media&token=9e2e16c8-d274-45b7-831e-936bac780c59";

        Picasso.get().load(urlGambar).into(gambarKomponen);

        backButton.setOnClickListener(v -> onBackPressed());

        qrButton.setOnClickListener(v -> {
            Intent intent;
            intent = new Intent(Cinterface.this, MenuScannerActivity.class);
            startActivity(intent);
        });

    }
}