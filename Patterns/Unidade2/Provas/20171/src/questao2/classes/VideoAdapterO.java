package questao2.classes;

import questao2.interfaces.IReprodutor;

public class VideoAdapterO implements IReprodutor
{
    private BluRay adaptee;

    public VideoAdapterO(BluRay bluray)
    {
        this.adaptee = bluray;
    }
    
    @Override
    public void reproduzir() 
    {
        this.adaptee.play();
    }
}
