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
public class AcoesDiarias {

    private int id;
    private Date data;
    private int idAnimal;
    private boolean comerAlimento;
    private boolean beberAgua;
    private float qtdAlimento;

    public AcoesDiarias() {
    }

    public AcoesDiarias(int idAnimal, Date data, boolean comerAlimento, boolean beberAgua, float qtdAlimento) {
        this.idAnimal = idAnimal;
        this.data = data;
        this.comerAlimento = comerAlimento;
        this.beberAgua = beberAgua;
        this.qtdAlimento = qtdAlimento;
    }

  
    public AcoesDiarias(int id, int idAnimal, Date data, boolean comerAlimento, boolean beberAgua, float qtdAlimento) {
        this.id=id;
        this.idAnimal = idAnimal;
        this.data = data;
        this.comerAlimento = comerAlimento;
        this.beberAgua = beberAgua;
        this.qtdAlimento = qtdAlimento;
    }
    

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isComerAlimento() {
        return comerAlimento;
    }

    public void setComerAlimento(boolean comerAlimento) {
        this.comerAlimento = comerAlimento;
    }

    public boolean isBeberAgua() {
        return beberAgua;
    }

    public void setBeberAgua(boolean beberAgua) {
        this.beberAgua = beberAgua;
    }

    public float getQtdAlimento() {
        return qtdAlimento;
    }

    public void setQtdAlimento(float qtdAlimento) {
        this.qtdAlimento = qtdAlimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
