package questao2.main;

import java.util.ArrayList;
import questao1.classes.Deposito;
import questao1.classes.Tranferencia;
import questao1.interfaces.IOperacao;
import questao2.classes.AlgoritmoDetectarDigital;
import questao2.classes.AlgoritmoDetectarSenha;
import questao2.interfaces.IStrategy;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<IOperacao> operacoes = new ArrayList<>();
        IStrategy algoritmoSenha = new AlgoritmoDetectarSenha("1234");
        IStrategy algoritmoDigital = new AlgoritmoDetectarDigital("12345");
        
        operacoes.add(new Deposito());
        operacoes.add(new Tranferencia());
        operacoes.add(new Deposito());
        
        for(int i = 0; i< operacoes.size(); i++)
        {
            algoritmoSenha.detectarFraude(operacoes.get(i));
        }
        
        for(int i = 0; i< operacoes.size(); i++)
        {
            algoritmoDigital.detectarFraude(operacoes.get(i));
        }
    }
}
