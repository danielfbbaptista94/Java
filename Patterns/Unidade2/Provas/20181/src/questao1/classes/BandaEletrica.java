package questao1.classes;

import questao1.interfaces.IBanda;

public class BandaEletrica implements IBanda
{
    @Override
    public void tocarBaixo() 
    {
        System.out.println("Tocar Baixo Eletrico");
    }

    @Override
    public void tocarGuitarra() 
    {
        System.out.println("Tocar Guitarra Eletrico");
    }

    @Override
    public void tocarBateria() 
    {
        System.out.println("Tocar Bateria Eletrico");
    }
}
