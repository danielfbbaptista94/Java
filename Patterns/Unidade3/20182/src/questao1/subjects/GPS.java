package questao1.subjects;

import questao1.interfaces.ISubject;

public class GPS extends ISubject
{
    @Override
    protected void collectValues() 
    {
        System.out.println("Coletando novos valores do GPS");
        super.notificarApps = " GPS para <latitude>, <longitude>";
    }
}
