package decorators;

import interfaces.Component;
import interfaces.Decorator;

public class DecoratorFrangoComCatupiry extends Decorator
{
    public DecoratorFrangoComCatupiry(Component decorated) {
        super(decorated);
    }
    @Override
    public void assar() 
    {
        super.assar();
        System.out.println("Colocando o Frango com Catupiry");
    }
}


