package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandList extends AbstractType implements Type
{
    public CommandList()
    {
        super(CommandType.LIST);
        allowed = new FlagType[]{FlagType.PATTERN};
    }

    public String help()
    {
        return "Syntax: /list --pattern=<pattern>\n"+
                "Creates a list of all existing channels matching the glob pattern <pattern>\n";
    }
}
