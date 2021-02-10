package com.example.ejercicioclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvnum;
    int i=0;
    int result;
    String result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnum=(TextView)findViewById(R.id.tvtabla);

        Bundle bundle = getIntent().getExtras();
        String numero=bundle.getString("txtnum");

        tvnum=(TextView)findViewById(R.id.tvtabla);
        int valor1n = Integer.parseInt(numero);
       for(i=1; i<=13; i++){
           result=valor1n*i;
           result2 += valor1n+ " x " + i + " = " + String.valueOf(result) + '\n';
       }
        tvnum.setText(result2);

       }
    }


