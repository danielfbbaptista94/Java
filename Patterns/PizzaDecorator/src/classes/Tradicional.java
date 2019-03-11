package classes;

import interfaces.Decorator;
import interfaces.IComponent;

public class Tradicional extends Decorator
{
    public Tradicional() 
    {
        super(null);
    }
    
    public Tradicional(IComponent decorator) 
    {
        super(decorator);
    }
    
    @Override
    public void assar()
    {
        System.out.println("Massa + Queijo + Molho de tomate");
    }
}
