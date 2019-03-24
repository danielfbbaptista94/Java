package questao1.interfaces;

public abstract class Musica 
{
    protected IBanda banda;
    
    public abstract void play();

    public void setBanda(IBanda banda) 
    {
        this.banda = banda;
    }
}
