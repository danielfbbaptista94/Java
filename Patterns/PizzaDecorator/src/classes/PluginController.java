package classes;

import gui.MenuPizza;
import interfaces.IPlugin;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PluginController implements IPlugin{

    ArrayList<String> loadplugins;
    
    
    @Override
    public ArrayList<String> getLoadedPlugins()
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
        for (i = 0; i < plugins.length; i++) {
            String factoryName = plugins[i].split("\\.")[0];
            loadplugins.add(factoryName);
        }
        return loadplugins;
    }
    
}
