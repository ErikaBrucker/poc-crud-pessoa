package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


