package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Pengembang extends AppCompatActivity {

    ImageView fotProf, myInstagram, myTwitter, myYoutube, myLinkedIn, myGithub;
    CardView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengembang);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        fotProf = findViewById(R.id.pengembang);
        myInstagram = findViewById(R.id.myinstagram);
        myTwitter = findViewById(R.id.mytwitter);
        myYoutube = findViewById(R.id.myyoutube);
        myLinkedIn = findViewById(R.id.mylinkedin);
        myGithub = findViewById(R.id.mygithub);
        backButton = findViewById(R.id.backBtn);

        String urlFot = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Frev%2FProfil%20Skillbuilds.jpg?alt=media&token=fde9c174-f53c-4709-ae24-ab7fee849bb9";
        Picasso.get().load(urlFot).into(fotProf);

        myInstagram.setOnClickListener(v -> gotoUrl("https://www.instagram.com/budi_kukuh23/"));
        myTwitter.setOnClickListener(v -> gotoUrl("https://twitter.com/BudiKukuh10"));
        myYoutube.setOnClickListener(v -> gotoUrl("https://www.youtube.com/channel/UCl0Bwg1AcCA2t0jL07B8gQQ"));
        myLinkedIn.setOnClickListener(v -> gotoUrl("https://www.linkedin.com/in/budikukuh/"));
        myGithub.setOnClickListener(v -> gotoUrl("https://github.com/budikukuh23"));
        backButton.setOnClickListener(v -> onBackPressed());

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}