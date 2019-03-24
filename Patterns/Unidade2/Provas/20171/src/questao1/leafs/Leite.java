package questao1.leafs;

import questao1.interfaces.IComponent;

public class Leite extends IComponent
{
    
    
    public Leite(double preco) 
    {
        super(preco);
    }

    @Override
    public void aumentarPreco(double percente) 
    {
        double precoF = this.preco;
        precoF += (this.preco * percente);
        System.out.println( "Preço anterior: " + getPreco() + " -->> NOVO Preço: " + precoF );
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
}
