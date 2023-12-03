/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author Feh
 */
public class home_view extends javax.swing.JFrame {

    /**
     * Creates new form home_view
     */
    public home_view() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnBiblioteca = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnCadastrarLivros = new javax.swing.JButton();
        btnFunc = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnEmprestimo = new javax.swing.JButton();
        btnGerarRela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInicio1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblFecharX1 = new javax.swing.JLabel();
        lblFechar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(239, 236, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(218, 799));

        btnBuscar.setBackground(new java.awt.Color(239, 236, 228));
        btnBuscar.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(60, 65, 70));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBiblioteca.setBackground(new java.awt.Color(239, 236, 228));
        btnBiblioteca.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        btnBiblioteca.setForeground(new java.awt.Color(60, 65, 70));
        btnBiblioteca.setText("Biblioteca");
        btnBiblioteca.setBorder(null);
        btnBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBibliotecaActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 120, 156));

        btnCadastrarLivros.setBackground(new java.awt.Color(239, 236, 228));
        btnCadastrarLivros.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnCadastrarLivros.setForeground(new java.awt.Color(60, 65, 70));
        btnCadastrarLivros.setText("Cadastrar Livros");
        btnCadastrarLivros.setBorder(null);
        btnCadastrarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivrosActionPerformed(evt);
            }
        });

        btnFunc.setBackground(new java.awt.Color(239, 236, 228));
        btnFunc.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnFunc.setForeground(new java.awt.Color(60, 65, 70));
        btnFunc.setText("Funcionários");
        btnFunc.setBorder(null);
        btnFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(239, 236, 228));
        btnClientes.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(60, 65, 70));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnEmprestimo.setBackground(new java.awt.Color(239, 236, 228));
        btnEmprestimo.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnEmprestimo.setForeground(new java.awt.Color(60, 65, 70));
        btnEmprestimo.setText("Empréstimo");
        btnEmprestimo.setBorder(null);
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });

        btnGerarRela.setBackground(new java.awt.Color(239, 236, 228));
        btnGerarRela.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnGerarRela.setForeground(new java.awt.Color(60, 65, 70));
        btnGerarRela.setText("Gerar Relatórios");
        btnGerarRela.setBorder(null);
        btnGerarRela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelaActionPerformed(evt);
            }
        });

        btnInicio1.setBackground(new java.awt.Color(239, 236, 228));
        btnInicio1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnInicio1.setForeground(new java.awt.Color(102, 120, 156));
        btnInicio1.setText("Início");
        btnInicio1.setBorder(null);
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnCadastrarLivros))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFunc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnClientes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnEmprestimo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnGerarRela))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBiblioteca)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel1))
                            .addComponent(btnInicio1)
                            .addComponent(btnBuscar))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(btnInicio1)
                .addGap(44, 44, 44)
                .addComponent(btnBuscar)
                .addGap(56, 56, 56)
                .addComponent(btnBiblioteca)
                .addGap(48, 48, 48)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnCadastrarLivros)
                .addGap(75, 75, 75)
                .addComponent(btnFunc)
                .addGap(72, 72, 72)
                .addComponent(btnClientes)
                .addGap(70, 70, 70)
                .addComponent(btnEmprestimo)
                .addGap(75, 75, 75)
                .addComponent(btnGerarRela)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(80, 98, 134));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(756, 791));

        lblFecharX1.setFont(new java.awt.Font("Poppins Black", 0, 14)); // NOI18N
        lblFecharX1.setForeground(new java.awt.Color(255, 255, 255));
        lblFecharX1.setText("X");
        lblFecharX1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharX1MouseClicked(evt);
            }
        });

        lblFechar1.setFont(new java.awt.Font("Poppins Black", 0, 14)); // NOI18N
        lblFechar1.setForeground(new java.awt.Color(255, 255, 255));
        lblFechar1.setText("Fechar");
        lblFechar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFechar1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Biblioteca Municipal");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblFecharX1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechar1)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(78, 78, 78))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecharX1)
                    .addComponent(lblFechar1))
                .addGap(137, 137, 137)
                .addComponent(jLabel2)
                .addGap(152, 152, 152)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addGap(79, 79, 79)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 550, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblFecharX1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharX1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblFecharX1MouseClicked

    private void lblFechar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFechar1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblFechar1MouseClicked

    private void btnGerarRelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelaActionPerformed
        new report_view().setVisible(true);
    }//GEN-LAST:event_btnGerarRelaActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncActionPerformed
        new register_view().setVisible(true);
    }//GEN-LAST:event_btnFuncActionPerformed

    private void btnCadastrarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivrosActionPerformed
        new books_view().setVisible(true);
    }//GEN-LAST:event_btnCadastrarLivrosActionPerformed

    private void btnBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBibliotecaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicio1ActionPerformed

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
            java.util.logging.Logger.getLogger(home_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiblioteca;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrarLivros;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnFunc;
    private javax.swing.JButton btnGerarRela;
    private javax.swing.JButton btnInicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblFechar1;
    private javax.swing.JLabel lblFecharX1;
    // End of variables declaration//GEN-END:variables
}