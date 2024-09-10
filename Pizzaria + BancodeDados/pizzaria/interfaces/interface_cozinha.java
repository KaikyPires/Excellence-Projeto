/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzaria.interfaces;

import connectionfactory.ConnectionFactory;
import dao.IngredientesDAO;
import dao.PizzasDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Pizzas;
import pizzaria.classes.Ingredientes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class interface_cozinha extends javax.swing.JFrame {

    public interface_cozinha() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        jTable3.setRowSorter(new TableRowSorter(modelo));
        DefaultTableModel modelo2 = (DefaultTableModel) tabelaPizzas.getModel();
        tabelaPizzas.setRowSorter(new TableRowSorter(modelo2));

        readJTable();

    }

    private void adicionar()throws SQLException {
        
        String nomePizza = Jtnome.getText();

        if (nomePizza.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome da pizza!");
        } 
        else {
            PreparedStatement stmt = null;
            Connection con = ConnectionFactory.getConnection();
            ResultSet rs = null;

            String pizzaExiste = "SELECT nome FROM pizzaria.pizzas WHERE  nome = '"+Jtnome.getText()+"'" ;
            stmt = con.prepareStatement(pizzaExiste);
            rs = stmt.executeQuery();
            

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "Usuário ou Email existentes!");

            }
            else {
                
                Pizzas p = new Pizzas();
                p.setNome(Jtnome.getText());
                PizzasDAO dao = new PizzasDAO();
                dao.inserirPizza(p);
                Jtnome.setText("");
               
                JOptionPane.showMessageDialog(null, "Pizza criada com sucesso!");
                
            }
            ConnectionFactory.closeConnection(con, stmt, rs);

        }
    }
    private void deletar() throws SQLException {
        String nomePizza = Jtnome.getText();

        if (nomePizza.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome da pizza!");
        } else {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;

            try {
                String sql = "DELETE FROM pizzaria.pizzas WHERE nome = ?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, nomePizza);

                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Pizza deletada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma pizza encontrada com o nome fornecido.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }
        }
    }


    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) tabelaPizzas.getModel();
        modelo.setNumRows(0);
        IngredientesDAO udao = new IngredientesDAO();
        modelo2.setNumRows(0);
        PizzasDAO vdao = new PizzasDAO();

        for (Ingredientes a : udao.listarIngredientes()) {

            modelo.addRow(new Object[]{
                a.getNome(),
                a.getValor(),});
        }
        for (Pizzas b : vdao.listarPizzas()) {

            modelo2.addRow(new Object[]{
                b.getNome(),});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_listaingredientes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pizza_logopequena = new javax.swing.JLabel();
        b_retornar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPizzas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        titulo_listapizzas = new javax.swing.JLabel();
        b_cardapio = new javax.swing.JButton();
        b_cardapio1 = new javax.swing.JButton();
        Jtnome = new javax.swing.JTextField();
        titulo_listaingredientes1 = new javax.swing.JLabel();
        titulo_listaingredientes2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        titulo_listaingredientes.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        titulo_listaingredientes.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes.setText("Ingredientes no Estoque:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(85, 0, 0));

        pizza_logopequena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/pizza_logo_pequena.png"))); // NOI18N

        b_retornar.setBackground(new java.awt.Color(85, 0, 0));
        b_retornar.setForeground(new java.awt.Color(245, 239, 239));
        b_retornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/saida.png"))); // NOI18N
        b_retornar.setBorderPainted(false);
        b_retornar.setFocusPainted(false);
        b_retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_retornarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(147, 26, 37));

        tabelaPizzas.setBackground(new java.awt.Color(245, 239, 239));
        tabelaPizzas.setForeground(new java.awt.Color(0, 0, 0));
        tabelaPizzas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPizzas.setRowHeight(30);
        jScrollPane2.setViewportView(tabelaPizzas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(147, 26, 37));

        jTable3.setBackground(new java.awt.Color(245, 239, 239));
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Valor"
            }
        ));
        jTable3.setRowHeight(30);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        titulo_listapizzas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        titulo_listapizzas.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listapizzas.setText("Pizzas Disponíveis:");

        b_cardapio.setBackground(new java.awt.Color(233, 113, 113));
        b_cardapio.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_cardapio.setForeground(new java.awt.Color(245, 239, 239));
        b_cardapio.setText("Excluir Pizza");
        b_cardapio.setBorderPainted(false);
        b_cardapio.setFocusPainted(false);
        b_cardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_cardapioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_cardapioMouseExited(evt);
            }
        });
        b_cardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cardapioActionPerformed(evt);
            }
        });

        b_cardapio1.setBackground(new java.awt.Color(233, 113, 113));
        b_cardapio1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_cardapio1.setForeground(new java.awt.Color(245, 239, 239));
        b_cardapio1.setText("Adicionar Pizza");
        b_cardapio1.setBorderPainted(false);
        b_cardapio1.setFocusPainted(false);
        b_cardapio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_cardapio1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_cardapio1MouseExited(evt);
            }
        });
        b_cardapio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cardapio1ActionPerformed(evt);
            }
        });

        Jtnome.setBackground(new java.awt.Color(255, 255, 255));
        Jtnome.setForeground(new java.awt.Color(0, 0, 0));
        Jtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtnomeActionPerformed(evt);
            }
        });

        titulo_listaingredientes1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        titulo_listaingredientes1.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes1.setText("Ingredientes no Estoque:");

        titulo_listaingredientes2.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 24)); // NOI18N
        titulo_listaingredientes2.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes2.setText("Nome da Pizza:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/tempero4.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/pizza4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(titulo_listapizzas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtnome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_cardapio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_cardapio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(titulo_listaingredientes2)
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(titulo_listaingredientes1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pizza_logopequena)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_retornar)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pizza_logopequena)
                        .addComponent(titulo_listapizzas, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(titulo_listaingredientes1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo_listaingredientes2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(b_cardapio1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(b_cardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(b_retornar)))
                .addGap(202, 202, 202))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_retornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_retornarActionPerformed
        interface_areaFuncionarios i_areaFuncionarios = new interface_areaFuncionarios();
        i_areaFuncionarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_retornarActionPerformed

    private void b_cardapioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cardapioMouseEntered
        b_cardapio.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_b_cardapioMouseEntered

    private void b_cardapioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cardapioMouseExited
        b_cardapio.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_b_cardapioMouseExited

    private void b_cardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cardapioActionPerformed
        try {
            //interface_cozinha i_cozinha = new interface_cozinha();
            //i_cozinha.setVisible(true);
            //this.dispose();
            deletar();
        } catch (SQLException ex) {
            Logger.getLogger(interface_cozinha.class.getName()).log(Level.SEVERE, null, ex);
        }
        readJTable();
    }//GEN-LAST:event_b_cardapioActionPerformed

    private void b_cardapio1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cardapio1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cardapio1MouseEntered

    private void b_cardapio1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cardapio1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cardapio1MouseExited

    private void b_cardapio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cardapio1ActionPerformed
        
        try {
            adicionar();
        } catch (SQLException ex) {
            Logger.getLogger(interface_cozinha.class.getName()).log(Level.SEVERE, null, ex);
        }
        readJTable();
    }//GEN-LAST:event_b_cardapio1ActionPerformed

    private void JtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtnomeActionPerformed

    }//GEN-LAST:event_JtnomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interface_cozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_cozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_cozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_cozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_cozinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtnome;
    private javax.swing.JButton b_cardapio;
    private javax.swing.JButton b_cardapio1;
    private javax.swing.JButton b_retornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel pizza_logopequena;
    private javax.swing.JTable tabelaPizzas;
    private javax.swing.JLabel titulo_listaingredientes;
    private javax.swing.JLabel titulo_listaingredientes1;
    private javax.swing.JLabel titulo_listaingredientes2;
    private javax.swing.JLabel titulo_listapizzas;
    // End of variables declaration//GEN-END:variables
}
