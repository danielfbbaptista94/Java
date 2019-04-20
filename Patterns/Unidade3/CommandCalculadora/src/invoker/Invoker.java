package invoker;

import interfaces.ICommand;
import java.util.ArrayList;

public class Invoker 
{
    private ArrayList<ICommand> commands = new ArrayList<ICommand>();
    private int current;

    public Invoker() 
    {
        this.current = -1;
    }

    public void storeAndExecute(ICommand c) 
    {
        commands.add( c );
        c.redo();
        current = commands.size() - 1;
    } 

    public void unexecute() 
    {
        if( commands.isEmpty() == false && current >= 0 ) 
        {
            commands.get(current).undo();
            current--;
        }
    }

    public void execute() 
    {
        if( current < commands.size() - 1 )
        {
            if( current == - 1 )
            {
                current++;
            }
            
            while( current < commands.size() ) 
            {
                commands.get(current).redo();

                current++;
            }

            current--;
        }
    }
}
