package com.example.andrribeiro.change_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnActivity1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnActivity1 = findViewById(R.id.button);

    }

    public void btnClickAct4(View v) {


        final EditText nMatricula = findViewById(R.id.matricula);
        final EditText nUtilizador = findViewById(R.id.utilizador);
        final EditText nPassword = findViewById(R.id.password);



        String user = nUtilizador.getText().toString();
        String matricula = nMatricula.getText().toString();
        String pass = nPassword.getText().toString();


       if( (user.equals("")||(matricula.equals(""))||(pass.equals(""))) ){
           Toast.makeText(this, "Todos os campos devem estar preenchidos",Toast.LENGTH_SHORT).show();

        }else{

           Intent i = new Intent(this, MainActivity4.class);

           startActivity(i);
        }
    }

    public void btnClickAct1(View view) {
    }

    public void imgonClick(View view) {
    }

    public void btnClickAct3(View view) {
    }
}
