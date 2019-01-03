package com.example.andrribeiro.change_activity;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button btnActivity4;
    Button btnmap1;
    Button btnmap2;
    String uri="geo:0,0?q=india";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity4 =  findViewById(R.id.user_sign_in_button);
         btnmap1 = findViewById(R.id.img);
         btnmap2 =  findViewById(R.id.img2);


    btnmap2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent mapIntent =new Intent(Intent.ACTION_VIEW);
            mapIntent.setPackage("com.google.android.apps.maps");
            if(mapIntent.resolveActivity(getPackageManager())!=null){
                startActivity(mapIntent);
            }
        }
    });}

    public void btnClickAct4(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void btnClickAct1(View v) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void btnClickAct3(View v) {
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }

    public void imgonClick(View v) {

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("GPS Status")
                .setContentText("A Obter dados dos satélite....");


        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, mBuilder.build());


        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);


        }

}
