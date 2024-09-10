package dao;

import connectionfactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Funcionarios;


public class FuncionariosDAO {

    
    public void inserirFuncionario(Funcionarios funcionario) {
        Connection connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO pizzaria.funcionarios (cargo, salario, nome) VALUES (?, ?, ?)";
            PreparedStatement stmt = null;
            try  {
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, funcionario.getCargo());
                stmt.setDouble(2, funcionario.getSalario());
                stmt.setString(3, funcionario.getNome());

                stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
            finally{
                ConnectionFactory.closeConnection(connection, stmt);
            }
    }
  
public boolean deletarFuncionario(String nome) {
    Connection connection = ConnectionFactory.getConnection();
    String sql = "DELETE FROM pizzaria.funcionarios WHERE nome = ?";
    PreparedStatement stmt = null;

    try {
        stmt = connection.prepareStatement(sql);
        stmt.setString(1, nome);
        int rowsAffected = stmt.executeUpdate();

        // Retorna true se a exclusão foi bem-sucedida (pelo menos uma linha afetada)
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Retorna false em caso de falha na exclusão
    } finally {
        ConnectionFactory.closeConnection(connection, stmt);
    }
}




    public List<Funcionarios> listarFuncionarios() {
        List<Funcionarios> funcionarios = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM pizzaria.funcionarios";
            PreparedStatement stmt = null;
            ResultSet rs = null;
                try {
                   
                    stmt = connection.prepareStatement(sql);
                     rs = stmt.executeQuery();
                    while (rs.next()) {
                        Funcionarios funcionario = new Funcionarios();
                        funcionario.setCargo(rs.getString("cargo"));
                        funcionario.setSalario(rs.getDouble("salario"));
                        funcionario.setNome(rs.getString("nome"));

                        funcionarios.add(funcionario);
                    }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(connection, stmt, rs);
        }

                
        return funcionarios;
    }

}


