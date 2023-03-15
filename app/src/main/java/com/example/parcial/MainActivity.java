package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextNum1, editTextNum2;
    TextView textViewResul;
    Button buttonPotencia;
    Button buttonFibonacci;
    Button buttonMulti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
        editTextNum2 = (EditText) findViewById(R.id.editTextNum2);
        textViewResul = (TextView) findViewById(R.id.textViewResul);
        buttonPotencia = (Button) findViewById(R.id.buttonPotencia);
        buttonFibonacci = (Button) findViewById(R.id.buttonFibonacci);
        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonPotencia.setOnClickListener(this);
        buttonFibonacci .setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
            float n1, n2, res,resul;
            n1 = Float.parseFloat(editTextNum1.getText().toString());
            n2 = Float.parseFloat(editTextNum2.getText().toString());
            res= (n1-1) +(n2-2) ;
            resul=n1*n2;
            textViewResul .setText("el resultado es " + res);
            Toast.makeText(getApplicationContext(), "el resultado es " + res, Toast.LENGTH_LONG).show();
            textViewResul.setText("la multiplicacion es " + resul);
            Toast.makeText(getApplicationContext(), "la multiplicacion es " + resul, Toast.LENGTH_LONG).show();
    }
}