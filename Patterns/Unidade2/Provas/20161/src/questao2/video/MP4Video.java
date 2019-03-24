package questao2.video;

import questao2.interfaces.IImage;

public class MP4Video implements IImage
{
    @Override
    public void load() 
    {
        System.out.println("LOAD mp4 video");
    }

    @Override
    public void view() 
    {
        System.out.println("VIEW mp4 video");
    }
}
