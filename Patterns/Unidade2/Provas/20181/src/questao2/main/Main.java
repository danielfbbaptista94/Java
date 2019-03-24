package questao2.main;

import questao2.interfaces.Composite;
import questao2.leafs.Timbau;
import questao2.leafs.Violino;

public class Main 
{
    public static void main(String[] args) 
    {
        Composite orquestra = new Composite();
        
        orquestra.addInstrumento(new Violino("Corda"));
        orquestra.addInstrumento(new Timbau("Percurssao"));
        
        orquestra.afinarInstrumento();
        System.out.println("");
        
        orquestra.tocarInstrumento();
        System.out.println("");
        
        orquestra.tocarInstrumentoCorda();
        orquestra.tocarInstrumentoPercussivo();
    }
}
