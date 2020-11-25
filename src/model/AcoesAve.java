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
public class AcoesAve extends AcoesDiarias{
    
    
      private int idAve;
      

    public AcoesAve() {
 
    }

    public AcoesAve(int id, Date data, boolean comerAlimento, boolean beberAgua, float qtdAlimento) {
        super(id, data, comerAlimento, beberAgua, qtdAlimento);
    }
    

    public int getIdAve() {
        return idAve;
    }

    public void setIdAve(int idAve) {
        this.idAve = idAve;
    }
   
}
