package questao1.estilos;

import questao1.interfaces.Musica;

public class Arrocha extends Musica
{
    @Override
    public void play() 
    {
        super.banda.tocarBaixo();
        super.banda.tocarGuitarra();
        super.banda.tocarBateria();
        System.out.println("Tocar Estilo de musica Arrocha");
    }
}
