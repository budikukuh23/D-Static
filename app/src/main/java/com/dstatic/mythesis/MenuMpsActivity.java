package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MenuMpsActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView backbutton, videobutton1, videobutton2;
    private TextView videoTeks1, videoTeks2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mps);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView imageView1 = findViewById(R.id.imageMps1);
        ImageView imageView2 = findViewById(R.id.imageMps2);
        ImageView videoView3 = findViewById(R.id.imagevideo1);
        ImageView videoView4 = findViewById(R.id.imagevideo2);

        String urlimage1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fimage1.JPG?alt=media&token=33176062-a9d7-4db4-8093-79d3134aaeaf";
        String urlimage2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fimage2.JPG?alt=media&token=90b7bdfc-97a1-470e-bae9-092d70fcf260";
        String urlvideo3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fvideo1.PNG?alt=media&token=14b5c346-57cd-470e-aae3-44de8dc44a48";
        String urlvideo4 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fvideo2.jpg?alt=media&token=9dbbbfa2-fe55-4d8d-9bf5-bb62dc65ccb1";

        Picasso.get().load(urlimage1).into(imageView1);
        Picasso.get().load(urlimage2).into(imageView2);
        Picasso.get().load(urlvideo3).into(videoView3);
        Picasso.get().load(urlvideo4).into(videoView4);

        backbutton = findViewById(R.id.backBtn);
        videobutton1 = findViewById(R.id.videoMps1);
        videobutton2 = findViewById(R.id.videoMps2);
        videoTeks1 = findViewById(R.id.teksVideo1);
        videoTeks2 = findViewById(R.id.teksVideo2);

        backbutton.setOnClickListener(this);
        videobutton1.setOnClickListener(this);
        videobutton2.setOnClickListener(this);
        videoTeks1.setOnClickListener(this);
        videoTeks2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.backBtn: onBackPressed(); break;
            case R.id.videoMps1: i = new Intent(this,MenuFmsActivity.class); startActivity(i); break;
            case R.id.videoMps2: i = new Intent(this,VideoAnimasiFms.class); startActivity(i); break;
            case R.id.teksVideo1: i = new Intent(this,MenuFmsActivity.class); startActivity(i); break;
            case R.id.teksVideo2: i = new Intent(this,VideoAnimasiFms.class); startActivity(i); break;
            default:break;
        }
    }
}