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
            cardbtn1, cardbtn2, cardbtn3, cardbtn4, cardbtn9, cardbtn11, cardbtn12, cardbtn13,
            cardbtn14, cardbtn15, cardbtn17, cardbtn18, cardbtn19, cardbtn20, cardbtn21, cardbtn22,
            cardbtn23, cardbtn24, cardbtn26, cardbtn29, cardbtn33, cardbtn34, cardbtn37,
            cardbtn38, cardbtn41, cardbtn42, cardbtn43, cardbtn44, cardbtn45, cardbtn46, cardbtn47,
            cardbtn48, cardbtn49, cardbtn50, cardbtn51, cardbtn52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_daftar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView imageView1 = findViewById(R.id.gambarKomponen1);
        ImageView imageView2 = findViewById(R.id.gambarKomponen2);
        ImageView imageView3 = findViewById(R.id.gambarKomponen3);
        ImageView imageView4 = findViewById(R.id.gambarKomponen4);
        ImageView imageView9 = findViewById(R.id.gambarKomponen9);
        ImageView imageView11 = findViewById(R.id.gambarKomponen11);
        ImageView imageView12 = findViewById(R.id.gambarKomponen12);
        ImageView imageView13 = findViewById(R.id.gambarKomponen13);
        ImageView imageView14 = findViewById(R.id.gambarKomponen14);
        ImageView imageView15 = findViewById(R.id.gambarKomponen15);
        ImageView imageView17 = findViewById(R.id.gambarKomponen17);
        ImageView imageView18 = findViewById(R.id.gambarKomponen18);
        ImageView imageView19 = findViewById(R.id.gambarKomponen19);
        ImageView imageView20 = findViewById(R.id.gambarKomponen20);
        ImageView imageView21 = findViewById(R.id.gambarKomponen21);
        ImageView imageView22 = findViewById(R.id.gambarKomponen22);
        ImageView imageView23 = findViewById(R.id.gambarKomponen23);
        ImageView imageView24 = findViewById(R.id.gambarKomponen24);
        ImageView imageView26 = findViewById(R.id.gambarKomponen26);
        ImageView imageView29 = findViewById(R.id.gambarKomponen29);
        ImageView imageView33 = findViewById(R.id.gambarKomponen33);
        ImageView imageView34 = findViewById(R.id.gambarKomponen34);
        ImageView imageView37 = findViewById(R.id.gambarKomponen37);
        ImageView imageView38 = findViewById(R.id.gambarKomponen38);
        ImageView imageView41 = findViewById(R.id.gambarKomponen41);
        ImageView imageView42 = findViewById(R.id.gambarKomponen42);
        ImageView imageView43 = findViewById(R.id.gambarKomponen43);
        ImageView imageView44 = findViewById(R.id.gambarKomponen44);
        ImageView imageView45 = findViewById(R.id.gambarKomponen45);
        ImageView imageView46 = findViewById(R.id.gambarKomponen46);
        ImageView imageView47 = findViewById(R.id.gambarKomponen47);
        ImageView imageView48 = findViewById(R.id.gambarKomponen48);
        ImageView imageView49 = findViewById(R.id.gambarKomponen49);
        ImageView imageView50 = findViewById(R.id.gambarKomponen50);
        ImageView imageView51 = findViewById(R.id.gambarKomponen51);
        ImageView imageView52 = findViewById(R.id.gambarKomponen52);

        String urlimage1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FAir%20solenoid%20valve%2Fair_solenoid_valvea1.jpg?alt=media&token=ac299f0b-616d-42eb-9fde-1f10a2543a96";
        String urlimage2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FAir%20solenoid%20valve2%2Fair_solenoid_valveb1.jpg?alt=media&token=653c00bf-cbcb-4ed7-803f-b48409dd7f54";
        String urlimage3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FConnecting%20cable%2Fconnecting_cable1.jpg?alt=media&token=d5b16ad3-af7a-4d6e-a082-d7fa433eccee";
        String urlimage4 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FConnecting%20cable2%2Fconnecting_cableb1.jpg?alt=media&token=e5a0b827-482e-49a5-98d6-e7f46e5bf647";
        String urlimage9 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FISO%20cylinder%2Fiso_cylinder1.jpg?alt=media&token=e4ab8322-ef78-4d64-8c40-3c7c23c4d2ee";
        String urlimage11 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FMultiple%20distributor%2Fmultiple_distributor1.jpg?alt=media&token=f90f8033-3e32-4e22-9567-4c7df73a41b6";
        String urlimage12 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FNon%20return%20valve%2Fnon_return_valve1.jpg?alt=media&token=1c27f069-e126-4321-b6c0-f3330bf1b5fd";
        String urlimage13 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FOne-way%20flow%20control%20valve%2Fone_way_flow_control_valve1.jpg?alt=media&token=8881ce49-8d9a-4d85-b9fa-297248868c1b";
        String urlimage14 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPlastic%20tubing%2Fplastic_tubing1.jpg?alt=media&token=4db4de74-48ff-4af7-80ba-bea55eeb1586";
        String urlimage15 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPlastic%20tubing2%2Fplastic_tubingb1.jpg?alt=media&token=e7c652e8-939a-4c46-bb7e-f740fe41af3c";
        String urlimage17 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FProximity%20sensor%2Fproximity_sensor1.jpg?alt=media&token=2f3ab895-e2a1-4631-aee1-f5514a2826de";
        String urlimage18 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector1.jpg?alt=media&token=6ac3da0b-f2ab-4332-a831-9af87753bb30";
        String urlimage19 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting%2Fpush_in_l_fitting1.jpg?alt=media&token=3725218e-14f7-40f0-860c-43893a059d71";
        String urlimage20 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting2%2Fpush_in_l_fittingb1.jpg?alt=media&token=b4f32ca5-788f-42cd-9340-4d13facb346c";
        String urlimage21 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting%2C%20rotatable%2Fpush_in_l_fitting_rotatable1.jpg?alt=media&token=bab28f24-f9a2-44c2-addf-5ca73af854d3";
        String urlimage22 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FQuarter%20turn%20actuator%2Fquarter_turn_actuator1.jpg?alt=media&token=379dbbad-2cfa-4244-83f6-1eed86666e0e";
        String urlimage23 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FVacuum%20filter%2Fvacuum_filter1.jpg?alt=media&token=df577b2b-0be3-4cc1-9089-f030815c12b6";
        String urlimage24 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FVacuum%20generator%2Fvacuum_generator1.jpg?alt=media&token=0c1081a3-6b93-43c1-825b-98c40f50f8f5";
        String urlimage26 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FAluminum%20profile%20plate.jpg?alt=media&token=36daee54-c2a8-4e8c-86f6-46ef76df8177";
        String urlimage29 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FControl%20console.jpg?alt=media&token=fe31c41f-2100-49e7-b29b-d860298d7622";
        String urlimage33 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FMPS%C2%AE%20trolley.jpg?alt=media&token=d3256eaf-0739-4f50-8349-77b6066e16de";
        String urlimage34 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FPA%20workpiece.jpg?alt=media&token=26fd7530-d68c-47b0-9876-44a55c583f3b";
        String urlimage37 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FStacking%20magazine%20module.jpg?alt=media&token=5e418570-ad6c-4cea-9b37-b5cb2696638f";
        String urlimage38 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FService%20unit%20with%20onoff%20valve.JPG?alt=media&token=5f58fed7-8a13-428c-9ead-6e37fca0e0ae";
        String urlimage41 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FChanger%20module.jpg?alt=media&token=590a76dc-08ad-478e-ad4f-b132c52bd6b2";
        String urlimage42 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FDisplacement%20encoder.jpg?alt=media&token=3dd0f19b-5700-46aa-bedf-0bcf02a142e2";
        String urlimage43 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FDuo%20Cable.jpg?alt=media&token=1768170d-f96e-428f-8b1d-602e8bf8f3f1";
        String urlimage44 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FFiber%20Optic%20Cable.jpg?alt=media&token=020f9791-460d-4799-8732-5ce8cad9da37";
        String urlimage45 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FFiber-optic%20unit1.jpg?alt=media&token=797c6297-09e2-4e55-8319-f5bfa2902aed";
        String urlimage46 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FIO%20Interface.JPG?alt=media&token=eb0472b3-dc00-426a-8377-82d8ca77b8e5";
        String urlimage47 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FMicro%20switch1.jpg?alt=media&token=64160146-bc26-4be4-be64-ce5081f65ba0";
        String urlimage48 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FReceiver1.jpg?alt=media&token=1fbeeabc-7928-49e3-b461-3d4177d5c65b";
        String urlimage49 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FSilencer.jpg?alt=media&token=cc87d42f-86b0-40c6-8cc1-696333c39cc4";
        String urlimage50 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FSleeve.jpg?alt=media&token=353aa155-4ed2-4148-9963-9e1f620fd5fd";
        String urlimage51 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FSuction%20cup.png?alt=media&token=1d9da8f1-16fa-4455-bceb-c56d159592f8";
        String urlimage52 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FValve%20interface.jpg?alt=media&token=56b3f50b-d1c2-45c4-832a-15368dc9c39f";

        Picasso.get().load(urlimage1).into(imageView1);
        Picasso.get().load(urlimage2).into(imageView2);
        Picasso.get().load(urlimage26).into(imageView26);
        Picasso.get().load(urlimage41).into(imageView41);
        Picasso.get().load(urlimage3).into(imageView3);
        Picasso.get().load(urlimage4).into(imageView4);
        Picasso.get().load(urlimage29).into(imageView29);
        Picasso.get().load(urlimage42).into(imageView42);
        Picasso.get().load(urlimage43).into(imageView43);
        Picasso.get().load(urlimage44).into(imageView44);
        Picasso.get().load(urlimage45).into(imageView45);
        Picasso.get().load(urlimage46).into(imageView46);
        Picasso.get().load(urlimage9).into(imageView9);
        Picasso.get().load(urlimage47).into(imageView47);
        Picasso.get().load(urlimage33).into(imageView33);
        Picasso.get().load(urlimage11).into(imageView11);
        Picasso.get().load(urlimage12).into(imageView12);
        Picasso.get().load(urlimage34).into(imageView34);
        Picasso.get().load(urlimage13).into(imageView13);
        Picasso.get().load(urlimage14).into(imageView14);
        Picasso.get().load(urlimage15).into(imageView15);
        Picasso.get().load(urlimage17).into(imageView17);
        Picasso.get().load(urlimage18).into(imageView18);
        Picasso.get().load(urlimage19).into(imageView19);
        Picasso.get().load(urlimage20).into(imageView20);
        Picasso.get().load(urlimage21).into(imageView21);
        Picasso.get().load(urlimage22).into(imageView22);
        Picasso.get().load(urlimage48).into(imageView48);
        Picasso.get().load(urlimage37).into(imageView37);
        Picasso.get().load(urlimage49).into(imageView49);
        Picasso.get().load(urlimage50).into(imageView50);
        Picasso.get().load(urlimage51).into(imageView51);
        Picasso.get().load(urlimage38).into(imageView38);
        Picasso.get().load(urlimage23).into(imageView23);
        Picasso.get().load(urlimage24).into(imageView24);
        Picasso.get().load(urlimage52).into(imageView52);

        cardbtn1 = findViewById(R.id.cardview_id1);
        cardbtn2 = findViewById(R.id.cardview_id2);
        cardbtn3 = findViewById(R.id.cardview_id3);
        cardbtn4 = findViewById(R.id.cardview_id4);
        cardbtn9 = findViewById(R.id.cardview_id9);
        cardbtn11 = findViewById(R.id.cardview_id11);
        cardbtn12 = findViewById(R.id.cardview_id12);
        cardbtn13 = findViewById(R.id.cardview_id13);
        cardbtn14 = findViewById(R.id.cardview_id14);
        cardbtn15 = findViewById(R.id.cardview_id15);
        cardbtn17 = findViewById(R.id.cardview_id17);
        cardbtn18 = findViewById(R.id.cardview_id18);
        cardbtn19 = findViewById(R.id.cardview_id19);
        cardbtn20 = findViewById(R.id.cardview_id20);
        cardbtn21 = findViewById(R.id.cardview_id21);
        cardbtn22 = findViewById(R.id.cardview_id22);
        cardbtn23 = findViewById(R.id.cardview_id23);
        cardbtn24 = findViewById(R.id.cardview_id24);
        cardbtn26 = findViewById(R.id.cardview_id26);
        cardbtn29 = findViewById(R.id.cardview_id29);
        cardbtn33 = findViewById(R.id.cardview_id33);
        cardbtn34 = findViewById(R.id.cardview_id34);
        cardbtn37 = findViewById(R.id.cardview_id37);
        cardbtn38 = findViewById(R.id.cardview_id38);
        cardbtn41 = findViewById(R.id.cardview_id41);
        cardbtn42 = findViewById(R.id.cardview_id42);
        cardbtn43 = findViewById(R.id.cardview_id43);
        cardbtn44 = findViewById(R.id.cardview_id44);
        cardbtn45 = findViewById(R.id.cardview_id45);
        cardbtn46 = findViewById(R.id.cardview_id46);
        cardbtn47 = findViewById(R.id.cardview_id47);
        cardbtn48 = findViewById(R.id.cardview_id48);
        cardbtn49 = findViewById(R.id.cardview_id49);
        cardbtn50 = findViewById(R.id.cardview_id50);
        cardbtn51 = findViewById(R.id.cardview_id51);
        cardbtn52 = findViewById(R.id.cardview_id52);
        backbutton = findViewById(R.id.backBtn);
        cambutton = findViewById(R.id.camBtn);

        cardbtn1.setOnClickListener(this);
        cardbtn2.setOnClickListener(this);
        cardbtn3.setOnClickListener(this);
        cardbtn4.setOnClickListener(this);
        cardbtn9.setOnClickListener(this);
        cardbtn11.setOnClickListener(this);
        cardbtn12.setOnClickListener(this);
        cardbtn13.setOnClickListener(this);
        cardbtn14.setOnClickListener(this);
        cardbtn15.setOnClickListener(this);
        cardbtn17.setOnClickListener(this);
        cardbtn18.setOnClickListener(this);
        cardbtn19.setOnClickListener(this);
        cardbtn20.setOnClickListener(this);
        cardbtn21.setOnClickListener(this);
        cardbtn22.setOnClickListener(this);
        cardbtn23.setOnClickListener(this);
        cardbtn24.setOnClickListener(this);
        cardbtn26.setOnClickListener(this);
        cardbtn29.setOnClickListener(this);
        cardbtn33.setOnClickListener(this);
        cardbtn34.setOnClickListener(this);
        cardbtn37.setOnClickListener(this);
        cardbtn38.setOnClickListener(this);
        cardbtn41.setOnClickListener(this);
        cardbtn42.setOnClickListener(this);
        cardbtn43.setOnClickListener(this);
        cardbtn44.setOnClickListener(this);
        cardbtn45.setOnClickListener(this);
        cardbtn46.setOnClickListener(this);
        cardbtn47.setOnClickListener(this);
        cardbtn48.setOnClickListener(this);
        cardbtn49.setOnClickListener(this);
        cardbtn50.setOnClickListener(this);
        cardbtn51.setOnClickListener(this);
        cardbtn52.setOnClickListener(this);
        backbutton.setOnClickListener(this);
        cambutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.cardview_id1: i = new Intent(this,AirSolenoidValveA.class); startActivity(i); break;
            case R.id.cardview_id2: i = new Intent(this,AirSolenoidValveB.class); startActivity(i); break;
            case R.id.cardview_id3: i = new Intent(this,ConnectingCable.class); startActivity(i); break;
            case R.id.cardview_id4: i = new Intent(this,ConnectingCableB.class); startActivity(i); break;
            case R.id.cardview_id9: i = new Intent(this,IsoCylinder.class); startActivity(i); break;
            case R.id.cardview_id11: i = new Intent(this,MultipleDistributor.class); startActivity(i); break;
            case R.id.cardview_id12: i = new Intent(this,NonReturnValve.class); startActivity(i); break;
            case R.id.cardview_id13: i = new Intent(this,OneWayFlowControlValve.class); startActivity(i); break;
            case R.id.cardview_id14: i = new Intent(this,PlasticTubing.class); startActivity(i); break;
            case R.id.cardview_id15: i = new Intent(this,PlasticTubingB.class); startActivity(i); break;
            case R.id.cardview_id17: i = new Intent(this,ProximitySensor.class); startActivity(i); break;
            case R.id.cardview_id18: i = new Intent(this,PushInBulkheadConnector.class); startActivity(i); break;
            case R.id.cardview_id19: i = new Intent(this,PushInLFitting.class); startActivity(i); break;
            case R.id.cardview_id20: i = new Intent(this,PushInLFittingB.class); startActivity(i); break;
            case R.id.cardview_id21: i = new Intent(this,PushInLFittingRotatable.class); startActivity(i); break;
            case R.id.cardview_id22: i = new Intent(this,QuarterTurnActuator.class); startActivity(i); break;
            case R.id.cardview_id23: i = new Intent(this,VacuumFilter.class); startActivity(i); break;
            case R.id.cardview_id24: i = new Intent(this,VacuumGenerator.class); startActivity(i); break;
            case R.id.cardview_id26: i = new Intent(this,AluminumProfilePlate.class); startActivity(i); break;
            case R.id.cardview_id29: i = new Intent(this,ControlConsole.class); startActivity(i); break;
            case R.id.cardview_id33: i = new Intent(this,MpsTrolley.class); startActivity(i); break;
            case R.id.cardview_id34: i = new Intent(this,PaWorkpiece.class); startActivity(i); break;
            case R.id.cardview_id37: i = new Intent(this,StackingMagazineModule.class); startActivity(i); break;
            case R.id.cardview_id38: i = new Intent(this,StartUpValve.class); startActivity(i); break;
            case R.id.cardview_id41: i = new Intent(this,ChangerModule.class); startActivity(i); break;
            case R.id.cardview_id42: i = new Intent(this,DisplacementEncoder.class); startActivity(i); break;
            case R.id.cardview_id43: i = new Intent(this,DuoCable.class); startActivity(i); break;
            case R.id.cardview_id44: i = new Intent(this,FibreOpticCable.class); startActivity(i); break;
            case R.id.cardview_id45: i = new Intent(this,FibreOpticDevice.class); startActivity(i); break;
            case R.id.cardview_id46: i = new Intent(this,IoTerminal.class); startActivity(i); break;
            case R.id.cardview_id47: i = new Intent(this,MicroSwitch.class); startActivity(i); break;
            case R.id.cardview_id48: i = new Intent(this,Receiver.class); startActivity(i); break;
            case R.id.cardview_id49: i = new Intent(this,Silencer.class); startActivity(i); break;
            case R.id.cardview_id50: i = new Intent(this,Sleeve.class); startActivity(i); break;
            case R.id.cardview_id51: i = new Intent(this,SuctionCup.class); startActivity(i); break;
            case R.id.cardview_id52: i = new Intent(this,ValveInterface.class); startActivity(i); break;
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