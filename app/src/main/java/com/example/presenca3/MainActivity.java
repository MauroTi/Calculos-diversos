package com.example.presenca3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.IntentService;
import android.content.Intent;
import android.hardware.Camera;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double v1;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calcularQuadrado(View view) {

        EditText etValorQuadrado = findViewById(R.id.etValorQuadrado);
        String valor = etValorQuadrado.getText().toString();
        try{
            v1 = Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Opa, texto inválido", Toast.LENGTH_SHORT).show();
        }

        double v2 = Math.pow(v1,2);
       // Toast.makeText(this, "Quadrado:" + v2, Toast.LENGTH_SHORT).show();
        //Toast.makeText( view.getContext(),  "Teste", Toast. LENGTH_LONG).show();

        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        i.putExtra("Quadrado", ""+v2);
        startActivity(i);
    }

   public void calcularIdade(View view) {
        EditText etCalculoIdade = findViewById(R.id.etCalculoIdade);
        int valor;
        int idade;
        valor = Integer.parseInt(etCalculoIdade.getText().toString());
        try{

            valor = Integer.parseInt(String.valueOf(valor));
        } catch (NumberFormatException e){
            Toast.makeText(this, "Opa, somente números", Toast.LENGTH_SHORT).show();

        }

        Calendar c = Calendar.getInstance();
        int anoA = c.get(Calendar.YEAR);
        idade = anoA - Integer.parseInt(String.valueOf(valor));
        //Toast.makeText(this, "Sua idade é " + idade, Toast.LENGTH_SHORT).show();

       Intent i = new Intent(MainActivity.this,Main2Activity.class);
       i.putExtra("Idade", ""+idade);
       startActivity(i);
    }

    public void raizQuadrada(View view) {
        EditText etRaiz = findViewById(R.id.etRaiz);
        String raiz = etRaiz.getText().toString();
        try{
            v1 = Double.parseDouble(String.valueOf(raiz));
        }
        catch(NumberFormatException e){
            Toast.makeText(this, "Somente números!!!", Toast.LENGTH_SHORT).show();
        }

        double resultado = Math.sqrt(v1);
        //Toast.makeText(this, "A raiz é " + resultado, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("Raiz", ""+ resultado);
        startActivity(i);
    }

    public void areaCirculo(View view) {
        EditText etareaCirculo = findViewById(R.id.etareaCirculo);
        String raio = etareaCirculo.getText().toString();
        double area;

        try {
            v1 = Double.parseDouble(raio);
        }
        catch(NumberFormatException e){
            Toast.makeText(this, "Somente números!!", Toast.LENGTH_SHORT).show();
        }
        area = Math.PI*(v1*v1);
        //Toast.makeText(this, "A área é " + area, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("Area","" + area);
        startActivity(i);
    }


   /* public void mudaTela(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);

    }*/

       /* primeira tela

        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        i.putExtra("NOME", etNome.getText().toString());
        startActivity(i);

        segunda tela

        Bundle extras = getIntent().getExtras();

        String nome = extras.getString("NOME");
        Toast.makeText(this,nome, Toast.LENGTH_LONG).show();*/

}
