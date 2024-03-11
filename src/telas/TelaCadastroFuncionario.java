/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import bd.FuncionarioDAO;
import entities.Funcionario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    
    private Funcionario funcionario = new Funcionario();
    
    public TelaCadastroFuncionario() {
        initComponents();
    }
    
    public TelaCadastroFuncionario(Funcionario funcionario) 
    {
        this.funcionario = funcionario;
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        Lnome = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        Lsalario = new javax.swing.JLabel();
        TFsalario = new javax.swing.JTextField();
        Lemail = new javax.swing.JLabel();
        LdataNascimento = new javax.swing.JLabel();
        TFdataNascimento = new javax.swing.JTextField();
        TFnome = new javax.swing.JTextField();
        Lsexo = new javax.swing.JLabel();
        Lsetor = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        cmbSetor = new javax.swing.JComboBox<>();
        TFfuncao = new javax.swing.JTextField();
        Lfuncao = new javax.swing.JLabel();
        LconfirmarSenha = new javax.swing.JLabel();
        TFusuario = new javax.swing.JTextField();
        Lusuario1 = new javax.swing.JLabel();
        PFconfirmarSenha = new javax.swing.JPasswordField();
        PFsenha = new javax.swing.JPasswordField();
        Lsenha = new javax.swing.JLabel();
        CBver = new javax.swing.JCheckBox();
        CBver1 = new javax.swing.JCheckBox();
        title = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cadastro Funcionário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 210, 122));

        Lnome.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lnome.setText("Nome do funcionário:");

        TFemail.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        Lsalario.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lsalario.setText("Salário:");

        TFsalario.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        Lemail.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lemail.setText("Email:");

        LdataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        LdataNascimento.setText("Data de Nascimento:");

        TFdataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        TFnome.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        Lsexo.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lsexo.setText("Sexo:");

        Lsetor.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lsetor.setText("Setor:");

        cmbSexo.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        cmbSetor.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        cmbSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Financeiro", "Depósito", "Mercado" }));

        TFfuncao.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        Lfuncao.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lfuncao.setText("Função:");

        LconfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        LconfirmarSenha.setText("Confirmar senha:");

        TFusuario.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        Lusuario1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lusuario1.setText("Usuário:");

        PFconfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        PFsenha.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        Lsenha.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lsenha.setText("Senha:");

        CBver.setText("Mostrar Senha");
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

        CBver1.setText("Mostrar Senha");
        CBver1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CBver1StateChanged(evt);
            }
        });
        CBver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lsetor)
                    .addComponent(Lusuario1)
                    .addComponent(cmbSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFnome)
                    .addComponent(Lnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFusuario))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PFsenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addComponent(TFfuncao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TFemail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lemail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lfuncao, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Lsenha)
                    .addComponent(CBver, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBver1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LconfirmarSenha)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Lsalario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PFconfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFsalario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LdataNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFdataNascimento, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lsexo))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnome)
                    .addComponent(Lemail)
                    .addComponent(LdataNascimento)
                    .addComponent(Lsexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TFnome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lfuncao)
                            .addComponent(Lsalario))
                        .addGap(66, 66, 66)
                        .addComponent(LconfirmarSenha)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lsetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lusuario1)
                            .addComponent(Lsenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PFconfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(290, 290, 290))
        );

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/07.png"))); // NOI18N

        btnCadastrar.setBackground(new java.awt.Color(154, 203, 251));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(255, 182, 182));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // senha e confirmaSenha tem de ser iguais para se fazer a cadastro
        String senha = String.valueOf(PFsenha.getPassword());
        String confirmarSenha = String.valueOf(PFconfirmarSenha.getPassword()); 
        
        if(senha.equals(confirmarSenha))
        {
            // Fazendo a confirmação do cadasdtro        
            int confirmacao = JOptionPane.showConfirmDialog(null, "Realmente quer fazer o cadastro?");
            if (confirmacao == 0)
            {
                // Setando os parametros do funcionario
                Funcionario fun = new Funcionario();
                fun.setNome(TFnome.getText());
                fun.setEmail(TFemail.getText());
                fun.setSexo(cmbSexo.getSelectedItem().toString());
                fun.setSetor(cmbSetor.getSelectedItem().toString());
                fun.setUsuario(TFusuario.getText());
                fun.setSenha(senha);
                fun.setSalario(Double.valueOf(TFsalario.getText()));
                fun.setFuncao(TFfuncao.getText());

                DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                try {
                        Date dataNascimento = (Date)format.parse(TFdataNascimento.getText());
                        fun.setDataNascimento(dataNascimento);
                } catch (ParseException e) {
                        System.out.println("Erro: "+ e);
                }

                FuncionarioDAO funDAO = new FuncionarioDAO();
                funDAO.inserirFuncionario(fun);

            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Senha e Confirma Senha não conferem!");
        }

        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Limpar os Text Fields
        TFnome.setText("");
        TFemail.setText("");
        TFdataNascimento.setText("");
        TFsalario.setText("");
        TFfuncao.setText("");
        PFsenha.setText("");
        PFconfirmarSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        if(funcionario.getSetor().equals("Administração"))
        {
            TelaInicialAdmin tc = new TelaInicialAdmin(funcionario);
            tc.setVisible(true);
            this.dispose();
        }
        else
        {
            TelaInicial tc = new TelaInicial();
            tc.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void CBverStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CBverStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CBverStateChanged

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

    private void CBver1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CBver1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CBver1StateChanged

    private void CBver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBver1ActionPerformed
        // Show Password
        if(CBver1.isSelected())
        {
            PFconfirmarSenha.setEchoChar((char)0);
        }
        else
        {
            PFconfirmarSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_CBver1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBver;
    private javax.swing.JCheckBox CBver1;
    private javax.swing.JLabel LconfirmarSenha;
    private javax.swing.JLabel LdataNascimento;
    private javax.swing.JLabel Lemail;
    private javax.swing.JLabel Lfuncao;
    private javax.swing.JLabel Lnome;
    private javax.swing.JLabel Lsalario;
    private javax.swing.JLabel Lsenha;
    private javax.swing.JLabel Lsetor;
    private javax.swing.JLabel Lsexo;
    private javax.swing.JLabel Lusuario1;
    private javax.swing.JPasswordField PFconfirmarSenha;
    private javax.swing.JPasswordField PFsenha;
    private javax.swing.JTextField TFdataNascimento;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFfuncao;
    private javax.swing.JTextField TFnome;
    private javax.swing.JTextField TFsalario;
    private javax.swing.JTextField TFusuario;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbSetor;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
