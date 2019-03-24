package questao2.main;

import questao2.classes.BluRay;
import questao2.classes.VideoAdapterC;
import questao2.classes.VideoAdapterO;
import questao2.interfaces.IReprodutor;

public class Main 
{
    public static void main(String[] args) 
    {
        IReprodutor r = new VideoAdapterO(new BluRay());
        r.reproduzir();
        
        IReprodutor r2 = new VideoAdapterC();
        r2.reproduzir();
    }
}
