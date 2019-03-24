package questao2.video;

import questao2.interfaces.IImage;

public class AVIVideo implements IImage
{
    @Override
    public void load() 
    {
        System.out.println("LOAD avi video");
    }

    @Override
    public void view() 
    {
        System.out.println("VIEW avi video");
    }
}
