package questao1.decorator;

import questao1.interfaces.IGame;

public class AnimationDecorator extends IDecorator
{
    public AnimationDecorator(IGame game) 
    {
        super(game);
    }
    
    @Override
    public void finish() 
    {
        System.out.println("Finishing animation");
        this.game.finish();
    }
}
