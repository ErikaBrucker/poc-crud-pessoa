package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TelaCadastroTelefone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_telefone);



        Spinner spinner = (Spinner) findViewById(R.id.TxEscolhaOpcoesTelefone);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.txEscolhaOpcoesTelefone, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        EditText tTelefone = (EditText)findViewById(R.id.telefoneCadastrado);
        String telefone = tTelefone.getText().toString();

        Button botaoSalvar= (Button) findViewById(R.id.btSalvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alert("Telefone salvo com sucesso!");
                irTelaCadastro();
            }

        });


        FloatingActionButton botaoVoltar = (FloatingActionButton) findViewById(R.id.btVoltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaCadastro();
            }
        });

    }
    private void alert(String s){

        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }


    private void irTelaCadastro(){

        Intent intent = new Intent(this, TelaCadastro.class);
        startActivity(intent);

    }


}