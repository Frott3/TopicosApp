package com.example.aluno.topicosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela3Activity extends AppCompatActivity {

    private EditText num1, num2;
    private TextView result;
    private Button btSomar, btSubtrair, btDividir, btMultiplicar;

    double n1, n2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        //Pegando os valores do usuário
        num1    = (EditText) findViewById(R.id.num1);
        num2    = (EditText) findViewById(R.id.num2);
        result  = (TextView) findViewById(R.id.result);

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

        //BOTÃO SUBTRAIR
        btSubtrair.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1-n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO DIVIDIR
        btDividir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1/n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });

        //BOTÃO MULTIPLICAR
        btMultiplicar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //Passando os valores do layout para as vars da classe
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1*n2;

                //Passando os valores da soma para o campo Resultado do layout
                result.setText(String.valueOf(resultado));
            }
        });
    }
}
