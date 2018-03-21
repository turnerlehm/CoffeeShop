package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandServer extends AbstractType implements Type
{
    public CommandServer()
    {
        super(CommandType.SRVR);
        allowed = new FlagType[]{FlagType.NONE};
    }

    public String help()
    {
        return "Ya dun goofed";
    }
}
