package questao2.interfaces;

public abstract class ModalImage 
{
    protected IImage image;
    
    public abstract void show();

    public void setImage(IImage image) 
    {
        this.image = image;
    }
}
