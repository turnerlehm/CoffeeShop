package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandPart extends AbstractType implements Type
{
    public CommandPart()
    {
        super(CommandType.PART);
        allowed = new FlagType[]{FlagType.CHANNEL};
    }

    @Override
    public String help() {
        return "Syntax: /part --channel=<channel>[,<channels>]\n"+
                "Leaves one or more channels you specify\n"+
                "You must specify at least one <channel>, multiple <channels> must be comma separated\n";
    }
}
