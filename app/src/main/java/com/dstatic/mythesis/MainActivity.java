package com.dstatic.mythesis;

import androidx.appcompat.app.AlertDialog;
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
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView daftarbtn, scanbtn, videobtn, fmsbtn, tentangbtn, keluarbtn, downloadFile;
    TextView versiAplikasi;
    ImageView logoAplikasi;
    String versi = BuildConfig.VERSION_NAME;

    private String[] mImages = new String[] {
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fslider1.png?alt=media&token=973d4934-eb30-4ce5-8029-a4ef3a8221ff",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fslider2.png?alt=media&token=6de1cb12-704e-410c-aac5-e8a256ef21ea",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fslider3.png?alt=media&token=5424baa5-db95-4b81-a4bc-89aec3293769",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fslider4.png?alt=media&token=22920faa-7a14-414e-8af2-59df673ce538",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fslider5.png?alt=media&token=507de6cd-1b4b-4450-bf58-bf52bcd51f2d",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fslider6.png?alt=media&token=1e6bff4c-86dc-4b6c-a3b0-3b9a130592a4",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fslider7.png?alt=media&token=1e5869ae-8f9f-4b9f-9b84-13aec057db49"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logoAplikasi = findViewById(R.id.iconApk);
        versiAplikasi = findViewById(R.id.versiApk2);
        CarouselView carouselView = findViewById(R.id.carousel1);
        carouselView.setPageCount(mImages.length);

        String urlimage = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Ficonnew.png?alt=media&token=4e2b213b-21bc-4871-831a-9eedc2d0c56f";

        Picasso.get().load(urlimage).into(logoAplikasi);
        versiAplikasi.setText(versi);

        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                Picasso.get().load(mImages[position]).into(imageView);
            }
        });

        daftarbtn = findViewById(R.id.daftar_btn);
        scanbtn = findViewById(R.id.scan_btn);
        videobtn = findViewById(R.id.video_btn);
        fmsbtn = findViewById(R.id.fms_btn);
        tentangbtn = findViewById(R.id.tentang_btn);
        keluarbtn = findViewById(R.id.keluar_btn);
        downloadFile = findViewById(R.id.downloadFile);

        daftarbtn.setOnClickListener(this);
        scanbtn.setOnClickListener(this);
        videobtn.setOnClickListener(this);
        fmsbtn.setOnClickListener(this);
        tentangbtn.setOnClickListener(this);

        keluarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        downloadFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1sCzXBMSkPtROwEkupl23jnXEcwEzHSzo?usp=sharing");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.daftar_btn : i = new Intent(this,MenuDaftarActivity.class); startActivity(i); break;
            case R.id.video_btn: i = new Intent(this,MenuVideoActivity.class); startActivity(i); break;
            case R.id.scan_btn: i = new Intent(this,MenuScannerActivity.class); startActivity(i); break;
            case R.id.fms_btn: i = new Intent(this,MenuMpsActivity.class); startActivity(i); break;
            case R.id.tentang_btn: i = new Intent(this,MenuTentangActivity.class); startActivity(i); break;
            default: break;

        }
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage("Apakah anda ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", (dialog, which) -> {
                    MainActivity.this.finish();
                    System.exit(0);
                })
                .setNegativeButton("Tidak", (dialog, which) -> dialog.cancel())
                .show();
    }
}