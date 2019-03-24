package questao2.decorators;

import questao2.interfaces.Animacao;
import questao2.interfaces.IAnimacao;

public class AnimacaoDepois extends Animacao
{
    public AnimacaoDepois(IAnimacao anima) 
    {
        super(anima);
    }
    
    @Override
    public void animar()
    {
        System.out.println("Animação Depois");
        super.animar();
    }
}
