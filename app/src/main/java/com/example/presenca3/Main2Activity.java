package com.example.presenca3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String v2 = extras.getString("Quadrado");
        if (v2 != null) {
            Toast.makeText(this, v2, Toast.LENGTH_LONG).show();
        }

        String idade = extras.getString("Idade");
        if (idade != null) {
            Toast.makeText(this, idade, Toast.LENGTH_SHORT).show();
        }

        String resultado = extras.getString("Raiz");
        if (resultado != null) {
            Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show();
        }

        String area = extras.getString("Area");
        if (area!= null){
        Toast.makeText(this,area, Toast.LENGTH_SHORT).show();
        }

    }


    public void voltaTela(View view) {

        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);

    }

}



