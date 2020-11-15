package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class FuncionalidadesDoSistema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcionalidades_do_sistema);

        Button btInserir = (Button) findViewById(R.id.btInserir);
        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaCadastro();
            }
        });

        Button btConsultar = (Button) findViewById(R.id.btConsultar);
        btConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaConsulta();
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
                new Pessoa(100, "Erika Albano Brucker", "111.111.111-11"),
                new Pessoa(101, "Daniel Ramos Hanzen", "222.222.222-22"),
                new Pessoa(102, "Rafael da Silva Fontes", "333.333.333-33")

        );
       ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1,pessoas);
        listaCadastrados.setAdapter(adapter);
        listaCadastrados.setOnItemClickListener(chamaCadastrados());


    }


    public void irTelaConsulta(){

        Intent intent = new Intent(this, TelaConsulta.class);
        startActivity(intent);
    }


    public AdapterView.OnItemClickListener chamaCadastrados(){
        return ( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                irPessoasCadastradas();

            }
        });
    }

    private void irPessoasCadastradas(){

        Intent intent = new Intent(this, PessoasCadastradas.class);
        startActivity(intent);

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


