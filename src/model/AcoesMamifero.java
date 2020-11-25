/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class AcoesMamifero {
    
    
    private boolean passear;
    private boolean banho;

    public AcoesMamifero(boolean passear, boolean banho) {
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
