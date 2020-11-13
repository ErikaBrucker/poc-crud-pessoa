package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class AlterarDadosCadastrais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_dados_cadastrais);

        DadosCadastrais dadosCadastrais = DadosCadastriasFactory.build();

        EditText nome = (EditText) findViewById(R.id.txNome);
        nome.setText(dadosCadastrais.getNomeCompleto());
    }

}