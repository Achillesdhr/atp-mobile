package com.example.atp_mobile;// CadastroActivity.java

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    private Button buttonRetornar;
    private Button buttonPontosColeta;
    private Button buttonDiaTurnoColeta;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        buttonRetornar = findViewById(R.id.buttonRetornar);
        buttonPontosColeta = findViewById(R.id.buttonPontosColeta);
        buttonDiaTurnoColeta = findViewById(R.id.buttonDiaTurnoColeta);

        buttonRetornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retornarParaTelaInicial();
            }
        });

        buttonPontosColeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaPontosColeta();
            }
        });

        buttonDiaTurnoColeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaDiaTurnoColeta();
            }
        });
    }



    private void retornarParaTelaInicial() {
        finish(); // Fecha a atividade atual e retorna para a tela anterior (MainActivity)
    }

    private void abrirTelaPontosColeta() {
        // Intent para abrir a tela de Pontos de Coleta
        // Implemente conforme necessário
    }

    private void abrirTelaDiaTurnoColeta() {
        // Intent para abrir a tela de Dia e Turno da Coleta
        // Implemente conforme necessário
    }
}
