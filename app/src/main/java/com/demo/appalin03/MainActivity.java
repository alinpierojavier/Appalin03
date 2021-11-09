package com.demo.appalin03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextViewa;
    private EditText editTextViewb;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextViewa = findViewById(R.id.editTexta);
        editTextViewb = findViewById(R.id.editTextb);

        textViewResult = findViewById(R.id.textResultado);
    }

    public void suma(View view){
        int Resultado = Integer.parseInt(editTextViewa.getText().toString())+Integer.parseInt(editTextViewb.getText().toString());
        textViewResult.setText(Resultado+"");
    }
    public void resta(View view){
        int Resultado = Integer.parseInt(editTextViewa.getText().toString())-Integer.parseInt(editTextViewb.getText().toString());
        textViewResult.setText(Resultado+"");
    }
    public void multiplicacion(View view){
        int Resultado = Integer.parseInt(editTextViewa.getText().toString())*Integer.parseInt(editTextViewb.getText().toString());
        textViewResult.setText(Resultado+"");
    }
    public void division(View view){
        int Resultado = Integer.parseInt(editTextViewa.getText().toString())/Integer.parseInt(editTextViewb.getText().toString());
        textViewResult.setText(Resultado+"");
    }
}