package decorators;

import interfaces.Component;
import interfaces.Decorator;

public class DecoratorPimenta extends Decorator
{
    public DecoratorPimenta(Component decorated) {
        super(decorated);
    }
    @Override
    public void assar() {
        super.assar();
        System.out.println("Colocando a Pimenta");
    }
}
