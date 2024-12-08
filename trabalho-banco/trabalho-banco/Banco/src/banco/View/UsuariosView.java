/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco.View;

import banco.Dao.Usuarios;
import banco.Dao.connectDAO;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Alunos
 */
public class UsuariosView extends javax.swing.JFrame {

    Usuarios usuarios_tela = new Usuarios();

    /**
     * Creates new form Usuarios
     */
    public UsuariosView() {
        initComponents();
    }

    String operacaoAtivaGlobal = "Nenhum";                     // Variável criada para utilização em toda a classe

    public UsuariosView(String operacaoAtiva) {
        initComponents();                                    // Inicializa todos os componentes que estão colocados na tela Text, Labels, Buttons, etc.
        operacaoAtivaGlobal = operacaoAtiva;                // Setar a operacaoAtivaGlobal com o parâmetro recebido para utilização em toda a classe
        String operacao = "Incluir";                       // String para verificar qual é operação que será configurada
        if (operacaoAtiva.equals(operacao)) {             // Para inclusão serão liberados todos os componentes da tela como true para ficarem visíveis
            jTextField1_id.setVisible(true);
            jTextField2_senha.setVisible(true);
            jTextField3_numAge.setVisible(true);
            jTextField4_cc.setVisible(true);

            jButton1_ler.setVisible(false);
            jButton1_excluir.setVisible(false);
            jButton1_alterar.setVisible(false);
        }
        operacao = "Alterar";                                   // defini a operação como Alterar os dados de um registro
        if (operacaoAtiva.equals(operacao)) {                  // para alteração deverá ser setado todos os componentes como false para não visualizar
            jTextField1_id.setVisible(true);
            jTextField2_senha.setVisible(false);
            jTextField3_numAge.setVisible(false);
            jTextField4_cc.setVisible(false);

            jLabel2_senha.setVisible(false);
            jLabel3_numAge.setVisible(false);
            jLabel4_cc.setVisible(false);

            jButton1_cadastrar.setVisible(false);
            jButton1_excluir.setVisible(false);
            jButton1_alterar.setVisible(false);
        }
        operacao = "Excluir";                                // defini a operação como Excluir um registro
        if (operacaoAtiva.equals(operacao)) {       // para exclusão deverá ser setado todos os componentes como false para não visualizar
            jTextField1_id.setVisible(true);
            jTextField2_senha.setVisible(false);
            jTextField3_numAge.setVisible(false);
            jTextField4_cc.setVisible(false);
            jTextField2_senha.setEditable(false);
            jTextField3_numAge.setEditable(false);
            jTextField4_cc.setEditable(false);

            jLabel2_senha.setVisible(false);
            jLabel3_numAge.setVisible(false);
            jLabel4_cc.setVisible(false);

            jButton1_cadastrar.setVisible(false);
            jButton1_excluir.setVisible(false);
            jButton1_alterar.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_id = new javax.swing.JLabel();
        jLabel2_senha = new javax.swing.JLabel();
        jLabel3_numAge = new javax.swing.JLabel();
        jLabel4_cc = new javax.swing.JLabel();
        jTextField1_id = new javax.swing.JTextField();
        jTextField2_senha = new javax.swing.JTextField();
        jTextField3_numAge = new javax.swing.JTextField();
        jTextField4_cc = new javax.swing.JTextField();
        jButton1_cadastrar = new javax.swing.JButton();
        jButton1_alterar = new javax.swing.JButton();
        jButton1_excluir = new javax.swing.JButton();
        jButton1_ler = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1_id.setText("ID");

        jLabel2_senha.setText("senha");

        jLabel3_numAge.setText("Número Agência");

        jLabel4_cc.setText("CC");

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
        jLabel1.setText("Usuários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_ler)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2_senha)
                            .addComponent(jLabel1_id))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jTextField1_id))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3_numAge)
                                .addGap(26, 26, 26)
                                .addComponent(jTextField3_numAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4_cc)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField4_cc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3_numAge)
                        .addComponent(jTextField3_numAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1_id)
                        .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4_cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4_cc))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2_senha)))
                .addGap(18, 18, 18)
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
        try {
            Usuarios dados = new Usuarios();
            dados.setId(jTextField1_id.getText());
            dados.setSenha(jTextField2_senha.getText());
            dados.setNumAge(Integer.parseInt(jTextField3_numAge.getText()));
            dados.setNumCc(Long.parseLong(jTextField4_cc.getText()));

            connectDAO objcon = new connectDAO();
            objcon.insereRegistroJFBD("Usuarios", dados.dadosSQLValuesUsuarios());
            JOptionPane.showMessageDialog(null, "Registro cadastrado com sucesso!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro de formato de número: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1_cadastrarActionPerformed

    private void jButton1_lerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_lerActionPerformed
        if (jTextField1_id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o id", "Erro", JOptionPane.ERROR_MESSAGE);

        } else {
            connectDAO objcon = new connectDAO();
            usuarios_tela = objcon.pesquisaUsuarioJFBD("USUARIOS", "ID = '" + jTextField1_id.getText() + "'");
            
            jTextField1_id.setEditable(false);
            
            jTextField2_senha.setText(usuarios_tela.getSenha());
            jTextField3_numAge.setText(String.valueOf(usuarios_tela.getNumAge()));
            jTextField4_cc.setText(String.valueOf(usuarios_tela.getNumCc()));
            jTextField2_senha.setVisible(true);
            jTextField3_numAge.setVisible(true);
            jTextField4_cc.setVisible(true);
            
            jLabel2_senha.setVisible(true);
            jLabel3_numAge.setVisible(true);
            jLabel4_cc.setVisible(true);
            
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
        Usuarios dados = new Usuarios();
        connectDAO objcon = new connectDAO();
        objcon.deletaRegistroJFBD("USUARIOS", "ID =" + jTextField1_id.getText());
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
    }//GEN-LAST:event_jButton1_excluirActionPerformed

    private void jButton1_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_alterarActionPerformed
        try {
            Usuarios dados = new Usuarios();
            connectDAO objcon = new connectDAO();
            dados.setId(jTextField1_id.getText());
            dados.setNumAge(Integer.parseInt(jTextField3_numAge.getText()));
            dados.setNumCc(Long.parseLong(jTextField4_cc.getText()));
            dados.setSenha(jTextField2_senha.getText());
            objcon.alteraRegistoJFBD("USUARIOS", dados.alteradadosSQLValues(), "ID =" + jTextField1_id.getText());
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro de formato de número: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_alterar;
    private javax.swing.JButton jButton1_cadastrar;
    private javax.swing.JButton jButton1_excluir;
    private javax.swing.JButton jButton1_ler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_id;
    private javax.swing.JLabel jLabel2_senha;
    private javax.swing.JLabel jLabel3_numAge;
    private javax.swing.JLabel jLabel4_cc;
    private javax.swing.JTextField jTextField1_id;
    private javax.swing.JTextField jTextField2_senha;
    private javax.swing.JTextField jTextField3_numAge;
    private javax.swing.JTextField jTextField4_cc;
    // End of variables declaration//GEN-END:variables
}
