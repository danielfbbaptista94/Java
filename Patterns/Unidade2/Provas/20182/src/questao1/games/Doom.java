package questao1.games;

import questao1.interfaces.IGame;

public class Doom extends IGame
{
    @Override
    public void initialize() 
    {
        System.out.println("Initialize Doom");
    }

    @Override
    public void start() 
    {
        System.out.println("Start Doom");
    }

    @Override
    public void finish() 
    {
        System.out.println("Finish Doom");
    }
}
