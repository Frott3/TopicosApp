package com.example.aluno.topicosapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnTela2;
    private Button btnTela3;

    private EditText num1, num2, result;
    private Button btSomar, btSubtrair, btDividir, btMultiplicar;

    double n1, n2, resultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTela2 = (Button) findViewById(R.id.buttonTela2);

        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //O que fazer quando clicar neste botão

                startActivity( new Intent(MainActivity.this, Tela2Activity.class));
            }
        });

        btnTela3 = (Button) findViewById(R.id.buttonTela3);

        btnTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //O que fazer quando clicar neste botão

                startActivity( new Intent(MainActivity.this, Tela3Activity.class));
            }
        });

        //Pegando os valores do usuário
        num1    = (EditText) findViewById(R.id.num1);
        num2    = (EditText) findViewById(R.id.num2);
        result  = (EditText) findViewById(R.id.result);

        btSomar       = (Button)   findViewById(R.id.btSomar);
        btSubtrair    = (Button)   findViewById(R.id.btSubtrair);
        btDividir     = (Button)   findViewById(R.id.btDividir);
        btMultiplicar = (Button)   findViewById(R.id.btMultiplicar);

        //BOTÃO SOMAR
        btSomar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1+n2;


                result.setText(String.valueOf(resultado));
            }
        });



    }
}
