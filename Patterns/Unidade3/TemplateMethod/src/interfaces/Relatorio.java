package interfaces;

public abstract class Relatorio 
{
    public void gerarRelatorio()
    {
        gerarCabecalhio();
        gerarCorpo();
        gerarRodape();
    }
    
    protected abstract void gerarCorpo();
    
    private void gerarCabecalhio()
    {
        System.out.println("INSTITUTO FEDERAL DA BAHIA - CAMPUS SALVADOR");
    }
    
    private void gerarRodape()
    {
        System.out.println("Salvador/2019");
    }
}
