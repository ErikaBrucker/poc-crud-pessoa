package br.unip.sistemaerd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.Login);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if(login.equals("admin")&&senha.equals("111")){
                    alert("Login realizado com sucesso");
                    irParaSegundaTela();
                }else{
                    alert("Login ou senha invalida");
                };
            }
        });
    }
    private void alert(String s){

        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }

    private void irParaSegundaTela(){

      /*  var segundaTela = Intent(this, SegundaTela::class.java)
        startActivity(segundaTela);*/

        Intent intent = new Intent(this, SegundaTela.class);
        startActivity(intent);

    }
}



/**public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/