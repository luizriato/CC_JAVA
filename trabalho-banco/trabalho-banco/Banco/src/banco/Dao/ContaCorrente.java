/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.Dao;

/**
 *
 * @author Alunos
 */
public class ContaCorrente {

    private int numAge;
    private long numCc;
    private int idCli;
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

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String dadosSQLValuesContaCorrente() {

        String dados_contaCorrente = this.getNumAge() + ",'"
                + this.getNumCc() + "','"
                + this.getIdCli() + "','"
                + this.getSaldo() + "'";

        return dados_contaCorrente;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String alteradadosSQLValues() {

        String dados
                = "ID_CLI='" + this.getIdCli() + "',"
                + "SALDO='" + this.getSaldo() + "'"; // Removed trailing comma

        return dados;
    }
}
