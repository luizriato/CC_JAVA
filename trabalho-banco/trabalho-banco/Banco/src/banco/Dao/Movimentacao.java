/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.Dao;
import java.text.SimpleDateFormat;
import java.sql.Date;
/**
 *
 * @author Alunos
 */
public class Movimentacao {
    private int numAge;
    private long numCc;
    private Date dataMov; // Pode usar java.sql.Date ou LocalDate
    private String numDocto;
    private char debitoCredito;
    private int idHis;
    private String complHis;
    private double valor;
    private double saldo;

    // Getters e Setters
    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public long getNumCc() {
        return numCc;
    }

    public void setNumCc(long numCc) {
        this.numCc = numCc;
    }

    public java.util.Date getDataMov() {
        return dataMov;
    }

    public void setDataMov(String dataMov) {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.dataMov = (Date) sdf.parse(dataMov); //converte e atribui a variavel data
        } catch (Exception e) {
            e.printStackTrace(); // para debugar
        }
    }

    public String getNumDocto() {
        return numDocto;
    }

    public void setNumDocto(String numDocto) {
        this.numDocto = numDocto;
    }

    public char getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(char debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public String getComplHis() {
        return complHis;
    }

    public void setComplHis(String complHis) {
        this.complHis = complHis;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    public String dadosSQLValuesMovimentacao() {
    String sqlDateStr = ""; // Valor padrão para data nula

    if (this.getDataMov() != null) {
        // Converte java.util.Date para java.sql.Date apenas se não for nulo
        java.sql.Date sqlDate = new java.sql.Date(this.getDataMov().getTime());
        sqlDateStr = "'" + sqlDate + "'"; // Data formatada para o SQL
    }
    String dados_movimentacao = this.getNumAge() + ",'" +
                                this.getNumCc() + "','" +
                                sqlDateStr + "','" +
                                this.getNumDocto() + "','" +
                                this.getDebitoCredito() + "'," +
                                this.getIdHis() + ",'" +
                                this.getComplHis() + "'," +
                                this.getValor() + "," +
                                this.getSaldo() + "'";

    return dados_movimentacao;
}

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
           public String alteradadosSQLValues() {
        String sqlDateStr = ""; // Valor padrão para data nula

        if (this.getDataMov() != null) {
            // Converte java.util.Date para java.sql.Date apenas se não for nulo
            java.sql.Date sqlDate = new java.sql.Date(this.getDataMov().getTime());
            sqlDateStr = "'" + sqlDate + "'"; 
        }

     String dados = "NUM_AGE='" + this.getNumAge()+ "',"
            + "NUM_CC='" + this.getNumCc()+ "',"
            + "DATA_MOV='" + this.getDataMov()+ "',"
            + "NUM_DOCTO='" + this.getNumDocto()+ "',"
            + "DEBITO_CREDITO='" + this.getDebitoCredito()+ "',"
            + "ID_HIS='" + this.getIdHis()+ "',"
            + "COMPL_HIS='" + this.getComplHis()+ "',"
            + "VALOR='" + this.getValor() + "',"
            + "SALDO='" + this.getSaldo() + "'";
     
        return dados;
    }

}
