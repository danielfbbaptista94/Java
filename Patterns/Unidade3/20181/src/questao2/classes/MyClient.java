package questao2.classes;

import questao2.interfaces.IStrategy;

public class MyClient 
{
    private IStrategy strategy;

    public void setSortStrategy(IStrategy algoritmo) 
    {
        this.strategy = algoritmo;
    }
    
    public void sort()
    {
        strategy.sort();
    }
}
