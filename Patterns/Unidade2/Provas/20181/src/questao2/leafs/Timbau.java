package questao2.leafs;

import questao2.interfaces.Component;

public class Timbau extends Component
{
    public Timbau(String tipo) 
    {
        super(tipo);
    }
    
    @Override
    public void afinarInstrumento() 
    {
        System.out.println("Afinar Timbau");
    }

    @Override
    public void tocarInstrumento() 
    {
        System.out.println("Tocar Timbau");
    }
}
