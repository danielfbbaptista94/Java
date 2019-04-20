package questao1.interfaces;

public abstract class IGame 
{
    protected IBackend backend;
            
    public abstract void initialize();
    public abstract void start();
    public abstract void finish();
    
    public void setBackend(IBackend backend)
    {
        this.backend = backend;
    }
}
