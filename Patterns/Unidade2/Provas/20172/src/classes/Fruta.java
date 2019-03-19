package classes;

import interfaces.IComponent;

public class Fruta extends IComponent
{
    public Fruta(String name, String maturidade, String tamanho, IComponent pai)
    {
        super(name, maturidade, tamanho);
        pai.addFruta(this);
    }

    @Override
    public void limparFrutas() 
    {
        System.out.println("Limpar " + this.name + ", " + this.maturidade + ", " + this.tamanho);
    }

    @Override
    public IComponent getChild(String caracteristica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
