package questao2.main;

import questao2.classes.GlassesVisor;
import questao2.image.JPGImage;
import questao2.image.PNGImage;
import questao2.interfaces.IImage;
import questao2.interfaces.ModalImage;
import questao2.video.AVIVideo;
import questao2.video.MP4Video;

public class Main 
{
    public static void main(String[] args) 
    {
        ModalImage visor = new GlassesVisor();
        
        IImage jpg = new JPGImage();
        visor.setImage(jpg);
        visor.show();
        
        System.out.println("");
        
        IImage png = new PNGImage();
        visor.setImage(jpg);
        visor.show();
        
        System.out.println("");
        
        IImage avi = new AVIVideo();
        visor.setImage(jpg);
        visor.show();
    
        System.out.println("");
        
        IImage mp4 = new MP4Video();
        visor.setImage(jpg);
        visor.show();
    }
}
