package questao1.backends;

import questao1.interfaces.IBackend;

public class MacBackend implements IBackend
{
    @Override
    public void drawSprite() 
    {
        System.out.println("Draw Sprite on Mac Backend");
    }

    @Override
    public void detectCollision() 
    {
        System.out.println("Detect Collision on Mac Backend");
    }
}