package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandMotd extends AbstractType implements Type
{
    public CommandMotd()
    {
        super(CommandType.MOTD);
        allowed = new FlagType[]{FlagType.SERVER};
    }

    @Override
    public String help() {
        return "Syntax: /motd --server=<server>\n"+
                "Shows the message of the day for <server>\n";
    }
}
