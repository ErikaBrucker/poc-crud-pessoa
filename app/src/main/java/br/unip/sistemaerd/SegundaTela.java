package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela1);

        Button btInserir = (Button) findViewById(R.id.btInserir);
        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaCadastro();
            }
        });

        Button btSair = (Button) findViewById(R.id.btSair);
        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaInicial();
            }
        });

        ListView listaCadastrados = (ListView) findViewById(R.id.listaCadastrados);
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa(100, "Erika", "1234"),
                new Pessoa(101, "Pedro", "98745"),
                new Pessoa(100, "Erika", "1234"),
                new Pessoa(101, "Pedro", "98745"),
                new Pessoa(100, "Erika", "1234"),
                new Pessoa(101, "Pedro", "98745"),
                new Pessoa(100, "Erika", "1234"),
                new Pessoa(101, "Pedro", "98745"),
                new Pessoa(100, "Erika", "1234"),
                new Pessoa(101, "Pedro", "98745"),
                new Pessoa(100, "Erika", "1234"),
                new Pessoa(101, "Pedro", "98745")
        );
        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1,pessoas);
        listaCadastrados.setAdapter(adapter);


    }

    private void irTelaCadastro(){

        Intent intent = new Intent(this, TelaCadastro.class);
        startActivity(intent);

    }

      private void irTelaInicial() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}


