package classes;

import interfaces.ITarget;

public class Adapter implements ITarget
{
    private Adaptee adaptee;
    
    public Adapter()
    {
        this.adaptee = new Adaptee();
    }
    
    @Override
    public void request() 
    {
        adaptee.specificRequest();
    }
}
