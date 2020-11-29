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
public class AcoesAve extends AcoesDiarias {

    public AcoesAve() {

    }

    public AcoesAve(int idAnimal, Date data, boolean comerAlimento, boolean beberAgua, float qtdAlimento) {
        super(idAnimal, data, comerAlimento, beberAgua, qtdAlimento);
    }

    public AcoesAve(int id, int idAnimal, Date data, boolean comerAlimento, boolean beberAgua, float qtdAlimento) {
        super(id, idAnimal, data, comerAlimento, beberAgua, qtdAlimento);
    }

    
    

}
