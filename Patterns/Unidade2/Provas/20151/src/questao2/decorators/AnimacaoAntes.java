package questao2.decorators;

import questao2.interfaces.Animacao;
import questao2.interfaces.IAnimacao;

public class AnimacaoAntes extends Animacao
{
    public AnimacaoAntes(IAnimacao anima) 
    {
        super(anima);
    }
    
    @Override
    public void animar()
    {
        System.out.println("Animação Antes");
        super.animar();
    }
}
