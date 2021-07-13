package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class StackingMagazineModule extends AppCompatActivity {

    private CardView backButton, qrButton;
    ImageView gambarKomponen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stacking_magazine_module);

        gambarKomponen = findViewById(R.id.gambarNew);
        backButton = findViewById(R.id.back);
        qrButton = findViewById(R.id.camBtn);

        String urlGambar = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FStacking%20magazine%20module.jpg?alt=media&token=5e418570-ad6c-4cea-9b37-b5cb2696638f";

        Picasso.get().load(urlGambar).into(gambarKomponen);

        backButton.setOnClickListener(v -> onBackPressed());

        qrButton.setOnClickListener(v -> {
            Intent intent;
            intent = new Intent(StackingMagazineModule.this, MenuScannerActivity.class);
            startActivity(intent);
        });

    }
}