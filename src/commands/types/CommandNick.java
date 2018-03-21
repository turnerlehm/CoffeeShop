package commands.types;

import commands.CommandType;
import commands.Flag;
import commands.FlagType;
import commands.InvalidCommandException;

public class CommandNick extends AbstractType implements Type
{
    public CommandNick()
    {
        super(CommandType.NICK);
        allowed = new FlagType[]{FlagType.NICK};
    }

    public void addFlag(Flag f) throws InvalidCommandException
    {
        super.addFlag(f);
    }

    public String help()
    {
        return "Syntax: /nick --nick=<newnick>\n"+
                "This command changes your nickname to <newnick>\n"+
                "<newnick> may not contain spaces or the @ symbol\n";
    }
}
