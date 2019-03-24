package questao2.image;

import questao2.interfaces.IImage;

public class JPGImage implements IImage
{
    @Override
    public void load() 
    {
        System.out.println("LOAD jpg image");
    }

    @Override
    public void view() 
    {
        System.out.println("VIEW jpg image");
    }
}
