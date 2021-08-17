package com.dstatic.mythesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MenuDaftarActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView backbutton, cambutton,
            cb1, cb2, cb3, cb4a, cb4b, cb4c, cb4d, cb4e, cb4f, cb4g, cb5, cb6a,
            cb6b, cb7a, cb7b, cb8, cb9, cb10, cb11, cb12a, cb12b, cb13a, cb13b, cb13c,
            cb13d, cb13e, cb13f, cb14, cb15, cb16, cb17, cb18, cb19, cb20, cb21, cb22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_daftar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView iv1 = findViewById(R.id.tn1);
        ImageView iv2 = findViewById(R.id.tn2);
        ImageView iv3 = findViewById(R.id.tn3);
        ImageView iv4a = findViewById(R.id.tn4a);
        ImageView iv4b = findViewById(R.id.tn4b);
        ImageView iv4c = findViewById(R.id.tn4c);
        ImageView iv4d = findViewById(R.id.tn4d);
        ImageView iv4e = findViewById(R.id.tn4e);
        ImageView iv4f = findViewById(R.id.tn4f);
        ImageView iv4g = findViewById(R.id.tn4g);
        ImageView iv5 = findViewById(R.id.tn5);
        ImageView iv6a = findViewById(R.id.tn6a);
        ImageView iv6b = findViewById(R.id.tn6b);
        ImageView iv7a = findViewById(R.id.tn7a);
        ImageView iv7b = findViewById(R.id.tn7b);
        ImageView iv8 = findViewById(R.id.tn8);
        ImageView iv9 = findViewById(R.id.tn9);
        ImageView iv10 = findViewById(R.id.tn10);
        ImageView iv11 = findViewById(R.id.tn11);
        ImageView iv12a = findViewById(R.id.tn12a);
        ImageView iv12b = findViewById(R.id.tn12b);
        ImageView iv13a = findViewById(R.id.tn13a);
        ImageView iv13b = findViewById(R.id.tn13b);
        ImageView iv13c = findViewById(R.id.tn13c);
        ImageView iv13d = findViewById(R.id.tn13d);
        ImageView iv13e = findViewById(R.id.tn13e);
        ImageView iv13f = findViewById(R.id.tn13f);
        ImageView iv14 = findViewById(R.id.tn14);
        ImageView iv15 = findViewById(R.id.tn15);
        ImageView iv16 = findViewById(R.id.tn16);
        ImageView iv17 = findViewById(R.id.tn17);
        ImageView iv18 = findViewById(R.id.tn18);
        ImageView iv19 = findViewById(R.id.tn19);
        ImageView iv20 = findViewById(R.id.tn20);
        ImageView iv21 = findViewById(R.id.tn21);
        ImageView iv22 = findViewById(R.id.tn22);

        String ui1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FService%20unit%20with%20onoff%20valve.JPG?alt=media&token=5f58fed7-8a13-428c-9ead-6e37fca0e0ae";
        String ui2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2FStacking%20Magazine.jpg?alt=media&token=0297bd23-826b-4c42-b243-a2fba191201b";
        String ui3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FChanger%20module.jpg?alt=media&token=590a76dc-08ad-478e-ad4f-b132c52bd6b2";
        String ui4a = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2FCP%20Valve%20Terminal1.jpg?alt=media&token=956d19ee-e63c-4230-97c1-ffc9478cfa56";
        String ui4b = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FAir%20solenoid%20valve%2Fair_solenoid_valvea1.jpg?alt=media&token=ac299f0b-616d-42eb-9fde-1f10a2543a96";
        String ui4c = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FAir%20solenoid%20valve2%2Fair_solenoid_valveb1.jpg?alt=media&token=653c00bf-cbcb-4ed7-803f-b48409dd7f54";
        String ui4d = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FVacuum%20generator%2Fvacuum_generator1.jpg?alt=media&token=0c1081a3-6b93-43c1-825b-98c40f50f8f5";
        String ui4e = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting2%2Fpush_in_l_fittingb1.jpg?alt=media&token=b4f32ca5-788f-42cd-9340-4d13facb346c";
        String ui4f = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FSilencer.jpg?alt=media&token=cc87d42f-86b0-40c6-8cc1-696333c39cc4";
        String ui4g = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FMultiple%20distributor%2Fmultiple_distributor1.jpg?alt=media&token=f90f8033-3e32-4e22-9567-4c7df73a41b6";
        String ui5 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FIO%20Interface.JPG?alt=media&token=eb0472b3-dc00-426a-8377-82d8ca77b8e5";
        String ui6a = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2FVacuum%20Switch.jpg?alt=media&token=6bffeb95-ea80-494e-8018-1dddf086e5c1";
        String ui6b = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FConnecting%20cable%2Fconnecting_cable1.jpg?alt=media&token=d5b16ad3-af7a-4d6e-a082-d7fa433eccee";
        String ui7a = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FFiber-optic%20unit1.jpg?alt=media&token=797c6297-09e2-4e55-8319-f5bfa2902aed";
        String ui7b = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FFiber%20Optic%20Cable.jpg?alt=media&token=020f9791-460d-4799-8732-5ce8cad9da37";
        String ui8 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FReceiver1.jpg?alt=media&token=1fbeeabc-7928-49e3-b461-3d4177d5c65b";
        String ui9 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FAluminum%20profile%20plate.jpg?alt=media&token=36daee54-c2a8-4e8c-86f6-46ef76df8177";
        String ui10 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FISO%20cylinder%2Fiso_cylinder1.jpg?alt=media&token=e4ab8322-ef78-4d64-8c40-3c7c23c4d2ee";
        String ui11 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FOne-way%20flow%20control%20valve%2Fone_way_flow_control_valve1.jpg?alt=media&token=8881ce49-8d9a-4d85-b9fa-297248868c1b";
        String ui12a = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FProximity%20sensor%2Fproximity_sensor1.jpg?alt=media&token=2f3ab895-e2a1-4631-aee1-f5514a2826de";
        String ui12b = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FConnecting%20cable2%2Fconnecting_cableb1.jpg?alt=media&token=e5a0b827-482e-49a5-98d6-e7f46e5bf647";
        String ui13a = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FSuction%20cup.png?alt=media&token=1d9da8f1-16fa-4455-bceb-c56d159592f8";
        String ui13b = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FSleeve.jpg?alt=media&token=353aa155-4ed2-4148-9963-9e1f620fd5fd";
        String ui13c = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting%2C%20rotatable%2Fpush_in_l_fitting_rotatable1.jpg?alt=media&token=bab28f24-f9a2-44c2-addf-5ca73af854d3";
        String ui13d = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FVacuum%20filter%2Fvacuum_filter1.jpg?alt=media&token=df577b2b-0be3-4cc1-9089-f030815c12b6";
        String ui13e = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FNon%20return%20valve%2Fnon_return_valve1.jpg?alt=media&token=1c27f069-e126-4321-b6c0-f3330bf1b5fd";
        String ui13f = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector1.jpg?alt=media&token=6ac3da0b-f2ab-4332-a831-9af87753bb30";
        String ui14 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FMicro%20switch1.jpg?alt=media&token=64160146-bc26-4be4-be64-ce5081f65ba0";
        String ui15 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FOne-way%20flow%20control%20valve%2Fone_way_flow_control_valve1.jpg?alt=media&token=8881ce49-8d9a-4d85-b9fa-297248868c1b";
        String ui16 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FQuarter%20turn%20actuator%2Fquarter_turn_actuator1.jpg?alt=media&token=379dbbad-2cfa-4244-83f6-1eed86666e0e";
        String ui17 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FControl%20console.jpg?alt=media&token=fe31c41f-2100-49e7-b29b-d860298d7622";
        String ui18 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2FPLC.jpg?alt=media&token=5ccb1024-1ffc-4a42-a7a7-ac90db9da4ef";
        String ui19 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FMPS%C2%AE%20trolley.jpg?alt=media&token=d3256eaf-0739-4f50-8349-77b6066e16de";
        String ui20 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPlastic%20tubing%2Fplastic_tubing1.jpg?alt=media&token=4db4de74-48ff-4af7-80ba-bea55eeb1586";
        String ui21 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPlastic%20tubing2%2Fplastic_tubingb1.jpg?alt=media&token=e7c652e8-939a-4c46-bb7e-f740fe41af3c";
        String ui22 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FPA%20workpiece.jpg?alt=media&token=26fd7530-d68c-47b0-9876-44a55c583f3b";

        Picasso.get().load(ui1).into(iv1);
        Picasso.get().load(ui2).into(iv2);
        Picasso.get().load(ui3).into(iv3);
        Picasso.get().load(ui4a).into(iv4a);
        Picasso.get().load(ui4b).into(iv4b);
        Picasso.get().load(ui4c).into(iv4c);
        Picasso.get().load(ui4d).into(iv4d);
        Picasso.get().load(ui4e).into(iv4e);
        Picasso.get().load(ui4f).into(iv4f);
        Picasso.get().load(ui4g).into(iv4g);
        Picasso.get().load(ui5).into(iv5);
        Picasso.get().load(ui6a).into(iv6a);
        Picasso.get().load(ui6b).into(iv6b);
        Picasso.get().load(ui7a).into(iv7a);
        Picasso.get().load(ui7b).into(iv7b);
        Picasso.get().load(ui8).into(iv8);
        Picasso.get().load(ui9).into(iv9);
        Picasso.get().load(ui10).into(iv10);
        Picasso.get().load(ui11).into(iv11);
        Picasso.get().load(ui12a).into(iv12a);
        Picasso.get().load(ui12b).into(iv12b);
        Picasso.get().load(ui13a).into(iv13a);
        Picasso.get().load(ui13b).into(iv13b);
        Picasso.get().load(ui13c).into(iv13c);
        Picasso.get().load(ui13d).into(iv13d);
        Picasso.get().load(ui13e).into(iv13e);
        Picasso.get().load(ui13f).into(iv13f);
        Picasso.get().load(ui14).into(iv14);
        Picasso.get().load(ui15).into(iv15);
        Picasso.get().load(ui16).into(iv16);
        Picasso.get().load(ui17).into(iv17);
        Picasso.get().load(ui18).into(iv18);
        Picasso.get().load(ui19).into(iv19);
        Picasso.get().load(ui20).into(iv20);
        Picasso.get().load(ui21).into(iv21);
        Picasso.get().load(ui22).into(iv22);

        cb1 = findViewById(R.id.cv1);
        cb2 = findViewById(R.id.cv2);
        cb3 = findViewById(R.id.cv3);
        cb4a = findViewById(R.id.cv4a);
        cb4b = findViewById(R.id.cv4b);
        cb4c = findViewById(R.id.cv4c);
        cb4d = findViewById(R.id.cv4d);
        cb4e = findViewById(R.id.cv4e);
        cb4f = findViewById(R.id.cv4f);
        cb4g = findViewById(R.id.cv4g);
        cb5 = findViewById(R.id.cv5);
        cb6a = findViewById(R.id.cv6a);
        cb6b = findViewById(R.id.cv6b);
        cb7a = findViewById(R.id.cv7a);
        cb7b = findViewById(R.id.cv7b);
        cb8 = findViewById(R.id.cv8);
        cb9 = findViewById(R.id.cv9);
        cb10 = findViewById(R.id.cv10);
        cb11 = findViewById(R.id.cv11);
        cb12a = findViewById(R.id.cv12a);
        cb12b = findViewById(R.id.cv12b);
        cb13a = findViewById(R.id.cv13a);
        cb13b = findViewById(R.id.cv13b);
        cb13c = findViewById(R.id.cv13c);
        cb13d = findViewById(R.id.cv13d);
        cb13e = findViewById(R.id.cv13e);
        cb13f = findViewById(R.id.cv13f);
        cb14 = findViewById(R.id.cv14);
        cb15 = findViewById(R.id.cv15);
        cb16 = findViewById(R.id.cv16);
        cb17 = findViewById(R.id.cv17);
        cb18 = findViewById(R.id.cv18);
        cb19 = findViewById(R.id.cv19);
        cb20 = findViewById(R.id.cv20);
        cb21 = findViewById(R.id.cv21);
        cb22 = findViewById(R.id.cv22);
        backbutton = findViewById(R.id.backBtn);
        cambutton = findViewById(R.id.camBtn);

        cb1.setOnClickListener(this);
        cb2.setOnClickListener(this);
        cb3.setOnClickListener(this);
        cb4a.setOnClickListener(this);
        cb4b.setOnClickListener(this);
        cb4c.setOnClickListener(this);
        cb4d.setOnClickListener(this);
        cb4e.setOnClickListener(this);
        cb4f.setOnClickListener(this);
        cb4g.setOnClickListener(this);
        cb5.setOnClickListener(this);
        cb6a.setOnClickListener(this);
        cb6b.setOnClickListener(this);
        cb7a.setOnClickListener(this);
        cb7b.setOnClickListener(this);
        cb8.setOnClickListener(this);
        cb9.setOnClickListener(this);
        cb10.setOnClickListener(this);
        cb11.setOnClickListener(this);
        cb12a.setOnClickListener(this);
        cb12b.setOnClickListener(this);
        cb13a.setOnClickListener(this);
        cb13b.setOnClickListener(this);
        cb13c.setOnClickListener(this);
        cb13d.setOnClickListener(this);
        cb13e.setOnClickListener(this);
        cb13f.setOnClickListener(this);
        cb14.setOnClickListener(this);
        cb15.setOnClickListener(this);
        cb16.setOnClickListener(this);
        cb17.setOnClickListener(this);
        cb18.setOnClickListener(this);
        cb19.setOnClickListener(this);
        cb20.setOnClickListener(this);
        cb21.setOnClickListener(this);
        cb22.setOnClickListener(this);
        backbutton.setOnClickListener(this);
        cambutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.cv1: i = new Intent(this,StartUpValve.class); startActivity(i); break;
            case R.id.cv2: i = new Intent(this,StackingMagazineModule.class); startActivity(i); break;
            case R.id.cv3: i = new Intent(this,ChangerModule.class); startActivity(i); break;
            case R.id.cv4a: i = new Intent(this,CpValveTerminal.class); startActivity(i); break;
            case R.id.cv4b: i = new Intent(this,AirSolenoidValveA.class); startActivity(i); break;
            case R.id.cv4c: i = new Intent(this,AirSolenoidValveB.class); startActivity(i); break;
            case R.id.cv4d: i = new Intent(this,VacuumGenerator.class); startActivity(i); break;
            case R.id.cv4e: i = new Intent(this,PushInLFittingB.class); startActivity(i); break;
            case R.id.cv4f: i = new Intent(this,Silencer.class); startActivity(i); break;
            case R.id.cv4g: i = new Intent(this,MultipleDistributor.class); startActivity(i); break;
            case R.id.cv5: i = new Intent(this,IoTerminal.class); startActivity(i); break;
            case R.id.cv6a: i = new Intent(this,VacuumSwitch.class); startActivity(i); break;
            case R.id.cv6b: i = new Intent(this,ConnectingCable.class); startActivity(i); break;
            case R.id.cv7a: i = new Intent(this,FibreOpticDevice.class); startActivity(i); break;
            case R.id.cv7b: i = new Intent(this,FibreOpticCable.class); startActivity(i); break;
            case R.id.cv8: i = new Intent(this,Receiver.class); startActivity(i); break;
            case R.id.cv9: i = new Intent(this,AluminumProfilePlate.class); startActivity(i); break;
            case R.id.cv10: i = new Intent(this,IsoCylinder.class); startActivity(i); break;
            case R.id.cv11: i = new Intent(this,OneWayFlowControlValve.class); startActivity(i); break;
            case R.id.cv12a: i = new Intent(this,ProximitySensor.class); startActivity(i); break;
            case R.id.cv12b: i = new Intent(this,ConnectingCableB.class); startActivity(i); break;
            case R.id.cv13a: i = new Intent(this,SuctionCup.class); startActivity(i); break;
            case R.id.cv13b: i = new Intent(this,Sleeve.class); startActivity(i); break;
            case R.id.cv13c: i = new Intent(this,PushInLFittingRotatable.class); startActivity(i); break;
            case R.id.cv13d: i = new Intent(this,VacuumFilter.class); startActivity(i); break;
            case R.id.cv13e: i = new Intent(this,NonReturnValve.class); startActivity(i); break;
            case R.id.cv13f: i = new Intent(this,PushInBulkheadConnector.class); startActivity(i); break;
            case R.id.cv14: i = new Intent(this,MicroSwitch.class); startActivity(i); break;
            case R.id.cv15: i = new Intent(this,OneWayFlowControlValve.class); startActivity(i); break;
            case R.id.cv16: i = new Intent(this,QuarterTurnActuator.class); startActivity(i); break;
            case R.id.cv17: i = new Intent(this,ControlConsole.class); startActivity(i); break;
            case R.id.cv18: i = new Intent(this,PlcDevice.class); startActivity(i); break;
            case R.id.cv19: i = new Intent(this,MpsTrolley.class); startActivity(i); break;
            case R.id.cv20: i = new Intent(this,PlasticTubing.class); startActivity(i); break;
            case R.id.cv21: i = new Intent(this,PlasticTubingB.class); startActivity(i); break;
            case R.id.cv22: i = new Intent(this,PaWorkpiece.class); startActivity(i); break;
            case R.id.backBtn: onBackPressed(); break;
            case R.id.camBtn: i = new Intent(this,MenuScannerActivity.class); startActivity(i); break;
            default:break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}