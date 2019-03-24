package questao1.classes;

import questao1.interfaces.IBanda;

public class BandaAcustica implements IBanda
{
    @Override
    public void tocarBaixo() 
    {
        System.out.println("Tocar Baixo Acustica");
    }

    @Override
    public void tocarGuitarra() 
    {
        System.out.println("Tocar Baixo Acustica");
    }

    @Override
    public void tocarBateria() 
    {
        System.out.println("Tocar Baixo Acustica");
    }
}
