package bd;
import entities.Funcionario;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FuncionarioDAO {

    public void inserirFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO funcionario(nome, email, sexo, funcao, data_de_nascimento, nome_setor, salario, usuario, senha)"
                + "Values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try{
            //criar a conexao
            conn = ConexaoBD.createConexao();
            //criar um preparedStatement
            pstm = conn.prepareStatement(sql);
            //colocar os parametros
            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getEmail());
            pstm.setString(3, funcionario.getSexo());
            pstm.setString(4, funcionario.getFuncao());
            pstm.setDate(5, new Date(funcionario.getDataNascimento().getTime()));
            pstm.setString(6, funcionario.getSetor());
            pstm.setDouble(7, funcionario.getSalario());
            pstm.setString(8, funcionario.getUsuario());
            pstm.setString(9, funcionario.getSenha());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            JOptionPane.showMessageDialog(null, "Funcionário já cadastrado!");
        } finally{
            try{
                if (pstm != null)
                {
                    pstm.close();
                }
                if (conn != null)
                {
                    conn.close();
                }
            } catch(SQLException e){
                System.out.println("Erro: "+ e);
            }
        }
    }
    
     public void AtualizarFuncionario(Funcionario funcionario)
    {
        String sql = "UPDATE funcionario SET nome = ?, email = ?, sexo = ?, funcao = ?, data_de_nascimento = ?, nome_setor = ?, salario = ?, senha = ? WHERE usuario = ?";
        
        Connection connection = null;
        PreparedStatement pstm = null;
        
        try{
            //criar a conexao
            connection = ConexaoBD.createConexao();
            //criar um preparedStatement
            pstm = connection.prepareStatement(sql);
            //colocar os parametros
            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getEmail());
            pstm.setString(3, funcionario.getSexo());
            pstm.setString(4, funcionario.getFuncao());
            pstm.setDate(5, new Date(funcionario.getDataNascimento().getTime()));
            pstm.setString(6, funcionario.getSetor());
            pstm.setDouble(7, funcionario.getSalario());
            pstm.setString(8, funcionario.getSenha());
            pstm.setString(9, funcionario.getUsuario());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Funcionario atualizado com sucesso!");
            
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

    public List<Funcionario> listarFuncionario(Funcionario funcionario)
    {
        String sql = "SELECT * FROM funcionario WHERE usuario = ?";
        String sqlSelect = "SELECT nome FROM funcionario WHERE usuario = ?";
        List<Funcionario> funcionarios = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            //Criar conexao
            conn = ConexaoBD.createConexao();
            //Criar o Prepared Statement
            pstm = conn.prepareStatement(sqlSelect);
            pstm.setString(1, funcionario.getUsuario());
            //Criar o Result Set
            rs = pstm.executeQuery();
            
            if (rs.next())
            {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, funcionario.getUsuario());
                rs = pstm.executeQuery();
                
                while(rs.next())
                {         
                    funcionario.setDataNascimento(rs.getDate("data_de_nascimento"));
                    funcionario.setEmail(rs.getString("email"));
                    funcionario.setFuncao(rs.getString("funcao"));
                    funcionario.setNome(rs.getString("nome"));
                    funcionario.setSalario(rs.getDouble("salario"));
                    funcionario.setSetor(rs.getString("nome_setor"));
                    funcionario.setSexo(rs.getString("sexo"));
                    funcionario.setUsuario(rs.getString("usuario"));
                    funcionario.setSenha(rs.getString("senha"));

                    funcionarios.add(funcionario);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
            }
        } catch (Exception e){
            System.out.println("Erro: " + e);
        } finally {
            try{
                if (pstm != null){
                    pstm.close();
                }
                if(conn != null){
                    rs.close();
                }
            } catch(SQLException e){
                System.out.println("Erro: " + e);
            }
        }
        return funcionarios;
    }

    public void removerporFuncionario(Funcionario funcionario){
        String sql = "DELETE FROM funcionario WHERE usuario = ?";
        String sqlSelect = "SELECT nome FROM funcionario WHERE usuario = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
           //Criar a conexao
           conn = ConexaoBD.createConexao();
           //Criar o Prepared Statement
           pstm = conn.prepareStatement(sqlSelect);
           pstm.setString(1, funcionario.getUsuario());
           rs = pstm.executeQuery();
           
           if (rs.next())
           {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, funcionario.getUsuario());
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Usuario removido com sucesso!");
           }
           else
           {
                JOptionPane.showMessageDialog(null, "Usuario não encontrado!");   
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
            } catch(SQLException e){
                System.out.println("Erro: " + e);
            }
        }
    }
    
    public List<Funcionario> listarTodosFuncionarios(Funcionario funcionario)
    {
        String sql = "SELECT * FROM Funcionario ORDER BY nome_setor";
        List<Funcionario> funcionarios = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            //Criar conexao
            conn = ConexaoBD.createConexao();
            //Criar o Prepared Statement
            pstm = conn.prepareStatement(sql);
            //Criar o Result Set
            rs = pstm.executeQuery();

            while(rs.next())
            {
                Funcionario f = new Funcionario();
                f.setDataNascimento(rs.getDate("data_de_nascimento"));
                f.setEmail(rs.getString("email"));
                f.setFuncao(rs.getString("funcao"));
                f.setNome(rs.getString("nome"));
                f.setSalario(rs.getDouble("salario"));
                f.setSetor(rs.getString("nome_setor"));
                f.setSexo(rs.getString("sexo"));
                f.setUsuario(rs.getString("usuario"));

                funcionarios.add(f);
            }

        } catch (Exception ex){
            System.out.println("Erro: "+ex);
        } finally {
            try{
                if (pstm != null){
                    pstm.close();
                }
                if(conn != null){
                    rs.close();
                }
            } catch(SQLException ex){
                System.out.println("Erro: "+ex);
            }
        }
        return funcionarios;
    }

    public boolean autenticar(Funcionario funcionario){
        boolean autenticado = false;
        String sql = "SELECT usuario, senha FROM funcionario WHERE usuario like ? and senha like ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            //criar a conexao
            conn = ConexaoBD.createConexao();
            //criar um preparedStatement
            pstm = conn.prepareStatement(sql);
            //colocar os parametros
            pstm.setString(1, funcionario.getUsuario());
            pstm.setString(2, funcionario.getSenha());

            rs = pstm.executeQuery();

            while (rs.next())
            {
                String usuarioBanco = rs.getString("usuario");
                String senhaBanco = rs.getString("senha");
                autenticado = true;
            }
        } catch (SQLException e){
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
            } catch (SQLException e){
                System.out.println("Erro: "+ e);
            }
            return autenticado;
        }
       
    }
    public boolean autenticarAdiministrador(Funcionario funcionario){
        boolean autenticado = false;
        String sql = "SELECT nome_setor FROM funcionario WHERE usuario like ? and senha like ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            //criar a conexao
            conn = ConexaoBD.createConexao();
            //criar um preparedStatement
            pstm = conn.prepareStatement(sql);
            //colocar os parametros
            pstm.setString(1, funcionario.getUsuario());
            pstm.setString(2, funcionario.getSenha());

            rs = pstm.executeQuery();

            while (rs.next())
            {
                String setorBanco = rs.getString("nome_setor");
                if(setorBanco.equals("Administração"))
                {
                    autenticado = true;
                    funcionario.setSetor("Administração");
                }
                else
                {
                    funcionario.setSetor(setorBanco);
                }
            }
        } catch (SQLException e){
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
            } catch (SQLException e){
                System.out.println("Erro: "+ e);
            }
            return autenticado;
        }
       
    }
}
