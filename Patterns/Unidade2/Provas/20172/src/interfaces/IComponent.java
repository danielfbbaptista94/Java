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
        return true;
    }
    
    public abstract IComponent getChild(String caracteristica);
    
    public boolean removeAll()
    {
        return true;
    }
    
    public abstract void limparFrutas();
}
