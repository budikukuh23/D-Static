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
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider1.jpg?alt=media&token=19b73962-57fd-428f-881f-1b65c6155571",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider2.jpg?alt=media&token=e8bb8c9f-1773-40d6-a4b7-454c32b46ebf",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider3.jpg?alt=media&token=d26a890b-2047-428a-af69-a0524dc70286",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider4.jpg?alt=media&token=a7a3afd2-a997-4f2e-a959-da74e6cf5812",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider5.jpg?alt=media&token=7c874d9c-5967-4b64-95ea-98459be3e662",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider6.jpg?alt=media&token=0f36a5e6-dbfc-4439-a240-d25e66b9ac48",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider7.jpg?alt=media&token=4f08812b-9741-488b-a116-4d098f819f13",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider8.jpg?alt=media&token=22444691-494f-4780-a993-3b572834fc83",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider9.jpg?alt=media&token=723655e0-c220-408f-adc4-1a3471e20964",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fslider10.jpg?alt=media&token=b24a105c-dfd4-4435-8bfe-206c28263075"
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