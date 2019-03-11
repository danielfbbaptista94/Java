package calabresa;

import interfaces.*;
import java.util.ArrayList;

public class Calabresa extends Decorator implements IPlugin{
    
    public Calabresa() {
        super(null);
    }
    
    @Override
    public void assar()
    {
        decorator.assar();
        System.out.println("+ Calabresa +");
    }
    
    @Override
    public ArrayList<String> getLoadedPlugins() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
