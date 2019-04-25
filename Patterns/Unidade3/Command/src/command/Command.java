package command;

import interfaces.ICommand;
import receiver.Mensagem;

public class Command implements ICommand{
    
    public Mensagem mensagem;

    public Command(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
    
    @Override
    public void redo() {
        mensagem.sendEmail();
    }

    @Override
    public void undo() {
        mensagem.cancelEmail();
    }
    
}
