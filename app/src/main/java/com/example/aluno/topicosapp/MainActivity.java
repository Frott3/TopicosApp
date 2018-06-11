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





    }
}
