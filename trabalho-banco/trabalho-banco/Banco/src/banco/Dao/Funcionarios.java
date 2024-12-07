/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.Dao;

/**
 *
 * @author Luiz Riato
 */
public class Funcionarios {
    private int id; 
    private String nomeFuncionario; 
    private String cep; 
    private String logradouro; 
    private String complemento; 
    private String bairro; 
    private String localidade; 
    private String uf;
    private String estado; 
    private String ddd; 

    public int getId() {
        return id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getEstado() {
        return estado;
    }

    public String getDdd() {
        return ddd;
    }

  

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

   
    public String dadosSQLValuesFuncionarios() {
    // Gera uma string de valores SQL baseados em todos os atributos da classe
    String dadosUsuarios = this.id + ",'"
            + this.nomeFuncionario + "','"
            + this.cep + "','"
            + this.logradouro + "','"
            + (this.complemento != null ? this.complemento : "") + "','"
            + this.bairro + "','"
            + this.localidade + "','"
            + this.uf + "','"
            + this.estado + "','"
            + this.ddd + "'";
    return dadosUsuarios;
}

public String alteradadosSQLValues() {
    // Gera uma string SQL para atualização com todos os atributos da classe
    String dados = "_id='" + this.id + "',"
            + "nomeFuncionario='" + this.nomeFuncionario + "',"
            + "cep='" + this.cep + "',"
            + "logradouro='" + this.logradouro + "',"
            + "complemento='" + (this.complemento != null ? this.complemento : "") + "',"
            + "bairro='" + this.bairro + "',"
            + "localidade='" + this.localidade + "',"
            + "uf='" + this.uf + "',"
            + "estado='" + this.estado + "',"
            + "ddd='" + this.ddd + "'";
    return dados;
}

}
