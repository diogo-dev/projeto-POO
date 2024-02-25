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
        String sql = "INSERT INTO Funcionario(Nome, Email, Sexo, Funçao, Data_de_nascimento, Setor, Salario, usuario, senha)"
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

    public List<Funcionario> listarFuncionario(){
        String sql = "SELECT * FROM Funcionario";
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try{
            conn = ConexaoBD.createConexao();
            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while(rs.next()){
                Funcionario user = new Funcionario();
                user.setCodigo(rs.getInt("codigo"));
                user.setDataNascimento(rs.getDate("dataNascimento"));
                user.setEmail(rs.getString("email"));
                user.setFuncao(rs.getString("funçao"));
                user.setNome(rs.getString("nome"));
                user.setSalario(rs.getDouble("salario"));
                user.setSetor(rs.getString("setor"));
                user.setSexo(rs.getString("sexo"));
                user.setUsuario(rs.getString("usuario"));

                funcionarios.add(user);
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
        return funcionarios;
        }
    }

    public void removerporFuncionario(String funcionario){
        String sql = "DELETE FROM Funcionario WHERE funcionario = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
           conn = ConexaoBD.createConexao();
           pstm = conn.prepareStatement(sql);
           pstm.setString(1, funcionario);

           pstm.execute();
           JOptionPane.showMessageDialog(null, "Usuario removido com sucesso!");

        } catch (Exception ex){
            System.out.println("Erro: "+ex);
        } finally {
            try{
                if (pstm!=null){
                    pstm.close();
                }
                if (conn!=null){
                    conn.close();
                }
            } catch(SQLException ex){
                System.out.println("Erro: "+ex);
            }
        }
    }

    public boolean autenticar(Funcionario funcionario){
        boolean autenticado = false;
        String sql = "SELECT usuario, senha FROM Funcionario"
                + "WHERE usuario=? and senha=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        System.out.println("Aqui");

        try{
            conn = ConexaoBD.createConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionario.getUsuario());
            pstm.setString(2, funcionario.getSenha());

            rs = pstm.executeQuery();

            while (rs.next()){
                String usuarioBanco = rs.getString("usuario");
                String senhaBanco = rs.getString("senha");
                autenticado = true;
            }


        } catch (SQLException ex){
            System.out.println("Erro: "+ex);
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
            } catch (SQLException ex){
                System.out.println("Erro: "+ex);
            }
            return autenticado;
        }
    }
}
