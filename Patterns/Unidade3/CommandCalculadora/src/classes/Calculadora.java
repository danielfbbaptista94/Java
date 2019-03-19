package classes;

// Receiver
public class Calculadora 
{
    private int nInicial = 0;
    
    public void operacaoAritmetica(String operador, int numero)
    {
        switch(operador)
        {
            case "+":
                nInicial += numero;
                break;
            case "-":
                nInicial -= numero;
                break;
            case "*":
                nInicial *= numero;
                break;
            case "/":
                nInicial /= numero;
                break;
        }
        System.out.println("Calculando: " + operador + " " + numero + " -> " + "Valor = " + nInicial);
    }
}
