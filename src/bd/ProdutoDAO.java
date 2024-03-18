package bd;
import entities.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


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
            // caso tente-se cadastrar um produto que possui o mesmo código de um ja cadastrado
            JOptionPane.showMessageDialog(null, "Código de identificação já Cadastrado!");
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
    
    public void AtualizarProduto(Produto produto)
    {
        String sql = "UPDATE produto SET preço = ?, quantidade = ?, nome = ?, marca = ?, validade = ?, nome_setor = ?, lote = ? WHERE codigo = ?";
        
        Connection connection = null;
        PreparedStatement pstm = null;
        
        try{
            //criar a conexao
            connection = ConexaoBD.createConexao();
            //criar um preparedStatement
            pstm = connection.prepareStatement(sql);
            //colocar os parametros
            pstm.setDouble(1, produto.getPreco());
            pstm.setInt(2, produto.getQuantidade());
            pstm.setString(3, produto.getNome());
            pstm.setString(4, produto.getMarca());
            pstm.setDate(5, new Date(produto.getValidade().getTime()));
            pstm.setString(6, produto.getSetor());
            pstm.setInt(7, produto.getLote());
            pstm.setInt(8, produto.getCodigo());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
            
        }catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
            // caso tente-se cadastrar um produto que possui o mesmo código de um ja cadastrado
            JOptionPane.showMessageDialog(null, "Código de identificação já Cadastrado!");
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
    
    public void deletarProduto (Produto produto)
    {
        String sql = "DELETE FROM produto WHERE codigo = ?";
        String sqlSelect = "SELECT nome FROM produto WHERE codigo = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            conn = ConexaoBD.createConexao();
            pstm = conn.prepareStatement(sqlSelect);
            pstm.setInt(1, produto.getCodigo());            
            rs = pstm.executeQuery();
            
            if (rs.next())
            {
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, produto.getCodigo());
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            }                      
        } catch (Exception e){
            System.out.println("Erro: " + e);
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
            } catch(SQLException e){
                System.out.println("Erro: " + e);
            }
        }
    }
    
     public List<Produto> listarCodigoProdutos(Produto produto)
     {
        String sql = "SELECT * FROM produto WHERE codigo = ?";
        String sqlSelect = "SELECT nome FROM produto WHERE codigo = ?";
        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            conn = ConexaoBD.createConexao();
            pstm = conn.prepareStatement(sqlSelect);
            pstm.setString(1, String.valueOf(produto.getCodigo()));
            
            rs = pstm.executeQuery();
            
            if (rs.next())
            {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, String.valueOf(produto.getCodigo()));
                rs = pstm.executeQuery();
                while(rs.next())
                {                   
                    produto.setCodigo(rs.getInt("codigo"));
                    produto.setPreco(rs.getDouble("preço"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setNome(rs.getString("nome"));
                    produto.setMarca(rs.getString("marca"));
                    produto.setValidade(rs.getDate("validade"));
                    produto.setSetor(rs.getString("nome_setor"));
                    produto.setLote(rs.getInt("lote"));

                    produtos.add(produto);
                } 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            }
    
            
        } catch (Exception e){
            System.out.println("Erro: "+ e);
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
            } catch(Exception e){
                System.out.println("Erro: "+ e);
            }
        }
        
        return produtos;
    }
     
    public List<Produto> listarNomeProdutos(Produto produto)
    {
        String sql = "SELECT * FROM produto WHERE nome like ? ORDER BY nome_setor";
        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            conn = ConexaoBD.createConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, produto.getNome()+"%");
            
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                Produto p = new Produto();
                p.setCodigo(rs.getInt("codigo"));
                p.setPreco(rs.getDouble("preço"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setNome(rs.getString("nome"));
                p.setMarca(rs.getString("marca"));
                p.setValidade(rs.getDate("validade"));
                p.setSetor(rs.getString("nome_setor"));
                p.setLote(rs.getInt("lote"));
                
                produtos.add(p);
            }
            
        } catch (Exception e){
            System.out.println("Erro: "+ e);
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
            } catch(Exception e){
                System.out.println("Erro: "+ e);
            }
        }
        
        return produtos;
    }
     
    public List<Produto> listarTodosProdutos(Produto produto)
    {
        String sql = "SELECT DISTINCT codigo, nome FROM produto ORDER BY nome";
        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            conn = ConexaoBD.createConexao();
            pstm = conn.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                Produto p = new Produto();
                p.setCodigo(rs.getInt("codigo"));
                p.setNome(rs.getString("nome"));
                
                produtos.add(p);
            }
            
        } catch (Exception e){
            System.out.println("Erro: "+ e);
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
            } catch(SQLException e){
                System.out.println("Erro: "+ e);
            }
        }
        
        return produtos;
    }
}
