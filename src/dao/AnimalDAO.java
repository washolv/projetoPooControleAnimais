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
import java.sql.Statement;
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
        conexao = ConexaoMySql.getConexaoMySQL();
        PreparedStatement instrucaoSQL = null;
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
            if (addSQL != null) {
                addSQL.close();
            }
        }
        return false;
    }

    public static boolean editarAnimal(Animal animal) throws SQLException {
        boolean retorno = false;
        PreparedStatement addSQL = null;
        conexao = ConexaoMySql.getConexaoMySQL();
        try {
            if (animal instanceof Mamifero) {
                addSQL = conexao.prepareStatement("UPDATE Mamifero SET raca = ?, idade=?, nome=?, peso=?, aliemnto=?, tipo=?  WHERE id = ?");

                //Adicionando parâmetros ao comando SQL
                addSQL.setString(1, animal.getRaca());
                addSQL.setInt(2, animal.getIdade());
                addSQL.setString(3, animal.getNome());
                addSQL.setFloat(4, animal.getPeso());
                addSQL.setFloat(5, animal.getAlimento());
                addSQL.setString(6, animal.getTipo());
                addSQL.setInt(7, animal.getId());

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
                addSQL = conexao.prepareStatement("UPDATE Ave SET raca=? , idade=? , nome =?, peso=? , alimento=?, tipo=?, cod_liberacao=? WHERE id = ?");

                //Adicionando parâmetros ao comando SQL
                addSQL.setString(1, ave.getRaca());
                addSQL.setInt(2, ave.getIdade());
                addSQL.setString(3, ave.getNome());
                addSQL.setFloat(4, ave.getPeso());
                addSQL.setFloat(5, ave.getAlimento());
                addSQL.setString(6, ave.getTipo());
                addSQL.setInt(7, ave.getCod_liberacao());
                addSQL.setInt(8, animal.getId());
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
                addSQL.close();
            }
        }
        return false;
    }

    public static ArrayList<Animal> listarAnimal(String tipo) {
        ArrayList<Animal> animais = new ArrayList<Animal>();
        PreparedStatement addSQL = null;
        conexao = ConexaoMySql.getConexaoMySQL();
        ResultSet rs = null;
        try {
            conexao = ConexaoMySql.getConexaoMySQL();
            if (tipo.equals("Mamifero")) {
                addSQL = conexao.prepareStatement("Select * from Mamifero");
                rs = addSQL.executeQuery();
                Ave ave;
                while (rs.next()) {
                    Animal animal = new Animal(rs.getString("nome"), rs.getFloat("peso"), rs.getInt("idade"), rs.getString("tipo"), rs.getString("raca"), rs.getFloat("alimento"));
                    animais.add(animal);
                }
            } else {
                addSQL = conexao.prepareStatement("Select * from Ave");
                rs = addSQL.executeQuery();
                Ave ave;
                while (rs.next()) {
                    Animal animal = new Ave(rs.getInt("cod_liberacao"),rs.getInt("id"),rs.getString("nome"), rs.getFloat("peso"), rs.getInt("idade"), rs.getString("tipo"), rs.getString("raca"), rs.getFloat("alimento"));
                    animais.add(animal);
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return animais;
    }

    public static void excluirAnimal(int id) {
        try {
            conexao = ConexaoMySql.getConexaoMySQL();
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

        PreparedStatement addSQL = null;

    }

    public static void inserirNovaAcaoAnimal() {
        try {
            conexao = ConexaoMySql.getConexaoMySQL();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        PreparedStatement addSQL = null;

    }

}
