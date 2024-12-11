package banco.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prof. Corredato - Controle de conexão com o banco de dados
 */
public class connectDAO {

    Connection con;

    public Connection connectDB() {
        // JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");

        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;";

        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            // JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
        }
        return con;
        // con.close();
    }

    public void insereRegistroJFBD(String tabela, String strDados) {
        Statement stmt;
        con = connectDB();
        try {
            stmt = con.createStatement();
   

            String sql = "INSERT INTO dbo." + tabela + " "
                    + "VALUES (" + strDados + ")";
            try {
              
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Clientes pesquisaClienteJFBD(String tabela, String pesquisaId) {
        Clientes clientesReturn = null;
        String tabelaSGBD = "CLIENTES";
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();  
            Statement stmt = null;
            try {
                stmt = con.createStatement();

               
                String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId;  

                ResultSet dados = stmt.executeQuery(sql); 

                if (!dados.next()) {  
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para essa consulta");
                } else {
                    // Populando o objeto Cliente com os dados retornados
                    clientesReturn = new Clientes();
                    clientesReturn.setIdCli(dados.getInt(1));
                    clientesReturn.setNomeCli(dados.getString(2));
                    clientesReturn.setEndeCli(dados.getString(3));
                    clientesReturn.setNumeCli(dados.getString(4));
                    clientesReturn.setComplCli(dados.getString(5));
                    clientesReturn.setBairCli(dados.getString(6));
                    clientesReturn.setCidaCli(dados.getString(7));
                    clientesReturn.setUfCli(dados.getString(8));
                    clientesReturn.setCepCli(dados.getString(9));
                    clientesReturn.setFoneCli(dados.getString(10));
                    clientesReturn.setCpfCli(dados.getString(11));
                    clientesReturn.setDataNasc(dados.getDate(12));
                    clientesReturn.setCnpjCli(dados.getString(13));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            } finally {
            
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return clientesReturn;  // Retorna o cliente ou null se não encontrar
    }

    public Agencias pesquisaAgenciaJFBD(String tabela, String pesquisaId) {
        Agencias agenciasReturn = null;
        String tabelaSGBD = "AGENCIAS";  
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();  
            Statement stmt = null;
            try {
                stmt = con.createStatement();

        
                String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId; 

                ResultSet dados = stmt.executeQuery(sql);  

                if (!dados.next()) { 
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para essa consulta");
                } else {
                   
                    agenciasReturn = new Agencias();
                    agenciasReturn.setNumAge(dados.getInt("NUM_AGE"));
                    agenciasReturn.setNomeAge(dados.getString("NOME_AGE"));
                    agenciasReturn.setEndeAge(dados.getString("ENDE_AGE"));
                    agenciasReturn.setNumeAge(dados.getString("NUME_AGE"));
                    agenciasReturn.setComplAge(dados.getString("COMPL_AGE"));
                    agenciasReturn.setBairAge(dados.getString("BAIR_AGE"));
                    agenciasReturn.setCidaAge(dados.getString("CIDA_AGE"));
                    agenciasReturn.setUfAge(dados.getString("UF_AGE"));
                    agenciasReturn.setCepAge(dados.getString("CEP_AGE"));
                    agenciasReturn.setFoneAge(dados.getString("FONE_AGE"));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Código => " + erro.getErrorCode());
            } finally {
                // Fechar conexões e limpar recursos
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return agenciasReturn;  
    }
    
    public Funcionarios pesquisaFuncionario(String tabela, String pesquisaId) {
    Funcionarios funcionarioRetorno = null;
    String tabelaSGBD = "FUNCIONARIOS";
    if (tabela.equals(tabelaSGBD)) {
        con = connectDB();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId;
            ResultSet dados = stmt.executeQuery(sql);

            if (!dados.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para essa consulta");
            } else {
                funcionarioRetorno = new Funcionarios();
                funcionarioRetorno.setId(dados.getInt("_id"));
                funcionarioRetorno.setNomeFuncionario(dados.getString("nomeFuncionario"));
                funcionarioRetorno.setCep(dados.getString("Cep"));
                funcionarioRetorno.setLogradouro(dados.getString("logradouro"));
                funcionarioRetorno.setComplemento(dados.getString("complemento"));
                funcionarioRetorno.setBairro(dados.getString("bairro"));
                funcionarioRetorno.setLocalidade(dados.getString("localidade"));
                funcionarioRetorno.setUf(dados.getString("uf"));
                funcionarioRetorno.setEstado(dados.getString("estado"));
                funcionarioRetorno.setDdd(dados.getString("ddd"));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
        }
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    return funcionarioRetorno;
}


    public ContaCorrente pesquisaContaCorrenteJFBD(String tabela, String pesquisaId) {
        ContaCorrente contaCorrenteReturn = null;
        String tabelaSGBD = "CONTACORRENTE"; 
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();  
            Statement stmt = null;
            try {
                stmt = con.createStatement();

             
                String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId; 

                ResultSet dados = stmt.executeQuery(sql);  

                if (!dados.next()) { 
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para essa consulta");
                } else {
                   
                    contaCorrenteReturn = new ContaCorrente();
                    contaCorrenteReturn.setNumAge(dados.getInt("NUM_AGE"));
                    contaCorrenteReturn.setNumCc(dados.getLong("NUM_CC"));
                    contaCorrenteReturn.setIdCli(dados.getInt("ID_CLI"));
                    contaCorrenteReturn.setSaldo(dados.getDouble("SALDO"));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Código => " + erro.getErrorCode());
            } finally {
           
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return contaCorrenteReturn;  
    }

    public Movimentacao pesquisaMovimentacaoJFBD(String tabela, String pesquisaId) {
        Movimentacao movimentacaoReturn = null;
        String tabelaSGBD = "MOVIMENTACAO";  // Nome da tabela no banco de dados
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();  // Conectar ao banco de dados
            Statement stmt = null;
            try {
                stmt = con.createStatement();

             
                String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId; 

                ResultSet dados = stmt.executeQuery(sql);  

                if (!dados.next()) {  
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para essa consulta");
                } else {
                    // Populando o objeto Movimentacao com os dados retornados
                    movimentacaoReturn = new Movimentacao();
                    movimentacaoReturn.setNumAge(dados.getInt("NUM_AGE"));
                    movimentacaoReturn.setNumCc(dados.getLong("NUM_CC"));
                    movimentacaoReturn.setDataMov(dados.getDate("DATA_MOV"));
                    movimentacaoReturn.setNumDocto(dados.getString("NUM_DOCTO"));
                    char debitoCredito = dados.getString("DEBITO_CREDITO").charAt(0);
                    movimentacaoReturn.setDebitoCredito(debitoCredito);
                    movimentacaoReturn.setIdHis(dados.getInt("ID_HIS"));
                    movimentacaoReturn.setComplHis(dados.getString("COMPL_HIS"));
                    movimentacaoReturn.setValor(dados.getDouble("VALOR"));
                    movimentacaoReturn.setSaldo(dados.getDouble("SALDO"));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Código => " + erro.getErrorCode());
            } finally {
               
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return movimentacaoReturn;
    }

    
        public Usuarios pesquisaUsuarioJFBD(String tabela, String pesquisaId) {
            Usuarios usuariosReturn = null;
        String tabelaSGBD = "USUARIOS"; 
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();  
            Statement stmt = null;
            try {
                stmt = con.createStatement();

             
                String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId; 

                ResultSet dados = stmt.executeQuery(sql);  

                if (!dados.next()) { 
                    JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para essa consulta");
                } else {
                   
                    usuariosReturn = new Usuarios();
                    usuariosReturn.setId(dados.getString("ID"));
                    usuariosReturn.setSenha(dados.getString("SENHA"));
                    usuariosReturn.setNumAge(dados.getInt("NUM_AGE"));
                    usuariosReturn.setNumCc(dados.getLong("NUM_CC"));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Código => " + erro.getErrorCode());
            } finally {
           
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return usuariosReturn;  
    }
        
        
   public void alteraRegistoJFBD(String tabela, String strDados, String pesquisaId) {
    Connection con = null;
    Statement stmt = null;

    try {
        con = connectDB(); 
        stmt = con.createStatement();
        
  
        String sql = "UPDATE dbo." + tabela
                   + " SET " + strDados
                   + " WHERE (" + pesquisaId + ");";
        
        stmt.executeUpdate(sql);  
        JOptionPane.showMessageDialog(null, "Alteração executada com sucesso");
        
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Alteração não permitida!");
        JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
//        JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Estado => " + erro.getSQLState());
//        JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Código => " + erro.getErrorCode());
        Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
    } finally {
        try {
            if (stmt != null) stmt.close();  
            if (con != null) con.close(); 
        } catch (SQLException e) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
   
   public void deletaRegistroJFBD(String tabela, String pesquisaId) {
    Connection con = null;
    Statement stmt = null;

    try {
        con = connectDB(); 
        stmt = con.createStatement();
        
       
        String sql = "DELETE FROM dbo." + tabela
                   + " WHERE (" + pesquisaId + ");";
        
        stmt.executeUpdate(sql);  // Executando a exclusão
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
        
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Exclusão não permitida!");
        JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
//        JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Estado => " + erro.getSQLState());
//        JOptionPane.showMessageDialog(null, "\nErro de conexão, connectDAO - Código => " + erro.getErrorCode());
        Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
    } finally {
        try {
            if (stmt != null) stmt.close();  
            if (con != null) con.close(); 
        } catch (SQLException e) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
   
       public Historicos pesquisaHistoricoJFBD(String tabela, String pesquisaId) {
        Historicos historicosReturn = null;
        String tabelaSGBD = "HISTORICOS";
        if (tabela.equals(tabelaSGBD)) {
            con = connectDB();  
            Statement stmt = null;
            try {
                stmt = con.createStatement();


                String sql = "SELECT * FROM " + tabela + " WHERE " + pesquisaId;  // Aqui, pesquisaId deve ser algo como "ID_CLI = 'valor'"

                ResultSet dados = stmt.executeQuery(sql);  

                if (!dados.next()) {  
                    JOptionPane.showMessageDialog(null, "Nenhum Histórico foi encontrado para esse Id");
                } else {
                   
                    historicosReturn = new Historicos();
                    historicosReturn.setIdHis(dados.getInt(1));
                    historicosReturn.setDesHis(dados.getString(2));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            } finally {
                
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return historicosReturn;  
    }

}