package bd;
import entities.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO 
{
    public void cadastrarProduto(Produto produto)
    {
        String sql = "INSERT INTO produto(Codigo, Preço, Quantidade, Nome, Marca, Validade, Nome_setor)"
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
            pstm.setDate(6, (Date) produto.getValidade()); //Validade ja eh do tipo Date
            pstm.setString(7, produto.getSetor());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!");
            
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
}
