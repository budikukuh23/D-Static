package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class StartUpValve extends AppCompatActivity {

    private CardView backButton, qrButton;
    ImageView gambarKomponen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up_valve);

        gambarKomponen = findViewById(R.id.gambarNew);
        backButton = findViewById(R.id.back);
        qrButton = findViewById(R.id.camBtn);

        String urlGambar = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FStart-up%20valve%20with%20filter%20control%20valve.jpg?alt=media&token=68d1f1c2-b737-46d1-9b46-d04ac9122742";

        Picasso.get().load(urlGambar).into(gambarKomponen);

        backButton.setOnClickListener(v -> onBackPressed());

        qrButton.setOnClickListener(v -> {
            Intent intent;
            intent = new Intent(StartUpValve.this, MenuScannerActivity.class);
            startActivity(intent);
        });

    }
}