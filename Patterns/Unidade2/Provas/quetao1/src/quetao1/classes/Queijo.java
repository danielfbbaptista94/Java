package quetao1.classes;

import quetao1.interfaces.IComponent;

public class Queijo extends IComponent
{
    public Queijo(double preco) 
    {
        this.preco = preco;
    }
    
    @Override
    public void aumentarPreco(double percentual) 
    {
        System.out.println("Aumentando o preco do queijo para " + (this.preco + (this.preco*percentual)) );
    }
    
    private double preco;
}
