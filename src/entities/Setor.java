package entities;

import java.util.LinkedList;

public class Setor 
{
    //Atributos
    private String nome;
    private LinkedList<Produto> produtos;
    private LinkedList<Funcionario> funcionarios;
    
    //Construtores
    public Setor() {}
    
    public Setor(String nome, LinkedList<Produto> produtos, LinkedList<Funcionario> funcionarios)
    {
        this.nome = nome;
        this.produtos = produtos;
        this.funcionarios = funcionarios;
    }
    
    //Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }

    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
}
