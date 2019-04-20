package questao2.strategies;

import questao2.interfaces.IStrategy;

public class MergeSort implements IStrategy
{
    @Override
    public void sort() 
    {
        System.out.println("Ordenando com o MergeSort");
    }
}
