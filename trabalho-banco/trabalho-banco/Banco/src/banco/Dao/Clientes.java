/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.Dao;

/**
 *
 * @author Alunos
 */
public class Clientes {

    private int idCli;
    private String nomeCli;
    private String endeCli;
    private String numeCli;
    private String complCli;
    private String bairCli;
    private String cidaCli;
    private String ufCli;
    private String cepCli;
    private String foneCli;
    private String cpfCli;
    private java.util.Date dataNasc; // Pode usar java.sql.Date ou LocalDate
    private String cnpjCli;

    // Getters e Setters
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getEndeCli() {
        return endeCli;
    }

    public void setEndeCli(String endeCli) {
        this.endeCli = endeCli;
    }

    public String getNumeCli() {
        return numeCli;
    }

    public void setNumeCli(String numeCli) {
        this.numeCli = numeCli;
    }

    public String getComplCli() {
        return complCli;
    }

    public void setComplCli(String complCli) {
        this.complCli = complCli;
    }

    public String getBairCli() {
        return bairCli;
    }

    public void setBairCli(String bairCli) {
        this.bairCli = bairCli;
    }

    public String getCidaCli() {
        return cidaCli;
    }

    public void setCidaCli(String cidaCli) {
        this.cidaCli = cidaCli;
    }

    public String getUfCli() {
        return ufCli;
    }

    public void setUfCli(String ufCli) {
        this.ufCli = ufCli;
    }

    public String getCepCli() {
        return cepCli;
    }

    public void setCepCli(String cepCli) {
        this.cepCli = cepCli;
    }

    public String getFoneCli() {
        return foneCli;
    }

    public void setFoneCli(String foneCli) {
        this.foneCli = foneCli;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    public java.util.Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(java.util.Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCnpjCli() {
        return cnpjCli;
    }

    public void setCnpjCli(String cnpjCli) {
        this.cnpjCli = cnpjCli;
    }

    public Clientes() {

    }

    public String dadosSQLValues() {
        String sqlDateStr = "NULL"; // Valor padrão para data nula

        if (this.getDataNasc() != null) {
            // Converte java.util.Date para java.sql.Date apenas se não for nulo
            java.sql.Date sqlDate = new java.sql.Date(this.getDataNasc().getTime());
            sqlDateStr = "'" + sqlDate + "'"; // Data formatada para o SQL
        }

        String dados_clientes
                = this.getIdCli() + ",'"
                + this.getNomeCli() + "','"
                + this.getEndeCli() + "','"
                + this.getNumeCli() + "','"
                + this.getComplCli() + "','"
                + this.getBairCli() + "','"
                + this.getCidaCli() + "','"
                + this.getUfCli() + "','"
                + this.getCepCli() + "','"
                + this.getFoneCli() + "','"
                + this.getCpfCli() + "',"
                + sqlDateStr + ",'" // Data pode ser NULL ou a data formatada
                + this.getCnpjCli() + "'";

        return dados_clientes;
    }
    
        public String alteradadosSQLValues() {
        String sqlDateStr = "NULL"; // Valor padrão para data nula

        if (this.getDataNasc() != null) {
            // Converte java.util.Date para java.sql.Date apenas se não for nulo
            java.sql.Date sqlDate = new java.sql.Date(this.getDataNasc().getTime());
            sqlDateStr = "'" + sqlDate + "'"; // Data formatada para o SQL
        }

     String dados_clientes = "ID_CLI='" + this.getIdCli() + "',"
            + "NOME_CLI='" + this.getNomeCli() + "',"
            + "ENDE_CLI='" + this.getEndeCli() + "',"
            + "NUME_CLI='" + this.getNumeCli() + "',"
            + "COMPL_CLI='" + this.getComplCli() + "',"
            + "BAIR_CLI='" + this.getBairCli() + "',"
            + "CIDA_CLI='" + this.getCidaCli() + "',"
            + "UF_CLI='" + this.getUfCli() + "',"
            + "CEP_CLI='" + this.getCepCli() + "',"
            + "FONE_CLI='" + this.getFoneCli() + "',"
            + "CPF_CLI='" + this.getCpfCli() + "',"
            + "DATA_NASC=" + sqlDateStr + ","
            + "CNPJ_CLI='" + this.getCnpjCli() + "'";
     
        return dados_clientes;
    }

}