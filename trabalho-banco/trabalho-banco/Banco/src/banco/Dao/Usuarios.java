/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.Dao;

/**
 *
 * @author Alunos
 */
public class Usuarios {
    private String id;
    private String senha;
    private int numAge;
    private long numCc;

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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
    
    public String dadosSQLValuesUsuarios() {
        
    String dados_usuarios = this.getId()+ ",'"
            + this.getSenha()+ "','"
            + this.getNumAge() + "','"
            + this.getNumCc() + "'";

    return dados_usuarios;
}

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
               public String alteradadosSQLValues() {
     String dados = "ID='" + this.getId()+ "',"
            + "SENHA='" + this.getSenha()+ "',"
            + "NUM_AGE='" + this.getNumAge()+ "',"
            + "NUM_CC='" + this.getNumCc()+ "',";    
        return dados;
    }
}
