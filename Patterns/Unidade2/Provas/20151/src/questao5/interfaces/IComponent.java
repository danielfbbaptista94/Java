package questao5.interfaces;

public abstract class IComponent 
{
    protected String nome;
    protected double salario;
    
    public IComponent() { }

    public IComponent(String nome, double salario) 
    {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getSalario() 
    {
        return ""+salario;
    }
    
    public boolean addEmpregado(IComponent empregado)
    {
        return true;
    }
    
    public boolean removeEmpregado(IComponent empregado)
    {
        return false;
    }
}
