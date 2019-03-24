package questao1.leafs;

import questao1.interfaces.IComponent;

public class Leite extends IComponent
{
    
    
    public Leite(double preco) 
    {
        super(preco);
    }

    @Override
    public void aumentarPreco(double percente) 
    {
        System.out.println("Leite preço anterioir: " + preco);
        preco += preco * percente;
        System.out.println("Novo preço: " + preco);
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
}
