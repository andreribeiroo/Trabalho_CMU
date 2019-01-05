package com.example.andrribeiro.change_activity;

        import android.arch.persistence.room.Room;
        import android.content.Intent;
        import android.support.design.widget.FloatingActionButton;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;
        import android.widget.Toast;

        import com.example.andrribeiro.change_activity.data.AppDatabase;

public class MainActivity2 extends AppCompatActivity {
private ListView List;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button idbtnFavorite1;
        Button idbtnFavorite2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-name.db").build();

        List = findViewById(R.id.ListMeusLocais);

        fab = findViewById(R.id.newlocal);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



          Toast.makeText(getBaseContext(), "Adicionar Novo Local", Toast.LENGTH_SHORT).show();}
});

    }}