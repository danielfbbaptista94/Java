package questao2.classes;

import questao2.interfaces.ModalImage;

public class GlassesVisor extends ModalImage
{
    @Override
    public void show() 
    {
        System.out.println("GlassVisor");
        super.image.load();
        super.image.view();
    }
}
