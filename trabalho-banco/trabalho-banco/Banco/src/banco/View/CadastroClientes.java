/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco.View;

import banco.Dao.Clientes;
import banco.Dao.connectDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;

public class CadastroClientes extends javax.swing.JFrame {

    Clientes cliente_tela = new Clientes();

    public CadastroClientes() {
        initComponents();
    }

    String operacaoAtivaGlobal = "Nenhum";

    public CadastroClientes(String operacaoAtiva) {
        initComponents();
        operacaoAtivaGlobal = operacaoAtiva;
        String operacao = "Incluir";
        if (operacaoAtiva.equals(operacao)) {
            jLabel1_id.setVisible(true);
            jLabel2_nome.setVisible(true);
            jLabel3_endereco.setVisible(true);
            jLabel4_numero.setVisible(true);
            jLabel5_complemento.setVisible(true);
            jLabel6_bairro.setVisible(true);
            jLabel7_cidade.setVisible(true);
            jLabel8_uf.setVisible(true);
            jLabel9_cep.setVisible(true);
            jLabel10_fone.setVisible(true);
            jLabel13_cpf.setVisible(true);
            jLabel13_data.setVisible(true);
            jLabel12_cnpj.setVisible(true);

            jButton2_alterar.setVisible(false);
            jButton3_excluir.setVisible(false);
            jButton1_ler.setVisible(false);
        }
        operacao = "Alterar";
        if (operacaoAtiva.equals(operacao)) {
            jTextField1_id.setVisible(true);
            jTextField2_nome.setVisible(false);
            jTextField3_endereco.setVisible(false);
            jTextField4_numero.setVisible(false);
            jTextField5_complemento.setVisible(false);
            jTextField6_bairro.setVisible(false);
            jTextField7_cidade.setVisible(false);
            jTextField8_UF.setVisible(false);
            jTextField9_cep.setVisible(false);
            jTextField10_fone.setVisible(false);
            jTextField13_cpf.setVisible(false);
            jTextField14_data.setVisible(false);
            jTextField12_cnpj.setVisible(false);

            jLabel1_id.setVisible(true);
            jLabel2_nome.setVisible(false);
            jLabel3_endereco.setVisible(false);
            jLabel4_numero.setVisible(false);
            jLabel5_complemento.setVisible(false);
            jLabel6_bairro.setVisible(false);
            jLabel7_cidade.setVisible(false);
            jLabel8_uf.setVisible(false);
            jLabel9_cep.setVisible(false);
            jLabel10_fone.setVisible(false);
            jLabel13_cpf.setVisible(false);
            jLabel13_data.setVisible(false);
            jLabel12_cnpj.setVisible(false);

            jTextField1_id.setVisible(true);
            jTextField2_nome.setVisible(false);
            jTextField3_endereco.setVisible(false);
            jTextField4_numero.setVisible(false);
            jTextField5_complemento.setVisible(false);
            jTextField6_bairro.setVisible(false);
            jTextField7_cidade.setVisible(false);
            jTextField8_UF.setVisible(false);
            jTextField9_cep.setVisible(false);
            jTextField10_fone.setVisible(false);
            jTextField13_cpf.setVisible(false);
            jTextField14_data.setVisible(false);
            jTextField12_cnpj.setVisible(false);

            jButton1_cadastro.setVisible(false);
            jButton3_excluir.setVisible(false);
            jButton2_alterar.setVisible(false);
        }
        operacao = "Excluir";
        if (operacaoAtiva.equals(operacao)) {
            jLabel1_id.setVisible(true);
            jLabel2_nome.setVisible(false);
            jLabel3_endereco.setVisible(false);
            jLabel4_numero.setVisible(false);
            jLabel5_complemento.setVisible(false);
            jLabel6_bairro.setVisible(false);
            jLabel7_cidade.setVisible(false);
            jLabel8_uf.setVisible(false);
            jLabel9_cep.setVisible(false);
            jLabel10_fone.setVisible(false);
            jLabel13_cpf.setVisible(false);
            jLabel13_data.setVisible(false);
            jLabel12_cnpj.setVisible(false);

            jTextField1_id.setVisible(true);
            jTextField2_nome.setVisible(false);
            jTextField3_endereco.setVisible(false);
            jTextField4_numero.setVisible(false);
            jTextField5_complemento.setVisible(false);
            jTextField6_bairro.setVisible(false);
            jTextField7_cidade.setVisible(false);
            jTextField8_UF.setVisible(false);
            jTextField9_cep.setVisible(false);
            jTextField10_fone.setVisible(false);
            jTextField13_cpf.setVisible(false);
            jTextField14_data.setVisible(false);
            jTextField12_cnpj.setVisible(false);

            jTextField2_nome.setEditable(false);
            jTextField3_endereco.setEditable(false);
            jTextField4_numero.setEditable(false);
            jTextField5_complemento.setEditable(false);
            jTextField6_bairro.setEditable(false);
            jTextField7_cidade.setEditable(false);
            jTextField8_UF.setEditable(false);
            jTextField9_cep.setEditable(false);
            jTextField10_fone.setEditable(false);
            jTextField13_cpf.setEditable(false);
            jTextField14_data.setEditable(false);
            jTextField12_cnpj.setEditable(false);

            jButton1_cadastro.setVisible(false);
            jButton2_alterar.setVisible(false);
            jButton3_excluir.setVisible(false);
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

        jLabel1_id = new javax.swing.JLabel();
        jLabel2_nome = new javax.swing.JLabel();
        jLabel3_endereco = new javax.swing.JLabel();
        jLabel4_numero = new javax.swing.JLabel();
        jLabel5_complemento = new javax.swing.JLabel();
        jLabel6_bairro = new javax.swing.JLabel();
        jLabel7_cidade = new javax.swing.JLabel();
        jLabel8_uf = new javax.swing.JLabel();
        jLabel9_cep = new javax.swing.JLabel();
        jLabel10_fone = new javax.swing.JLabel();
        jLabel13_cpf = new javax.swing.JLabel();
        jLabel12_cnpj = new javax.swing.JLabel();
        jLabel13_data = new javax.swing.JLabel();
        jTextField1_id = new javax.swing.JTextField();
        jTextField2_nome = new javax.swing.JTextField();
        jTextField3_endereco = new javax.swing.JTextField();
        jTextField4_numero = new javax.swing.JTextField();
        jTextField5_complemento = new javax.swing.JTextField();
        jTextField6_bairro = new javax.swing.JTextField();
        jTextField7_cidade = new javax.swing.JTextField();
        jTextField8_UF = new javax.swing.JTextField();
        jTextField9_cep = new javax.swing.JTextField();
        jTextField10_fone = new javax.swing.JTextField();
        jTextField13_cpf = new javax.swing.JTextField();
        jTextField14_data = new javax.swing.JTextField();
        jTextField12_cnpj = new javax.swing.JTextField();
        jButton1_cadastro = new javax.swing.JButton();
        jButton2_alterar = new javax.swing.JButton();
        jButton3_excluir = new javax.swing.JButton();
        jButton1_ler = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jLabel1_id.setText("ID");

        jLabel2_nome.setText("Nome");

        jLabel3_endereco.setText("Endereço");

        jLabel4_numero.setText("Número");

        jLabel5_complemento.setText("Complemento");

        jLabel6_bairro.setText("Bairro");

        jLabel7_cidade.setText("Cidade");

        jLabel8_uf.setText("UF");

        jLabel9_cep.setText("CEP");

        jLabel10_fone.setText("Fone");

        jLabel13_cpf.setText("CPF");

        jLabel12_cnpj.setText("CNPJ");

        jLabel13_data.setText("Data Nascimento");

        jTextField1_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_idActionPerformed(evt);
            }
        });

        jButton1_cadastro.setText("Cadastrar");
        jButton1_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_cadastroActionPerformed(evt);
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
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3_endereco)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9_cep)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField9_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5_complemento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5_complemento)
                                        .addGap(7, 7, 7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4_numero)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1_id)
                                .addGap(34, 34, 34)
                                .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jTextField2_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6_bairro)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8_uf)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField8_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7_cidade)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10_fone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10_fone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13_data)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField14_data, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1_cadastro)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2_alterar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3_excluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12_cnpj)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField12_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel13_cpf)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_ler))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_id)
                    .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_nome)
                    .addComponent(jTextField2_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_endereco)
                    .addComponent(jTextField3_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4_numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5_complemento))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7_cidade)
                            .addComponent(jTextField7_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6_bairro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField9_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9_cep))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField8_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8_uf)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10_fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10_fone)
                    .addComponent(jLabel13_data, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField12_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13_cpf)
                        .addComponent(jTextField13_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12_cnpj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_cadastro)
                    .addComponent(jButton2_alterar)
                    .addComponent(jButton3_excluir)
                    .addComponent(jButton1_ler))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_cadastroActionPerformed
        Clientes dados = new Clientes();

        dados.setIdCli(Integer.parseInt(jTextField1_id.getText()));
        dados.setNomeCli(jTextField2_nome.getText());
        dados.setEndeCli(jTextField3_endereco.getText());
        dados.setNumeCli(jTextField4_numero.getText());
        dados.setComplCli(jTextField5_complemento.getText());
        dados.setBairCli(jTextField6_bairro.getText());
        dados.setCidaCli(jTextField7_cidade.getText());
        dados.setUfCli(jTextField8_UF.getText());
        dados.setCepCli(jTextField9_cep.getText());
        dados.setFoneCli(jTextField10_fone.getText());
        dados.setCpfCli(jTextField13_cpf.getText());
        String dateString = jTextField14_data.getText();
        SimpleDateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date = originalFormat.parse(dateString);
            dados.setDataNasc(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dados.setCnpjCli(jTextField12_cnpj.getText());
        connectDAO objcon = new connectDAO();
        objcon.insereRegistroJFBD("Clientes", dados.dadosSQLValues());
    }//GEN-LAST:event_jButton1_cadastroActionPerformed

    private void jButton2_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_alterarActionPerformed
        Clientes dados = new Clientes();
        connectDAO objcon = new connectDAO();

        dados.setIdCli(Integer.parseInt(jTextField1_id.getText()));
        dados.setNomeCli(jTextField2_nome.getText());
        dados.setEndeCli(jTextField3_endereco.getText());
        dados.setNumeCli(jTextField4_numero.getText());
        dados.setComplCli(jTextField5_complemento.getText());
        dados.setBairCli(jTextField6_bairro.getText());
        dados.setCidaCli(jTextField7_cidade.getText());
        dados.setUfCli(jTextField8_UF.getText());
        dados.setCepCli(jTextField9_cep.getText());
        dados.setFoneCli(jTextField10_fone.getText());
        dados.setCpfCli(jTextField13_cpf.getText());
        String dateString = jTextField14_data.getText(); // Formato esperado: "dd/MM/yyyy"
        SimpleDateFormat originalFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = originalFormat.parse(dateString);
            dados.setDataNasc(date);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        objcon.alteraRegistoJFBD("CLIENTES", dados.alteradadosSQLValues(), "ID_CLI =" + jTextField1_id.getText());

        jTextField1_id.setText("");
        jTextField2_nome.setText("");
        jTextField3_endereco.setText("");
        jTextField4_numero.setText("");
        jTextField5_complemento.setText("");
        jTextField6_bairro.setText("");
        jTextField7_cidade.setText("");
        jTextField8_UF.setText("");
        jTextField9_cep.setText("");
        jTextField10_fone.setText("");
        jTextField13_cpf.setText("");
        jTextField14_data.setText("");
        jTextField12_cnpj.setText("");
    }//GEN-LAST:event_jButton2_alterarActionPerformed

    private void jButton3_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_excluirActionPerformed
        Clientes dados = new Clientes();
        connectDAO objcon = new connectDAO();
        objcon.deletaRegistroJFBD("CLIENTES", "ID_CLI =" + jTextField1_id.getText());
    }//GEN-LAST:event_jButton3_excluirActionPerformed

    private void jTextField1_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_idActionPerformed

    private void jButton1_lerActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (jTextField1_id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o id", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            connectDAO objcon = new connectDAO();
            cliente_tela = objcon.pesquisaClienteJFBD("CLIENTES", "ID_CLI = '" + jTextField1_id.getText() + "'");
            jTextField1_id.setEditable(false);

            jTextField2_nome.setText(cliente_tela.getNomeCli());
            jTextField3_endereco.setText(cliente_tela.getEndeCli());
            jTextField4_numero.setText(cliente_tela.getNumeCli());
            jTextField5_complemento.setText(cliente_tela.getComplCli());
            jTextField6_bairro.setText(cliente_tela.getBairCli());
            jTextField7_cidade.setText(cliente_tela.getCidaCli());
            jTextField8_UF.setText(cliente_tela.getUfCli());
            jTextField9_cep.setText(cliente_tela.getCepCli());
            jTextField10_fone.setText(cliente_tela.getFoneCli());
            jTextField13_cpf.setText(cliente_tela.getCpfCli());
            jTextField14_data.setText(new SimpleDateFormat("dd/MM/yyyy").format(cliente_tela.getDataNasc()));
            jTextField12_cnpj.setText(cliente_tela.getCnpjCli());

            jTextField1_id.setVisible(true);
            jTextField2_nome.setVisible(true);
            jTextField3_endereco.setVisible(true);
            jTextField4_numero.setVisible(true);
            jTextField5_complemento.setVisible(true);
            jTextField6_bairro.setVisible(true);
            jTextField7_cidade.setVisible(true);
            jTextField8_UF.setVisible(true);
            jTextField9_cep.setVisible(true);
            jTextField10_fone.setVisible(true);
            jTextField13_cpf.setVisible(true);
            jTextField14_data.setVisible(true);
            jTextField12_cnpj.setVisible(true);

            jLabel1_id.setVisible(true);
            jLabel2_nome.setVisible(true);
            jLabel3_endereco.setVisible(true);
            jLabel4_numero.setVisible(true);
            jLabel5_complemento.setVisible(true);
            jLabel6_bairro.setVisible(true);
            jLabel7_cidade.setVisible(true);
            jLabel8_uf.setVisible(true);
            jLabel9_cep.setVisible(true);
            jLabel10_fone.setVisible(true);
            jLabel13_cpf.setVisible(true);
            jLabel13_data.setVisible(true);
            jLabel12_cnpj.setVisible(true);
            jTextField1_id.setVisible(true);



        }
        if (operacaoAtivaGlobal.equals("Alterar")) {
            jButton2_alterar.setVisible(true);
            jButton1_ler.setVisible(false);
        } else {
            jButton3_excluir.setVisible(true);
            jButton1_ler.setVisible(false);
        }
    }

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_cadastro;
    private javax.swing.JButton jButton1_ler;
    private javax.swing.JButton jButton2_alterar;
    private javax.swing.JButton jButton3_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10_fone;
    private javax.swing.JLabel jLabel12_cnpj;
    private javax.swing.JLabel jLabel13_cpf;
    private javax.swing.JLabel jLabel13_data;
    private javax.swing.JLabel jLabel1_id;
    private javax.swing.JLabel jLabel2_nome;
    private javax.swing.JLabel jLabel3_endereco;
    private javax.swing.JLabel jLabel4_numero;
    private javax.swing.JLabel jLabel5_complemento;
    private javax.swing.JLabel jLabel6_bairro;
    private javax.swing.JLabel jLabel7_cidade;
    private javax.swing.JLabel jLabel8_uf;
    private javax.swing.JLabel jLabel9_cep;
    private javax.swing.JTextField jTextField10_fone;
    private javax.swing.JTextField jTextField12_cnpj;
    private javax.swing.JTextField jTextField13_cpf;
    private javax.swing.JTextField jTextField14_data;
    private javax.swing.JTextField jTextField1_id;
    private javax.swing.JTextField jTextField2_nome;
    private javax.swing.JTextField jTextField3_endereco;
    private javax.swing.JTextField jTextField4_numero;
    private javax.swing.JTextField jTextField5_complemento;
    private javax.swing.JTextField jTextField6_bairro;
    private javax.swing.JTextField jTextField7_cidade;
    private javax.swing.JTextField jTextField8_UF;
    private javax.swing.JTextField jTextField9_cep;
    // End of variables declaration//GEN-END:variables
}
