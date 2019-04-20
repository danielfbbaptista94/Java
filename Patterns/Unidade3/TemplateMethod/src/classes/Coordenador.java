package classes;

import interfaces.Relatorio;

public class Coordenador 
{
    private Relatorio relatorio;

    public void setRelatorio(Relatorio relatorio) 
    {
        this.relatorio = relatorio;
    }
    
    public void solicitarRelatorio()
    {
        relatorio.gerarRelatorio();
    }
}
