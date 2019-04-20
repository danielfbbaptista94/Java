package questao2.interfaces;

import java.util.ArrayList;

public class Composite extends IComponent
{
    private ArrayList<IComponent> childrens;
    
    public Composite()
    {
        this.childrens = new ArrayList<>();
    }
    
    @Override
    public boolean addObjetoVisual(IComponent objetoVisual)
    {
        return (!this.childrens.equals(objetoVisual)) ? this.childrens.add(objetoVisual) : false;
    }
    
    @Override
    public boolean removeObjetoVisual(IComponent objetoVisual)
    {
        return this.childrens.remove(objetoVisual);
    }

    @Override
    public void show() 
    {
        for(IComponent objetoVisual : this.childrens)
        {
            objetoVisual.show();
        }
    }

    @Override
    public void hide() 
    {
        for(IComponent objetoVisual : this.childrens)
        {
            objetoVisual.hide();
        }
    }
}
