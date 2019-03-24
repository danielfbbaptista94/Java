package quetao1.decorator;

import quetao1.interfaces.IComponent;

public class Decorator extends IComponent
{
    public Decorator() 
    {
        this.decorated = null;
    }
    
    public Decorator(IComponent decorated) 
    {
        setDecorated(decorated);
    }
    
    public void setDecorated(IComponent decorated) 
    {
        this.decorated = decorated;    
    }
    
    @Override
    public void aumentarPreco(double percentual) 
    {
        decorated.aumentarPreco(percentual);
    }
    
    IComponent decorated;
}
