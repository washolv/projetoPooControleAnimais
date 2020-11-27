/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AcoesDiariasDAO;
import dao.AnimalDAO;
import interfaces.Cadastravel;
import java.util.ArrayList;

/**
 *
 * @author w_olv
 */
public class AcoesDiariasController implements Cadastravel{

    @Override
    public boolean cadastrar(Object acao) {
        boolean retorno=AcoesDiariasDAO.CadastrarAcao(acao);
        return retorno;
    }

    @Override
    public boolean alterar(Object acao) {
        boolean retorno=AcoesDiariasDAO.EditarAcao(acao);
        return retorno;
    }

    @Override
    public ArrayList<Object> pesquisar(String pesquisar) {
        ArrayList<Object> listaAcoes=AcoesDiariasDAO.listarAcoes();
        return listaAcoes;
    }

    @Override
    public boolean excluir(String tabela, int id) {
        boolean retorno = AcoesDiariasDAO.ExcluirAcao(tabela, id);
        return retorno;
    }
    
    public static String buscar(String tabela, int id) {
        String retorno = AcoesDiariasDAO.buscar(tabela, id);
        return retorno;
    }
    
}
