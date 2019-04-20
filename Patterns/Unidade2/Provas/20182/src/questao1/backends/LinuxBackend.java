package questao1.backends;

import questao1.interfaces.IBackend;

public class LinuxBackend implements IBackend
{
    @Override
    public void drawSprite() 
    {
        System.out.println("Draw Sprite on Linux Backend");
    }

    @Override
    public void detectCollision() 
    {
        System.out.println("Detect Collision on Linux Backend");
    }
}
