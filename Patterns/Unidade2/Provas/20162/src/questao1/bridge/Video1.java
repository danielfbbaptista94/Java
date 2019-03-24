package questao1.bridge;

import questao1.interfaces.IVideo;

public class Video1 extends IVideo
{
    @Override
    public void play() 
    {
        System.out.println("Reproduzir video1");
    }
}
