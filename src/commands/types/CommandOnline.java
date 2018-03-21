package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandOnline extends AbstractType implements Type
{
    public CommandOnline()
    {
        super(CommandType.ONLN);
        allowed = new FlagType[]{FlagType.NICK};
    }

    public String help()
    {
        return "Syntax: /online --nick=<nickname>[,<nicknames>]\n" +
                "Returns a subset of the nicknames given showing only those that are currently online\n" +
                "<nickname> must not contain spaces or the @ symbol\n" +
                "Multiple nicknames must be comma separated\n";
    }
}
