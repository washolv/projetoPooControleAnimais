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
public class Mamifero extends Animal {

 

    public Mamifero(String nome, float peso, int idade, String tipo, String raca, float alimento) {
        super(nome, peso, idade, tipo, raca, alimento);
    }

 
public boolean passear(boolean p){
    return p;
}
     
public boolean banho(boolean b){
    return b;
}
}
