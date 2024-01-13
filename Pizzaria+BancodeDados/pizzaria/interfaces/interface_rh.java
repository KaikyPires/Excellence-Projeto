/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzaria.interfaces;

import connectionfactory.ConnectionFactory;
import dao.FuncionariosDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Funcionarios;
import pizzaria.interfaces.interface_gerencia;

/**
 *
 * @author kaiky
 */
public class interface_rh extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public interface_rh() {
        initComponents();
        setLocationRelativeTo(null);

    }

    private void adicionar() throws SQLException {
        String nomeFuncionario = Jtnome.getText();
        String cargo = Jtcargo.getText();
        double salario = Double.parseDouble(Jtsalario.getText());

        if (nomeFuncionario.isEmpty() || cargo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome e o cargo do funcionário!");
        } else {
            PreparedStatement stmt = null;
            Connection con = ConnectionFactory.getConnection();
            ResultSet rs = null;

            String funcionarioExiste = "SELECT nome FROM pizzaria.funcionarios WHERE nome = ?";
            stmt = con.prepareStatement(funcionarioExiste);
            stmt.setString(1, nomeFuncionario);
            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Funcionário já existente!");
            } else {
                Funcionarios funcionario = new Funcionarios();
                funcionario.setNome(nomeFuncionario);
                funcionario.setCargo(cargo);
                funcionario.setSalario(salario);

                FuncionariosDAO dao = new FuncionariosDAO();
                dao.inserirFuncionario(funcionario);
                Jtnome.setText("");
                Jtcargo.setText("");
                Jtsalario.setText("");

                JOptionPane.showMessageDialog(null, "Funcionário criado com sucesso!");
            }
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JLabel();
        b_cadastrarFuncionario = new javax.swing.JButton();
        pizza_logopequena1 = new javax.swing.JLabel();
        b_retornar = new javax.swing.JButton();
        titulo_listaingredientes1 = new javax.swing.JLabel();
        Jtcargo = new javax.swing.JTextField();
        titulo_listaingredientes2 = new javax.swing.JLabel();
        titulo_listaingredientes3 = new javax.swing.JLabel();
        Jtsalario = new javax.swing.JTextField();
        Jtnome = new javax.swing.JTextField();
        titulo_listaingredientes4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(85, 0, 0));

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/cadastrar.png"))); // NOI18N

        b_cadastrarFuncionario.setBackground(new java.awt.Color(233, 113, 113));
        b_cadastrarFuncionario.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_cadastrarFuncionario.setForeground(new java.awt.Color(245, 239, 239));
        b_cadastrarFuncionario.setText("Cadastrar");
        b_cadastrarFuncionario.setBorderPainted(false);
        b_cadastrarFuncionario.setFocusPainted(false);
        b_cadastrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_cadastrarFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_cadastrarFuncionarioMouseExited(evt);
            }
        });
        b_cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarFuncionarioActionPerformed(evt);
            }
        });

        pizza_logopequena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/pizza_logo_pequena.png"))); // NOI18N

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

        titulo_listaingredientes1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        titulo_listaingredientes1.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes1.setText("Nome:");

        Jtcargo.setBackground(new java.awt.Color(255, 255, 255));
        Jtcargo.setForeground(new java.awt.Color(0, 0, 0));
        Jtcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtcargoActionPerformed(evt);
            }
        });

        titulo_listaingredientes2.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 30)); // NOI18N
        titulo_listaingredientes2.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes2.setText("Cadastro de Funcionario");

        titulo_listaingredientes3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        titulo_listaingredientes3.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes3.setText("Cargo:");

        Jtsalario.setBackground(new java.awt.Color(255, 255, 255));
        Jtsalario.setForeground(new java.awt.Color(0, 0, 0));
        Jtsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtsalarioActionPerformed(evt);
            }
        });

        Jtnome.setBackground(new java.awt.Color(255, 255, 255));
        Jtnome.setForeground(new java.awt.Color(0, 0, 0));
        Jtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtnomeActionPerformed(evt);
            }
        });

        titulo_listaingredientes4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        titulo_listaingredientes4.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes4.setText("Salário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titulo_listaingredientes2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pizza_logopequena1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_retornar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(cadastrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titulo_listaingredientes3)
                                    .addComponent(Jtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titulo_listaingredientes4)
                                    .addComponent(Jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titulo_listaingredientes1))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(b_cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pizza_logopequena1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b_retornar)))
                .addGap(45, 45, 45)
                .addComponent(titulo_listaingredientes2)
                .addGap(18, 18, 18)
                .addComponent(cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_listaingredientes1)
                .addGap(18, 18, 18)
                .addComponent(Jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo_listaingredientes3)
                .addGap(18, 18, 18)
                .addComponent(Jtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo_listaingredientes4)
                .addGap(18, 18, 18)
                .addComponent(Jtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtnomeActionPerformed

    private void JtsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtsalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtsalarioActionPerformed

    private void JtcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtcargoActionPerformed

    private void b_retornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_retornarActionPerformed
        interface_gerencia i_gerencia = new interface_gerencia();
        i_gerencia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_retornarActionPerformed

    private void b_cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioActionPerformed
        try {
            adicionar();
        } catch (SQLException ex) {
            Logger.getLogger(interface_rh.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_b_cadastrarFuncionarioActionPerformed

    private void b_cadastrarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioMouseExited
        b_cadastrarFuncionario.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_b_cadastrarFuncionarioMouseExited

    private void b_cadastrarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioMouseEntered
        b_cadastrarFuncionario.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_b_cadastrarFuncionarioMouseEntered

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
            java.util.logging.Logger.getLogger(interface_rh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_rh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_rh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_rh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_rh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtcargo;
    private javax.swing.JTextField Jtnome;
    private javax.swing.JTextField Jtsalario;
    private javax.swing.JButton b_cadastrarFuncionario;
    private javax.swing.JButton b_retornar;
    private javax.swing.JLabel cadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pizza_logopequena1;
    private javax.swing.JLabel titulo_listaingredientes1;
    private javax.swing.JLabel titulo_listaingredientes2;
    private javax.swing.JLabel titulo_listaingredientes3;
    private javax.swing.JLabel titulo_listaingredientes4;
    // End of variables declaration//GEN-END:variables
}
