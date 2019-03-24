package questao1.main;

import questao1.classes.BandaAcustica;
import questao1.classes.BandaEletrica;
import questao1.estilos.Arrocha;
import questao1.estilos.Pagode;
import questao1.interfaces.IBanda;
import questao1.interfaces.Musica;

public class Main 
{
    public static void main(String[] args) 
    {
        IBanda bEletrica = new BandaEletrica();
        IBanda bAcustica = new BandaAcustica();
        
        Musica pagode = new Pagode();
        pagode.setBanda(bEletrica);
        pagode.play();
        
        System.out.println("");
        
        pagode.setBanda(bAcustica);
        pagode.play();
        
        System.out.println("");
        
        Musica arrocha = new Arrocha();
        arrocha.setBanda(bEletrica);
        arrocha.play();
        
        System.out.println("");
        
        arrocha.setBanda(bAcustica);
        arrocha.play();
    }
}
