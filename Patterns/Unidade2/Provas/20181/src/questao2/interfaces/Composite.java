package questao2.interfaces;

import java.util.ArrayList;

public class Composite extends Component
{
    private ArrayList<Component> childrens;

    public Composite() 
    {
        this.childrens = new ArrayList<>();
    }
    
    public Composite(String tipo)
    {
        super(tipo);
        this.childrens = new ArrayList<>();
    }
    
//    public Composite(Component pai)
//    {
//        this.childrens = new ArrayList<>();
//        pai.addFruta(this);
//    }
    
    @Override
    public boolean addInstrumento(Component instrumento)
    {
        return (!this.childrens.equals(instrumento)) ? this.childrens.add(instrumento) : false;
    }
    
    @Override
    public boolean removeInstrumento(Component instrumento)
    {
        return this.childrens.remove(instrumento);
    }

    @Override
    public void afinarInstrumento() 
    {
        for(Component instrumento : this.childrens)
        {
            instrumento.afinarInstrumento();
        }
    }

    @Override
    public void tocarInstrumento() 
    {
        for(Component instrumento : this.childrens)
        {
            instrumento.tocarInstrumento();
        }
    }
    
    @Override
    public void tocarInstrumentoCorda()
    {
        for(Component instrumento : this.childrens)
        {
            if(instrumento.getTipo().equalsIgnoreCase("Corda"))
            {
                instrumento.tocarInstrumento();
            }
        }
    }
    
    @Override
    public void tocarInstrumentoPercussivo()
    {
        for(Component instrumento : this.childrens)
        {
            if(instrumento.getTipo().equalsIgnoreCase("Percurssao"))
            {
                instrumento.tocarInstrumento();
            }
        }
    }
}
