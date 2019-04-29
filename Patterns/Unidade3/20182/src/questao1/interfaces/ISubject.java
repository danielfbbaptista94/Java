package questao1.interfaces;

import java.util.ArrayList;

public abstract class ISubject 
{
    protected String notificarApps;
    public ArrayList<IObserver> observers = new ArrayList<>();
    
    protected abstract void collectValues();
    
    public void addSubscriber(IObserver subject)
    {
        this.observers.add(subject);
    }
    
    public void collectNewValues()
    {
        collectValues();
        notifyObservers();
    }
    
    private void notifyObservers()
    {
        for(IObserver observer : this.observers)
        {
            observer.update(notificarApps);
        }
    }
}
