package decorators;

import interfaces.Component;
import interfaces.Decorator;

public class DecoratorPresunto extends Decorator
{
    public DecoratorPresunto(Component decorated) {
        super(decorated);
    }
    @Override
    public void assar() 
    {
        super.assar();
        System.out.println("Colocando o presunto");
    }
}



