package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TelaCadastro extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        Spinner spinner = (Spinner) findViewById(R.id.estadosBrasileiros);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.estadosBrasilerios, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        FloatingActionButton botaoAddTelefone = (FloatingActionButton) findViewById(R.id.addTelefone);
        botaoAddTelefone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaCadastroTelefone();
            }
        });


        Button btVoltar = (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irSegundaTela();
            }
        });

        Button btSalvar = (Button) findViewById(R.id.btSalvar);
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irSegundaTela();
            }
        });


    }

     private void irSegundaTela(){
        Intent intent = new Intent(this, FuncionalidadesDoSistema.class);
        startActivity(intent);
    }

    private void irTelaCadastroTelefone(){
        Intent intent = new Intent(this, TelaCadastroTelefone.class);
        startActivity(intent);

    }
}


