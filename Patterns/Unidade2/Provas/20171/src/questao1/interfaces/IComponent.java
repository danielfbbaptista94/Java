package questao1.interfaces;

public abstract class IComponent 
{
    protected double preco;
    
    public IComponent() { }
    
    public IComponent(double preco)
    {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    
    public boolean addProduto(IComponent produto)
    {
        return true;
    }
    
    public boolean removeProduto(IComponent produto)
    {
        return false;
    }
    
    public abstract void aumentarPreco(double percente);
}
