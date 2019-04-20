package questao2.classes;

import questao1.interfaces.IOperacao;
import questao2.interfaces.IStrategy;

public class AlgoritmoDetectarDigital implements IStrategy
{
    private String digitalInformada;
    private String digitalCadastrada = "12345";

    public AlgoritmoDetectarDigital(String senhaInformada) 
    {
        this.digitalInformada = senhaInformada;
    }

    @Override
    public void detectarFraude(IOperacao operacao) 
    {
        if(digitalInformada.equals(digitalCadastrada))
        {
            System.out.println("Operação Confirmada");
        }
        else{
            System.out.println("Operação Invalida");
        }
    }
}
