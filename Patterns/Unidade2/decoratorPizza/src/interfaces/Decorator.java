package interfaces;

public class Decorator extends Component 
{
    public Decorator(Component decorated)
    {
        this.decorated = decorated;
    }
    
    @Override
    public void assar() 
    {
        decorated.assar();
    }
    
    private Component decorated;
}
