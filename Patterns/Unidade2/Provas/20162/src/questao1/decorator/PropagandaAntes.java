package questao1.decorator;

import questao1.interfaces.IVideo;

public class PropagandaAntes extends DecoratorVideo
{
    public PropagandaAntes(IVideo video)
    {
        super(video);
    }
    
    @Override
    public void play() 
    {
        System.out.println("Propagando antes");
        super.play();
    }
}
