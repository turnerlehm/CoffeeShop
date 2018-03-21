package commands.types;

import commands.CommandType;
import commands.FlagType;
import commands.types.AbstractType;
import commands.types.Type;

public class CommandWho extends AbstractType implements Type
{
    public CommandWho()
    {
        super(CommandType.WHO);
        allowed = new FlagType[]{FlagType.PATTERN};
    }

    @Override
    public String help() {
        return "*** Command \"/who\" not currently implemented ***";
    }
}
