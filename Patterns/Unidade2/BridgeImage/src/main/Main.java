package main;

import classes.GlassesVisor;
import image.JPGImage;
import interfaces.IImage;
import interfaces.ModalImage;

public class Main 
{
    public static void main(String[] args) 
    {
        ModalImage visor = new GlassesVisor();
        IImage image = new JPGImage();
        visor.setImage(image);
        visor.show();
    }
}
