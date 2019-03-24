package questao2.leafs;

import questao2.interfaces.Component;

public class Violino extends Component
{
    public Violino(String tipo) 
    {
        super(tipo);
    }
    
    @Override
    public void afinarInstrumento() 
    {
        System.out.println("Afinar Violino");
    }

    @Override
    public void tocarInstrumento() 
    {
        System.out.println("Tocar Violino");
    }
}
