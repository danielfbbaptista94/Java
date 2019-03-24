package questao2.image;

import questao2.interfaces.IImage;

public class PNGImage implements IImage
{
    @Override
    public void load() 
    {
        System.out.println("Load png image");
    }

    @Override
    public void view() 
    {
        System.out.println("View png image");
    }
}
