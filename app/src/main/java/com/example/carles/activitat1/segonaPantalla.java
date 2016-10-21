package com.example.carles.activitat1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class segonaPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona_pantalla);

        TextView nom;
        TextView cognom;
        TextView edat;

        nom = (TextView)findViewById(R.id.nom2p);
        cognom = (TextView)findViewById(R.id.cognom2p);
        edat = (TextView)findViewById(R.id.edat2p);

        Bundle b = getIntent().getExtras();
        nom.setText(b.getString("NOM"));
        cognom.setText(b.getString("COGNOM"));
        edat.setText(b.getString("EDAT"));
    }
}
