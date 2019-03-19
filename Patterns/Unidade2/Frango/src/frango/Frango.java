package frango;

import interfaces.Decorator;
import interfaces.IPlugin;

public class Frango extends Decorator
{
    public Frango()
    {
        super(null);
    }
    
    @Override
    public void assar()
    {
        decorator.assar();
        System.out.print("+ Frango +");
    }
}

