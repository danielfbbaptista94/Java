package questao2.main;

import questao2.decorated.Anima;
import questao2.decorators.AnimacaoAntes;
import questao2.decorators.AnimacaoDepois;
import questao2.interfaces.IAnimacao;

public class Main 
{
    public static void main(String[] args) 
    {
        IAnimacao animacao = new AnimacaoAntes(new AnimacaoDepois(new Anima()));
        
        animacao.animar();
    }
}
