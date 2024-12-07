/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco.View;

import banco.Dao.connectDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Riato
 */
public class Funcionarios extends javax.swing.JFrame {

    banco.Dao.Funcionarios funcionario_tela = new banco.Dao.Funcionarios();

    /**
     * Creates new form Funcionarios
     */
    public Funcionarios() {
        initComponents();
    }
    String operacaoAtivaGlobal = "Nenhum";

    public Funcionarios(String operacaoAtiva) {
        initComponents();
        operacaoAtivaGlobal = operacaoAtiva;
        String operacao = "Incluir";
        if (operacaoAtiva.equals(operacao)) {
            jLabel1_id.setVisible(true);
            jLabel2_nomeFuncionario.setVisible(true);
            jLabel1_cep.setVisible(true);
            jLabel1_logradouro.setVisible(true);
            jLabel2_complemento.setVisible(true);
            jLabel3_bairro.setVisible(true);
            jLabel3_localidade.setVisible(true);
            jLabel4_uf.setVisible(true);
            jLabel4_estado.setVisible(true);
            jLabel4_ddd.setVisible(true);
            jButton3_alterar.setVisible(false);
            jButton2_ler.setVisible(false);
            jButton4_excluir.setVisible(false);
            jButton1_cadastrar.setText("Incluir");
        }
        operacao = "Alterar";
        if (operacaoAtiva.equals(operacao)) {
            jTextField2_id.setVisible(true);
            jTextField4_nomeFuncionario.setVisible(false);
            jTextField3_cep.setVisible(false);
            jTextField1_logradouro.setVisible(false);
            jTextField7_complemento.setVisible(false);
            jTextField6_bairro.setVisible(false);
            jTextField5_localidade.setVisible(false);
            jTextField10_uf.setVisible(false);
            jTextField8_estado.setVisible(false);
            jTextField9_ddd.setVisible(false);

            jLabel1_id.setVisible(true);
            jLabel2_nomeFuncionario.setVisible(false);
            jLabel1_cep.setVisible(false);
            jLabel1_logradouro.setVisible(false);
            jLabel2_complemento.setVisible(false);
            jLabel3_bairro.setVisible(false);
            jLabel3_localidade.setVisible(false);
            jLabel4_uf.setVisible(false);
            jLabel4_estado.setVisible(false);
            jLabel4_ddd.setVisible(false);

            jButton1_cadastrar.setVisible(false);
            jButton4_excluir.setVisible(false);
            jButton3_alterar.setVisible(false);
        }
        operacao = "Excluir";
        if (operacaoAtiva.equals(operacao)) {
            jLabel1_id.setVisible(true);
            jLabel2_nomeFuncionario.setVisible(false);
            jLabel1_cep.setVisible(false);
            jLabel1_logradouro.setVisible(false);
            jLabel2_complemento.setVisible(false);
            jLabel3_bairro.setVisible(false);
            jLabel3_localidade.setVisible(false);
            jLabel4_uf.setVisible(false);
            jLabel4_estado.setVisible(false);
            jLabel4_ddd.setVisible(false);

            jTextField4_nomeFuncionario.setVisible(false);
            jTextField3_cep.setVisible(false);
            jTextField1_logradouro.setVisible(false);
            jTextField7_complemento.setVisible(false);
            jTextField6_bairro.setVisible(false);
            jTextField5_localidade.setVisible(false);
            jTextField10_uf.setVisible(false);
            jTextField8_estado.setVisible(false);
            jTextField9_ddd.setVisible(false);

            jTextField4_nomeFuncionario.setEditable(false);
            jTextField3_cep.setEditable(false);
            jTextField1_logradouro.setEditable(false);
            jTextField7_complemento.setEditable(false);
            jTextField6_bairro.setEditable(false);
            jTextField5_localidade.setEditable(false);
            jTextField10_uf.setEditable(false);
            jTextField8_estado.setEditable(false);
            jTextField9_ddd.setEditable(false);

            jButton1_cadastrar.setVisible(false);
            jButton3_alterar.setVisible(false);
            jButton4_excluir.setVisible(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1_logradouro = new javax.swing.JTextField();
        jTextField2_id = new javax.swing.JTextField();
        jTextField3_cep = new javax.swing.JTextField();
        jTextField4_nomeFuncionario = new javax.swing.JTextField();
        jTextField5_localidade = new javax.swing.JTextField();
        jTextField6_bairro = new javax.swing.JTextField();
        jTextField7_complemento = new javax.swing.JTextField();
        jTextField8_estado = new javax.swing.JTextField();
        jTextField9_ddd = new javax.swing.JTextField();
        jTextField10_uf = new javax.swing.JTextField();
        jLabel1_id = new javax.swing.JLabel();
        jLabel2_nomeFuncionario = new javax.swing.JLabel();
        jLabel1_cep = new javax.swing.JLabel();
        jLabel1_logradouro = new javax.swing.JLabel();
        jLabel2_complemento = new javax.swing.JLabel();
        jLabel3_bairro = new javax.swing.JLabel();
        jLabel3_localidade = new javax.swing.JLabel();
        jLabel4_uf = new javax.swing.JLabel();
        jLabel4_estado = new javax.swing.JLabel();
        jLabel4_ddd = new javax.swing.JLabel();
        jButton1_cadastrar = new javax.swing.JButton();
        jButton2_ler = new javax.swing.JButton();
        jButton3_alterar = new javax.swing.JButton();
        jButton4_excluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1_id.setText("ID");

        jLabel2_nomeFuncionario.setText("Nome");

        jLabel1_cep.setText("Cep");

        jLabel1_logradouro.setText("Logradouro");

        jLabel2_complemento.setText("Complemento");

        jLabel3_bairro.setText("Bairro");

        jLabel3_localidade.setText("Localidade");

        jLabel4_uf.setText("UF");

        jLabel4_estado.setText("Estado");

        jLabel4_ddd.setText("DDD");

        jButton1_cadastrar.setText("Cadastrar");
        jButton1_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_cadastrarActionPerformed(evt);
            }
        });

