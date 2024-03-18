package entities;

import java.util.Date;


public class Funcionario 
{
    //Atributos
    private String nome;
    private String email;
    private String sexo;
    private String funcao;
    private Double salario;
    private Date dataNascimento;
    private String setor;
    private String usuario;
    private String senha;
    
    //Construtores
    public Funcionario() {}
    
    public Funcionario(String nome, String email, String sexo, String funcao, Double salario, Date dataNascimento, String setor, String usuario, String senha)
    {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.funcao = funcao;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.setor = setor;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    //Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     @Override
    public String toString()
    {
        return  """
                ----------------------------------
                Nome: """ + getNome() + "\n" + 
                "Email: " + getEmail()+ "\n" +
                "Função: " + getFuncao()+ "\n" + 
                "Salario: " + getSalario()+ "\n" + 
                "Data de Nascimento: " + getDataNascimento()+ "\n" + 
                "Setor: " + getSetor()+ "\n" + 
                "Sexo: " + getSexo()+ "\n" + 
                "Usuário: " + getUsuario()+ "\n" + 
                "Senha: " + getSenha()+ "\n\n";
                
    }
    
}
