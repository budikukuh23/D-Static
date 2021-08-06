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

    ImageView imagetentang2, imagetentang3, googlePlay;
    CardView backButton, shareApp;
    TextView versiaplikasi, developer, dosBing;
    String versi = BuildConfig.VERSION_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tentang);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imagetentang2 = findViewById(R.id.imageinfo2);
        imagetentang3 = findViewById(R.id.imageinfo3);
        googlePlay = findViewById(R.id.downGp);
        backButton = findViewById(R.id.backBtn);
        shareApp = findViewById(R.id.share);
        versiaplikasi = findViewById(R.id.versiapk);
        developer = findViewById(R.id.dev);
        dosBing = findViewById(R.id.dosbing);

        String urlimage2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fpersonal_growth_100px.png?alt=media&token=181e4745-1c59-4e21-8a13-8ccc06baf5a2";
        String urlimage3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Feasy_100px.png?alt=media&token=59e3a16e-0ce6-42d2-bbd6-3f20d9fde180";
        String urlGp = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Frev%2Fgoogleplay.png?alt=media&token=6acc4dc6-38a6-42a5-b29c-7c3d7c37631d";
        String urlApp = "https://play.google.com/store/apps/details?id=com.dstatic.mythesis";

        Picasso.get().load(urlimage2).into(imagetentang2);
        Picasso.get().load(urlimage3).into(imagetentang3);
        Picasso.get().load(urlGp).into(googlePlay);
        versiaplikasi.setText(versi);

        developer.setOnClickListener(v -> {
            Intent intent = new Intent(MenuTentangActivity.this, Pengembang.class);
            startActivity(intent);
        });
        dosBing.setOnClickListener(v -> {
            Intent intent = new Intent(MenuTentangActivity.this, Pembimbing.class);
            startActivity(intent);
        });
        googlePlay.setOnClickListener(v -> gotoUrl(urlApp));
        shareApp.setOnClickListener(v -> {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "D-Static");
            String sharePesan = "\nSaya merekomendasikan aplikasi ini untuk Anda\n\n";
            sharePesan = sharePesan + "D-Static App\n" + urlApp + "\n\n" + "D-Static merupakan " +
                    "aplikasi pengenalan komponen pada Distributing Station berbantuan " +
                    "QR-Code";
            shareIntent.putExtra(Intent.EXTRA_TEXT, sharePesan);
            startActivity(Intent.createChooser(shareIntent, "Bagikan via"));
        });
        backButton.setOnClickListener(v -> onBackPressed());

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}