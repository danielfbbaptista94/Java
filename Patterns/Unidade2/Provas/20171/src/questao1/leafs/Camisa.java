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
        System.out.println("Camisa preço anterioir: " + preco);
        preco += preco * percente;
        System.out.println("Novo preço: " + preco);
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
    
}
