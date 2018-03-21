package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandDie extends AbstractType implements Type
{
    public CommandDie()
    {
        super(CommandType.DIE);
        allowed = new FlagType[]{FlagType.PASSWORD};
    }

    public String help()
    {
        return "Syntax: /die --pwd=<password>\n" +
                "If you are an admin and the correct <password> is provided, this command will shutdown the local server\n";
    }
}
