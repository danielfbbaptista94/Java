package questao1.main;

import questao1.bridge.Codec1;
import questao1.bridge.Video1;
import questao1.decorator.PropagandaAntes;
import questao1.decorator.PropagandaDepois;
import questao1.interfaces.IVideo;

public class Main 
{
    public static void main(String[] args) 
    {
        IVideo video1 = new Video1();
        video1.setCodec(new Codec1());
        IVideo videoComPropaganda = new PropagandaAntes(new PropagandaDepois((IVideo)video1));
        videoComPropaganda.play();
    }
}
