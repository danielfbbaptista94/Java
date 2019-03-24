package questao1.decorator;

import questao1.interfaces.IVideo;

public class DecoratorVideo extends IVideo
{
    protected IVideo video;
    
    @Override
    public void play() 
    {
        this.video.play();
    }
    
    public DecoratorVideo(IVideo video)
    {
        this.video = video;
    }
}
