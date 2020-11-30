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

    public static ArrayList<Object> listarAcoes(String tipo, int id) {
        PreparedStatement addSQL = null;
        conexao = ConexaoMySql.getConexaoMySQL();
        ResultSet rs = null;
        ArrayList<Object> listarAcoes = new ArrayList<Object>();
        PreparedStatement instrucaoSQL = null;
        try {
            conexao = ConexaoMySql.getConexaoMySQL();
            if (tipo.equals("Mamifero")) {
                addSQL = conexao.prepareStatement("Select * from AcoesMamifero WHERE id=?");
                addSQL.setInt(1, id);
                rs = addSQL.executeQuery();
                Ave ave;
                while (rs.next()) {
                    AcoesDiarias acao = new AcoesMamifero(StringToBoolean(rs.getString("passear")),
                            StringToBoolean(rs.getString("banho")),
                            rs.getInt("id"),
                            rs.getInt("idAnimal"),
                            rs.getDate("dataAcao"),
                            StringToBoolean(rs.getString("comerAlimento")),
                            StringToBoolean(rs.getString("beberAgua")),
                            rs.getFloat("qtdAlimento"));
                    listarAcoes.add(acao);
                }
            } else {
                addSQL = conexao.prepareStatement("Select * from AcoesAve WHERE id=?");
                addSQL.setInt(1, id);
                rs = addSQL.executeQuery();
                Ave ave;
                while (rs.next()) {
                    AcoesDiarias acao = new AcoesAve(rs.getInt("id"),
                            rs.getInt("idAve"),
                            rs.getDate("dataAcao"),
                            StringToBoolean(rs.getString("comerAlimento")),
                            StringToBoolean(rs.getString("beberAgua")),
                            rs.getFloat("qtdAlimento"));
                    listarAcoes.add(acao);
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return listarAcoes;
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
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

        try {
            if (acao instanceof AcoesMamifero) {
                addSQL = conexao.prepareStatement("UPDATE AcoesMamifero SET beberAgua = ?, dataAcao=?, comerAlimento=?, qtdAlimento=?, passear=?, banho=?  WHERE id = ?");
                AcoesMamifero ac = (AcoesMamifero) acao;
                String formatted = format1.format(ac.getData());

                //Adicionando parâmetros ao comando SQL
                addSQL.setString(1, trueOrFalse(ac.isBeberAgua()));
                addSQL.setString(2, formatted);
                addSQL.setString(3, trueOrFalse(ac.isComerAlimento()));
                addSQL.setFloat(4, ac.getQtdAlimento());
                addSQL.setString(5, trueOrFalse(ac.isPassear()));
                addSQL.setString(6, trueOrFalse(ac.isBanho()));
                addSQL.setFloat(7, ac.getId());

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
                addSQL = conexao.prepareStatement("UPDATE AcoesAve SET beberAgua = ?, dataAcao=?, comerAlimento=?, qtdAlimento=? WHERE id = ?");
                String formatted = format1.format(ac.getData());

                //Adicionando parâmetros ao comando SQL
                addSQL.setString(1, trueOrFalse(ac.isBeberAgua()));
                addSQL.setString(2, formatted);
                addSQL.setString(3, trueOrFalse(ac.isComerAlimento()));
                addSQL.setFloat(4, ac.getQtdAlimento());
                addSQL.setFloat(5, ac.getId());
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
                    Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
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

    public static boolean StringToBoolean(String condicao) {
        return condicao.equals("sim");
    }
}
