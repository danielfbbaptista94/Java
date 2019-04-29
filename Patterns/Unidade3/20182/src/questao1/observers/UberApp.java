package questao1.observers;

import questao1.interfaces.IObserver;

public class UberApp implements IObserver
{
    @Override
    public void update(String notificarApps) 
    {
        System.out.println("UberApp atualizando dados do" + notificarApps);
    }  
}
