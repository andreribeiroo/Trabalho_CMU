package com.example.andrribeiro.change_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnActivity4;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity4 = (Button) findViewById(R.id.user_sign_in_button);
        ImageView img = (ImageButton) findViewById(R.id.img);
    }


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
        {
            Intent i = new Intent(this, MapsActivity.class);
            startActivity(i);

        }
    }
}