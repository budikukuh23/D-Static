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
                                    case "0161414": {
                                        Intent intent = new Intent(MenuScannerActivity.this, AirSolenoidValveA.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0161417": {
                                        Intent intent = new Intent(MenuScannerActivity.this, AirSolenoidValveB.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0158960": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ConnectingCable.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0159420": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ConnectingCableB.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0019181": {
                                        Intent intent = new Intent(MenuScannerActivity.this, IsoCylinder.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0153209": {
                                        Intent intent = new Intent(MenuScannerActivity.this, MultipleDistributor.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0153462": {
                                        Intent intent = new Intent(MenuScannerActivity.this, NonReturnValve.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0175056": {
                                        Intent intent = new Intent(MenuScannerActivity.this, OneWayFlowControlValve.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0159662": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PlasticTubing.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0159664": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PlasticTubingB.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0150857": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ProximitySensor.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0153157": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PushInBulkheadConnector.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0153333": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PushInLFitting.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0186285": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PushInLFittingRotatable.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0186117": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PushInLFittingB.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0011910": {
                                        Intent intent = new Intent(MenuScannerActivity.this, QuarterTurnActuator.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0015889": {
                                        Intent intent = new Intent(MenuScannerActivity.this, VacuumFilter.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0185865": {
                                        Intent intent = new Intent(MenuScannerActivity.this, VacuumGenerator.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0159333": {
                                        Intent intent = new Intent(MenuScannerActivity.this, AluminumProfilePlate.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0195764": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ControlConsole.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "8033248": {
                                        Intent intent = new Intent(MenuScannerActivity.this, MpsTrolley.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0554301": {
                                        Intent intent = new Intent(MenuScannerActivity.this, PaWorkpiece.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "8032172": {
                                        Intent intent = new Intent(MenuScannerActivity.this, StackingMagazineModule.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0152894": {
                                        Intent intent = new Intent(MenuScannerActivity.this, StartUpValve.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0162387": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ChangerModule.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0152629": {
                                        Intent intent = new Intent(MenuScannerActivity.this, DisplacementEncoder.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0018685": {
                                        Intent intent = new Intent(MenuScannerActivity.this, DuoCable.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0165360": {
                                        Intent intent = new Intent(MenuScannerActivity.this, FibreOpticCable.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0165327": {
                                        Intent intent = new Intent(MenuScannerActivity.this, FibreOpticDevice.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0034035": {
                                        Intent intent = new Intent(MenuScannerActivity.this, IoTerminal.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0007347": {
                                        Intent intent = new Intent(MenuScannerActivity.this, MicroSwitch.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0165323": {
                                        Intent intent = new Intent(MenuScannerActivity.this, Receiver.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0004645": {
                                        Intent intent = new Intent(MenuScannerActivity.this, Silencer.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0036169": {
                                        Intent intent = new Intent(MenuScannerActivity.this, Sleeve.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0036135": {
                                        Intent intent = new Intent(MenuScannerActivity.this, SuctionCup.class);
                                        startActivity(intent);
                                        break;
                                    }
                                    case "0196083": {
                                        Intent intent = new Intent(MenuScannerActivity.this, ValveInterface.class);
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