package com.example.carles.activitat1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class primeraPantalla extends AppCompatActivity {


    Button next;
    EditText nom;
    EditText cognom;
    EditText edat;
    CheckBox acepta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla);

        nom = (EditText)findViewById(R.id.nom);
        cognom = (EditText)findViewById(R.id.cognom);
        edat = (EditText)findViewById(R.id.edat);
        acepta = (CheckBox)findViewById(R.id.aceptar);

        next = (Button) findViewById(R.id.btn_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(acepta.isChecked()) {
                    Bundle b = new Bundle();
                    b.putString("NOM", nom.getText().toString());
                    b.putString("COGNOM", cognom.getText().toString());
                    b.putString("EDAT", edat.getText().toString());
                    Intent next = new Intent(primeraPantalla.this, segonaPantalla.class);
                    next.putExtras(b);
                    startActivity(next);
                }

            }
        });


    }
}
