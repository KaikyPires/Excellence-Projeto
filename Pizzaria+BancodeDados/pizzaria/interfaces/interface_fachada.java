/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzaria.interfaces;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class interface_fachada extends javax.swing.JFrame {

    public interface_fachada() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_fachadamaior = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botao_bemvindo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pizza_fachada2 = new javax.swing.JLabel();
        pizza_fachada1 = new javax.swing.JLabel();
        pizza_logo_fachada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel_fachadamaior.setBackground(new java.awt.Color(233, 113, 113));
        painel_fachadamaior.setForeground(new java.awt.Color(233, 113, 113));

        jPanel2.setBackground(new java.awt.Color(147, 26, 37));

        botao_bemvindo.setBackground(new java.awt.Color(233, 113, 113));
        botao_bemvindo.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        botao_bemvindo.setForeground(new java.awt.Color(255, 255, 255));
        botao_bemvindo.setText("Benvenuto!");
        botao_bemvindo.setBorder(null);
        botao_bemvindo.setBorderPainted(false);
        botao_bemvindo.setFocusPainted(false);
        botao_bemvindo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao_bemvindoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao_bemvindoMouseExited(evt);
            }
        });
        botao_bemvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_bemvindoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 239, 239));
        jLabel1.setText("João Victor Dutra and Kaiky Pires");

        pizza_fachada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/PIZZA2.png"))); // NOI18N

        pizza_fachada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/PIZZA1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(pizza_fachada2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(botao_bemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(pizza_fachada1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_bemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pizza_fachada1)))
                    .addComponent(pizza_fachada2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pizza_logo_fachada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/pizza_logo.png"))); // NOI18N

        javax.swing.GroupLayout painel_fachadamaiorLayout = new javax.swing.GroupLayout(painel_fachadamaior);
        painel_fachadamaior.setLayout(painel_fachadamaiorLayout);
        painel_fachadamaiorLayout.setHorizontalGroup(
            painel_fachadamaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel_fachadamaiorLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(pizza_logo_fachada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_fachadamaiorLayout.setVerticalGroup(
            painel_fachadamaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_fachadamaiorLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(pizza_logo_fachada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fachadamaior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fachadamaior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_bemvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_bemvindoActionPerformed
        interface_entrada i_entrada = new interface_entrada();
        i_entrada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_bemvindoActionPerformed

    private void botao_bemvindoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_bemvindoMouseEntered
        botao_bemvindo.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_botao_bemvindoMouseEntered

    private void botao_bemvindoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_bemvindoMouseExited
        botao_bemvindo.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_botao_bemvindoMouseExited

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
            java.util.logging.Logger.getLogger(interface_fachada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_fachada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_fachada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_fachada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_fachada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_bemvindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel painel_fachadamaior;
    private javax.swing.JLabel pizza_fachada1;
    private javax.swing.JLabel pizza_fachada2;
    private javax.swing.JLabel pizza_logo_fachada;
    // End of variables declaration//GEN-END:variables
}
