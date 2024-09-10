/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectionfactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pizzaria.classes.Ingredientes;

public class IngredientesDAO {

    public void inserirIngrediente(Ingredientes ingrediente) {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "INSERT INTO pizzaria.ingredientes (nome, valor) VALUES (?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, ingrediente.getNome());
            stmt.setDouble(2, ingrediente.getValor());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public List<Ingredientes> listarIngredientes() {
        List<Ingredientes> ingredientes = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
       String sql = "SELECT * FROM pizzaria.ingredientes";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = connection.prepareStatement(sql);
           rs = stmt.executeQuery();
            while (rs.next()) {
                Ingredientes ingrediente = new Ingredientes();
                ingrediente.setNome(rs.getString("nome"));
                ingrediente.setValor(rs.getDouble("valor"));

                ingredientes.add(ingrediente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            ConnectionFactory.closeConnection(connection, stmt, rs);
        }
        return ingredientes;
    }

}
