package interfaces;

public abstract class IComponent 
{
    protected String name;
    protected String maturidade;
    protected String tamanho;

    public IComponent() { }

    public IComponent(String name, String maturidade, String tamanho) {
        this.name = name;
        this.maturidade = maturidade;
        this.tamanho = tamanho;
    }
    
    public String getName() {
        return name;
    }

    public String getMaturidade() {
        return maturidade;
    }

    public String getTamanho() {
        return tamanho;
    }
    
    public boolean addFruta(IComponent fruta)
    {
        return true;
    }
    
    public boolean removeFruta(IComponent fruta)
    {
        return false;
    }
    
    public abstract IComponent getChild(String caracteristica);
    public abstract void removeAll();
    
    public abstract void limparFrutas();
}
