package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandStats extends AbstractType implements Type
{
    public CommandStats()
    {
        super(CommandType.STATS);
        allowed = new FlagType[]{FlagType.SYMBOL, FlagType.SERVER};
    }

    public String help()
    {
        return "--- Command \"/stats\" not currently supported ---";
    }
}
