package classes;

import gui.MenuPizza;
import interfaces.Decorator;
import interfaces.IComponent;
import interfaces.IPlugin;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;

public class PluginController implements IPlugin
{
    ArrayList<String> loadplugins;
    
    @Override
    public ArrayList<String> initialize()
    {
        loadplugins = new ArrayList<>();
        File currentDir = new File("./ingredientes");
        String[] plugins = currentDir.list();
        int i;
        
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++) {
            loadplugins.add(plugins[i].split("\\.")[0]);
            try {
                jars[i] = (new File("./ingredientes/" + plugins[i])).toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(MenuPizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);
//        for (i = 0; i < plugins.length; i++) {
//            String factoryName = plugins[i].split("\\.")[0];
//            try {
//               IPlugin plugin = (IPlugin) Class.forName(factoryName.toLowerCase()+"."+ factoryName, true, ulc).newInstance();
//               plugin.initialize();
//            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
//                Logger.getLogger(MenuPizza.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        return loadplugins;
    }
    
    
    public static IComponent makePizza(JList<String> listIngrChoosen) {
        IComponent last = new Tradicional();
        URL[] jars = new URL[listIngrChoosen.getModel().getSize()];
        for (int i = 0; i < listIngrChoosen.getModel().getSize(); i++) {
            try {
                jars[i] = new File("ingredientes/" + listIngrChoosen.getModel().getElementAt(i)+".jar").toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(MenuPizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);
        for (int i = 0; i < listIngrChoosen.getModel().getSize(); i++) {
            String decoratorName = listIngrChoosen.getModel().getElementAt(i);
            Decorator decorator = null;
            try {
                decorator = (Decorator) Class.forName(decoratorName.toLowerCase() + "." + decorator, true, ulc).newInstance();
                decorator.setDecorator(last);
                last = decorator;
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                Logger.getLogger(MenuPizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return last;
    }
}
