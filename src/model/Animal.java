package model;

import interfaces.Cadastravel;

public class Animal {
    
    

    protected int id;
    protected String nome;
    protected float peso;
    protected int idade;
    protected String tipo;
    protected String raca;
    protected float alimento;

    public Animal() {
    }

    public Animal(int id, String nome, float peso, int idade, String tipo, String raca, float alimento) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.tipo = tipo;
        this.raca = raca;
        this.alimento = alimento;
    }
     public Animal( String nome, float peso, int idade, String tipo, String raca, float alimento) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.tipo = tipo;
        this.raca = raca;
        this.alimento = alimento;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getAlimento() {
        return alimento;
    }

    public void setAlimento(float alimento) {
        this.alimento = alimento;
    }
    

}
