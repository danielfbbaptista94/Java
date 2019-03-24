package questao2.interfaces;

public abstract class Component 
{
    protected String tipo;

    public Component() {}

    public Component(String tipo) 
    {
        this.tipo = tipo;
    }
    
    public boolean addInstrumento(Component instrumento)
    {
        return true;
    }
    
    public boolean removeInstrumento(Component instrumento)
    {
        return true;
    }
    
    public void tocarInstrumentoCorda(){}
    public void tocarInstrumentoPercussivo(){}
    
    public abstract void afinarInstrumento();
    public abstract void tocarInstrumento();

    public String getTipo() 
    {
        return tipo;
    }
}
