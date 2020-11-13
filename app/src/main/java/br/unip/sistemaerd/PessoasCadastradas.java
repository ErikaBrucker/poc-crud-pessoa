package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;
import java.util.List;

public class PessoasCadastradas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoas_cadastradas);





        FloatingActionButton botaoVoltar = (FloatingActionButton) findViewById(R.id.btVoltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irSegundaTela();
            }
        });



        Button btAlterar = (Button) findViewById(R.id.btAlterar);
        btAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTelaAlteracao();
            }
        });

        Button btExcluir = (Button) findViewById(R.id.btExcluir);
        btExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irSegundaTela();
            }
        });


        DadosCadastrais dadosCadastrais = DadosCadastriasFactory.build();


        TextView tvId = (TextView) findViewById(R.id.tvId);
        tvId.setText(String.valueOf(dadosCadastrais.getId()));


        TextView tvNome = (TextView) findViewById(R.id.tvNome);
        tvNome.setText(dadosCadastrais.getNomeCompleto());

        TextView tvCPF = (TextView) findViewById(R.id.tvCPF);
        tvCPF.setText(dadosCadastrais.getCpf());

        TextView tvLogradouro = (TextView) findViewById(R.id.tvLogradouro);
        tvLogradouro.setText(dadosCadastrais.getLogradouro());

        TextView tvNumero = (TextView) findViewById(R.id.tvNumero);
        tvNumero.setText(String.valueOf(dadosCadastrais.getNumero()));


        TextView tvComplemento = (TextView) findViewById(R.id.tvComplemento);
        tvComplemento.setText(dadosCadastrais.getComplemento());

        TextView tvCep = (TextView) findViewById(R.id.tvCep);
        tvCep.setText(dadosCadastrais.getCep());

        TextView tvBairro = (TextView) findViewById(R.id.tvBairro);
        tvBairro.setText(dadosCadastrais.getBairro());

        TextView tvCidade = (TextView) findViewById(R.id.tvCidade);
        tvCidade.setText(dadosCadastrais.getCidade());

        TextView tvEstado = (TextView) findViewById(R.id.tvEstado);
        tvEstado.setText(dadosCadastrais.getEstado());

        TextView tvTipoTelefone = (TextView) findViewById(R.id.tvTipoTelefone);
        tvTipoTelefone.setText(dadosCadastrais.getTipoTelefone());

        TextView tvTelefone = (TextView) findViewById(R.id.tvTelefone);
        tvTelefone.setText(dadosCadastrais.getTelefone());



        /*ListView dadosCadastrais = (ListView) findViewById(R.id.listaCadastrados);
        List<DadosCadastrais> dadosPessoais = Arrays.asList(
                new DadosCadastrais(100, "Erika", "111.111.111-11", "Rua das Flores",
                        444, "apto 101", "11.111-001", "Floresta",
                        "Jardim", "SP", "Celular", "(11)99999-9999")

        );
        ArrayAdapter<DadosCadastrais> adapter = new ArrayAdapter<DadosCadastrais>(this, android.R.layout.simple_list_item_1,dadosPessoais);
        dadosCadastrais.setAdapter(adapter);
        dadosCadastrais.setOnItemClickListener(chamaCadastrados());
*/

    }


   /* public AdapterView.OnItemClickListener chamaCadastrados(){
        return ( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                irPessoasCadastradas();

            }
        });


    }*/



    private void irPessoasCadastradas(){

        Intent intent = new Intent(this, PessoasCadastradas.class);
        startActivity(intent);

    }




    private void irSegundaTela (){

        Intent intent = new Intent(this, SegundaTela.class);
        startActivity(intent);
    }





    private void irTelaCadastro(){

        Intent intent = new Intent(this, TelaCadastro.class);
        startActivity(intent);
    }

    private void irTelaAlteracao(){

        Intent intent = new Intent(this, AlterarDadosCadastrais.class);
        startActivity(intent);
    }


}








