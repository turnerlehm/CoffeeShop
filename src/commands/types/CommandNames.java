package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandNames extends AbstractType implements Type
{
    public CommandNames()
    {
        super(CommandType.NAMES);
        allowed = new FlagType[]{FlagType.CHANNEL};
    }

    @Override
    public String help() {
        return "Syntax: /names --channel=<channel>[,<channels>]\n"+
                "Returns a list of users in the channel(s) named by <channel>\n"+
                "You must specify at least one <channel>, multiple <channels> must be comma separated\n"+
                "If the channel mode is PRIVATE you must be in the channel to perform this command\n";
    }
}
