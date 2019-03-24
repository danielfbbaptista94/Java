package classes;

import interfaces.ModalImage;

public class GlassesVisor extends ModalImage
{
    @Override
    public void show() 
    {
        super.image.load();
        super.image.view();
    }
}
