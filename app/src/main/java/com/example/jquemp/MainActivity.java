package com.example.jquemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionarPedra(View view){
        this.opcaoSelecionada("Pedra");
    }
    public void selecionarTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }
    public void selecionarPapel(View view){
        this.opcaoSelecionada("Papel");
    }
    public void opcaoSelecionada(String escolhaUsuario){

        int numero = new Random().nextInt(3);

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        String escolhaApp = opcoes[numero];

        ImageView imagemRes = findViewById(R.id.imageResultado);

        TextView mostraEscolha = findViewById()

        switch(escolhaApp){
            case "pedra":
                imagemRes.setImageResource(R.drawable.pedra);
                break;
            case "tesoura":
                imagemRes.setImageResource(R.drawable.tesoura);
                break;
            case "papel":
                imagemRes.setImageResource(R.drawable.Papel);
                break;
        }
        if ((escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
            (escolhaApp == "tesoura" && escolhaUsuario == "papel") ||
            (escolhaApp == "papel" && escolhaUsuario == "pedra")){

        }else if(
                (escolhaApp == "pedra" && escolhaUsuario == "papel") ||
                (escolhaApp == "papel" && escolhaUsuario == "tesoura")||
                (escolhaApp == "tesoura" && escolhaUsuario == "pedra")){

        }else{

        }

    }


}
