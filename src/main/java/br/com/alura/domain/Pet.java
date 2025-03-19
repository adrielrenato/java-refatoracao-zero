package br.com.alura.domain;

public class Pet {
    private String nome;
    private String raca;
    private Integer idade;
    private String cor;
    private Float peso;
    private String tipo;

    public Pet(String nome, String raca, Integer idade, String cor, Float peso, String Tipo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
        this.tipo = tipo;
    }
}
