package entities;

import java.util.Date;


public class Funcionario 
{
    //Atributos
    private String nome;
    private String email;
    private Integer codigo;
    private String sexo;
    private String funcao;
    private Double salario;
    private Date dataNascimento;
    private String setor;
    
    //Construtores
    public Funcionario() {}
    
    public Funcionario(String nome, String email, Integer codigo, String sexo, String funcao, Double salario, Date dataNascimento, String setor)
    {
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
        this.sexo = sexo;
        this.funcao = funcao;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.setor = setor;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
    
}
