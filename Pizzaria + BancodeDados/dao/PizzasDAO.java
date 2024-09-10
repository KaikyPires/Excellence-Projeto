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
import model.bean.Pizzas;

public class PizzasDAO {


    public void inserirPizza(Pizzas pizza) {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "INSERT INTO pizzaria.pizzas (nome, valor, tamanho) VALUES (?, ?, ?)";
            PreparedStatement stmt = null;
            try {
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, pizza.getNome());
                stmt.setDouble(2, pizza.getValor());
                stmt.setString(3, pizza.getTamanho());

                stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
        ConnectionFactory.closeConnection(connection, stmt);
    }
    }
    public void deletarPizza(String nomePizza) {
    Connection connection = ConnectionFactory.getConnection();
    String sql = "DELETE FROM pizzaria.pizzas WHERE nome = ?";
    PreparedStatement stmt = null;

    try {
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, nomePizza);

        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Pizza deletada com sucesso!");
        } else {
            System.out.println("Nenhuma pizza encontrada com o nome fornecido.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        ConnectionFactory.closeConnection(connection, stmt);
    }
}


    public List<Pizzas> listarPizzas() {
        List<Pizzas> pizzas = new ArrayList<>();
       Connection connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM pizzaria.pizzas";
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                stmt = connection.prepareStatement(sql);
                rs = stmt.executeQuery();
                    while (rs.next()) {
                        Pizzas pizza = new Pizzas();
                        pizza.setId(rs.getInt("id"));
                        pizza.setNome(rs.getString("nome"));
                        pizza.setValor(rs.getDouble("valor"));
                        pizza.setTamanho(rs.getString("tamanho"));

                        pizzas.add(pizza);
                    }
                
            
        } catch (SQLException e) {
            e.printStackTrace();  
        }
            finally{
                ConnectionFactory.closeConnection(connection, stmt, rs);
            }
        return pizzas;
    }

}

