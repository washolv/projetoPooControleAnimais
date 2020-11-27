/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import model.Animal;

/**
 *
 * @author User
 */
public interface Cadastravel {

    public abstract boolean cadastrar(Object animal);

    public abstract boolean alterar(Object animal);

    public abstract ArrayList<Object> pesquisar(String pesquisar);

    public abstract boolean excluir(String tabela, int id);

}
