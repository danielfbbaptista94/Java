package questao5.interfaces;

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
        pai.addEmpregado(this);
    }

    @Override
    public boolean addEmpregado(IComponent empregado) 
    {
        return (!this.childrens.equals(empregado)) ? this.childrens.add(empregado) : false;
    }

    @Override
    public boolean removeEmpregado(IComponent empregado) 
    {
        return this.childrens.remove(empregado);
    }
}