        jButton2_ler.setText("Ler");
        jButton2_ler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_lerActionPerformed(evt);
            }
        });

        jButton3_alterar.setText("Alterar");
        jButton3_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_alterarActionPerformed(evt);
            }
        });

        jButton4_excluir.setText("Excluir");
        jButton4_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_excluirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Funcionários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1_id)
                                    .addGap(29, 29, 29))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1_cep)
                                        .addComponent(jLabel3_localidade))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2_complemento)
                                            .addGap(31, 31, 31)
                                            .addComponent(jTextField7_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField3_cep)
                                            .addGap(64, 64, 64)
                                            .addComponent(jLabel1_logradouro)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3_bairro)
                                                .addComponent(jLabel4_uf))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField10_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField6_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jTextField2_id, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2_nomeFuncionario)
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField4_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4_estado)
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField8_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(jTextField5_localidade))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4_ddd)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField9_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2_ler)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4_excluir)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_id)
                    .addComponent(jTextField2_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_nomeFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_cep)
                    .addComponent(jTextField3_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_logradouro)
                    .addComponent(jTextField1_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3_bairro))
                    .addComponent(jLabel2_complemento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3_localidade)
                        .addComponent(jTextField5_localidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4_uf))
                    .addComponent(jTextField10_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4_estado)
                    .addComponent(jTextField8_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4_ddd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_cadastrar)
                    .addComponent(jButton2_ler)
                    .addComponent(jButton3_alterar)
                    .addComponent(jButton4_excluir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_cadastrarActionPerformed
        banco.Dao.Funcionarios dados = new banco.Dao.Funcionarios();
        dados.setId(Integer.parseInt(jTextField2_id.getText()));
        dados.setNomeFuncionario(jTextField4_nomeFuncionario.getText());
        dados.setCep(jTextField3_cep.getText());
        dados.setLogradouro(jTextField1_logradouro.getText());
        dados.setComplemento(jTextField7_complemento.getText());
        dados.setBairro(jTextField6_bairro.getText());
        dados.setLocalidade(jTextField5_localidade.getText());
        dados.setUf(jTextField10_uf.getText());
        dados.setEstado(jTextField8_estado.getText());
        dados.setDdd(jTextField9_ddd.getText());
        banco.Dao.connectDAO objcon = new banco.Dao.connectDAO();
        objcon.insereRegistroJFBD("FUNCIONARIOS", dados.dadosSQLValuesFuncionarios());
    }//GEN-LAST:event_jButton1_cadastrarActionPerformed

    private void jButton2_lerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_lerActionPerformed
        if (jTextField2_id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o ID do funcionário", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            banco.Dao.connectDAO objcon = new banco.Dao.connectDAO();
            jTextField2_id.setEditable(false);
            funcionario_tela = objcon.pesquisaFuncionario("FUNCIONARIOS", "[_id] = '" + jTextField2_id.getText() + "'");

            jTextField4_nomeFuncionario.setText(funcionario_tela.getNomeFuncionario());
            jTextField3_cep.setText(funcionario_tela.getCep());
            jTextField1_logradouro.setText(funcionario_tela.getLogradouro());
            jTextField7_complemento.setText(funcionario_tela.getComplemento());
            jTextField6_bairro.setText(funcionario_tela.getBairro());
            jTextField5_localidade.setText(funcionario_tela.getLocalidade());
            jTextField10_uf.setText(funcionario_tela.getUf());
            jTextField8_estado.setText(funcionario_tela.getEstado());
            jTextField9_ddd.setText(funcionario_tela.getDdd());

            jLabel2_nomeFuncionario.setVisible(true);
            jLabel1_cep.setVisible(true);
            jLabel1_logradouro.setVisible(true);
            jLabel2_complemento.setVisible(true);
            jLabel3_bairro.setVisible(true);
            jLabel3_localidade.setVisible(true);
            jLabel4_uf.setVisible(true);
            jLabel4_estado.setVisible(true);
            jLabel4_ddd.setVisible(true);
            jTextField4_nomeFuncionario.setVisible(true);
            jTextField3_cep.setVisible(true);
            jTextField1_logradouro.setVisible(true);
            jTextField7_complemento.setVisible(true);
            jTextField6_bairro.setVisible(true);
            jTextField5_localidade.setVisible(true);
            jTextField10_uf.setVisible(true);
            jTextField8_estado.setVisible(true);
            jTextField9_ddd.setVisible(true);

            jButton4_excluir.setVisible(false);
            if (operacaoAtivaGlobal.equals("Alterar")) {
                jButton3_alterar.setVisible(true);
            } else {
                jButton4_excluir.setVisible(true);
            }
            jButton2_ler.setVisible(false);
        }
    }//GEN-LAST:event_jButton2_lerActionPerformed

    private void jButton3_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_alterarActionPerformed
        banco.Dao.Funcionarios dados = new banco.Dao.Funcionarios();
        connectDAO objcon = new connectDAO();
        int id = Integer.valueOf(jTextField2_id.getText());
        dados.setId(id);
        dados.setNomeFuncionario(jTextField4_nomeFuncionario.getText());
        dados.setCep(jTextField3_cep.getText());
        dados.setLogradouro(jTextField1_logradouro.getText());
        dados.setComplemento(jTextField7_complemento.getText());
        dados.setBairro(jTextField6_bairro.getText());
        dados.setLocalidade(jTextField5_localidade.getText());
        dados.setUf(jTextField10_uf.getText());
        dados.setEstado(jTextField8_estado.getText());
        dados.setDdd(jTextField9_ddd.getText());

        objcon.alteraRegistoJFBD("FUNCIONARIOS", dados.alteradadosSQLValues(), "_id =" + jTextField2_id.getText());
        jTextField2_id.setText("");
        jTextField4_nomeFuncionario.setText("");
        jTextField3_cep.setText("");
        jTextField1_logradouro.setText("");
        jTextField7_complemento.setText("");
        jTextField6_bairro.setText("");
        jTextField6_bairro.setText("");
        jTextField5_localidade.setText("");
        jTextField10_uf.setText("");
        jTextField8_estado.setText("");
        jTextField9_ddd.setText("");
    }//GEN-LAST:event_jButton3_alterarActionPerformed

    private void jButton4_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_excluirActionPerformed
        Funcionarios dados = new Funcionarios();
        connectDAO objcon = new connectDAO();
        objcon.deletaRegistroJFBD("FUNCIONARIOS", "_id =" + jTextField2_id.getText());
    }//GEN-LAST:event_jButton4_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_cadastrar;
    private javax.swing.JButton jButton2_ler;
    private javax.swing.JButton jButton3_alterar;
    private javax.swing.JButton jButton4_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_cep;
    private javax.swing.JLabel jLabel1_id;
    private javax.swing.JLabel jLabel1_logradouro;
    private javax.swing.JLabel jLabel2_complemento;
    private javax.swing.JLabel jLabel2_nomeFuncionario;
    private javax.swing.JLabel jLabel3_bairro;
    private javax.swing.JLabel jLabel3_localidade;
    private javax.swing.JLabel jLabel4_ddd;
    private javax.swing.JLabel jLabel4_estado;
    private javax.swing.JLabel jLabel4_uf;
    private javax.swing.JTextField jTextField10_uf;
    private javax.swing.JTextField jTextField1_logradouro;
    private javax.swing.JTextField jTextField2_id;
    private javax.swing.JTextField jTextField3_cep;
    private javax.swing.JTextField jTextField4_nomeFuncionario;
    private javax.swing.JTextField jTextField5_localidade;
    private javax.swing.JTextField jTextField6_bairro;
    private javax.swing.JTextField jTextField7_complemento;
    private javax.swing.JTextField jTextField8_estado;
    private javax.swing.JTextField jTextField9_ddd;
    // End of variables declaration//GEN-END:variables
}
