package entities;

import java.util.LinkedList;

public class SetorFuncionario extends Setor
{
    private LinkedList<Funcionario> funcionarios = new LinkedList<>();
    
    public SetorFuncionario() {}
    
    public SetorFuncionario(LinkedList<Funcionario> funcionarios) 
    {
        this.funcionarios = funcionarios;
    }

    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    @Override
    public String ExibirDadosSetor()
    {
        String resultado = "";
        for (Funcionario f : funcionarios)
        {
            resultado += f.toString();
        }
        return resultado;
    }
}
