/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author User
 */
public class AcoesMamifero extends AcoesDiarias {

    private boolean passear;
    private boolean banho;

    public AcoesMamifero() {
    }

    public AcoesMamifero(boolean passear, boolean banho, int idAnimal, Date data, boolean comerAlimento, boolean beberAgua, float qtdAlimento) {
        super(idAnimal, data, comerAlimento, beberAgua, qtdAlimento);
        this.passear = passear;
        this.banho = banho;
    }
    public AcoesMamifero(boolean passear, boolean banho, int id, int idAnimal, Date data, boolean comerAlimento, boolean beberAgua, float qtdAlimento) {
        super(id, idAnimal, data, comerAlimento, beberAgua, qtdAlimento);
        this.passear = passear;
        this.banho = banho;
    }

   
    
    public boolean isPassear() {
        return passear;
    }

    public void setPassear(boolean passear) {
        this.passear = passear;
    }

    public boolean isBanho() {
        return banho;
    }

    public void setBanho(boolean banho) {
        this.banho = banho;
    }

}
