package questao1.subjects;

import questao1.interfaces.ISubject;

public class Acelerometro extends ISubject
{
    @Override
    protected void collectValues() 
    {
        System.out.println("Coletando novos valores do acelerometro");
        super.notificarApps = " acelerometro para <x>, <y>, <z>";
    }    
}
