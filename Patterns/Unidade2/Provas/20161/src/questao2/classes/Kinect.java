package questao2.classes;

import questao2.interfaces.ModalImage;

public class Kinect extends ModalImage
{
    @Override
    public void show() 
    {
        System.out.println("Kinect");
        super.image.load();
        super.image.view();
    }
}
