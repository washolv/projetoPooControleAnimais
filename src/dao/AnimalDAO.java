/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Animal;
import model.Ave;
import model.Mamifero;
import utils.ConexaoMySql;

/**
 *
 * @author User
 */
public class AnimalDAO {

    PreparedStatement addSQL = null;
    private static Connection conexao;

    public static boolean inserirNovoAnimal(Animal animal) throws SQLException {
        boolean retorno = false;
        PreparedStatement addSQL = null;
        try {
            if (animal instanceof Mamifero) {
                addSQL = conexao.prepareStatement("INSERT INTO Mamifero (raca, idade, nome, peso, alimento, tipo)"
                        + "VALUES(?, ?, ?, ?, ?,?)");

                //Adicionando parâmetros ao comando SQL
                addSQL.setString(1, animal.getRaca());
                addSQL.setInt(2, animal.getIdade());
                addSQL.setString(3, animal.getNome());
                addSQL.setFloat(4, animal.getPeso());
                addSQL.setFloat(5, animal.getAlimento());
                addSQL.setString(6, animal.getTipo());

                //Executando a instrução SQL
                int linhasAfetadas = addSQL.executeUpdate();

                if (linhasAfetadas > 0) {
                    retorno = true;
                } else {
                    retorno = false;
                }
                return retorno;
                
            } else {
                Ave ave = (Ave) animal;
                addSQL = conexao.prepareStatement("INSERT INTO Ave (raca, idade, nome, peso, alimento, tipo, cod_liberacao)"
                        + "VALUES(?, ?, ?, ?, ?,?,?)");

                //Adicionando parâmetros ao comando SQL
                addSQL.setString(1, ave.getRaca());
                addSQL.setInt(2, ave.getIdade());
                addSQL.setString(3, ave.getNome());
                addSQL.setFloat(4, ave.getPeso());
                addSQL.setFloat(5, ave.getAlimento());
                addSQL.setString(6, ave.getTipo());
                addSQL.setInt(7, ave.getCod_liberacao());
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
            try {
                if (addSQL != null) {
                    addSQL.close();
                }
            } catch (SQLException ex) {
            }
            try {
                conexao = ConexaoMySql.getConexaoMySQL();
            } catch (Exception e) {
            }

        }
        return false;
    }


    public static void editarAnimal(int id) {
        try {
            conexao = ConexaoMySql.getConexaoMySQL();
        } catch (Exception e) {
        }

        PreparedStatement addSQL = null;

    }

    public static ArrayList<Animal> listarAnimal() {
        ArrayList<Animal> animal = null;
        try {
            conexao = ConexaoMySql.getConexaoMySQL();
        } catch (Exception e) {
        }

        PreparedStatement addSQL = null;

        return animal;
    }

    public static void excluirAnimal(int id) {
        try {
            conexao = ConexaoMySql.getConexaoMySQL();
        } catch (Exception e) {
        }

        PreparedStatement addSQL = null;

    }

    public static void inserirNovaAcaoAnimal() {
        try {
            conexao = ConexaoMySql.getConexaoMySQL();
        } catch (Exception e) {
        }

        PreparedStatement addSQL = null;

    }

}
