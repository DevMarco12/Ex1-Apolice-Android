package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Variáveis dos atributos do Android
    EditText txtSexo, txtIdade, txtValorCarro, txtNome;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Atribuindo o id do design para variáveis
        txtIdade = findViewById(R.id.txtIdade);
        txtSexo = findViewById(R.id.txtSexo);
        txtResultado = findViewById(R.id.txtResultado);
        txtValorCarro = findViewById(R.id.txtValorCarro);
        txtNome = findViewById(R.id.txtNome);
    }

    // Método que será chamado pelo botão
    public void Calcular (View view) {
        // Instância da classe
        Apolice apolice = new Apolice();

        // Aplicando os valores para os atributos da classe Apolice
        apolice.setIdade(Integer.parseInt(txtIdade.getText().toString()));
        apolice.setSexo(txtSexo.getText().charAt(0));
        apolice.setValorAutomovel(Double.parseDouble(txtValorCarro.getText().toString()));
        apolice.setNome(txtNome.getText().toString());

        // Resultado do método CalcularValor
        double result = apolice.CalcularValor();

        // Aplicando o resultado no componente do Android
        txtResultado.setText("Resultado de " + apolice.getNome() + ": " + result);
    }
}