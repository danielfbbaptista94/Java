package calabresa;

import interfaces.Decorator;
import interfaces.IPlugin;

public class Calabresa extends Decorator
{
    public Calabresa()
    {
        super(null);
    }
    
    @Override
    public void assar()
    {
        decorator.assar();
        System.out.print("+ Calabresa +");
    }
}