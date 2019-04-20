package questao2.strategies;

import questao2.interfaces.IStrategy;

public class QuickSort implements IStrategy
{
    @Override
    public void sort() 
    {
        System.out.println("Ordenando com o QuickSort");
    }
}
