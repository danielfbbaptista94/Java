package interfaces;

public class Decorator implements IComponent
{
    protected IComponent decorator;

    public Decorator(IComponent decorator) 
    {
        this.decorator = decorator;
    }
    
    public void setDecorator(IComponent decorator)
    {
        this.decorator = this.decorator;
    }
    
    @Override
    public void assar()
    {
        decorator.assar();
    }
}
