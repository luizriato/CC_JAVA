/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco.View;

import banco.Dao.ContaCorrente;
import banco.Dao.connectDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ContaCorrenteView extends javax.swing.JFrame {

    ContaCorrente contaCorrente_tela = new ContaCorrente();

    /**
     * Creates new form ContaCorrente
     */
    public ContaCorrenteView() {
        initComponents();
    }

    String operacaoAtivaGlobal = "Nenhum";                     // Variável criada para utilização em toda a classe

    public ContaCorrenteView(String operacaoAtiva) {
        initComponents();                                    // Inicializa todos os componentes que estão colocados na tela Text, Labels, Buttons, etc.
        operacaoAtivaGlobal = operacaoAtiva;                // Setar a operacaoAtivaGlobal com o parâmetro recebido para utilização em toda a classe
        String operacao = "Incluir";                       // String para verificar qual é operação que será configurada
        if (operacaoAtiva.equals(operacao)) {             // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jTextField1_numAge.setVisible(true);
            jTextField2_cc.setVisible(true);
            jTextField3_id.setVisible(true);
            jTextField4_saldo.setVisible(true);
            jTextField2_cc.setEditable(true);
            jTextField3_id.setEditable(true);
            jTextField4_saldo.setEditable(true);
            jButton1_ler.setVisible(false);
            jButton3_excluir.setVisible(false);
            jButton2_alterar.setVisible(false);
        }
        operacao = "Alterar";                                   // defini a operação como Alterar os dados de um registro
        if (operacaoAtiva.equals(operacao)) {      
            jTextField1_numAge.setEditable(false);
            jTextField2_cc.setEditable(false);
            jTextField1_numAge.setVisible(false);
            jTextField2_cc.setVisible(false);
            jTextField3_id.setVisible(true);
            jTextField4_saldo.setVisible(false);
            jLabel1_numAge.setVisible(false);
            jLabel3_cc.setVisible(false);
            jLabel4_saldo.setVisible(false);
            jLabel2_id.setVisible(true);
            jButton1_cadastrar.setVisible(false);
            jButton2_alterar.setVisible(false);
            jButton3_excluir.setVisible(false);
        }
        operacao = "Excluir";                                // defini a operação como Excluir um registro
        if (operacaoAtiva.equals(operacao)) {       // para exclusão deverá ser setado todos os componentes como false para não visualizar
            jTextField1_numAge.setVisible(false);
            jTextField2_cc.setVisible(false);
            jTextField4_saldo.setVisible(false);

            jLabel1_numAge.setVisible(false);
            jLabel3_cc.setVisible(false);
            jLabel4_saldo.setVisible(false);
            jLabel2_id.setVisible(true);

            jTextField1_numAge.setEditable(false);
            jTextField2_cc.setEditable(false);
            jTextField4_saldo.setEditable(false);

            jButton1_cadastrar.setVisible(false);
            jButton2_alterar.setVisible(false);
            jButton3_excluir.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_numAge = new javax.swing.JLabel();
        jLabel2_id = new javax.swing.JLabel();
        jLabel3_cc = new javax.swing.JLabel();
        jLabel4_saldo = new javax.swing.JLabel();
        jTextField1_numAge = new javax.swing.JTextField();
        jTextField3_id = new javax.swing.JTextField();
        jTextField2_cc = new javax.swing.JTextField();
        jTextField4_saldo = new javax.swing.JTextField();
        jButton1_cadastrar = new javax.swing.JButton();
        jButton2_alterar = new javax.swing.JButton();
        jButton3_excluir = new javax.swing.JButton();
        jButton1_ler = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1_numAge.setText("Número Agência");

        jLabel2_id.setText("ID");

        jLabel3_cc.setText("Conta Corrente");

        jLabel4_saldo.setText("Saldo");

        jButton1_cadastrar.setText("Cadastrar");
        jButton1_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_cadastrarActionPerformed(evt);
            }
        });

        jButton2_alterar.setText("Alterar");
        jButton2_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_alterarActionPerformed(evt);
            }
        });

        jButton3_excluir.setText("Excluir");
        jButton3_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_excluirActionPerformed(evt);
            }
        });

        jButton1_ler.setText("Ler");
        jButton1_ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_lerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Conta Corrente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4_saldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField4_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1_cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1_ler))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_numAge)
                            .addComponent(jLabel3_cc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2_cc)
                            .addComponent(jTextField1_numAge)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2_id)
                        .addGap(89, 89, 89)
                        .addComponent(jTextField3_id, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_id)
                    .addComponent(jTextField3_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_numAge)
                    .addComponent(jTextField1_numAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_cc)
                    .addComponent(jTextField2_cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4_saldo)
                    .addComponent(jTextField4_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_cadastrar)
                    .addComponent(jButton2_alterar)
                    .addComponent(jButton3_excluir)
                    .addComponent(jButton1_ler))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_alterarActionPerformed
        ContaCorrente dados = new ContaCorrente();
        connectDAO objcon = new connectDAO();
        dados.setSaldo(Double.parseDouble(jTextField4_saldo.getText().trim()));
        objcon.alteraRegistoJFBD("CONTACORRENTE", dados.alteradadosSQLValues(), "ID_CLI =" + jTextField3_id.getText());
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
    }//GEN-LAST:event_jButton2_alterarActionPerformed

    private void jButton1_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_cadastrarActionPerformed
        try {
            ContaCorrente dados = new ContaCorrente();
            dados.setNumAge(Integer.parseInt(jTextField1_numAge.getText()));
            dados.setNumCc(Long.parseLong(jTextField2_cc.getText()));
            dados.setIdCli(Integer.parseInt(jTextField3_id.getText()));
            dados.setSaldo(Double.parseDouble(jTextField4_saldo.getText()));

            connectDAO objcon = new connectDAO();
            objcon.insereRegistroJFBD("ContaCorrente", dados.dadosSQLValuesContaCorrente());
            JOptionPane.showMessageDialog(null, "Registro cadastrado com sucesso!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro de formato de número: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1_cadastrarActionPerformed

    private void jButton3_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_excluirActionPerformed
        ContaCorrente dados = new ContaCorrente();
        connectDAO objcon = new connectDAO();
        objcon.deletaRegistroJFBD("CONTACORRENTE", "ID_CLI =" + jTextField3_id.getText());
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
    }//GEN-LAST:event_jButton3_excluirActionPerformed

    private void jButton1_lerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_lerActionPerformed
        if (jTextField3_id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o id", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            connectDAO objcon = new connectDAO();
            contaCorrente_tela = objcon.pesquisaContaCorrenteJFBD("CONTACORRENTE", "ID_CLI = '" + jTextField3_id.getText() + "'");
            jTextField1_numAge.setText(String.valueOf(contaCorrente_tela.getNumAge()));
            jTextField2_cc.setText(String.valueOf(contaCorrente_tela.getNumCc()));
            jTextField4_saldo.setText(String.valueOf(contaCorrente_tela.getSaldo()));
            jTextField1_numAge.setVisible(true);
            jTextField2_cc.setVisible(true);
            jTextField3_id.setVisible(true);
            jTextField4_saldo.setVisible(true);
            jLabel1_numAge.setVisible(true);
            jLabel3_cc.setVisible(true);
            jLabel4_saldo.setVisible(true);
            jLabel2_id.setVisible(true);
            jButton2_alterar.setVisible(false);
            if (operacaoAtivaGlobal.equals("Alterar")) {
                jButton2_alterar.setVisible(true);
                jButton1_ler.setVisible(false);
            } else {
                jButton3_excluir.setVisible(true);
                jButton1_ler.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton1_lerActionPerformed

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
            java.util.logging.Logger.getLogger(ContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContaCorrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_cadastrar;
    private javax.swing.JButton jButton1_ler;
    private javax.swing.JButton jButton2_alterar;
    private javax.swing.JButton jButton3_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_numAge;
    private javax.swing.JLabel jLabel2_id;
    private javax.swing.JLabel jLabel3_cc;
    private javax.swing.JLabel jLabel4_saldo;
    private javax.swing.JTextField jTextField1_numAge;
    private javax.swing.JTextField jTextField2_cc;
    private javax.swing.JTextField jTextField3_id;
    private javax.swing.JTextField jTextField4_saldo;
    // End of variables declaration//GEN-END:variables
}
