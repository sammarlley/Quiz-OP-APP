package com.example.aula2910;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class questao4Activity extends AppCompatActivity {
    private Button btn_opcao_1;
    private Button btn_opcao_2;
    private Button btn_opcao_3;
    private Button btn_opcao_4;
    private TextView tv_resultado;
    private Button btn_avancar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_questao4);
        btn_opcao_1 = (Button) findViewById(R.id.btn_opcao_1);
        btn_opcao_2 = (Button) findViewById(R.id.btn_opcao_2);
        btn_opcao_3 = (Button) findViewById(R.id.btn_opcao_3);
        btn_opcao_4 = (Button) findViewById(R.id.btn_opcao_4);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        btn_avancar = (Button) findViewById(R.id.btn_avancar);


        btn_avancar.setVisibility(View.INVISIBLE);

        btn_opcao_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_resultado.setText("Resposta errada!");
                btn_avancar.setVisibility(View.INVISIBLE);
            }
        });
        btn_opcao_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_resultado.setText("Resposta errada!");
                btn_avancar.setVisibility(View.INVISIBLE);
            }
        });
        btn_opcao_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_resultado.setText("Resposta errada!");
                btn_avancar.setVisibility(View.INVISIBLE);
            }
        });
        btn_opcao_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_resultado.setText("Resposta Correta!!!!");
                btn_avancar.setVisibility(View.INVISIBLE);
            }
        });
        btn_avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(getBaseContext(), questao5Activity.class);
                startActivities(ir);
            }
        });
    }
}