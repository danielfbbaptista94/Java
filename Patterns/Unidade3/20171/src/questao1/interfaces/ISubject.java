package questao1.interfaces;

import java.util.ArrayList;

public abstract class ISubject 
{
    private ArrayList<IObserver> observers = new ArrayList<>();
    
    public void addObserver(IObserver observer)
    {
        this.observers.add(observer);
    }
    
    public void removeObserver(IObserver observer)
    {
        this.observers.remove(observer);
    }
    
    public void notifyObservers()
    {
        for(IObserver observer : this.observers)
        {
            observer.update(this);
        }
    }
}
