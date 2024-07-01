package com.example.atp_mobile;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private Button buttonCadastro;
    private Button buttonPontosColeta;
    private Button buttonDiaTurnoColeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buttonCadastro = findViewById(R.id.button_cadastro);
        buttonPontosColeta = findViewById(R.id.button_coleta);
        buttonDiaTurnoColeta = findViewById(R.id.button_turno);


        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaCadastro();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.editarCadastro) {
            Toast.makeText(MainActivity.this, "Você clicou em editar", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void abrirTelaCadastro() {
        Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
        startActivity(intent);
    }

    private void abrirTelaPontosColeta() {
        Intent intent = new Intent(MainActivity.this, PontosColetaActivity.class);
        startActivity(intent);
    }

    private void abrirTelaDiaTurnoColeta() {
        Intent intent = new Intent(MainActivity.this, DiaTurnoColetaActivity.class);
        startActivity(intent);
    }

}

