package entities;

public class Setor 
{
    //Atributos
    private String nome;
    
    //Construtores
    public Setor() {}
    
    public Setor(String nome)
    {
        this.nome = nome;
    }
    
    //Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Métodos
    public String ExibirDadosSetor()
    {
        return nome;
    }
}
