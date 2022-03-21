package com.example.ex1;

public class Apolice {
    // Variáveis
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    // Construtor vázio
    public Apolice() {
    }

    // Construtor com os atributos
    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    // Método que irá calcular o valor da Apolice
    public double CalcularValor() {
        if (sexo == 'M' && idade <= 25) {
            return valorAutomovel * 10 / 100;
        }
        if (sexo == 'M' && idade > 25) {
            return valorAutomovel * 5 / 100;
        }
        else {
            return valorAutomovel * 2 / 100;
        }
    }

    // Getter e Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
}
