package questao2.interfaces;

public abstract class Animacao implements IAnimacao
{
    private IAnimacao anima;
    
    protected Animacao(IAnimacao anima)
    {
        this.anima = anima;
    }
    
    @Override
    public void animar()
    {
        this.anima.animar();
    }
}
