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
public interface AcoesAnimais {
    
    
          public abstract boolean cadastrar(Animal animal);
          public abstract boolean alterar(Animal animal);
          public abstract ArrayList<Animal> pesquisar(String pesquisar);
          public abstract boolean excluir(String animal, int id);
    
}
