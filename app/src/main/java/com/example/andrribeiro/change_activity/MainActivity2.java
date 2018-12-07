package com.example.andrribeiro.change_activity;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnActivity2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnActivity2 = (Button) findViewById(R.id.idbtnActivity);
    }

    public void btnClickAct2(View v) {
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);
    }
}
