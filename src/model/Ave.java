/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import model.Animal;

/**
 *
 * @author User
 */
public class Ave extends Animal{

    private int cod_liberacao;

    public int getCod_liberacao() {
        return cod_liberacao;
    }

    public void setCod_liberacao(int cod_liberacao) {
        this.cod_liberacao = cod_liberacao;
    }

    public Ave() {
    }


    public Ave(int cod_liberacao, int id, String nome, float peso, int idade, String tipo, String raca, float alimento) {
        super(id, nome, peso, idade, tipo, raca, alimento);
        this.cod_liberacao = cod_liberacao;
    }
    
    
}
