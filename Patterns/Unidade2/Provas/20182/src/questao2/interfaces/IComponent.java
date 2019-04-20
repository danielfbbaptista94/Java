package questao2.interfaces;

public abstract class IComponent 
{
    public IComponent() { }
    
    public boolean addObjetoVisual(IComponent component)
    {
        return true;
    }
    
    public boolean removeObjetoVisual(IComponent component)
    {
        return true;
    }
    
    public abstract void show();
    public abstract void hide();
}
