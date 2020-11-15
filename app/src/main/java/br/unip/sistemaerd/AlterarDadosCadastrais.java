package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class AlterarDadosCadastrais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_dados_cadastrais);

        DadosCadastrais dadosCadastrais = DadosCadastriasFactory.build();

        FloatingActionButton voltarTelaPessoasCadastradas = (FloatingActionButton) findViewById(R.id.voltarTelaPessoasCadastradas);
        voltarTelaPessoasCadastradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaPessoasCadastradas();
            }
        });


        EditText id = (EditText) findViewById(R.id.alterarId);
        id.setText(String.valueOf(dadosCadastrais.getId()));

        EditText nome = (EditText) findViewById(R.id.alterarNome);
        nome.setText(dadosCadastrais.getNomeCompleto());

        EditText cpf = (EditText) findViewById(R.id.alterarCPF);
        cpf.setText(dadosCadastrais.getCpf());

        EditText logradouro = (EditText) findViewById(R.id.alterarLogradouro);
        logradouro.setText(dadosCadastrais.getLogradouro());

        EditText numero = (EditText) findViewById(R.id.alterarNumero);
        numero.setText(String.valueOf(dadosCadastrais.getNumero()));

        EditText complemento = (EditText) findViewById(R.id.alterarComplemento);
        complemento.setText(dadosCadastrais.getComplemento());

        EditText alterarCEP = (EditText) findViewById(R.id.alterarCEP);
        alterarCEP.setText(String.valueOf(dadosCadastrais.getCep()));

        EditText bairro = (EditText) findViewById(R.id.alterarBairro);
        bairro.setText(dadosCadastrais.getBairro());

        EditText cidade = (EditText) findViewById(R.id.alterarCidade);
        cidade.setText(dadosCadastrais.getCidade());


        TextView telefone = (TextView) findViewById(R.id.alterarTelefoneCadastrado);
        telefone.setText(String.valueOf(dadosCadastrais.getTelefone()));



        Spinner estado = (Spinner) findViewById(R.id.alterarEstadosBrasileiros);
        ArrayAdapter<CharSequence> adapterEstado = ArrayAdapter.createFromResource(this,
                R.array.alterarEstadosBrasileiros, android.R.layout.simple_spinner_item);
        adapterEstado.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        estado.setAdapter(adapterEstado);


        Spinner tipoTelefone = (Spinner) findViewById(R.id.alterarTipoTelefone);
        ArrayAdapter<CharSequence> adapterTelefone = ArrayAdapter.createFromResource(this,
                R.array.alterarTipoTelefone, android.R.layout.simple_spinner_item);
        adapterTelefone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoTelefone.setAdapter(adapterTelefone);
    }





       // EditText numTelefone = (EditText) findViewById(R.id.telefoneCadastrado);
       // numTelefone.setText(dadosCadastrais.getTipoTelefone());


        /*FloatingActionButton btEditarTelefone = (FloatingActionButton) findViewById(R.id.btEditarTelefone);
        btEditarTelefone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaCadastroTelefone();
            }
        });*/






    public void irTelaCadastroTelefone(){
        Intent intent = new Intent(this, TelaCadastroTelefone.class);
        startActivity(intent);

    }


    public void irTelaPessoasCadastradas(){
        Intent intent = new Intent(this, PessoasCadastradas.class);
        startActivity(intent);

    }
}

