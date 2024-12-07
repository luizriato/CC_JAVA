/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.Dao;

/**
 *
 * @author Alunos
 */
public class Agencias {

    private int numAge;
    private String nomeAge;
    private String endeAge;
    private String numeAge;
    private String complAge;
    private String bairAge;
    private String cidaAge;
    private String ufAge;
    private String cepAge;
    private String foneAge;

    // Getters e Setters
    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public String getNomeAge() {
        return nomeAge;
    }

    public void setNomeAge(String nomeAge) {
        this.nomeAge = nomeAge;
    }

    public String getEndeAge() {
        return endeAge;
    }

    public void setEndeAge(String endeAge) {
        this.endeAge = endeAge;
    }

    public String getNumeAge() {
        return numeAge;
    }

    public void setNumeAge(String numeAge) {
        this.numeAge = numeAge;
    }

    public String getComplAge() {
        return complAge;
    }

    public void setComplAge(String complAge) {
        this.complAge = complAge;
    }

    public String getBairAge() {
        return bairAge;
    }

    public void setBairAge(String bairAge) {
        this.bairAge = bairAge;
    }

    public String getCidaAge() {
        return cidaAge;
    }

    public void setCidaAge(String cidaAge) {
        this.cidaAge = cidaAge;
    }

    public String getUfAge() {
        return ufAge;
    }

    public void setUfAge(String ufAge) {
        this.ufAge = ufAge;
    }

    public String getCepAge() {
        return cepAge;
    }

    public void setCepAge(String cepAge) {
        this.cepAge = cepAge;
    }

    public String getFoneAge() {
        return foneAge;
    }

    public void setFoneAge(String foneAge) {
        this.foneAge = foneAge;
    }

    public String dadosSQLValuesAgencia() {

        String dados_agencias = this.getNumAge() + ",'"
                + this.getNomeAge() + "','"
                + this.getEndeAge() + "','"
                + this.getNumeAge() + "','"
                + this.getComplAge() + "','"
                + this.getBairAge() + "','"
                + this.getCidaAge() + "','"
                + this.getUfAge() + "','"
                + this.getCepAge() + "','"
                + this.getFoneAge() + "'";

        return dados_agencias;
    }

public String alteradadosSQLValues() {
    String sqlDateStr = "NULL"; // Valor padrão para data nula

    String dados_agencias = 
            "NOME_AGE='" + this.getNomeAge() + "',"
            + "ENDE_AGE='" + this.getEndeAge() + "',"
            + "NUME_AGE='" + this.getNumeAge() + "',"
            + "COMPL_AGE='" + this.getComplAge() + "',"
            + "BAIR_AGE='" + this.getBairAge() + "',"
            + "CIDA_AGE='" + this.getCidaAge() + "',"
            + "UF_AGE='" + this.getUfAge() + "',"
            + "CEP_AGE='" + this.getCepAge() + "',"
            + "FONE_AGE='" + this.getFoneAge() + "'";

    return dados_agencias;
}


    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
