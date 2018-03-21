package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandLusers extends AbstractType implements Type
{
    public CommandLusers()
    {
        super(CommandType.LUSERS);
    }

    public String help()
    {
        return "Syntax: /lusers\n" +
                "Shows a count of local and remote users, server, and channels\n";
    }
}
