package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class MenuScannerActivity extends AppCompatActivity implements View.OnClickListener {

    CodeScanner codeScanner;
    CodeScannerView scanView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_scanner);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        CardView backbutton = findViewById(R.id.backBtn);
        backbutton.setOnClickListener(this);
        scanView = findViewById(R.id.scannerView);
        codeScanner = new CodeScanner(this, scanView);

        codeScanner.setDecodeCallback(result -> {

            String hasilqr = result.getText();

                            runOnUiThread(() -> {

                                switch (hasilqr) {
                                    case "152894": {
                                        Intent intent = new Intent(MenuScannerActivity.this, StartUpValve.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "162385": {
                                        Intent intent = new Intent(MenuScannerActivity.this, StackingMagazineModule.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "162387": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ChangerModule.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "196972": {
                                        Intent intent = new Intent(MenuScannerActivity.this, CpValveTerminal.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "161414": {
                                        Intent intent = new Intent(MenuScannerActivity.this, AirSolenoidValveA.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "161417": {
                                        Intent intent = new Intent(MenuScannerActivity.this, AirSolenoidValveB.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "185865": {
                                        Intent intent = new Intent(MenuScannerActivity.this, VacuumGenerator.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "186117": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PushInLFittingB.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "004645": {
                                        Intent intent = new Intent(MenuScannerActivity.this, Silencer.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "153209": {
                                        Intent intent = new Intent(MenuScannerActivity.this, MultipleDistributor.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "034035": {
                                        Intent intent = new Intent(MenuScannerActivity.this, IoTerminal.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "196973": {
                                        Intent intent = new Intent(MenuScannerActivity.this, VacuumSwitch.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "158960": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ConnectingCable.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "165327": {
                                        Intent intent = new Intent(MenuScannerActivity.this, FibreOpticDevice.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "165360": {
                                        Intent intent = new Intent(MenuScannerActivity.this, FibreOpticCable.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "165323": {
                                        Intent intent = new Intent(MenuScannerActivity.this, Receiver.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "159333": {
                                        Intent intent = new Intent(MenuScannerActivity.this, AluminumProfilePlate.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "019181": {
                                        Intent intent = new Intent(MenuScannerActivity.this, IsoCylinder.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "175056": {
                                        Intent intent = new Intent(MenuScannerActivity.this, OneWayFlowControlValve.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "150857": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ProximitySensor.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "159420": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ConnectingCableB.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "036135": {
                                        Intent intent = new Intent(MenuScannerActivity.this, SuctionCup.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "036169": {
                                        Intent intent = new Intent(MenuScannerActivity.this, Sleeve.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "186285": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PushInLFittingRotatable.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "015889": {
                                        Intent intent = new Intent(MenuScannerActivity.this, VacuumFilter.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "153462": {
                                        Intent intent = new Intent(MenuScannerActivity.this, NonReturnValve.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "153157": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PushInBulkheadConnector.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "007347": {
                                        Intent intent = new Intent(MenuScannerActivity.this, MicroSwitch.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "011910": {
                                        Intent intent = new Intent(MenuScannerActivity.this, QuarterTurnActuator.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "195764": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ControlConsole.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "8084652": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PlcDevice.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "8033248": {
                                        Intent intent = new Intent(MenuScannerActivity.this, MpsTrolley.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "159662": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PlasticTubing.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "159664": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PlasticTubingB.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "554301": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PaWorkpiece.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    default: {
                                        Toast.makeText(this, "QR Code tidak sesuai", Toast.LENGTH_SHORT).show();
                                        codeScanner.startPreview();
                                    }
                                }
                            });
        });

        scanView.setOnClickListener(v -> codeScanner.startPreview());

    }

    @Override
    protected void onResume() {
        super.onResume();
        requestForCamera();
    }

    private void requestForCamera() {
        Dexter.withActivity(this).withPermission(Manifest.permission.CAMERA).withListener(new PermissionListener() {
            @Override
            public void onPermissionGranted(PermissionGrantedResponse response) {
                codeScanner.startPreview();
            }

            @Override
            public void onPermissionDenied(PermissionDeniedResponse response) {
                Toast.makeText(MenuScannerActivity.this, "Camera Permission is Required.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                token.continuePermissionRequest();
            }
        }).check();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.backBtn: onBackPressed(); break;
            default:break;
        }
    }
}