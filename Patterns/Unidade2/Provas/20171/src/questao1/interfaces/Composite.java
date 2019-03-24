package questao1.interfaces;

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
        pai.addProduto(this);
    }
    
    @Override
    public boolean addProduto(IComponent produto)
    {
        return (!this.childrens.equals(produto)) ? this.childrens.add(produto) : false;
    }
    
    @Override
    public boolean removeProduto(IComponent produto)
    {
        return this.childrens.remove(produto);
    }
    
//    public IComponent getChild(IComponent produto)
//    {
//        return this.childrens.
//    }

    @Override
    public void aumentarPreco(double percente) 
    {
        for(IComponent produto : this.childrens)
        {
            produto.aumentarPreco(percente);
        }
    }
}
