package interfaces;

import java.util.ArrayList;

public class Composite extends IComponent
{
    private ArrayList<IComponent> childrens;
    
    public Composite()
    {
        this.childrens = new ArrayList<>();
    }
    
    public Composite(IComponent pai)
    {
        this.childrens = new ArrayList<>();
        pai.addFruta(this);
    }

    @Override
    public boolean addFruta(IComponent fruta)
    {
        return (!this.childrens.equals(fruta)) ? this.childrens.add(fruta) : false;
    }
    
    @Override
    public boolean removeFruta(IComponent fruta)
    {
        return this.childrens.remove(fruta);
    }

    @Override
    public void limparFrutas()
    {
        for(IComponent fruta : this.childrens)
        {
            fruta.limparFrutas();
        }
    }

    @Override
    public IComponent getChild(String caracteristica) 
    {
        for(IComponent fruta : this.childrens)
        {
            if(fruta.name.equalsIgnoreCase(caracteristica) ||
                fruta.maturidade.equalsIgnoreCase(caracteristica) ||
                fruta.tamanho.equalsIgnoreCase(caracteristica))
            {
                return fruta;
            }
        }
        return null;
    }

    @Override
    public void removeAll() 
    {
        for(IComponent c : childrens)
        {
            removeFruta(c);
        }
    }
}
