/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AcoesAve;
import model.AcoesDiarias;
import model.AcoesMamifero;
import model.Animal;
import model.Ave;
import model.Mamifero;
import utils.ConexaoMySql;

/**
 *
 * @author w_olv
 */
public class AcoesDiariasDAO {

    private static Connection conexao;

    public static ArrayList<Object> listarAcoes() {
        PreparedStatement addSQL = null;
        conexao = ConexaoMySql.getConexaoMySQL();
        PreparedStatement instrucaoSQL = null;

        ArrayList<Object> listaAcoes = new ArrayList<Object>();
        return listaAcoes;
    }

    public static boolean CadastrarAcao(Object acao) {
        boolean retorno = false;
        PreparedStatement addSQL = null;
        conexao = ConexaoMySql.getConexaoMySQL();
        PreparedStatement instrucaoSQL = null;
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

        try {
            if (acao instanceof AcoesMamifero) {
                AcoesMamifero ac = (AcoesMamifero) acao;
                String formatted = format1.format(ac.getData());

                addSQL = conexao.prepareStatement("INSERT INTO AcoesMamifero (beberAgua, dataAcao , comerAlimento , qtdAlimento , passear , banho, idMamifero)"
                        + "VALUES(?, ?, ?, ?, ?, ?, ?)");
                //Adicionando parâmetros ao comando SQL
                addSQL.setString(1, trueOrFalse(ac.isBeberAgua()));
                addSQL.setString(2, formatted);
                addSQL.setString(3, trueOrFalse(ac.isComerAlimento()));
                addSQL.setFloat(4, ac.getQtdAlimento());
                addSQL.setString(5, trueOrFalse(ac.isPassear()));
                addSQL.setString(6, trueOrFalse(ac.isBanho()));
                addSQL.setFloat(7, ac.getIdAnimal());

                //Executando a instrução SQL
                int linhasAfetadas = addSQL.executeUpdate();

                if (linhasAfetadas > 0) {
                    retorno = true;
                } else {
                    retorno = false;
                }
                return retorno;

            } else {
                AcoesAve ac = (AcoesAve) acao;
                String formatted = format1.format(ac.getData());

                addSQL = conexao.prepareStatement("INSERT INTO AcoesAve  (beberAgua , dataAcao , comerAlimento , qtdAlimento , idAve)"
                        + "VALUES(?, ?, ?, ?, ?)");

                //Adicionando parâmetros ao comando SQL
                addSQL.setString(1, trueOrFalse(ac.isBeberAgua()));
                addSQL.setString(2, formatted);
                addSQL.setString(3, trueOrFalse(ac.isComerAlimento()));
                addSQL.setFloat(4, ac.getQtdAlimento());
                addSQL.setFloat(5, ac.getIdAnimal());
                //Executando a instrução SQL
                int linhasAfetadas = addSQL.executeUpdate();

                if (linhasAfetadas > 0) {
                    retorno = true;
                } else {
                    retorno = false;
                }
                return retorno;

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {
            if (addSQL != null) {
                try {
                    addSQL.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcoesDiariasDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

    public static boolean EditarAcao(Object acao) {
        boolean retorno = false;
        PreparedStatement addSQL = null;
        conexao = ConexaoMySql.getConexaoMySQL();
        PreparedStatement instrucaoSQL = null;
        return false;
    }

    public static boolean ExcluirAcao(String animal, int id) {
        boolean retorno = false;
        PreparedStatement addSQL = null;
        conexao = ConexaoMySql.getConexaoMySQL();
        PreparedStatement instrucaoSQL = null;
        return false;
    }

    public static String buscar(String tabela, int id) {
        String retorno = null;
        ResultSet rs = null;
        Animal animal = new Animal();
        PreparedStatement addSQL = null;
        conexao = ConexaoMySql.getConexaoMySQL();

        try {

            if (tabela.equals("Mamifero")) {

                addSQL = conexao.prepareStatement("Select * FROM Mamifero WHERE id = ?");
                addSQL.setInt(1, id);

                rs = addSQL.executeQuery();
            } else {
                addSQL = conexao.prepareStatement("Select * FROM Ave WHERE id = ?");
                addSQL.setInt(1, id);

                rs = addSQL.executeQuery();
            }
            if (rs.next()) {
                retorno = rs.getString("nome");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());

            retorno = null;
        } finally {

            if (addSQL != null) {
                try {
                    addSQL.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retorno;

    }

    public static String trueOrFalse(boolean condicao) {
        if (condicao) {
            return "sim";
        } else {
            return "nao";
        }
    }
}
