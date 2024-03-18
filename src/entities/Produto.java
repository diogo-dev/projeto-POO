package entities;

import java.util.Date;

public class Produto 
{
    //Atributos
    private String nome;
    private Integer codigo;
    private String marca;
    private Integer quantidade;
    private Double preco;
    private Date validade;
    private Integer lote;
    private String setor;
    
    //Construtores
    public Produto() {}
    
    public Produto(String nome, Integer codigo, String marca, Integer quantidade, Double preco, Date validade, Integer lote, String setor)
    {
        this.nome = nome;
        this.codigo = codigo;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
        this.validade = validade;
        this.lote = lote;
        this.setor = setor;
    }

    //Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public String toString()
    {
        return  """
                ----------------------------------
                Nome: """ + getNome() + "\n" + 
                "Código: " + getCodigo() + "\n" +
                "Marca: " + getMarca()+ "\n" + 
                "Quantidade: " + getQuantidade()+ "\n" + 
                "Preço: " + getPreco()+ "\n" + 
                "Validade: " + getValidade() + "\n" + 
                "Lote: " + getLote()+ "\n" + 
                "Setor: " + getSetor()+ "\n\n";
                
    }
     
}
