package questao1.decorator;

import questao1.interfaces.IGame;

public class SoundDecorator extends IDecorator
{
    public SoundDecorator(IGame game) 
    {
        super(game);
    }
    
    @Override
    public void finish() 
    {
        System.out.println("Finishing sound");
        this.game.finish();
    }
}
