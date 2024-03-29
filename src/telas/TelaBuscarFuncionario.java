/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import bd.FuncionarioDAO;
import entities.Funcionario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class TelaBuscarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaBuscarFuncionario
     */
    
    private Funcionario funcionario = new Funcionario();
    private Funcionario funcionarioBusca = new Funcionario();
    
    public TelaBuscarFuncionario() {
        initComponents();
    }
    
    public TelaBuscarFuncionario(Funcionario funcionario) 
    {
        this.funcionario = funcionario;
        funcionarioBusca.setSetor("nenhum");//flag padrão para verificar se o valor do obj funcionarioBusca foi setado corretamenta
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
        Lusuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAsaida = new javax.swing.JTextArea();
        TFusuario = new javax.swing.JTextField();
        Ltitulo = new javax.swing.JLabel();
        bntBuscar = new javax.swing.JButton();
        bntVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bntAtualizar = new javax.swing.JButton();
        bntBuscarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Buscar por Funcionário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Lusuario.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Lusuario.setText("Usuário:");

        TAsaida.setColumns(20);
        TAsaida.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        TAsaida.setRows(5);
        TAsaida.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(TAsaida);

        TFusuario.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N

        Ltitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/10.png"))); // NOI18N

        bntBuscar.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        bntBuscar.setForeground(new java.awt.Color(249, 154, 8));
        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        bntVoltar.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        bntVoltar.setForeground(new java.awt.Color(255, 57, 23));
        bntVoltar.setText("<<");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        bntAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        bntAtualizar.setText("Atualizar dados funcionário");
        bntAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtualizarActionPerformed(evt);
            }
        });

        bntBuscarTodos.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        bntBuscarTodos.setForeground(new java.awt.Color(249, 154, 8));
        bntBuscarTodos.setText("Buscar Todos");
        bntBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Ltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bntBuscarTodos)
                                .addGap(32, 32, 32)
                                .addComponent(bntBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lusuario)
                                .addGap(18, 18, 18)
                                .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bntAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))
                        .addGap(115, 115, 115))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lusuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntBuscar)
                    .addComponent(bntBuscarTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAtualizar)
                    .addComponent(bntVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed

        funcionarioBusca.setUsuario(TFusuario.getText());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        if (funcionarioBusca.getUsuario().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Digite o usuario do funcionario!");
        }
        else
        {
            List<Funcionario> funcionarios = new ArrayList<>();
            FuncionarioDAO funDAO = new FuncionarioDAO();
            funcionarios = funDAO.listarFuncionario(funcionarioBusca);
            
            String resultado = "Dados do funcionario:\n\n";
            for (Funcionario f : funcionarios){
                resultado += "-----------------------------------\n";
                resultado += "Nome: " + f.getNome() + "\n";
                resultado += "-----------------------------------\n";
                resultado += "Usuário: " + f.getUsuario()+ "\n";
                resultado += "-----------------------------------\n";
                resultado += "Email: " + f.getEmail() + "\n";
                resultado += "-----------------------------------\n";
                resultado += "Data de Nascimento: " + dateFormat.format(f.getDataNascimento()) + "\n";
                resultado += "-----------------------------------\n";
                resultado += "Sexo: " + f.getSexo()+ "\n";
                resultado += "-----------------------------------\n";
                resultado += "Função: " + f.getFuncao()+ "\n";
                resultado += "-----------------------------------\n";
                resultado += "Setor: " + f.getSetor()+ "\n";
                resultado += "-----------------------------------\n";
                resultado += "Salário: " + f.getSalario()+ "\n";
                resultado += "-----------------------------------\n";
            }
            
            TAsaida.setText(resultado);
            
        }
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void bntAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarActionPerformed
        if (funcionarioBusca.getSetor().equals("nenhum"))
        {
            JOptionPane.showMessageDialog(null, "Funcionario não encontrado! Digite o usuário do funcionário!");
        }
        else
        {
            TelaAtualizarFuncionario taf = new TelaAtualizarFuncionario(funcionario,funcionarioBusca);
            taf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bntAtualizarActionPerformed

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
        // TODO add your handling code here:
         if(funcionario.getSetor().equals("Administração"))
        {
            TelaInicialAdmin tc = new TelaInicialAdmin(funcionario);
            tc.setVisible(true);
            this.dispose();
        }
        else
        {
            TelaInicial tc = new TelaInicial(funcionario);
            tc.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void bntBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarTodosActionPerformed
        funcionarioBusca.setSetor("nenhum");//flag padrão para verificar se o valor do obj funcionarioBusca foi setado corretamenta
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Funcionario> funcionarios = new ArrayList<>();
        FuncionarioDAO funDAO = new FuncionarioDAO();
        funcionarios = funDAO.listarTodosFuncionarios(funcionarioBusca);
            
        String resultado = "Dados de todos os funcionarios:\n\n";
        for (Funcionario f : funcionarios){
            resultado += "Nome: " + f.getNome() + "\n";
            resultado += "Usuário: " + f.getUsuario()+ "\n";
            resultado += "Email: " + f.getEmail() + "\n";
            resultado += "Data de Nascimento: " + dateFormat.format(f.getDataNascimento()) + "\n";
            resultado += "Sexo: " + f.getSexo()+ "\n";
            resultado += "Função: " + f.getFuncao()+ "\n";
            resultado += "Setor: " + f.getSetor()+ "\n";
            resultado += "Salário: " + f.getSalario()+ "\n";
            resultado += "-----------------------------------\n";
        }
            
        TAsaida.setText(resultado);
             
    }//GEN-LAST:event_bntBuscarTodosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ltitulo;
    private javax.swing.JLabel Lusuario;
    private javax.swing.JTextArea TAsaida;
    private javax.swing.JTextField TFusuario;
    private javax.swing.JButton bntAtualizar;
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton bntBuscarTodos;
    private javax.swing.JButton bntVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
