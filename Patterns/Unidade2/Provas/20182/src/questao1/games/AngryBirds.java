package questao1.games;

import questao1.interfaces.IGame;

public class AngryBirds extends IGame
{
    @Override
    public void initialize() 
    {
        System.out.println("Initialize Angry Birds");
    }

    @Override
    public void start() 
    {
        System.out.println("Start Angry Birds");
    }

    @Override
    public void finish() 
    {
        System.out.println("Finish Angry Birds");
    }
}
