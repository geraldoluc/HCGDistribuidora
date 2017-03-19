package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

public class FornecedorDAO {
    PreparedStatement pst;
    String sql;
    
    static public Fornecedor busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        Fornecedor fornecedor = null;
        
        sql = "select * from fornecedor where codigo = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           fornecedor = new Fornecedor(
                        rs.getInt("codigo"),
                        rs.getString("nome"),
                        rs.getInt("cnpj"),
                        rs.getString("endereco"),
                        rs.getString("cidade"),
                        rs.getInt("telefone"),
                        rs.getString("email"));             
        }
        pst.close();
        
        return fornecedor;
    }
    
    public void salvar (Fornecedor fornecedor) throws SQLException{
        sql = "insert into fornecedor values (?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, fornecedor.getNomeFornecedor());
        pst.setInt(3, fornecedor.getCnpjFornecedor());
        pst.setString(4, fornecedor.getEnderecoFornecedor());
        pst.setString(5, fornecedor.getCidadeFornecedor());
        pst.setInt(6, fornecedor.getTelefoneFornecedor());
        pst.setString(7, fornecedor.getEmailFornecedor());
        pst.execute();
        pst.close();
    }
    
    public List<Fornecedor> listaFornecedor() throws SQLException {
        List<Fornecedor> listaFornecedores;
        listaFornecedores = new ArrayList<>();
        
        sql = "select * from fornecedor order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()){
            listaFornecedores.add(new Fornecedor(rs.getInt("codigo"),
                                                 rs.getString("nome"),
                                                 rs.getInt("cnpj"),
                                                 rs.getString("endereco"),
                                                 rs.getString("cidade"),
                                                 rs.getInt("telefone"),
                                                 rs.getString("email")));
        }
        pst.close();
        return listaFornecedores;
    }
    
    public void excluir(Fornecedor fornecedor) throws SQLException {
        sql = "delete from fornecedor where codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, fornecedor.getCodigoFornecedor());
        pst.execute();
        pst.close();
    }
    
    public void alterar(Fornecedor fornecedor) throws SQLException {
        sql = "update fornecedor set nome=?, cnpj=?, endereco=?, cidade=?, telefone=?, email=? where codigo=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, fornecedor.getNomeFornecedor());
        pst.setInt(2, fornecedor.getCnpjFornecedor());
        pst.setString(3, fornecedor.getEnderecoFornecedor());
        pst.setString(4, fornecedor.getCidadeFornecedor());
        pst.setInt(5, fornecedor.getTelefoneFornecedor());
        pst.setString(6, fornecedor.getEmailFornecedor());
        pst.setInt(7, fornecedor.getCodigoFornecedor());
        pst.execute();
        pst.close();
    }
}
