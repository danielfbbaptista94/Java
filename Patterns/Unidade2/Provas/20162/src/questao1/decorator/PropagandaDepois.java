package questao1.decorator;

import questao1.interfaces.IVideo;

public class PropagandaDepois extends DecoratorVideo
{
    public PropagandaDepois(IVideo video) 
    {
        super(video);
    }

    @Override
    public void play() 
    {
        System.out.println("Propagando depois");
        super.play();
    }
}
