package questao1.leafs;

import questao1.interfaces.IComponent;

public class Camisa extends IComponent
{
    public Camisa(double preco) 
    {
        super(preco);
    }

    @Override
    public void aumentarPreco(double percente) 
    {
        System.out.println( "Preço anterior: " + this.getPreco() + " -->> NOVO Preço: " + (this.getPreco() + (getPreco() * percente)) );
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
    
}
