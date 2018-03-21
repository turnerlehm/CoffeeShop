package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandJoin extends AbstractType implements Type
{
    public CommandJoin()
    {
        super(CommandType.JOIN);
        allowed = new FlagType[]{FlagType.CHANNEL};
    }

    @Override
    public String help() {
        return "Syntax: /join --channel=<channel>[,<channels>] [--key=<key>[,<keys>]]\n"+
                "Join one or more channels specified in <channel>\n"+
                "You must supply at least one <channel>, multiple <channels> must be comma separated\n"+
                "The --key flag is optional and only needed when a channel is password protected\n";
    }
}
