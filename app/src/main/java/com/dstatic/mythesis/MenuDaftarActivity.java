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
            cardbtn1, cardbtn2, cardbtn3, cardbtn4, cardbtn5,
            cardbtn6, cardbtn7, cardbtn8, cardbtn9, cardbtn10,
            cardbtn11, cardbtn12, cardbtn13, cardbtn14, cardbtn15,
            cardbtn16, cardbtn17, cardbtn18, cardbtn19, cardbtn20,
            cardbtn21, cardbtn22, cardbtn23, cardbtn24, cardbtn25,
            cardbtn26, cardbtn27, cardbtn28, cardbtn29, cardbtn30,
            cardbtn31, cardbtn32, cardbtn33, cardbtn34, cardbtn35,
            cardbtn36, cardbtn37, cardbtn38, cardbtn39, cardbtn40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_daftar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView imageView1 = findViewById(R.id.gambarKomponen1);
        ImageView imageView2 = findViewById(R.id.gambarKomponen2);
        ImageView imageView3 = findViewById(R.id.gambarKomponen3);
        ImageView imageView4 = findViewById(R.id.gambarKomponen4);
        ImageView imageView5 = findViewById(R.id.gambarKomponen5);
        ImageView imageView6 = findViewById(R.id.gambarKomponen6);
        ImageView imageView7 = findViewById(R.id.gambarKomponen7);
        ImageView imageView8 = findViewById(R.id.gambarKomponen8);
        ImageView imageView9 = findViewById(R.id.gambarKomponen9);
        ImageView imageView10 = findViewById(R.id.gambarKomponen10);
        ImageView imageView11 = findViewById(R.id.gambarKomponen11);
        ImageView imageView12 = findViewById(R.id.gambarKomponen12);
        ImageView imageView13 = findViewById(R.id.gambarKomponen13);
        ImageView imageView14 = findViewById(R.id.gambarKomponen14);
        ImageView imageView15 = findViewById(R.id.gambarKomponen15);
        ImageView imageView16 = findViewById(R.id.gambarKomponen16);
        ImageView imageView17 = findViewById(R.id.gambarKomponen17);
        ImageView imageView18 = findViewById(R.id.gambarKomponen18);
        ImageView imageView19 = findViewById(R.id.gambarKomponen19);
        ImageView imageView20 = findViewById(R.id.gambarKomponen20);
        ImageView imageView21 = findViewById(R.id.gambarKomponen21);
        ImageView imageView22 = findViewById(R.id.gambarKomponen22);
        ImageView imageView23 = findViewById(R.id.gambarKomponen23);
        ImageView imageView24 = findViewById(R.id.gambarKomponen24);
        ImageView imageView25 = findViewById(R.id.gambarKomponen25);
        ImageView imageView26 = findViewById(R.id.gambarKomponen26);
        ImageView imageView27 = findViewById(R.id.gambarKomponen27);
        ImageView imageView28 = findViewById(R.id.gambarKomponen28);
        ImageView imageView29 = findViewById(R.id.gambarKomponen29);
        ImageView imageView30 = findViewById(R.id.gambarKomponen30);
        ImageView imageView31 = findViewById(R.id.gambarKomponen31);
        ImageView imageView32 = findViewById(R.id.gambarKomponen32);
        ImageView imageView33 = findViewById(R.id.gambarKomponen33);
        ImageView imageView34 = findViewById(R.id.gambarKomponen34);
        ImageView imageView35 = findViewById(R.id.gambarKomponen35);
        ImageView imageView36 = findViewById(R.id.gambarKomponen36);
        ImageView imageView37 = findViewById(R.id.gambarKomponen37);
        ImageView imageView38 = findViewById(R.id.gambarKomponen38);
        ImageView imageView39 = findViewById(R.id.gambarKomponen39);
        ImageView imageView40 = findViewById(R.id.gambarKomponen40);


        String urlimage1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FAir%20solenoid%20valve%2Fair_solenoid_valvea1.jpg?alt=media&token=ac299f0b-616d-42eb-9fde-1f10a2543a96";
        String urlimage2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FAir%20solenoid%20valve2%2Fair_solenoid_valveb1.jpg?alt=media&token=653c00bf-cbcb-4ed7-803f-b48409dd7f54";
        String urlimage3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FConnecting%20cable%2Fconnecting_cable1.jpg?alt=media&token=d5b16ad3-af7a-4d6e-a082-d7fa433eccee";
        String urlimage4 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FConnecting%20cable2%2Fconnecting_cableb1.jpg?alt=media&token=e5a0b827-482e-49a5-98d6-e7f46e5bf647";
        String urlimage5 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FDistributor%2Fdistributor.jpg?alt=media&token=52a9c96f-0ddf-4749-9d41-e51bb3f558d5";
        String urlimage6 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FExtension%2Fextension1.jpg?alt=media&token=2a7a0d3c-7b31-4bf7-9ff1-6f5d750eee4a";
        String urlimage7 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FFiber-optic%20cable%2Ffiber_optic_cable1.jpg?alt=media&token=af763ba1-d58b-4bf7-a9a0-8bcbd1c00f36";
        String urlimage8 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FFiber-optic%20unit%2Ffiber_optic_unit1.jpg?alt=media&token=2b072f6a-5558-45c4-84fe-b2328009754f";
        String urlimage9 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FISO%20cylinder%2Fiso_cylinder1.jpg?alt=media&token=e4ab8322-ef78-4d64-8c40-3c7c23c4d2ee";
        String urlimage10 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FLight%20barrier%2Flight_barrier1.jpg?alt=media&token=dd3ff866-a652-4285-8f27-456c388ebccd";
        String urlimage11 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FMultiple%20distributor%2Fmultiple_distributor1.jpg?alt=media&token=f90f8033-3e32-4e22-9567-4c7df73a41b6";
        String urlimage12 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FNon%20return%20valve%2Fnon_return_valve1.jpg?alt=media&token=1c27f069-e126-4321-b6c0-f3330bf1b5fd";
        String urlimage13 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FOne-way%20flow%20control%20valve%2Fone_way_flow_control_valve1.jpg?alt=media&token=8881ce49-8d9a-4d85-b9fa-297248868c1b";
        String urlimage14 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPlastic%20tubing%2Fplastic_tubing1.jpg?alt=media&token=4db4de74-48ff-4af7-80ba-bea55eeb1586";
        String urlimage15 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPlastic%20tubing2%2Fplastic_tubingb1.jpg?alt=media&token=e7c652e8-939a-4c46-bb7e-f740fe41af3c";
        String urlimage16 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPneumatic%20muffler%2Fpneumatic_muffler1.jpg?alt=media&token=eedd0ad7-dce7-4ddb-aff8-5b6ec877b0bf";
        String urlimage17 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FProximity%20sensor%2Fproximity_sensor1.jpg?alt=media&token=2f3ab895-e2a1-4631-aee1-f5514a2826de";
        String urlimage18 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20bulkhead%20connector%2Fpush_in_bulkhead_connector1.jpg?alt=media&token=6ac3da0b-f2ab-4332-a831-9af87753bb30";
        String urlimage19 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting%2Fpush_in_l_fitting1.jpg?alt=media&token=3725218e-14f7-40f0-860c-43893a059d71";
        String urlimage20 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting2%2Fpush_in_l_fittingb1.jpg?alt=media&token=b4f32ca5-788f-42cd-9340-4d13facb346c";
        String urlimage21 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting%2C%20rotatable%2Fpush_in_l_fitting_rotatable1.jpg?alt=media&token=bab28f24-f9a2-44c2-addf-5ca73af854d3";
        String urlimage22 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FQuarter%20turn%20actuator%2Fquarter_turn_actuator1.jpg?alt=media&token=379dbbad-2cfa-4244-83f6-1eed86666e0e";
        String urlimage23 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FVacuum%20filter%2Fvacuum_filter1.jpg?alt=media&token=df577b2b-0be3-4cc1-9089-f030815c12b6";
        String urlimage24 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FVacuum%20generator%2Fvacuum_generator1.jpg?alt=media&token=0c1081a3-6b93-43c1-825b-98c40f50f8f5";
        String urlimage25 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FVacuum%20suction%20cup%2Fvacuum_suction_cup1.jpg?alt=media&token=037687f1-cd2c-4b21-8af0-8df8aa61c87e";
        String urlimage26 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FAluminum%20profile%20plate.jpg?alt=media&token=36daee54-c2a8-4e8c-86f6-46ef76df8177";
        String urlimage27 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FC%20interface.jpg?alt=media&token=9e2e16c8-d274-45b7-831e-936bac780c59";
        String urlimage28 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FCable%20holder%20with%20hook-and-loop%20fastener.jpg?alt=media&token=58e443ab-499a-438a-b7d5-5d505272534f";
        String urlimage29 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FControl%20console.jpg?alt=media&token=fe31c41f-2100-49e7-b29b-d860298d7622";
        String urlimage30 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FConveyor%20module.jpg?alt=media&token=2849f8d1-1d0c-4ff9-99bb-c677ea452534";
        String urlimage31 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FDiffuse%20sensor%2C%20analog.jpg?alt=media&token=fecac8d8-f186-4909-b7bc-3c9c41b9f248";
        String urlimage32 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FLight%20barrier.jpg?alt=media&token=d4625179-ce68-4c6b-81bd-36d6788bf1a3";
        String urlimage33 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FMPS%C2%AE%20trolley.jpg?alt=media&token=d3256eaf-0739-4f50-8349-77b6066e16de";
        String urlimage34 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FPA%20workpiece.jpg?alt=media&token=26fd7530-d68c-47b0-9876-44a55c583f3b";
        String urlimage35 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FQuick-Fix%20clamping%20adapter.jpg?alt=media&token=727930c3-fe73-4fe7-9129-aa1dba0b5c08";
        String urlimage36 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FSimulation%20box%2C%20digital.jpg?alt=media&token=4a9e96bc-5faa-41a2-854c-e2ed9c266a0e";
        String urlimage37 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FStacking%20magazine%20module.jpg?alt=media&token=5e418570-ad6c-4cea-9b37-b5cb2696638f";
        String urlimage38 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FStart-up%20valve%20with%20filter%20control%20valve.jpg?alt=media&token=68d1f1c2-b737-46d1-9b46-d04ac9122742";
        String urlimage39 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FStopper%2C%20simple%2C%20with%20valve.jpg?alt=media&token=964a5780-77eb-4ad7-a06f-2777f77ac3a0";
        String urlimage40 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FValve%20slice.jpg?alt=media&token=e2fdf23f-ffef-4c59-adad-ec6023ca5625";

        Picasso.get().load(urlimage1).into(imageView1);
        Picasso.get().load(urlimage2).into(imageView2);
        Picasso.get().load(urlimage26).into(imageView26);
        Picasso.get().load(urlimage27).into(imageView27);
        Picasso.get().load(urlimage28).into(imageView28);
        Picasso.get().load(urlimage3).into(imageView3);
        Picasso.get().load(urlimage4).into(imageView4);
        Picasso.get().load(urlimage29).into(imageView29);
        Picasso.get().load(urlimage30).into(imageView30);
        Picasso.get().load(urlimage31).into(imageView31);
        Picasso.get().load(urlimage5).into(imageView5);
        Picasso.get().load(urlimage6).into(imageView6);
        Picasso.get().load(urlimage7).into(imageView7);
        Picasso.get().load(urlimage8).into(imageView8);
        Picasso.get().load(urlimage9).into(imageView9);
        Picasso.get().load(urlimage32).into(imageView32);
        Picasso.get().load(urlimage10).into(imageView10);
        Picasso.get().load(urlimage33).into(imageView33);
        Picasso.get().load(urlimage11).into(imageView11);
        Picasso.get().load(urlimage12).into(imageView12);
        Picasso.get().load(urlimage34).into(imageView34);
        Picasso.get().load(urlimage13).into(imageView13);
        Picasso.get().load(urlimage14).into(imageView14);
        Picasso.get().load(urlimage15).into(imageView15);
        Picasso.get().load(urlimage16).into(imageView16);
        Picasso.get().load(urlimage17).into(imageView17);
        Picasso.get().load(urlimage18).into(imageView18);
        Picasso.get().load(urlimage19).into(imageView19);
        Picasso.get().load(urlimage20).into(imageView20);
        Picasso.get().load(urlimage21).into(imageView21);
        Picasso.get().load(urlimage22).into(imageView22);
        Picasso.get().load(urlimage35).into(imageView35);
        Picasso.get().load(urlimage36).into(imageView36);
        Picasso.get().load(urlimage37).into(imageView37);
        Picasso.get().load(urlimage38).into(imageView38);
        Picasso.get().load(urlimage39).into(imageView39);
        Picasso.get().load(urlimage23).into(imageView23);
        Picasso.get().load(urlimage24).into(imageView24);
        Picasso.get().load(urlimage25).into(imageView25);
        Picasso.get().load(urlimage40).into(imageView40);

        cardbtn1 = findViewById(R.id.cardview_id1);
        cardbtn2 = findViewById(R.id.cardview_id2);
        cardbtn3 = findViewById(R.id.cardview_id3);
        cardbtn4 = findViewById(R.id.cardview_id4);
        cardbtn5 = findViewById(R.id.cardview_id5);
        cardbtn6 = findViewById(R.id.cardview_id6);
        cardbtn7 = findViewById(R.id.cardview_id7);
        cardbtn8 = findViewById(R.id.cardview_id8);
        cardbtn9 = findViewById(R.id.cardview_id9);
        cardbtn10 = findViewById(R.id.cardview_id10);
        cardbtn11 = findViewById(R.id.cardview_id11);
        cardbtn12 = findViewById(R.id.cardview_id12);
        cardbtn13 = findViewById(R.id.cardview_id13);
        cardbtn14 = findViewById(R.id.cardview_id14);
        cardbtn15 = findViewById(R.id.cardview_id15);
        cardbtn16 = findViewById(R.id.cardview_id16);
        cardbtn17 = findViewById(R.id.cardview_id17);
        cardbtn18 = findViewById(R.id.cardview_id18);
        cardbtn19 = findViewById(R.id.cardview_id19);
        cardbtn20 = findViewById(R.id.cardview_id20);
        cardbtn21 = findViewById(R.id.cardview_id21);
        cardbtn22 = findViewById(R.id.cardview_id22);
        cardbtn23 = findViewById(R.id.cardview_id23);
        cardbtn24 = findViewById(R.id.cardview_id24);
        cardbtn25 = findViewById(R.id.cardview_id25);
        cardbtn26 = findViewById(R.id.cardview_id26);
        cardbtn27 = findViewById(R.id.cardview_id27);
        cardbtn28 = findViewById(R.id.cardview_id28);
        cardbtn29 = findViewById(R.id.cardview_id29);
        cardbtn30 = findViewById(R.id.cardview_id30);
        cardbtn31 = findViewById(R.id.cardview_id31);
        cardbtn32 = findViewById(R.id.cardview_id32);
        cardbtn33 = findViewById(R.id.cardview_id33);
        cardbtn34 = findViewById(R.id.cardview_id34);
        cardbtn35 = findViewById(R.id.cardview_id35);
        cardbtn36 = findViewById(R.id.cardview_id36);
        cardbtn37 = findViewById(R.id.cardview_id37);
        cardbtn38 = findViewById(R.id.cardview_id38);
        cardbtn39 = findViewById(R.id.cardview_id39);
        cardbtn40 = findViewById(R.id.cardview_id40);
        backbutton = findViewById(R.id.backBtn);
        cambutton = findViewById(R.id.camBtn);

        cardbtn1.setOnClickListener(this);
        cardbtn2.setOnClickListener(this);
        cardbtn3.setOnClickListener(this);
        cardbtn4.setOnClickListener(this);
        cardbtn5.setOnClickListener(this);
        cardbtn6.setOnClickListener(this);
        cardbtn7.setOnClickListener(this);
        cardbtn8.setOnClickListener(this);
        cardbtn9.setOnClickListener(this);
        cardbtn10.setOnClickListener(this);
        cardbtn11.setOnClickListener(this);
        cardbtn12.setOnClickListener(this);
        cardbtn13.setOnClickListener(this);
        cardbtn14.setOnClickListener(this);
        cardbtn15.setOnClickListener(this);
        cardbtn16.setOnClickListener(this);
        cardbtn17.setOnClickListener(this);
        cardbtn18.setOnClickListener(this);
        cardbtn19.setOnClickListener(this);
        cardbtn20.setOnClickListener(this);
        cardbtn21.setOnClickListener(this);
        cardbtn22.setOnClickListener(this);
        cardbtn23.setOnClickListener(this);
        cardbtn24.setOnClickListener(this);
        cardbtn25.setOnClickListener(this);
        cardbtn26.setOnClickListener(this);
        cardbtn27.setOnClickListener(this);
        cardbtn28.setOnClickListener(this);
        cardbtn29.setOnClickListener(this);
        cardbtn30.setOnClickListener(this);
        cardbtn31.setOnClickListener(this);
        cardbtn32.setOnClickListener(this);
        cardbtn33.setOnClickListener(this);
        cardbtn34.setOnClickListener(this);
        cardbtn35.setOnClickListener(this);
        cardbtn36.setOnClickListener(this);
        cardbtn37.setOnClickListener(this);
        cardbtn38.setOnClickListener(this);
        cardbtn39.setOnClickListener(this);
        cardbtn40.setOnClickListener(this);
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
            case R.id.cardview_id5: i = new Intent(this,Distributor.class); startActivity(i); break;
            case R.id.cardview_id6: i = new Intent(this,Extension.class); startActivity(i); break;
            case R.id.cardview_id7: i = new Intent(this,FiberOpticCable.class); startActivity(i); break;
            case R.id.cardview_id8: i = new Intent(this,FiberOpticUnit.class); startActivity(i); break;
            case R.id.cardview_id9: i = new Intent(this,IsoCylinder.class); startActivity(i); break;
            case R.id.cardview_id10: i = new Intent(this,LightBarrier.class); startActivity(i); break;
            case R.id.cardview_id11: i = new Intent(this,MultipleDistributor.class); startActivity(i); break;
            case R.id.cardview_id12: i = new Intent(this,NonReturnValve.class); startActivity(i); break;
            case R.id.cardview_id13: i = new Intent(this,OneWayFlowControlValve.class); startActivity(i); break;
            case R.id.cardview_id14: i = new Intent(this,PlasticTubing.class); startActivity(i); break;
            case R.id.cardview_id15: i = new Intent(this,PlasticTubingB.class); startActivity(i); break;
            case R.id.cardview_id16: i = new Intent(this,PneumaticMuffler.class); startActivity(i); break;
            case R.id.cardview_id17: i = new Intent(this,ProximitySensor.class); startActivity(i); break;
            case R.id.cardview_id18: i = new Intent(this,PushInBulkheadConnector.class); startActivity(i); break;
            case R.id.cardview_id19: i = new Intent(this,PushInLFitting.class); startActivity(i); break;
            case R.id.cardview_id20: i = new Intent(this,PushInLFittingB.class); startActivity(i); break;
            case R.id.cardview_id21: i = new Intent(this,PushInLFittingRotatable.class); startActivity(i); break;
            case R.id.cardview_id22: i = new Intent(this,QuarterTurnActuator.class); startActivity(i); break;
            case R.id.cardview_id23: i = new Intent(this,VacuumFilter.class); startActivity(i); break;
            case R.id.cardview_id24: i = new Intent(this,VacuumGenerator.class); startActivity(i); break;
            case R.id.cardview_id25: i = new Intent(this,VacuumSuctionCup.class); startActivity(i); break;
            case R.id.cardview_id26: i = new Intent(this,AluminumProfilePlate.class); startActivity(i); break;
            case R.id.cardview_id27: i = new Intent(this,Cinterface.class); startActivity(i); break;
            case R.id.cardview_id28: i = new Intent(this,CableHolder.class); startActivity(i); break;
            case R.id.cardview_id29: i = new Intent(this,ControlConsole.class); startActivity(i); break;
            case R.id.cardview_id30: i = new Intent(this,ConveyorModule.class); startActivity(i); break;
            case R.id.cardview_id31: i = new Intent(this,DiffuseSensor.class); startActivity(i); break;
            case R.id.cardview_id32: i = new Intent(this,LightBarrierb.class); startActivity(i); break;
            case R.id.cardview_id33: i = new Intent(this,MpsTrolley.class); startActivity(i); break;
            case R.id.cardview_id34: i = new Intent(this,PaWorkpiece.class); startActivity(i); break;
            case R.id.cardview_id35: i = new Intent(this,QuickFixClampingAdapter.class); startActivity(i); break;
            case R.id.cardview_id36: i = new Intent(this,SimulationBox.class); startActivity(i); break;
            case R.id.cardview_id37: i = new Intent(this,StackingMagazineModule.class); startActivity(i); break;
            case R.id.cardview_id38: i = new Intent(this,StartUpValve.class); startActivity(i); break;
            case R.id.cardview_id39: i = new Intent(this,Stopper.class); startActivity(i); break;
            case R.id.cardview_id40: i = new Intent(this,ValveSlice.class); startActivity(i); break;
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