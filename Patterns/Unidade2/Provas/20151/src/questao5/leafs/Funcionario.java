package questao5.leafs;

import questao5.interfaces.IComponent;

public class Funcionario extends IComponent
{
    public Funcionario(String nome, double salario, IComponent pai) 
    {
        super(nome, salario);
        pai.addEmpregado(this);
    }

    @Override
    public String getSalario() 
    {
        return "Nome: " + this.nome + " Salario de gerente é: " + this.salario + ", com o bonus fica: " + this.salario + 150;
    }
}
