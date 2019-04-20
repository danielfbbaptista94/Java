package questao2.classes;

import questao1.interfaces.IOperacao;
import questao2.interfaces.IStrategy;

public class AlgoritmoDetectarSenha implements IStrategy
{
    private String senhaInformada;
    private String senhaCadastrada = "12345";

    public AlgoritmoDetectarSenha(String senhaInformada) 
    {
        this.senhaInformada = senhaInformada;
    }

    @Override
    public void detectarFraude(IOperacao operacao) 
    {
        if(senhaInformada.equals(senhaCadastrada))
        {
            System.out.println("Operação Confirmada");
        }
        else{
            System.out.println("Operação Invalida");
        }
    }
}
