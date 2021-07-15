package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MenuTentangActivity extends AppCompatActivity {

    ImageView imagetentang1, imagetentang2, imagetentang3, myInstagram, myTwitter, myYoutube, myLinkedIn, myGithub;
    CardView backButton;
    String versi = BuildConfig.VERSION_NAME;
    TextView versiaplikasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tentang);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imagetentang1 = findViewById(R.id.imageinfo1);
        imagetentang2 = findViewById(R.id.imageinfo2);
        imagetentang3 = findViewById(R.id.imageinfo3);
        myInstagram = findViewById(R.id.myinstagram);
        myTwitter = findViewById(R.id.mytwitter);
        myYoutube = findViewById(R.id.myyoutube);
        myLinkedIn = findViewById(R.id.mylinkedin);
        myGithub = findViewById(R.id.mygithub);
        backButton = findViewById(R.id.backBtn);
        versiaplikasi = findViewById(R.id.versiapk);

        String urlimage1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Ficonnew.png?alt=media&token=4e2b213b-21bc-4871-831a-9eedc2d0c56f";
        String urlimage2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fpersonal_growth_100px.png?alt=media&token=181e4745-1c59-4e21-8a13-8ccc06baf5a2";
        String urlimage3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Feasy_100px.png?alt=media&token=59e3a16e-0ce6-42d2-bbd6-3f20d9fde180";

        Picasso.get().load(urlimage1).into(imagetentang1);
        Picasso.get().load(urlimage2).into(imagetentang2);
        Picasso.get().load(urlimage3).into(imagetentang3);
        versiaplikasi.setText(versi);

        myInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/budi_kukuh23/");
            }
        });
        myTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://twitter.com/BudiKukuh10");
            }
        });
        myYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/channel/UCl0Bwg1AcCA2t0jL07B8gQQ");
            }
        });
        myLinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/budikukuh/");
            }
        });
        myGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/budikukuh23");
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}