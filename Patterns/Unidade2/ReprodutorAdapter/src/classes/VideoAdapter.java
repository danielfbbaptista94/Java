package classes;

import interfaces.IReprodutor;

public class VideoAdapter implements IReprodutor
{
    private BluRay adaptee;

    public VideoAdapter(BluRay bluray)
    {
        this.adaptee = bluray;
    }
    
    @Override
    public void reproduzir() 
    {
        adaptee.play();
    }
}
