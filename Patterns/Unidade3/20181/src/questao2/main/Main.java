package questao2.main;

import questao2.classes.MyClient;
import questao2.strategies.MergeSort;
import questao2.strategies.QuickSort;

public class Main 
{
    public static void main(String[] args) 
    {
        MyClient cliente = new MyClient();
        cliente.setSortStrategy(new QuickSort());
        cliente.sort(); // Exibe na tela: “ordenando com o QuickSort”
        cliente.setSortStrategy(new MergeSort());
        cliente.sort(); // Exibe na tela: “ordenando com o MergeSort”
    }
}
