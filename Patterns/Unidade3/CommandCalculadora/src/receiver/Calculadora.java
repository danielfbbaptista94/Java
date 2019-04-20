package receiver;

// Receiver
public class Calculadora 
{
    private int total = 0;
    
    public Calculadora() 
    {
        this.setTotal(0);
    }
	
    public void somar(int valor) 
    {
        this.total += valor;
        System.out.println(valor);
    }
	
    public void subtrair(int valor) 
    {
        this.total -= valor;
        System.out.println(valor);
    }

    public void multiplicar(int valor) 
    {
        this.total *= valor;
        System.out.println(valor);
    }

    public void dividir(int valor) {
        this.total /= valor;
        System.out.println(valor);
    }

    private void setTotal(int total) 
    {
        this.total = total;
    }

    public double getTotal() 
    {
        return this.total;
    }
}
