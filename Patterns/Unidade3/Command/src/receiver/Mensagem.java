package receiver;

import classes.Pessoa;

public class Mensagem 
{
    private Pessoa remetente;
    private Pessoa destinatario;

    public Mensagem(Pessoa remetente, Pessoa destinatario) {
        this.remetente = remetente;
        this.destinatario = destinatario;
    }
    
    public void sendEmail()
    {
        System.out.println( remetente.getNome() + " mandando email para " + destinatario.getNome() );
    }
    
    public void cancelEmail()
    {
        System.out.println(remetente.getNome() + " cancelou email enviado para " + destinatario.getNome());
    }
}
