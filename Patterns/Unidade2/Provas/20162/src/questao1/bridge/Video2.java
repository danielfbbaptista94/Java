package questao1.bridge;

import questao1.interfaces.IVideo;

public class Video2 extends IVideo
{
    @Override
    public void play() 
    {
        System.out.println("Reproduzir video2");
    }
}
