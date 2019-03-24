package quetao1.classes;

import quetao1.interfaces.IComponent;

public class Arroz extends IComponent
{
    public Arroz(double preco) 
    {
        this.preco = preco;
    }
    
    @Override
    public void aumentarPreco(double percentual) 
    {
        System.out.println("Aumentando o preco do arroz para " + (this.preco + (this.preco*percentual)) );
    }
    
    private double preco;
}
