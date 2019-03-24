package questao2.classes;

import questao2.interfaces.IReprodutor;

public class VideoAdapterC extends DVD implements IReprodutor
{
    @Override
    public void reproduzir() 
    {
        super.play();
    }
}
