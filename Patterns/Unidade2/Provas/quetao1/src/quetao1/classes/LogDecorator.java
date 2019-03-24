package quetao1.classes;

import quetao1.decorator.Decorator;
import quetao1.interfaces.IComponent;

public class LogDecorator extends Decorator
{
    public LogDecorator(IComponent decorated) 
    {
        super(decorated);
    }
    
    @Override
    public void aumentarPreco(double percentual) 
    {
        super.aumentarPreco(percentual);
        System.out.println("Fazendo o log");
    }
}
