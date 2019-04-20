package questao2.main;

import questao2.interfaces.IComponent;
import questao2.interfaces.Composite;
import questao2.leafs.Quadrado;
import questao2.leafs.Retangulo;

public class Main 
{
    public static void main(String[] args) 
    {
        IComponent objetosVisuais = new Composite();
        IComponent quadrados = new Composite();
        IComponent retangulos = new Composite();

        Quadrado quadrado1 = new Quadrado();
        Retangulo retangulo1 = new Retangulo();
        
        Quadrado quadrado2 = new Quadrado();
        Retangulo retangulo2 = new Retangulo();

        objetosVisuais.addObjetoVisual(retangulos);
        objetosVisuais.addObjetoVisual(quadrados);
        
        quadrados.addObjetoVisual(quadrado1);
        quadrados.addObjetoVisual(quadrado2);
        
        retangulos.addObjetoVisual(retangulo1);
        //retangulos.addObjetoVisual(retangulo2);
        
//        objetosVisuais.show();
//        objetosVisuais.hide();
        
        quadrados.removeObjetoVisual(quadrado2);
        quadrados.show();
    }
}
