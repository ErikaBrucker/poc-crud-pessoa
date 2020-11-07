package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TelaCadastro extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);


      /*  ListView lista = (ListView) findViewById (R.id.telefoneCadastrado);
        ArrayList<String> telefoneCadastrado = preencherDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, telefoneCadastrado);
        lista.setAdapter(arrayAdapter);


        }

       */


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


    }

/*
        private ArrayList<String> preencherDados() {
            ArrayList<String> dados = new ArrayList<String>();
            for ( tele!= null) {
                dados.add("TxEscolhaOpcoesTelefone");
                dados.add("telefoneCadastrado");

            }

            return dados;

        }
*/

        private void irTelaCadastroTelefone(){


            Intent intent = new Intent(this, TelaCadastroTelefone.class);
            startActivity(intent);

        }
}


