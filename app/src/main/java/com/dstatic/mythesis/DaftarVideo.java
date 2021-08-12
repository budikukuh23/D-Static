package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DaftarVideo extends AppCompatActivity implements View.OnClickListener {

    private CardView backbutton, cVid1, cVid2, cVid3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_video);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView imVid1 = findViewById(R.id.gVid1);
        ImageView imVid2 = findViewById(R.id.gVid2);
        ImageView imVid3 = findViewById(R.id.gVid3);

        String urlIm1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fthumbnail1.jpg?alt=media&token=74c700e1-09e3-468e-938f-d02cbedb3ef4";
        String urlIm2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fthumbnail2.jpg?alt=media&token=b3f5510e-ac4d-4bcb-90df-110579ee0ccb";
        String urlIm3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fthumbnail3.jpg?alt=media&token=aea2e038-b5f1-4bc3-8549-f60cf18a61eb";

        Picasso.get().load(urlIm1).into(imVid1);
        Picasso.get().load(urlIm2).into(imVid2);
        Picasso.get().load(urlIm3).into(imVid3);

        cVid1 = findViewById(R.id.vid1);
        cVid2 = findViewById(R.id.vid2);
        cVid3 = findViewById(R.id.vid3);
        backbutton = findViewById(R.id.backBtn);

        cVid1.setOnClickListener(this);
        cVid2.setOnClickListener(this);
        cVid3.setOnClickListener(this);
        backbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.vid1:
                i = new Intent(this, MenuVideoActivity.class);
                startActivity(i);
                break;
            case R.id.vid2:
                i = new Intent(this, VideoAnimasiFms.class);
                startActivity(i);
                break;
            case R.id.vid3:
                i = new Intent(this, MenuFmsActivity.class);
                startActivity(i);
                break;
            case R.id.backBtn:
                onBackPressed();
                break;
            default:
                break;
        }
    }
}