/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco.View;

import banco.Dao.Movimentacao;
import banco.Dao.Agencias;
import banco.Dao.connectDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class MovimentacaoView extends javax.swing.JFrame {

    Movimentacao movimentacao_tela = new Movimentacao();

    /**
     * Creates new form Movimentacao
     */
    public MovimentacaoView() {
        initComponents();
    }

    String operacaoAtivaGlobal = "Nenhum";                     // Variável criada para utilização em toda a classe

    public MovimentacaoView(String operacaoAtiva) {
        initComponents();                                    // Inicializa todos os componentes que estão colocados na tela Text, Labels, Buttons, etc.
        operacaoAtivaGlobal = operacaoAtiva;                // Setar a operacaoAtivaGlobal com o parâmetro recebido para utilização em toda a classe
        String operacao = "Incluir";                       // String para verificar qual é operação que será configurada
        if (operacaoAtiva.equals(operacao)) {             // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jTextField1_numAge.setVisible(true);
            jTextField2_cc.setVisible(true);
            jTextField3_numDoc.setVisible(true);
            jTextField4_debCred.setVisible(true);
            jTextField5_id.setVisible(true);
            jTextField6_complHis.setVisible(true);
            jTextField7_valor.setVisible(true);
            jTextField8_saldo.setVisible(true);
            jTextField9_data.setVisible(true);

            jButton1_ler.setVisible(false);
            jButton1_excluir.setVisible(false);
            jButton1_alterar.setVisible(false);
        }
        operacao = "Alterar";                                   // defini a operação como Alterar os dados de um registro
        if (operacaoAtiva.equals(operacao)) {                  // para alteração deverá ser setado todos os componentes como false para não visualizar
            jTextField1_numAge.setVisible(true);
            jTextField2_cc.setVisible(false);
            jTextField3_numDoc.setVisible(false);
            jTextField4_debCred.setVisible(false);
            jTextField5_id.setVisible(false);
            jTextField6_complHis.setVisible(false);
            jTextField7_valor.setVisible(false);
            jTextField8_saldo.setVisible(false);
            jTextField9_data.setVisible(false);

            jLabel1_numAge.setVisible(true);
            jLabel2_cc.setVisible(false);
            jLabel4_numdoc.setVisible(false);
            jLabel5_debcred.setVisible(false);
            jLabel6_id.setVisible(false);
            jLabel8_complemento.setVisible(false);
            jLabel7_valor.setVisible(false);
            jLabel9_saldo.setVisible(false);
            jLabel3_data.setVisible(false);

            jButton1_cadastrar.setVisible(false);
            jButton1_excluir.setVisible(false);
            jButton1_alterar.setVisible(false);
        }
        operacao = "Excluir";                                // defini a operação como Excluir um registro
        if (operacaoAtiva.equals(operacao)) {       // para exclusão deverá ser setado todos os componentes como false para não visualizar
            jTextField1_numAge.setVisible(true);
            jTextField2_cc.setVisible(false);
            jTextField3_numDoc.setVisible(false);
            jTextField4_debCred.setVisible(false);
            jTextField5_id.setVisible(false);
            jTextField6_complHis.setVisible(false);
            jTextField7_valor.setVisible(false);
            jTextField8_saldo.setVisible(false);
            jTextField9_data.setVisible(false);

            jLabel1_numAge.setVisible(true);
            jLabel2_cc.setVisible(false);
            jLabel4_numdoc.setVisible(false);
            jLabel5_debcred.setVisible(false);
            jLabel6_id.setVisible(false);
            jLabel8_complemento.setVisible(false);
            jLabel7_valor.setVisible(false);
            jLabel9_saldo.setVisible(false);
            jLabel3_data.setVisible(false);

            jTextField2_cc.setEditable(false);
            jTextField3_numDoc.setEditable(false);
            jTextField4_debCred.setEditable(false);
            jTextField5_id.setEditable(false);
            jTextField6_complHis.setEditable(false);
            jTextField7_valor.setEditable(false);
            jTextField8_saldo.setEditable(false);
            jTextField9_data.setEditable(false);

            jButton1_cadastrar.setVisible(false);
            jButton1_excluir.setVisible(false);
            jButton1_alterar.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_numAge = new javax.swing.JLabel();
        jLabel2_cc = new javax.swing.JLabel();
        jLabel3_data = new javax.swing.JLabel();
        jLabel4_numdoc = new javax.swing.JLabel();
        jLabel5_debcred = new javax.swing.JLabel();
        jLabel6_id = new javax.swing.JLabel();
        jLabel7_valor = new javax.swing.JLabel();
        jLabel8_complemento = new javax.swing.JLabel();
        jLabel9_saldo = new javax.swing.JLabel();
        jTextField1_numAge = new javax.swing.JTextField();
        jTextField2_cc = new javax.swing.JTextField();
        jTextField9_data = new javax.swing.JTextField();
        jTextField4_debCred = new javax.swing.JTextField();
        jTextField3_numDoc = new javax.swing.JTextField();
        jTextField6_complHis = new javax.swing.JTextField();
        jTextField5_id = new javax.swing.JTextField();
        jTextField7_valor = new javax.swing.JTextField();
        jTextField8_saldo = new javax.swing.JTextField();
        jButton1_cadastrar = new javax.swing.JButton();
        jButton1_alterar = new javax.swing.JButton();
        jButton1_excluir = new javax.swing.JButton();
        jButton1_ler = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1_numAge.setText("Número Agência");

        jLabel2_cc.setText("CC");

        jLabel3_data.setText("Data");

        jLabel4_numdoc.setText("Número Documento");

        jLabel5_debcred.setText("Débido/Crédito");

        jLabel6_id.setText("ID");

        jLabel7_valor.setText("Valor");

        jLabel8_complemento.setText("Complemento");

        jLabel9_saldo.setText("Saldo");

        jButton1_cadastrar.setText("Cadastrar");
        jButton1_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_cadastrarActionPerformed(evt);
            }
        });

        jButton1_alterar.setText("Alterar");
        jButton1_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_alterarActionPerformed(evt);
            }
        });

        jButton1_excluir.setText("Excluir");
        jButton1_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_excluirActionPerformed(evt);
            }
        });

        jButton1_ler.setText("Ler");
        jButton1_ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_lerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Movimentação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7_valor)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9_saldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField8_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3_data)
                            .addComponent(jLabel4_numdoc)
                            .addComponent(jLabel1_numAge))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3_numDoc)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField1_numAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(jLabel2_cc)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField2_cc))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField9_data, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(jLabel5_debcred)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField4_debCred, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6_id)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5_id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8_complemento)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6_complHis))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_ler)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_numAge)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1_numAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2_cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2_cc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_data)
                    .addComponent(jTextField4_debCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5_debcred))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_numDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4_numdoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6_id)
                    .addComponent(jTextField6_complHis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8_complemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7_valor)
                    .addComponent(jLabel9_saldo)
                    .addComponent(jTextField8_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_cadastrar)
                    .addComponent(jButton1_alterar)
                    .addComponent(jButton1_excluir)
                    .addComponent(jButton1_ler))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_cadastrarActionPerformed
        Movimentacao dados = new Movimentacao();
                String dateString = jTextField9_data.getText();
        SimpleDateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date = originalFormat.parse(dateString);
            dados.setDataMov(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Agencias agencia = new Agencias();
        connectDAO objcon = new connectDAO();

        try {
            int numAge = Integer.parseInt(jTextField1_numAge.getText());
            agencia = objcon.pesquisaAgenciaJFBD("AGENCIAS", "NUM_AGE = " + numAge);

            if (agencia.getNumAge() == 0) {
                JOptionPane.showMessageDialog(null, "Agência não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            dados.setNumAge(numAge);
            dados.setNumCc(Long.parseLong(jTextField2_cc.getText()));
            dados.setNumDocto(jTextField3_numDoc.getText());
            dados.setDebitoCredito(jTextField4_debCred.getText().charAt(0));
            dados.setIdHis((int) Long.parseLong(jTextField5_id.getText())); // Changed to long
            dados.setComplHis(jTextField6_complHis.getText());
            dados.setValor(Double.parseDouble(jTextField7_valor.getText()));
            dados.setSaldo(Double.parseDouble(jTextField8_saldo.getText()));

            objcon.insereRegistroJFBD("Movimentacao", dados.dadosSQLValuesMovimentacao());
            JOptionPane.showMessageDialog(null, "Movimentação cadastrada com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira valores numéricos válidos.", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1_cadastrarActionPerformed

    private void jButton1_lerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_lerActionPerformed
        if (jTextField1_numAge.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o número da agência", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            connectDAO objcon = new connectDAO();
            movimentacao_tela = objcon.pesquisaMovimentacaoJFBD("MOVIMENTACAO", "NUM_AGE = '" + jTextField1_numAge.getText() + "'");
            jTextField1_numAge.setEditable(false);

            jTextField2_cc.setText(String.valueOf(movimentacao_tela.getNumCc()));
            jTextField9_data.setText(new SimpleDateFormat("dd/MM/yyyy").format(movimentacao_tela.getDataMov()));
            jTextField3_numDoc.setText(String.valueOf(movimentacao_tela.getNumDocto()));
            jTextField4_debCred.setText(String.valueOf(movimentacao_tela.getDebitoCredito()));
            jTextField5_id.setText(String.valueOf(movimentacao_tela.getIdHis()));
            jTextField6_complHis.setText(String.valueOf(movimentacao_tela.getComplHis()));
            jTextField7_valor.setText(String.valueOf(movimentacao_tela.getValor()));
            jTextField8_saldo.setText(String.valueOf(movimentacao_tela.getSaldo()));

            jTextField2_cc.setVisible(true);
            jTextField9_data.setVisible(true);
            jTextField3_numDoc.setVisible(true);
            jTextField4_debCred.setVisible(true);
            jTextField5_id.setVisible(true);
            jTextField6_complHis.setVisible(true);
            jTextField7_valor.setVisible(true);
            jTextField8_saldo.setVisible(true);

            jLabel2_cc.setVisible(true);
            jLabel3_data.setVisible(true);
            jLabel4_numdoc.setVisible(true);
            jLabel5_debcred.setVisible(true);
            jLabel6_id.setVisible(true);
            jLabel8_complemento.setVisible(true);
            jLabel7_valor.setVisible(true);
            jLabel9_saldo.setVisible(true);

            if (operacaoAtivaGlobal.equals("Alterar")) {
                jButton1_alterar.setVisible(true);
                jButton1_ler.setVisible(false);
            } else {
                jButton1_excluir.setVisible(true);
                jButton1_ler.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton1_lerActionPerformed

    private void jButton1_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_excluirActionPerformed
        Movimentacao dados = new Movimentacao();
        connectDAO objcon = new connectDAO();
        objcon.deletaRegistroJFBD("MOVIMENTACAO", "NUM_AGE =" + jTextField1_numAge.getText());
    }//GEN-LAST:event_jButton1_excluirActionPerformed

    private void jButton1_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_alterarActionPerformed
        Movimentacao dados = new Movimentacao();
        connectDAO objcon = new connectDAO();
        
        try {
            dados.setNumAge((int) Long.parseLong(jTextField1_numAge.getText()));
            dados.setNumCc(Long.parseLong(jTextField2_cc.getText()));
            String dateString = jTextField9_data.getText();
            SimpleDateFormat originalFormat = new SimpleDateFormat("dd/MM/yyyy"); 
        try {
            Date date = originalFormat.parse(dateString);
            dados.setDataMov(date);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
            dados.setNumDocto(jTextField3_numDoc.getText());

            String texto = jTextField4_debCred.getText();
            char debitoCreditoChar = texto.charAt(0);
            dados.setDebitoCredito(debitoCreditoChar);
            dados.setIdHis((int) Long.parseLong(jTextField5_id.getText()));
            dados.setComplHis(jTextField6_complHis.getText());
            dados.setValor(Double.parseDouble(jTextField7_valor.getText()));
            dados.setSaldo(Double.parseDouble(jTextField8_saldo.getText()));

            objcon.alteraRegistoJFBD("MOVIMENTACAO", dados.alteradadosSQLValues(), "NUM_AGE =" + jTextField1_numAge.getText());
            
            jTextField1_numAge.setText("");
            jTextField2_cc.setText("");
            jTextField9_data.setText("");
            jTextField3_numDoc.setText("");
            jTextField4_debCred.setText("");
            jTextField5_id.setText("");
            jTextField6_complHis.setText("");
            jTextField7_valor.setText("");
            jTextField8_saldo.setText("");
            
            JOptionPane.showMessageDialog(null, "Movimentação alterada com sucesso!"); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira valores numéricos válidos.", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1_alterarActionPerformed

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
            java.util.logging.Logger.getLogger(MovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovimentacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentacaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_alterar;
    private javax.swing.JButton jButton1_cadastrar;
    private javax.swing.JButton jButton1_excluir;
    private javax.swing.JButton jButton1_ler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_numAge;
    private javax.swing.JLabel jLabel2_cc;
    private javax.swing.JLabel jLabel3_data;
    private javax.swing.JLabel jLabel4_numdoc;
    private javax.swing.JLabel jLabel5_debcred;
    private javax.swing.JLabel jLabel6_id;
    private javax.swing.JLabel jLabel7_valor;
    private javax.swing.JLabel jLabel8_complemento;
    private javax.swing.JLabel jLabel9_saldo;
    private javax.swing.JTextField jTextField1_numAge;
    private javax.swing.JTextField jTextField2_cc;
    private javax.swing.JTextField jTextField3_numDoc;
    private javax.swing.JTextField jTextField4_debCred;
    private javax.swing.JTextField jTextField5_id;
    private javax.swing.JTextField jTextField6_complHis;
    private javax.swing.JTextField jTextField7_valor;
    private javax.swing.JTextField jTextField8_saldo;
    private javax.swing.JTextField jTextField9_data;
    // End of variables declaration//GEN-END:variables
}
