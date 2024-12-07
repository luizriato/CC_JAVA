/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco.View;

import banco.Dao.Agencias;
import banco.Dao.connectDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AgenciasView extends javax.swing.JFrame {

    Agencias agencia_tela = new Agencias();

    public AgenciasView() {
        initComponents();
    }

    String operacaoAtivaGlobal = "Nenhum";   // Variável criada para utilização em toda a classe

    public AgenciasView(String operacaoAtiva) {
        initComponents();                                    // Inicializa todos os componentes que estão colocados na tela Text, Labels, Buttons, etc.
        operacaoAtivaGlobal = operacaoAtiva;  // Setar a operacaoAtivaGlobal com o parâmetro recebido para utilização em toda a classe
        String operacao = "Incluir";                    // String para verificar qual é operação que será configurada
        if (operacaoAtiva.equals(operacao)) {
            jTextField1_numAge.setVisible(true);                   // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jTextField2_nomeAge.setVisible(true);
            jTextField3_endeAge.setVisible(true);
            jTextField5_numeAge.setVisible(true);
            jTextField4_compleAge.setVisible(true);
            jTextField6_bairAge.setVisible(true);
            jTextField7_cidaAge.setVisible(true);
            jTextField8_ufAge.setVisible(true);
            jTextField9_cepAge.setVisible(true);
            jTextField10_foneAge.setVisible(true);
            jButton1_excluir.setVisible(false);
            jButton1_alterar.setVisible(false);
            jButton1_ler.setVisible(false);
            jButton1_cadastrar.setText("Incluir");
        }
        operacao = "Alterar";                               // defini a operação como Alterar os dados de um registro
        if (operacaoAtiva.equals(operacao)) {       // para alteração deverá ser setado todos os componentes como false para não visualizar
            jTextField1_numAge.setVisible(true);                   // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jTextField2_nomeAge.setVisible(false);
            jTextField3_endeAge.setVisible(false);
            jTextField5_numeAge.setVisible(false);
            jTextField4_compleAge.setVisible(false);
            jTextField6_bairAge.setVisible(false);
            jTextField7_cidaAge.setVisible(false);
            jTextField8_ufAge.setVisible(false);
            jTextField9_cepAge.setVisible(false);
            jTextField10_foneAge.setVisible(false);
            jLabel3_numAge.setVisible(true);                   // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jLabel1_nome.setVisible(false);
            jLabel2_endereco.setVisible(false);
            jLabel4_num.setVisible(false);
            jLabel5_complemento.setVisible(false);
            jLabel7_bairro.setVisible(false);
            jLabel6_cidade.setVisible(false);
            jLabel9_uf.setVisible(false);
            jLabel8_cep.setVisible(false);
            jLabel10_fone.setVisible(false);
            jButton1_excluir.setVisible(false);
            jButton1_cadastrar.setVisible(false);
            jButton1_alterar.setVisible(false);
        }
        operacao = "Excluir";                                // defini a operação como Excluir um registro
        if (operacaoAtiva.equals(operacao)) {       // para exclusão deverá ser setado todos os componentes como false para não visualizar
            jTextField1_numAge.setVisible(true);                   // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jTextField2_nomeAge.setVisible(false);
            jTextField3_endeAge.setVisible(false);
            jTextField4_compleAge.setVisible(false);
            jTextField5_numeAge.setVisible(false);
            jTextField6_bairAge.setVisible(false);
            jTextField7_cidaAge.setVisible(false);
            jTextField8_ufAge.setVisible(false);
            jTextField9_cepAge.setVisible(false);
            jTextField10_foneAge.setVisible(false);
            jTextField2_nomeAge.setEditable(false);
            jTextField3_endeAge.setEditable(false);
            jTextField4_compleAge.setEditable(false);
            jTextField5_numeAge.setEditable(false);
            jTextField6_bairAge.setEditable(false);
            jTextField7_cidaAge.setEditable(false);
            jTextField8_ufAge.setEditable(false);
            jTextField9_cepAge.setEditable(false);
            jTextField10_foneAge.setEditable(false);
            jLabel3_numAge.setVisible(true);                   // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jLabel1_nome.setVisible(false);
            jLabel2_endereco.setVisible(false);
            jLabel4_num.setVisible(false);
            jLabel5_complemento.setVisible(false);
            jLabel7_bairro.setVisible(false);
            jLabel6_cidade.setVisible(false);
            jLabel9_uf.setVisible(false);
            jLabel8_cep.setVisible(false);
            jLabel10_fone.setVisible(false);
            jButton1_alterar.setVisible(false);
            jButton1_cadastrar.setVisible(false);
            jButton1_excluir.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_nome = new javax.swing.JLabel();
        jLabel2_endereco = new javax.swing.JLabel();
        jLabel3_numAge = new javax.swing.JLabel();
        jLabel4_num = new javax.swing.JLabel();
        jLabel5_complemento = new javax.swing.JLabel();
        jLabel6_cidade = new javax.swing.JLabel();
        jLabel7_bairro = new javax.swing.JLabel();
        jLabel8_cep = new javax.swing.JLabel();
        jLabel9_uf = new javax.swing.JLabel();
        jLabel10_fone = new javax.swing.JLabel();
        jTextField2_nomeAge = new javax.swing.JTextField();
        jTextField3_endeAge = new javax.swing.JTextField();
        jTextField5_numeAge = new javax.swing.JTextField();
        jTextField4_compleAge = new javax.swing.JTextField();
        jTextField1_numAge = new javax.swing.JTextField();
        jTextField6_bairAge = new javax.swing.JTextField();
        jTextField10_foneAge = new javax.swing.JTextField();
        jTextField7_cidaAge = new javax.swing.JTextField();
        jTextField9_cepAge = new javax.swing.JTextField();
        jTextField8_ufAge = new javax.swing.JTextField();
        jButton1_cadastrar = new javax.swing.JButton();
        jButton1_alterar = new javax.swing.JButton();
        jButton1_excluir = new javax.swing.JButton();
        jButton1_ler = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1_nome.setText("Nome");

        jLabel2_endereco.setText("Endereço");

        jLabel3_numAge.setText("Número Agência");

        jLabel4_num.setText("Número");

        jLabel5_complemento.setText("Complemento");

        jLabel6_cidade.setText("Cidade");

        jLabel7_bairro.setText("Bairro");

        jLabel8_cep.setText("Cep");

        jLabel9_uf.setText("UF");

        jLabel10_fone.setText("Fone");

        jTextField1_numAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_numAgeActionPerformed(evt);
            }
        });

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
        jLabel1.setText("Agências");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10_fone)
                            .addComponent(jLabel7_bairro)
                            .addComponent(jLabel5_complemento)
                            .addComponent(jLabel2_endereco)
                            .addComponent(jLabel3_numAge)
                            .addComponent(jLabel9_uf))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4_compleAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTextField8_ufAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8_cep)
                                    .addGap(30, 30, 30)
                                    .addComponent(jTextField9_cepAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTextField6_bairAge, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6_cidade)
                                    .addGap(30, 30, 30)
                                    .addComponent(jTextField7_cidaAge, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTextField1_numAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1_nome)
                                    .addGap(30, 30, 30)
                                    .addComponent(jTextField2_nomeAge, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField3_endeAge, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4_num)
                                    .addGap(30, 30, 30)
                                    .addComponent(jTextField5_numeAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField10_foneAge, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_ler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_excluir)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_numAge)
                    .addComponent(jTextField1_numAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_nome)
                    .addComponent(jTextField2_nomeAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_endeAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_endereco)
                    .addComponent(jTextField5_numeAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4_num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5_complemento)
                    .addComponent(jTextField4_compleAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6_bairAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7_bairro)
                    .addComponent(jTextField7_cidaAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6_cidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8_ufAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_cepAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8_cep)
                    .addComponent(jLabel9_uf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10_fone)
                    .addComponent(jTextField10_foneAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_cadastrar)
                    .addComponent(jButton1_alterar)
                    .addComponent(jButton1_excluir)
                    .addComponent(jButton1_ler))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_numAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_numAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_numAgeActionPerformed

    private void jButton1_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_cadastrarActionPerformed
        Agencias dados = new Agencias();
        dados.setNumAge(Integer.parseInt(jTextField1_numAge.getText()));
        dados.setNomeAge(jTextField2_nomeAge.getText());
        dados.setEndeAge(jTextField3_endeAge.getText());
        dados.setComplAge(jTextField4_compleAge.getText());
        dados.setNumeAge(jTextField5_numeAge.getText());
        dados.setBairAge(jTextField6_bairAge.getText());
        dados.setCidaAge(jTextField7_cidaAge.getText());
        dados.setUfAge(jTextField8_ufAge.getText());
        dados.setCepAge(jTextField9_cepAge.getText());
        dados.setFoneAge(jTextField10_foneAge.getText());

        connectDAO objcon = new connectDAO();
        objcon.insereRegistroJFBD("Agencias", dados.dadosSQLValuesAgencia());
    }//GEN-LAST:event_jButton1_cadastrarActionPerformed

    private void jButton1_lerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_lerActionPerformed

        if (jTextField1_numAge.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o número da agência", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            connectDAO objcon = new connectDAO();
            jTextField1_numAge.setEditable(false);
            agencia_tela = objcon.pesquisaAgenciaJFBD("AGENCIAS", "NUM_AGE = '" + jTextField1_numAge.getText() + "'");

            jTextField2_nomeAge.setText(agencia_tela.getNomeAge());
            jTextField3_endeAge.setText(agencia_tela.getEndeAge());
            jTextField5_numeAge.setText(agencia_tela.getNumeAge());
            jTextField4_compleAge.setText(agencia_tela.getComplAge());
            jTextField6_bairAge.setText(agencia_tela.getBairAge());
            jTextField7_cidaAge.setText(agencia_tela.getCidaAge());
            jTextField8_ufAge.setText(agencia_tela.getUfAge());
            jTextField9_cepAge.setText(agencia_tela.getCepAge());
            jTextField10_foneAge.setText(agencia_tela.getFoneAge());

            jLabel3_numAge.setVisible(true);
            jLabel1_nome.setVisible(true);
            jLabel2_endereco.setVisible(true);
            jLabel4_num.setVisible(true);
            jLabel5_complemento.setVisible(true);
            jLabel7_bairro.setVisible(true);
            jLabel6_cidade.setVisible(true);
            jLabel9_uf.setVisible(true);
            jLabel8_cep.setVisible(true);
            jLabel10_fone.setVisible(true);
            jTextField1_numAge.setVisible(true);
            jTextField2_nomeAge.setVisible(true);
            jTextField3_endeAge.setVisible(true);
            jTextField5_numeAge.setVisible(true);
            jTextField4_compleAge.setVisible(true);
            jTextField6_bairAge.setVisible(true);
            jTextField7_cidaAge.setVisible(true);
            jTextField8_ufAge.setVisible(true);
            jTextField9_cepAge.setVisible(true);
            jTextField10_foneAge.setVisible(true);

            jButton1_excluir.setVisible(false);
            if (operacaoAtivaGlobal.equals("Alterar")) {
                jButton1_alterar.setVisible(true);
            } else {
                jButton1_excluir.setVisible(true);
            }
            jButton1_ler.setVisible(false);
        }


    }//GEN-LAST:event_jButton1_lerActionPerformed

    private void jButton1_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_alterarActionPerformed
        Agencias dados = new Agencias();
        connectDAO objcon = new connectDAO();

        dados.setNomeAge(jTextField2_nomeAge.getText());
        dados.setEndeAge(jTextField3_endeAge.getText());
        dados.setComplAge(jTextField4_compleAge.getText());
        dados.setBairAge(jTextField6_bairAge.getText());
        dados.setCidaAge(jTextField7_cidaAge.getText());
        dados.setUfAge(jTextField8_ufAge.getText());
        dados.setCepAge(jTextField9_cepAge.getText());
        dados.setFoneAge(jTextField10_foneAge.getText());

        objcon.alteraRegistoJFBD("AGENCIAS", dados.alteradadosSQLValues(), "NUM_AGE =" + jTextField1_numAge.getText());

        jTextField2_nomeAge.setText("");
        jTextField3_endeAge.setText("");
        jTextField5_numeAge.setText("");
        jTextField4_compleAge.setText("");
        jTextField6_bairAge.setText("");
        jTextField7_cidaAge.setText("");
        jTextField8_ufAge.setText("");
        jTextField9_cepAge.setText("");
        jTextField10_foneAge.setText("");
    }//GEN-LAST:event_jButton1_alterarActionPerformed

    private void jButton1_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_excluirActionPerformed
        Agencias dados = new Agencias();
        connectDAO objcon = new connectDAO();
        objcon.deletaRegistroJFBD("AGENCIAS", "NUM_AGE =" + jTextField1_numAge.getText());         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(Agencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_alterar;
    private javax.swing.JButton jButton1_cadastrar;
    private javax.swing.JButton jButton1_excluir;
    private javax.swing.JButton jButton1_ler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10_fone;
    private javax.swing.JLabel jLabel1_nome;
    private javax.swing.JLabel jLabel2_endereco;
    private javax.swing.JLabel jLabel3_numAge;
    private javax.swing.JLabel jLabel4_num;
    private javax.swing.JLabel jLabel5_complemento;
    private javax.swing.JLabel jLabel6_cidade;
    private javax.swing.JLabel jLabel7_bairro;
    private javax.swing.JLabel jLabel8_cep;
    private javax.swing.JLabel jLabel9_uf;
    private javax.swing.JTextField jTextField10_foneAge;
    private javax.swing.JTextField jTextField1_numAge;
    private javax.swing.JTextField jTextField2_nomeAge;
    private javax.swing.JTextField jTextField3_endeAge;
    private javax.swing.JTextField jTextField4_compleAge;
    private javax.swing.JTextField jTextField5_numeAge;
    private javax.swing.JTextField jTextField6_bairAge;
    private javax.swing.JTextField jTextField7_cidaAge;
    private javax.swing.JTextField jTextField8_ufAge;
    private javax.swing.JTextField jTextField9_cepAge;
    // End of variables declaration//GEN-END:variables
}
