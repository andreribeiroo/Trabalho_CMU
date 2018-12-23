package com.example.andrribeiro.change_activity;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button idbtnFavorite1;
        Button idbtnFavorite2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        idbtnFavorite1 = (Button) findViewById(R.id.idbtnFavorite1);
        idbtnFavorite2 = (Button) findViewById(R.id.idbtnFavorite2);

    }



    public void btnClickFa1(View view) {
        Toast.makeText(this, "Marker in Casa", Toast.LENGTH_SHORT).show();
    }

    public void btnClickFa2(View view) {
        Toast.makeText(this, "Marker in Trabalho", Toast.LENGTH_SHORT).show();
    }
}
