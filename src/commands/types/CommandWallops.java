package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandWallops extends AbstractType implements Type
{
    public CommandWallops()
    {
        super(CommandType.WALLOPS);
        allowed = new FlagType[]{FlagType.MESSAGE};
    }

    public String help()
    {
        return "Syntax: /wallops --msg=\"<message>\"\n" +
                "Sends a message to all moderators\n" +
                "<message> must be contained in quotations as it may contain spaces\n";
    }
}
