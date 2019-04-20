package questao1.main;

import questao1.decorator.AnimationDecorator;
import questao1.decorator.IDecorator;
import questao1.decorator.SoundDecorator;
import questao1.games.AngryBirds;
import questao1.backends.LinuxBackend;
import questao1.backends.MacBackend;
import questao1.games.Doom;
import questao1.interfaces.IBackend;
import questao1.interfaces.IGame;

public class Main 
{
    public static void main(String[] args) 
    {
        IGame game1 = new AngryBirds();
        IBackend linux = new LinuxBackend();
        game1.setBackend(linux);
        IDecorator d1 = new SoundDecorator(new AnimationDecorator(game1));
        game1.initialize();
        game1.start();
        d1.finish();
        
        IGame game2 = new Doom();
        IBackend mac = new MacBackend();
        game2.setBackend(mac);
        IDecorator d2 = new SoundDecorator(new AnimationDecorator(game2));
        game2.initialize();
        game2.start();
        d2.finish();
    }
}
