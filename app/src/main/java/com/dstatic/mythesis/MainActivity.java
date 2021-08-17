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
    TextView versiAplikasi, mPengembang, mPembimbing;
    ImageView logoAplikasi, downloadGP;
    String versi = BuildConfig.VERSION_NAME;

    private String[] mImages = new String[] {
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider1.jpg?alt=media&token=cafca49d-6c58-4c77-916a-10b68287e3c1",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider2.jpg?alt=media&token=a517af65-c8bd-4860-b884-195984a69d7d",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider3.jpg?alt=media&token=1ca4e378-7319-48dd-bf28-955c25cd7519",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider4.jpg?alt=media&token=5273bead-9e4e-440c-8230-beb31ae27941",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider5.jpg?alt=media&token=51478d4a-d6ed-4508-8eaf-73d167ad76dd",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider6.jpg?alt=media&token=aca83bf4-b25e-456a-8ca0-268e3800765e",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider7.jpg?alt=media&token=2f341135-ba9b-4b9a-b71b-b76d3300feda",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider8.jpg?alt=media&token=a65168a5-2f98-4d1e-8fa2-1ef69113f123",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider9.jpg?alt=media&token=f9609a9e-83bd-4616-8047-caab33486837",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider10.jpg?alt=media&token=3e41f648-147e-4d9a-b895-1409a996a216",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider11.jpg?alt=media&token=d29cffd3-ff26-4b10-b9c9-127c6e7b6e3c",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2Fslider12.jpg?alt=media&token=90ddee9e-74de-4e5f-bfc8-e70135f8166d"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logoAplikasi = findViewById(R.id.iconApk);
        versiAplikasi = findViewById(R.id.versiApk2);
        downloadGP = findViewById(R.id.downGp);
        CarouselView carouselView = findViewById(R.id.carousel1);
        carouselView.setPageCount(mImages.length);

        String urlimage = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Ficonnew.png?alt=media&token=4e2b213b-21bc-4871-831a-9eedc2d0c56f";
        String urlGp = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Frev%2Fgoogleplay.png?alt=media&token=6acc4dc6-38a6-42a5-b29c-7c3d7c37631d";

        Picasso.get().load(urlimage).into(logoAplikasi);
        Picasso.get().load(urlGp).into(downloadGP);
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
        mPengembang = findViewById(R.id.mPeng);
        mPembimbing = findViewById(R.id.mPemb);

        daftarbtn.setOnClickListener(this);
        scanbtn.setOnClickListener(this);
        videobtn.setOnClickListener(this);
        fmsbtn.setOnClickListener(this);
        tentangbtn.setOnClickListener(this);
        mPengembang.setOnClickListener(this);
        mPembimbing.setOnClickListener(this);

        keluarbtn.setOnClickListener(v -> onBackPressed());

        downloadFile.setOnClickListener(v -> gotoUrl("https://drive.google.com/drive/folders/1sCzXBMSkPtROwEkupl23jnXEcwEzHSzo?usp=sharing"));

        downloadGP.setOnClickListener(v -> gotoUrl("https://play.google.com/store/apps/details?id=com.dstatic.mythesis"));
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
            case R.id.video_btn: i = new Intent(this,DaftarVideo.class); startActivity(i); break;
            case R.id.scan_btn: i = new Intent(this,MenuScannerActivity.class); startActivity(i); break;
            case R.id.fms_btn: i = new Intent(this,MenuMpsActivity.class); startActivity(i); break;
            case R.id.tentang_btn: i = new Intent(this,MenuTentangActivity.class); startActivity(i); break;
            case R.id.mPeng: i = new Intent(this,Pengembang.class); startActivity(i); break;
            case R.id.mPemb: i = new Intent(this,Pembimbing.class); startActivity(i); break;
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