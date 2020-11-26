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


public static boolean editarAnimal(Animal animal) {
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

    public static ArrayList<Animal> listarAnimal(String tipo) {
        ArrayList<Animal> animais = null;
        PreparedStatement addSQL = null;
        ResultSet rs = null;
 conexao = ConexaoMySql.getConexaoMySQL();
        try {

            addSQL = conexao.prepareStatement("select * from ? ");
            rs = addSQL.executeQuery();
            Ave ave;
            while (rs.next()) {
                addSQL.setString(1, tipo);
                Animal animal = new Animal();
                animal.setAlimento(rs.getFloat("alimento"));
                animal.setIdade(rs.getInt("idade"));
                animal.setNome(rs.getString("nome"));
                animal.setPeso(rs.getFloat("peso"));
                animal.setRaca(rs.getString("raça"));
                animal.setTipo(rs.getString("tipo"));

                if (tipo.equals("ave")) {
                    ave = (Ave) animal;
                    ave.setCod_liberacao(rs.getInt("cod_liberacao"));
                    animais.add(ave);
                } else {
                    animais.add(animal);
                }

            }

        } catch (Exception e) {
        }

        return animais;
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
