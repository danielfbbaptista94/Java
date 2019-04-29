package questao1.observers;

import questao1.interfaces.IObserver;

public class WazeApp implements IObserver
{
    @Override
    public void update(String notificarApps) 
    {
        System.out.println("WazeApp atualizando dados do" + notificarApps);
    }
}
