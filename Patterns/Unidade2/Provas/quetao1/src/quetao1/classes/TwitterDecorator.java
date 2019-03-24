package quetao1.classes;

import quetao1.decorator.Decorator;
import quetao1.interfaces.IComponent;

public class TwitterDecorator extends Decorator
{
    public TwitterDecorator(IComponent decorated) 
    {
        super(decorated);
    }
    
    @Override
    public void aumentarPreco(double percentual) 
    {
        System.out.println("Enviando mensagem via twitter");
        super.aumentarPreco(percentual);
    }
}
