package interfaces;

public abstract class Widget 
{
    protected IBackend backend;
    
    public abstract void show();

    public void setBackend(IBackend backend) 
    {
        this.backend = backend;
    }
}
