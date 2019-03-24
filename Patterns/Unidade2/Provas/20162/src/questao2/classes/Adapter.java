package questao2.classes;

import questao2.interfaces.ITarget;

public class Adapter implements ITarget
{
    private Adaptee adaptee;
    
    public Adapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }
    
    @Override
    public void mover(int x, int y) 
    {
        adaptee.mover(x, y);
    }
}
