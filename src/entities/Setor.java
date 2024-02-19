package entities;

import java.util.ArrayList;

public class Setor 
{
    //Atributos
    private String nome;
    private ArrayList<Produto> produtos;
    private ArrayList<Funcionario> funcionarios;
    
    //Construtores
    public Setor() {}
    
    public Setor(String nome, ArrayList<Produto> produtos, ArrayList<Funcionario> funcionarios)
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

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
}
