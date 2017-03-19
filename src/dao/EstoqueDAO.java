package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Estoque;

public class EstoqueDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Estoque estoque) throws SQLException{
        sql = "insert into estoque values (?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setBoolean(2, estoque.isCategoriaEstoque());
        pst.setString(3, estoque.getFabricanteEstoque());
        pst.setString(4, estoque.getDescricaoEstoque());
        pst.setFloat(5, estoque.getPreco_vendaEstoque());
        pst.setFloat(6, estoque.getPreco_custoEstoque());
        pst.setInt(7, estoque.getQuantidadeEstoque());
        pst.execute();
        pst.close();
    }
    
    public List<Estoque> listaEstoque(boolean tipo) throws SQLException {
        List<Estoque> listaEstoques;
        listaEstoques = new ArrayList<>();
       
            sql = "select * from estoque where categoria = ? order by quantidade";
            pst = Conexao.getInstance().prepareStatement(sql);
            pst.setBoolean(1, tipo);
        
            ResultSet rs = pst.executeQuery();
        
            while (rs.next()){
                listaEstoques.add(new Estoque(rs.getInt("codigo"),
                                              rs.getBoolean("categoria"),
                                              rs.getString("fabricante"),
                                              rs.getString("descricao"),
                                              rs.getFloat("preco_venda"),
                                              rs.getFloat("preco_custo"),
                                              rs.getInt("quantidade")));
        }
            pst.close();
            return listaEstoques;
   }
    
    
    
}
