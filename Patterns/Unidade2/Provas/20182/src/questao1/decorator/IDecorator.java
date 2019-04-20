package questao1.decorator;

import questao1.interfaces.IGame;

public class IDecorator extends IGame
{
    protected IGame game;
    
    public IDecorator(IGame game)
    {
        this.game = game;
    }
    
    @Override
    public void initialize() 
    {
        this.game.initialize();
    }

    @Override
    public void start() 
    {
        this.game.start();
    }

    @Override
    public void finish() 
    {
        this.game.finish();
    }
}
