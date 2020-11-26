/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AnimalDAO;
import static dao.AnimalDAO.listarAnimal;
import interfaces.AcoesAnimais;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Animal;

/**
 *
 * @author User
 */
public class AnimalController implements AcoesAnimais {

    @Override
    public boolean cadastrar(Animal animal) {

        //grava a informação no banco de dados
        boolean retorno = false;
        try {
            retorno = AnimalDAO.inserirNovoAnimal(animal);
        } catch (SQLException ex) {
            Logger.getLogger(AnimalController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retorno;

    }

    @Override
    public boolean alterar(Animal animal) {
        boolean retorno=AnimalDAO.editarAnimal(animal);
        return retorno;
    }

    @Override
    public ArrayList<Animal> pesquisar(String pesquisa) {
        ArrayList<Animal> animais = AnimalDAO.listarAnimal(pesquisa);

        return animais;
    }

    @Override
    public boolean excluir(String animal, int id) {
        boolean retorno = AnimalDAO.excluirAnimal(animal, id);
        return retorno;
    }

    public static void teste() {

    }

}
