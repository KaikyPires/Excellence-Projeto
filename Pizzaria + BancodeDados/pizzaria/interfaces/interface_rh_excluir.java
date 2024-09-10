package pizzaria.interfaces;

import dao.FuncionariosDAO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pizzaria.interfaces.interface_gerencia;

/**
 *
 * @author kaiky
 */
public class interface_rh_excluir extends javax.swing.JFrame {

    /**
     * Creates new form interface_rh_ex
     */
    public interface_rh_excluir() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void demitirFuncionario() throws SQLException {
        String nomeFuncionario = Jtcargo.getText();

        if (nomeFuncionario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome do funcionário!");
        } else {
            FuncionariosDAO dao = new FuncionariosDAO();

            if (dao.deletarFuncionario(nomeFuncionario)) {
                int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente demitir o funcionário?", "Confirmação", JOptionPane.YES_NO_OPTION);

                if (opcao == JOptionPane.YES_OPTION) {

                    dao.deletarFuncionario(nomeFuncionario);
                    Jtcargo.setText("");  // Limpa o campo de nome após a demissão
                    JOptionPane.showMessageDialog(null, "Funcionário demitido com sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo_listaingredientes4 = new javax.swing.JLabel();
        Jtcargo1 = new javax.swing.JTextField();
        b_cadastrarFuncionario = new javax.swing.JButton();
        pizza_logopequena1 = new javax.swing.JLabel();
        b_retornar = new javax.swing.JButton();
        Jtcargo = new javax.swing.JTextField();
        titulo_listaingredientes3 = new javax.swing.JLabel();
        demitir = new javax.swing.JLabel();
        titulo_listaingredientes2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(85, 0, 0));

        titulo_listaingredientes4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        titulo_listaingredientes4.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes4.setText("Nome:");

        Jtcargo1.setBackground(new java.awt.Color(255, 255, 255));
        Jtcargo1.setForeground(new java.awt.Color(0, 0, 0));
        Jtcargo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtcargo1ActionPerformed(evt);
            }
        });

        b_cadastrarFuncionario.setBackground(new java.awt.Color(233, 113, 113));
        b_cadastrarFuncionario.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_cadastrarFuncionario.setForeground(new java.awt.Color(245, 239, 239));
        b_cadastrarFuncionario.setText("Demitir");
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

        Jtcargo.setBackground(new java.awt.Color(255, 255, 255));
        Jtcargo.setForeground(new java.awt.Color(0, 0, 0));
        Jtcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtcargoActionPerformed(evt);
            }
        });

        titulo_listaingredientes3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        titulo_listaingredientes3.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes3.setText("Cargo:");

        demitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/demitir.png"))); // NOI18N

        titulo_listaingredientes2.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 30)); // NOI18N
        titulo_listaingredientes2.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listaingredientes2.setText("Demissao de Funcionario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(b_cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(pizza_logopequena1)
                            .addGap(245, 245, 245)
                            .addComponent(b_retornar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(demitir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo_listaingredientes4)
                            .addComponent(titulo_listaingredientes2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo_listaingredientes3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jtcargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b_retornar))
                    .addComponent(pizza_logopequena1))
                .addGap(39, 39, 39)
                .addComponent(titulo_listaingredientes2)
                .addGap(5, 5, 5)
                .addComponent(demitir)
                .addGap(18, 18, 18)
                .addComponent(titulo_listaingredientes4)
                .addGap(18, 18, 18)
                .addComponent(Jtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo_listaingredientes3)
                .addGap(18, 18, 18)
                .addComponent(Jtcargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(b_cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
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

    private void Jtcargo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtcargo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtcargo1ActionPerformed

    private void b_cadastrarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioMouseEntered
        b_cadastrarFuncionario.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_b_cadastrarFuncionarioMouseEntered

    private void b_cadastrarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioMouseExited
        b_cadastrarFuncionario.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_b_cadastrarFuncionarioMouseExited

    private void b_cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarFuncionarioActionPerformed
        try {
            demitirFuncionario();
        } catch (SQLException ex) {
            Logger.getLogger(interface_rh_excluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_cadastrarFuncionarioActionPerformed

    private void b_retornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_retornarActionPerformed
        interface_gerencia i_gerencia = new interface_gerencia();
        i_gerencia.setVisible(true);
        this.disable();
    }//GEN-LAST:event_b_retornarActionPerformed

    private void JtcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtcargoActionPerformed

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
            java.util.logging.Logger.getLogger(interface_rh_excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_rh_excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_rh_excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_rh_excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_rh_excluir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtcargo;
    private javax.swing.JTextField Jtcargo1;
    private javax.swing.JButton b_cadastrarFuncionario;
    private javax.swing.JButton b_retornar;
    private javax.swing.JLabel demitir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pizza_logopequena1;
    private javax.swing.JLabel titulo_listaingredientes2;
    private javax.swing.JLabel titulo_listaingredientes3;
    private javax.swing.JLabel titulo_listaingredientes4;
    // End of variables declaration//GEN-END:variables
}
