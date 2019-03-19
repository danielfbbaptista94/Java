package interfaces;

public abstract class Decorator implements IComponent
{
    protected IComponent decorator;
    
    @Override
    public abstract void assar();
    
    protected Decorator(IComponent decorator) 
    {
        this.decorator = decorator;
    }
    
    public void setDecorator(IComponent decorator)
    {
        this.decorator = this.decorator;
    }
}
