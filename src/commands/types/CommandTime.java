package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandTime extends AbstractType implements Type
{
    public CommandTime()
    {
        super(CommandType.TIME);
        allowed = new FlagType[]{FlagType.NONE};
    }

    public String help()
    {
        return "Syntax: /time [--server=<server>]\n" +
                "Returns the local time of the server, or remote time if another server is specified by <server>\n" +
                "<server> must not contain spaces or the @ symbol\n";
    }
}
