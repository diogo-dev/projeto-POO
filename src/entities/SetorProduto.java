package entities;

import java.util.LinkedList;

public class SetorProduto extends Setor
{
    private LinkedList<Produto> produtos = new LinkedList<>();
    
    public SetorProduto() {}
    
    public SetorProduto(LinkedList<Produto> produtos)
    {
        this.produtos = produtos;
    }

    public LinkedList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public String ExibirDadosSetor()
    {
        String resultado = "";
        for (Produto p : produtos)
        {
            resultado += p.toString();
        }
        return resultado;
    }
}
