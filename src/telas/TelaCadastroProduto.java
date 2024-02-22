/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import bd.ProdutoDAO;
import entities.Produto;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author diogo
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroProduto
     */
    public TelaCadastroProduto() {
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
        title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Lnome = new javax.swing.JLabel();
        TFnome = new javax.swing.JTextField();
        Lmarca = new javax.swing.JLabel();
        TFmarca = new javax.swing.JTextField();
        Lcodigo = new javax.swing.JLabel();
        TFcodigo = new javax.swing.JTextField();
        Lquantidade = new javax.swing.JLabel();
        TFquantidade = new javax.swing.JTextField();
        Lpreco1 = new javax.swing.JLabel();
        TFpreco = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        TFlote = new javax.swing.JTextField();
        Lvalidade = new javax.swing.JLabel();
        Llote = new javax.swing.JLabel();
        TFvalidade = new javax.swing.JTextField();
        LCategoria = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cadastro Produto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/05.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 210, 122));

        Lnome.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lnome.setText("Nome do produto:");

        TFnome.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        Lmarca.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lmarca.setText("Marca:");

        TFmarca.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        Lcodigo.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lcodigo.setText("Código de identificação:");

        TFcodigo.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        TFcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcodigoActionPerformed(evt);
            }
        });

        Lquantidade.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lquantidade.setText("Quantidade em estoque:");

        TFquantidade.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        TFquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFquantidadeActionPerformed(evt);
            }
        });

        Lpreco1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lpreco1.setText("Preço por Unidade:");

        TFpreco.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N

        cmbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Café da Manhã", "Mercearia", "Carnes", "Higiene", "Laticínios/Frios", "Limpeza", "Hortifruti", "Outro" }));

        TFlote.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        TFlote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFloteActionPerformed(evt);
            }
        });

        Lvalidade.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Lvalidade.setText("Validade:");

        Llote.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        Llote.setText("Lote de Produto");

        TFvalidade.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        TFvalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFvalidadeActionPerformed(evt);
            }
        });

        LCategoria.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        LCategoria.setText("Catergoria:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lcodigo)
                    .addComponent(TFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lnome)
                    .addComponent(Lquantidade)
                    .addComponent(TFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lvalidade)
                    .addComponent(TFvalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Llote)
                        .addComponent(Lmarca)
                        .addComponent(Lpreco1)
                        .addComponent(TFpreco)
                        .addComponent(cmbCategoria, 0, 278, Short.MAX_VALUE)
                        .addComponent(TFlote))
                    .addComponent(LCategoria)
                    .addComponent(TFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lmarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LCategoria))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lnome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lcodigo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Lquantidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lpreco1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Lvalidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFlote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFvalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Llote)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnVoltar.setBackground(new java.awt.Color(255, 182, 182));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(117, 117, 117))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcodigoActionPerformed

    private void TFquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFquantidadeActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        TelaCadastros tc = new TelaCadastros();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void TFloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFloteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFloteActionPerformed

    private void TFvalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFvalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFvalidadeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // Setando os parametros do produto
        Produto prod = new Produto();
        prod.setNome(TFnome.getText());
        prod.setCodigo(Integer.valueOf(TFcodigo.getText()));
        prod.setLote(Integer.valueOf(TFlote.getText()));
        prod.setQuantidade(Integer.valueOf(TFquantidade.getText()));
        prod.setPreco(Double.valueOf(TFpreco.getText()));
        prod.setSetor(cmbCategoria.getSelectedItem().toString());
        
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        try {
                Date validade = (Date)format.parse(TFvalidade.getText());
                prod.setValidade(validade);
        } catch (ParseException e) {
                System.out.println("Erro: "+ e);
        }
        
        ProdutoDAO prodDAO = new ProdutoDAO();
        prodDAO.cadastrarProduto(prod);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Limpar os Text Fields 
        TFcodigo.setText("");
        TFlote.setText("");
        TFmarca.setText("");
        TFpreco.setText("");
        TFquantidade.setText("");
        TFvalidade.setText("");
        TFnome.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCategoria;
    private javax.swing.JLabel Lcodigo;
    private javax.swing.JLabel Llote;
    private javax.swing.JLabel Lmarca;
    private javax.swing.JLabel Lnome;
    private javax.swing.JLabel Lpreco1;
    private javax.swing.JLabel Lquantidade;
    private javax.swing.JLabel Lvalidade;
    private javax.swing.JTextField TFcodigo;
    private javax.swing.JTextField TFlote;
    private javax.swing.JTextField TFmarca;
    private javax.swing.JTextField TFnome;
    private javax.swing.JTextField TFpreco;
    private javax.swing.JTextField TFquantidade;
    private javax.swing.JTextField TFvalidade;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}