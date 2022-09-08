package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView text_respuesta;

    private EditText edit_numeroUno;
    private EditText edit_numeroDos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.resultado);

        edit_numeroUno = findViewById(R.id.numero1);
        edit_numeroDos = findViewById(R.id.numero2);

        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            text_respuesta.setText( suma(Integer.parseInt(edit_numeroUno.getText().toString()), Integer.parseInt(edit_numeroDos.getText().toString())) + "");
            }
        });

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText( resta(Integer.parseInt(edit_numeroUno.getText().toString()), Integer.parseInt(edit_numeroDos.getText().toString())) + "");
            }
        });

        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText( multiplicacion(Integer.parseInt(edit_numeroUno.getText().toString()), Integer.parseInt(edit_numeroDos.getText().toString())) + "");
            }
        });

        btn_division = findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText( division(Integer.parseInt(edit_numeroUno.getText().toString()), Integer.parseInt(edit_numeroDos.getText().toString())) + "");
            }
        });
    }

    public int suma (int a, int b){
        return a+b;
    }

    public int resta (int a, int b){
        return a-b;
    }

    public int multiplicacion (int a, int b){
        return a*b;
    }

    public int division (int a, int b){
        int respuesta = 0;

        if (b != 0){
            respuesta = a/b;
        }
        return respuesta;
    }
}