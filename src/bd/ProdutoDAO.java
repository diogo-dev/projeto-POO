package bd;
import entities.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class ProdutoDAO 
{
    public void cadastrarProduto(Produto produto)
    {
        String sql = "INSERT INTO produto(codigo, preço, quantidade, nome, marca, validade, nome_setor, lote)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement pstm = null;
        
        try{
            //criar a conexao
            connection = ConexaoBD.createConexao();
            //criar um preparedStatement
            pstm = connection.prepareStatement(sql);
            //colocar os parametros
            pstm.setInt(1, produto.getCodigo());
            pstm.setDouble(2, produto.getPreco());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setString(4, produto.getNome());
            pstm.setString(5, produto.getMarca());
            pstm.setDate(6, new Date(produto.getValidade().getTime()));
            pstm.setString(7, produto.getSetor());
            pstm.setInt(8, produto.getLote());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
        }catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            try {
                if (connection != null)
                {
                    connection.close();
                }
                if (pstm != null)
                {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("ERRO: " + e.getMessage());
            }
        }
    }
    
    public void deletarProduto (String nome)
    {
        String sql = "DELETE FROM produto WHERE nome = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        String sqlSelect = "SELECT id_filme FROM filme WHERE nome_filme = ?";
        ResultSet rs = null;
        
        try {
            conn = ConexaoBD.createConexao();
            pstm = conn.prepareStatement(sqlSelect);
            pstm.setString(1, nome); 
            
            rs = pstm.executeQuery();
            
            if (rs.next()){
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, nome);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Filme deletado com sucesso!");
            }else {
                JOptionPane.showMessageDialog(null, "Filme não encontrado!");
            }
            
        } catch (Exception e){
            System.out.println("Erro: "+e);
        } finally {
            try{
                if (pstm!=null){
                    pstm.close();
                }
                if (conn!=null){
                    conn.close();
                }
                if (rs!=null){
                    rs.close();
                }
            } catch(SQLException ex){
                System.out.println("Erro: "+ex);
            }
        }
    }
}
