/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import bd.FuncionarioDAO;
import entities.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        TFusuario = new javax.swing.JTextField();
        Lusuario = new javax.swing.JLabel();
        Lsenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        LesqueceuSenha = new javax.swing.JLabel();
        Llogin = new javax.swing.JLabel();
        btnEsqueceuSenha = new javax.swing.JButton();
        PFsenha = new javax.swing.JPasswordField();
        CBver = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TFusuario.setBackground(new java.awt.Color(254, 233, 185));
        TFusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Lusuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lusuario.setForeground(new java.awt.Color(255, 86, 86));
        Lusuario.setText("Usuário:");

        Lsenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lsenha.setForeground(new java.awt.Color(255, 86, 86));
        Lsenha.setText("Senha:");

        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(249, 181, 6));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        LesqueceuSenha.setText("Não possui cadastro ? ");

        Llogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Llogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/02.png"))); // NOI18N

        btnEsqueceuSenha.setForeground(new java.awt.Color(255, 86, 86));
        btnEsqueceuSenha.setText("CADASTRE-SE AQUI!");
        btnEsqueceuSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueceuSenhaActionPerformed(evt);
            }
        });

        PFsenha.setBackground(new java.awt.Color(254, 233, 185));
        PFsenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CBver.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CBverStateChanged(evt);
            }
        });
        CBver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(LesqueceuSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEsqueceuSenha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Llogin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lusuario)
                            .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lsenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(Llogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Lsenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PFsenha))
                .addGap(40, 40, 40)
                .addComponent(btnEntrar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEsqueceuSenha)
                    .addComponent(LesqueceuSenha))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //Setar os valores de usuario e senha para o objeto funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setUsuario(TFusuario.getText());
        funcionario.setSenha(String.valueOf(PFsenha.getPassword()));
        //Verificar se eles conferem e estão no cadastrados no BD
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        boolean entrarComum = funcionarioDAO.autenticar(funcionario);
        boolean entrarAdmin = funcionarioDAO.autenticarAdiministrador(funcionario);
        
        // Se o usuario e senha estiverem certos, então
        if(entrarComum == true)
        {
            if(entrarAdmin == true)
            {
                JOptionPane.showMessageDialog(null, "Bem-Vindo Administrador!");
                TelaInicialAdmin tca = new TelaInicialAdmin();
                tca.setVisible(true);
                this.dispose();
            }
            else
            {
                TelaInicial tc = new TelaInicial();
                tc.setVisible(true);
                this.dispose();
            }
        }
        else //senao
        {
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos!");
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueceuSenhaActionPerformed
        // TODO add your handling code here:
        //TelaCadastroFuncionario tcf = new TelaCadastroFuncionario();
        //tcf.setVisible(true);
    }//GEN-LAST:event_btnEsqueceuSenhaActionPerformed

    private void CBverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBverActionPerformed
        // Show Password
        if(CBver.isSelected())
        {
            PFsenha.setEchoChar((char)0);
        }
        else
        {
            PFsenha.setEchoChar('*');
        }
    }//GEN-LAST:event_CBverActionPerformed

    private void CBverStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CBverStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CBverStateChanged

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBver;
    private javax.swing.JLabel LesqueceuSenha;
    private javax.swing.JLabel Llogin;
    private javax.swing.JLabel Lsenha;
    private javax.swing.JLabel Lusuario;
    private javax.swing.JPasswordField PFsenha;
    private javax.swing.JTextField TFusuario;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsqueceuSenha;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
