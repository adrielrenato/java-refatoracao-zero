package br.com.alura.domain;

public class Pet {
    private Long id;
    private String nome;
    private String raca;
    private Integer idade;
    private String cor;
    private Float peso;
    private String tipo;

    public Pet() {}

    public Pet(String nome, String raca, Integer idade, String cor, Float peso, String tipo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public Float getPeso() {
        return peso;
    }
}
